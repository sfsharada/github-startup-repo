
public class Magazines {

	private Books books;
	private String adress;
	private String publisherName;

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	@Override
	public String toString() {
		return "Magazines [books=" + books + ", adress=" + adress + ", publisherName=" + publisherName + "]";
	}

}
