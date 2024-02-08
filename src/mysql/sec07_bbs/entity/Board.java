package mysql.sec07_bbs.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Board {
	private int bid;
	private String titleString;
	private String contentString;
	private String uid;
	private LocalDateTime moLocalDateTime;
	private int isDeleted;
	private int viewCount;
	private int replyCount;
	
	public Board() { }
	
	public Board(int bid, String titleString, String contentString, String uid, LocalDateTime moLocalDateTime,
			int isDeleted, int viewCount, int replyCount) {
		this.bid = bid;
		this.titleString = titleString;
		this.contentString = contentString;
		this.uid = uid;
		this.moLocalDateTime = moLocalDateTime;
		this.isDeleted = isDeleted;
		this.viewCount = viewCount;
		this.replyCount = replyCount;
	}
	
	@Override
	public String toString() {
		return "Board [bid=" + bid + ", titleString=" + titleString + ", contentString=" + contentString + ", uid="
				+ uid + ", moLocalDateTime=" + moLocalDateTime + ", isDeleted=" + isDeleted + ", viewCount=" + viewCount
				+ ", replyCount=" + replyCount + "]";
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getTitleString() {
		return titleString;
	}
	public void setTitleString(String titleString) {
		this.titleString = titleString;
	}
	public String getContentString() {
		return contentString;
	}
	public void setContentString(String contentString) {
		this.contentString = contentString;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public LocalDateTime getMoLocalDateTime() {
		return moLocalDateTime;
	}
	public void setMoLocalDateTime(LocalDateTime moLocalDateTime) {
		this.moLocalDateTime = moLocalDateTime;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}
	
	
	
}
