
public class Song {
	String title;
	String artist;

	public Song() {
		title = null;
		artist = null;
	}

	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + "]";
	}

}
