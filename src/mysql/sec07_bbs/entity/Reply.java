package mysql.sec07_bbs.entity;

import java.time.LocalDateTime;

public class Reply {
	private int rid;
	private String comment;
	private LocalDateTime regTime;
	private String uidString;
	private String uid;
	private int bid;
	
	public Reply() { }
	public Reply(int rid, String comment, LocalDateTime regTime, String uidString, String uid, int bid) {
		this.rid = rid;
		this.comment = comment;
		this.regTime = regTime;
		this.uidString = uidString;
		this.uid = uid;
		this.bid = bid;
	}

	@Override
	public String toString() {
		return "Reply [rid=" + rid + ", comment=" + comment + ", regTime=" + regTime + ", uidString=" + uidString
				+ ", uid=" + uid + ", bid=" + bid + "]";
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public LocalDateTime getRegTime() {
		return regTime;
	}
	public void setRegTime(LocalDateTime regTime) {
		this.regTime = regTime;
	}
	public String getUidString() {
		return uidString;
	}
	public void setUidString(String uidString) {
		this.uidString = uidString;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	
}
