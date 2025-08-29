package com.spring.client.board.mapper;

import com.spring.client.board.vo.Board;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BoardMapper {
    @Results(id = "boardResult", value = {
            @Result(property = "boardNumber", column = "b_num"),
            @Result(property = "boardName", column = "b_name"),
            @Result(property = "boardTitle", column = "b_title"),
            @Result(property = "boardContent", column = "b_content"),
            @Result(property = "boardDate", column = "b_date"),
            @Result(property = "boardPasswd", column = "b_pwd"),
            @Result(property = "boardReadcnt", column = "b_readcnt")
    })
    @Select("""
            SELECT b_num, b_name, b_title, to_char(b_date, 'YYYY-MM-DD') as b_date, b_readcnt
            FROM spring_board
            ORDER BY b_num desc
      """)

    public List<Board> boardList(Board board);  /* 검색 포함 리스트 */

    @Insert("""
            INSERT INTO spring_board(b_num, b_name, b_title, b_content, b_pwd)
            VALUES(spring_board_seq.nextval, #{board.boardName}, #{board.boardTitle}, #{board.boardContent}, #{board.boardPasswd})
            """)
    public int boardInsert(@Param("board") Board board);


}
