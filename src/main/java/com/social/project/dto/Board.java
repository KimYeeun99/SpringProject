package com.social.project.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Board {
    private int board_id;
    private String title;
    private String body;
    private String user_id;
    private Date regdate;
    private String type;
}
