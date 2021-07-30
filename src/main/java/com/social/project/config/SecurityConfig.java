package com.social.project.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .httpBasic().disable() //security 에서 기본으로 생성하는 로그인 페이지 사용안함
                .csrf().disable() //csrf 사용안함 -> REST API 사용하기 때문
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) //JWT 인증 사용하므로 세션 사용
                .and()
                    .authorizeRequests() //다음 리퀘스트에 대한 사용권한 체크
                        .antMatchers("/*/signIn", "/*/signUp").permitAll() //가입 및 인증 주소는 누구나 접근 가능
                        .anyRequest().hasRole("USER") //그 외 나머지 요청은 모두 인증된 회원만 접근 가능
                .and()
                    .exceptionHandling().authenticationEntryPoint(new CustomAuthenticationEntryPoint())
                .and()
                    .addFilterBefore();
    }

    //Swagger 사용시 security 추가
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/v2/api-docs",
                "/configuration/ui",
                "/swagger-resources/**",
                "/configuration/security",
                "/swagger-ui.html",
                "/webjars/**");
    }
}
