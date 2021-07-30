package com.social.project.dao;

import com.social.project.dto.Board;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface BoardDao {
    ArrayList<Board> getAllBoard();
    Board getDetailBoard(int board_id);
}
