package com.social.project.controller;

import com.social.project.dto.Board;
import com.social.project.dto.User;
import com.social.project.service.BoardService;
import com.social.project.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    BoardService boardService;

    @ApiOperation(value = "전체 조회", notes = "게시판 조회")
    @GetMapping("/")
    public ArrayList<Board> getAllBoard(){
        ArrayList<Board> boards = boardService.getAllBoard();
        return boards;
    }

    @ApiOperation(value = "디테일 조회", notes = "게시판 디테일 조회")
    @GetMapping("/{board_id}")
    public Board getDetailBoard(@PathVariable int board_id){
        Board boards = boardService.getDetailBoard(board_id);
        return boards;
    }
}
