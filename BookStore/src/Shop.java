import java.util.ArrayList;
import java.util.List;

public class Shop {

	public static void main(String[] args) {
		List<Books> booklist = new ArrayList<Books>();
		List<Magazines> maglist = new ArrayList<Magazines>();
		List<EBook> ebooklist = new ArrayList<EBook>();

		/*
		 * Scanner sc = new Scanner(System.in); int numbooks = sc.nextInt(); for
		 * (numbooks:sc.hasNext()){ }
		 */
		for (int i = 0; i < 2; i++) {
			Books bookObj = new Books();
			bookObj.setFirstName("bfirstname".concat(String.valueOf(i)));
			bookObj.setLastName("blastname".concat(String.valueOf(i)));
			bookObj.setCity("bcity".concat(String.valueOf(i)));
			bookObj.setTitile("btitle".concat(String.valueOf(i)));
			System.out.println(bookObj);
			booklist.add(bookObj);
			bookPrice(bookObj);
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
			System.out.println(magObj);
			maglist.add(magObj);
			magazinePrice(magObj);
		}
		for (int i = 0; i < 2; i++) {
			EBook ebookObj = new EBook();
			Books bookObj = new Books();
			bookObj.setFirstName("ebfirstname".concat(String.valueOf(i)));
			bookObj.setLastName("eblastname".concat(String.valueOf(i)));
			bookObj.setCity("ebcity".concat(String.valueOf(i)));
			bookObj.setTitile("ebtitle".concat(String.valueOf(i)));
			System.out.println(ebookObj);
			ebookObj.setBooks(bookObj);
			ebooklist.add(ebookObj);
			ebookPrice();
		}
		calculatePrice(booklist);

	}

	public static void calculatePrice(List<Books> list) {
		int price = 0;
		for (Books books : list) {
			price = price + bookPrice(books);
		}
		System.out.println("Book Total Price=>" + price);

	}

	public static int bookPrice(Books books) {
		int bprice = 0;
		bprice = books.getFirstName().length() + books.getLastName().length();
		System.out.println("book price is " + bprice);
		return bprice;
	}

	public static int magazinePrice(Magazines magazines) {
		int mprice = 0;
		mprice = 12 * (magazines.getBooks().getFirstName().length() + magazines.getBooks().getLastName().length());
		System.out.println("magazine price is " + mprice);
		return mprice;
	}

	public static int ebookPrice() {
		int ebprice = 1;
		System.out.println("electronic book price is " + ebprice);
		return ebprice;
	}
}
