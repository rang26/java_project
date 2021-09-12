package com.mega.mvc07;

public class BbsDTO {
	private int bNo;
	private String title;
	private String content;
	private String writer;
	
	public void setbNo(int bNo) {
		this.bNo = bNo;
	}
	
	public int getbNo() {
		return bNo;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "BbsDTO [bNo=" + bNo + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
	
}
