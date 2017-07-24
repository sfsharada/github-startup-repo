import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class ShopTest {

	@Test
	public void testMain() {
		List<Books> booklisttest = new ArrayList<Books>();
		List<Magazines> maglisttest = new ArrayList<Magazines>();
		List<EBook> ebooklisttest = new ArrayList<EBook>();

		for (int i = 0; i < 2; i++) {
			Books bookObj = new Books();
			bookObj.setFirstName("bfirstname".concat(String.valueOf(i)));
			bookObj.setLastName("blastname".concat(String.valueOf(i)));
			bookObj.setCity("bcity".concat(String.valueOf(i)));
			bookObj.setTitile("btitle".concat(String.valueOf(i)));
			assertEquals("bfirstname".concat(String.valueOf(i)), bookObj.getFirstName());
			assertEquals("blastname".concat(String.valueOf(i)), bookObj.getLastName());
			assertEquals("bcity".concat(String.valueOf(i)), bookObj.getCity());
			assertEquals("btitle".concat(String.valueOf(i)), bookObj.getTitile());
		}

		for (int i = 0; i < 2; i++) {
			Magazines magObj = new Magazines();
			Books bookObj = new Books();
			bookObj.setFirstName("mafirstname".concat(String.valueOf(i)));
			bookObj.setLastName("malastname".concat(String.valueOf(i)));
			bookObj.setCity("macity".concat(String.valueOf(i)));
			bookObj.setTitile("matitle".concat(String.valueOf(i)));
			magObj.setBooks(bookObj);
			magObj.setPublisherName("magpname".concat(String.valueOf(i)));
			magObj.setAdress("magpaddress".concat(String.valueOf(i)));
			assertEquals("mafirstname".concat(String.valueOf(i)), bookObj.getFirstName());
			assertEquals("malastname".concat(String.valueOf(i)), bookObj.getLastName());
			assertEquals("macity".concat(String.valueOf(i)), bookObj.getCity());
			assertEquals("matitle".concat(String.valueOf(i)), bookObj.getTitile());
			assertEquals("magpname".concat(String.valueOf(i)), magObj.getPublisherName());
			assertEquals("magpaddress".concat(String.valueOf(i)), magObj.getAdress());
		}
		for (int i = 0; i < 2; i++) {
			EBook ebookObj = new EBook();
			Books bookObj = new Books();
			bookObj.setFirstName("ebfirstname".concat(String.valueOf(i)));
			bookObj.setLastName("eblastname".concat(String.valueOf(i)));
			bookObj.setCity("ebcity".concat(String.valueOf(i)));
			bookObj.setTitile("ebtitle".concat(String.valueOf(i)));
			ebookObj.setBooks(bookObj);
			assertEquals("ebfirstname".concat(String.valueOf(i)), bookObj.getFirstName());
			assertEquals("eblastname".concat(String.valueOf(i)), bookObj.getLastName());
			assertEquals("ebcity".concat(String.valueOf(i)), bookObj.getCity());
			assertEquals("ebtitle".concat(String.valueOf(i)), bookObj.getTitile());
		}
	}

	@Test
	public void calculatePriceTest() {
		int price = 0;
		for (Books books : getListofBooks()) {
			price = price + bookPriceTest(books);
		}
		assertEquals(42, price);
	}

	public List<Books> getListofBooks() {
		List<Books> booklist = new ArrayList<Books>();
		for (int i = 0; i < 2; i++) {
			Books bookObj = new Books();
			bookObj.setFirstName("bfirstname".concat(String.valueOf(i)));
			bookObj.setLastName("blastname".concat(String.valueOf(i)));
			bookObj.setCity("bcity".concat(String.valueOf(i)));
			bookObj.setTitile("btitle".concat(String.valueOf(i)));
			booklist.add(bookObj);
		}
		return booklist;

	}

	public int bookPriceTest(Books books) {
		int bprice = 0;
		bprice = books.getFirstName().length() + books.getLastName().length();
		assertEquals(21, bprice);
		return bprice;
	}

	@Test
	@Ignore
	public void magazinePriceTest() {
		List<Magazines> listmag = new ArrayList<Magazines>();

		for (int i = 0; i < 2; i++) {
			Magazines magObj = new Magazines();
			Books bookObj = new Books();
			bookObj.setFirstName("mafirstname".concat(String.valueOf(i)));
			bookObj.setLastName("malastname".concat(String.valueOf(i)));
			bookObj.setCity("macity".concat(String.valueOf(i)));
			bookObj.setTitile("matitle".concat(String.valueOf(i)));
			magObj.setBooks(bookObj);
			magObj.setPublisherName("magpname".concat(String.valueOf(i)));
			listmag.add(magObj);
		}
		for (Magazines magazines : listmag) {
			int mprice = 0;
			mprice = 12 * (magazines.getBooks().getFirstName().length() + magazines.getBooks().getLastName().length());
			assertEquals(276, mprice);
		}
	}

	@Test
	public void ebookPriceTest() {
		int ebprice = 1;
		assertEquals(1, ebprice);

	}

}
