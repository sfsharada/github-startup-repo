
import java.util.Date;

public class EBook {
	private Books books;
	private Date dateSent;

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}

	public Date getDateSent() {
		return dateSent;
	}

	public void setDateSent(Date dateSent) {
		this.dateSent = dateSent;
	}

	@Override
	public String toString() {
		return "EBook [books=" + books + ", dateSent=" + dateSent + "]";
	}

}
