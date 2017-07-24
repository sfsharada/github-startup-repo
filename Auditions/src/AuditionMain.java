import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AuditionMain {

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

	public static void main(String[] args) {

		for (Map.Entry<String, List> entry : mapAudition().entrySet()) {
			String key = entry.getKey();
			System.out.println(key);
			List<Object> value = entry.getValue();
			if ("Dancer".equalsIgnoreCase(key)) {
				for (Object da : value) {
					Dancer dancer = (Dancer) da;
					System.out.println(dancer.getStyle() + "-" + dancer.getId() + "-" + "Dnacer");
				}
			}
			if ("Performer".equalsIgnoreCase(key)) {
				for (Object da : value) {
					Performer performer = (Performer) da;
					System.out.println(performer.getId() + "-" + "Performer");
				}
			}

			if ("Vocalist".equalsIgnoreCase(key)) {
				for (Object da : value) {
					Vocalist vocalist = (Vocalist) da;
					if (vocalist.getVolume() != null) {
						System.out.println("Ising the Key of " + vocalist.getKey() + "-" + "-" + "at the volume"
								+ vocalist.getVolume() + "-" + vocalist.getId());
					} else {
						System.out.println("Ising the Key of " + vocalist.getKey() + "-" + "-" + vocalist.getId());
					}
				}
			}
		}

	}

}
