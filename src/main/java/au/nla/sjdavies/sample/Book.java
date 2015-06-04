package au.nla.sjdavies.sample;

/**
 * @since Jun 3, 2015
 * @author Stephen Davies
 */
public class Book {

	private int id;
	private String author;
	private String isbn;
	private String title;
	
	public int getId() {
		return id;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
}
