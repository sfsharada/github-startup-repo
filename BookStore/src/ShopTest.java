

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ShopTest {

	@Test
	public void testMain() {
		List<Books> booklisttest = new ArrayList<Books>();
		List<Magazines> maglisttest = new ArrayList<Magazines>();
		List<EBook> ebooklisttest = new ArrayList<EBook>();
	}	
}
/*
 List<Books> booklist = new ArrayList<Books>();
		List<Magazines> maglist = new ArrayList<Magazines>();
		List<EBook> ebooklist = new ArrayList<EBook>();
		for(int i=0;i<2;i++){
		Books bookObj = new Books();
		bookObj.setFirstName("bfirstname".concat(String.valueOf(i)));
		bookObj.setLastName("blastname".concat(String.valueOf(i)));
		bookObj.setCity("bcity".concat(String.valueOf(i)));
		bookObj.setTitile("btitle".concat(String.valueOf(i)));
		booklist.add(bookObj);
		System.out.println(booklist);
		bookPrice(bookObj);
		}
		for(int i=0;i<2;i++){
		Magazines magObj = new Magazines();
		Books bookObj = new Books();
		bookObj.setFirstName("mafirstname".concat(String.valueOf(i)));
		bookObj.setLastName("malastname".concat(String.valueOf(i)));
		bookObj.setCity("macity".concat(String.valueOf(i)));
		bookObj.setTitile("matitle".concat(String.valueOf(i)));
		//booklist.add(bookObj);
		magObj.setBooks(bookObj);
		magObj.setPublisherName("magpname".concat(String.valueOf(i)));
		magObj.setAdress("magpaddress".concat(String.valueOf(i)));
		maglist.add(magObj);
		System.out.println(maglist);
		magazinePrice(magObj);
		}
		for(int i=0;i<2;i++){
		EBook ebookObj = new EBook();
		Books bookObj = new Books();
		bookObj.setFirstName("ebfirstname".concat(String.valueOf(i)));
		bookObj.setLastName("eblastname".concat(String.valueOf(i)));
		bookObj.setCity("ebcity".concat(String.valueOf(i)));
		bookObj.setTitile("ebtitle".concat(String.valueOf(i)));
		ebookObj.setBooks(bookObj);
		ebooklist.add(ebookObj);
		System.out.println(ebooklist);
		ebookPrice();
		}
		calculatePrice(booklist); 
 */
