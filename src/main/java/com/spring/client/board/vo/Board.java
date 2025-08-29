package com.spring.client.board.vo;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Board {
    private int boardNumber;    // 글번호
    private String boardName;   //작성자
    private String boardTitle;  //제목
    private String boardContent;//내용
    private String boardDate;   //작성일
    private String boardPasswd; //비밀번호
    private int boardReadcnt;   //조회수
}
