package mysql.sec04_gril_group;

import java.time.LocalDate;

public class GRILGroup {
	private int gid;
	private String name;
	private LocalDate debut;
	private int hitSongId;     // Insert/Update 할 때 사용하는 필드
	private String hitSongTitleString; //Select 할 때 사용하는 필드
	public GRILGroup() { }
	public GRILGroup(int gid, String name, LocalDate debut, int hitSongId, String hitSongTitleString) {
	
		this.gid = gid;
		this.name = name;
		this.debut = debut;
		this.hitSongId = hitSongId;
		this.hitSongTitleString = hitSongTitleString;
	}
	// Insert 할 경우 사용되는 생성자
	public GRILGroup(String name, LocalDate debut, int hitSongId) {
		super();
		this.name = name;
		this.debut = debut;
		this.hitSongId = hitSongId;
	}
	// Update 헐 경우 사용되는 생성자
	public GRILGroup(int gid, String name, LocalDate debut, int hitSongId) {
		super();
		this.gid = gid;
		this.name = name;
		this.debut = debut;
		this.hitSongId = hitSongId;
	}
	@Override
	public String toString() {
		return "GRILGroup [gid=" + gid + ", name=" + name + ", debut=" + debut 
				+ ", hitSongTitleString=" + hitSongTitleString + "]";
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDebut() {
		return debut;
	}
	public void setDebut(LocalDate debut) {
		this.debut = debut;
	}
	public int getHitSongId() {
		return hitSongId;
	}
	public void setHitSongId(int hitSongId) {
		this.hitSongId = hitSongId;
	}
	public String getHitSongTitleString() {
		return hitSongTitleString;
	}
	public void setHitSongTitleString(String hitSongTitleString) {
		this.hitSongTitleString = hitSongTitleString;
	}
	
	

}
