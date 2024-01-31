package ch17_collection.qna.q7_list;

public class Board {
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	
	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + "]";
	}
}
