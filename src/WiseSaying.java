
public class WiseSaying {
	private int id;
	private String Author;
	private String WiseSaying;

	public WiseSaying(int id, String Author, String wise) {
		this.id = id;
		this.Author = Author;
		this.WiseSaying = wise;
	}

	public WiseSaying() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getWiseSaying() {
		return WiseSaying;
	}

	public void setWiseSaying(String wiseSaying) {
		WiseSaying = wiseSaying;
	}

}
