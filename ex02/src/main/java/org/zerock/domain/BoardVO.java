package org.zerock.domain;

import java.util.Date;

import lombok.Data;

//테이블의 컬럼구조를 반영하는 vo(value object / 도메인 객체)
@Data
public class BoardVO {
	
	private int bno;
	private String title;
	private String content;
	private String writer;
    private String regdate;
	private String updateDate;
	
}
