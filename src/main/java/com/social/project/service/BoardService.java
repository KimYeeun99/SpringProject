package com.social.project.service;

import com.social.project.dao.BoardDao;
import com.social.project.dto.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BoardService {
    @Autowired
    public BoardDao board;

    public ArrayList<Board> getAllBoard(){
        ArrayList<Board> boards = board.getAllBoard();
        return boards;
    }

    public Board getDetailBoard(int board_id){
        Board boards = board.getDetailBoard(board_id);
        return boards;
    }
}
