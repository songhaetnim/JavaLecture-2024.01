package mysql.sec03_song;

import java.util.List;

public class Main {

	public static void main(String[] args) {
SongDao songDao = new SongDao();
		
		Song song = songDao.getSongById(101);
		System.out.println(song);
		
		song = songDao.getSongByTitle("별빛");     // %별빛% - 제목에 별빛 검색
		System.out.println(song);
		System.out.println("===================================================");
		
		
//		song = new Song("ㅇㅇ","ㅇㅇㅇ");
//		songDao.insertSong(song);
		
		song = songDao.getSongById(117);
		song.setTitle("ㄴㄴ");
		song.setLyrics("ㄴㄴㄴ");
		songDao.updateSong(song);
		
		songDao.DeleteSong(118);
		
		List<Song> list = songDao.getSongListAll();
		list.forEach(x -> System.out.println(x));
	}

}