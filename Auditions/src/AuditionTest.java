import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.junit.Test;

public class AuditionTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	public static Map<String, List> mapAudition() {
		List<Performer> performerList = new ArrayList<Performer>();
		List<Dancer> dancerList = new ArrayList<Dancer>();
		List<Vocalist> vocalistList = new ArrayList<Vocalist>();

		Map<String, List> map = new HashMap<String, List>();
		for (int i = 0; i < 4; i++) {
			Performer performer = new Performer();
			performer.setId(String.valueOf(i));
			performerList.add(performer);
		}
		System.out.println(performerList);

		Scanner sc = new Scanner(System.in);
		List<Dancer> listDancer = new ArrayList<Dancer>();
		for (int i = 0; i < 2; i++) {
			Dancer dancer = new Dancer();
			System.out.println("Enter Dacner id ");
			String id = sc.nextLine();
			dancer.setId(id);
			System.out.println("Enter Dacner Type ");
			String dancerType = sc.nextLine();
			dancer.setStyle(dancerType);
			listDancer.add(dancer);
		}
		System.out.println(listDancer);

		Scanner s = new Scanner(System.in);
		List<Vocalist> listVocalist = new ArrayList<Vocalist>();
		Vocalist vocalist = new Vocalist();
		System.out.println("Enter Vocalist id");
		String id = s.nextLine();
		vocalist.setId(id);
		System.out.println("Enter the Key");
		String key = s.nextLine();
		vocalist.setKey(key);
		System.out.println("Enter the volume");
		String volume = s.nextLine();
		vocalist.setVolume(volume);
		listVocalist.add(vocalist);

		map.put("Performer", performerList);
		map.put("Dancer", listDancer);
		map.put("Vocalist", listVocalist);

		return map;
	}

	@Test
	public void testM11ain() {
		for (Map.Entry<String, List> entry : mapAudition().entrySet()) {
			String key = entry.getKey();
			System.out.println(key);
			List<Object> value = entry.getValue();
			if ("Dancer".equalsIgnoreCase(key)) {
				for (Object da : value) {
					Dancer dancer = (Dancer) da;
					assertEquals(dancer.getStyle() + "-" + dancer.getId() + "-" + "Dnacer",
							dancer.getStyle() + "-" + dancer.getId() + "-" + "Dnacer");
					System.out.println(dancer.getStyle() + "-" + dancer.getId() + "-" + "Dnacer");
				}
			}
			if ("Performer".equalsIgnoreCase(key)) {
				for (Object da : value) {
					Performer performer = (Performer) da;
					assertEquals(performer.getId() + "-" + "Performer", performer.getId() + "-" + "Performer");
					System.out.println(performer.getId() + "-" + "Performer");
				}
			}
			if ("Vocalist".equalsIgnoreCase(key)) {
				for (Object da : value) {
					Vocalist vocalist = (Vocalist) da;
					if (vocalist != null) {
						if (vocalist.getVolume() != null && !vocalist.getVolume().isEmpty()) {
							assertEquals(
									"I sing the Key of " + vocalist.getKey() + "-" + "at the volume"
											+ vocalist.getVolume() + "-" + vocalist.getId(),
									"I sing the Key of " + vocalist.getKey() + "-" + "at the volume"
											+ vocalist.getVolume() + "-" + vocalist.getId());
							System.out.println("I sing the Key of " + vocalist.getKey() + "-" + "at the volume"
									+ vocalist.getVolume() + "-" + vocalist.getId());
						} else {
							assertEquals("I sing the Key of " + vocalist.getKey() + "-" + vocalist.getId(),
									"I sing the Key of " + vocalist.getKey() + "-" + vocalist.getId());
							System.out.println("I sing the Key of " + vocalist.getKey() + "-" + vocalist.getId());
						}
					}

				}
			}
		}
	}

}
