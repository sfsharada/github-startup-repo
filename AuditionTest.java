import java.util.Arrays;
import java.util.List;

public class AuditionTest {

	public static void main(String[] args) {
		
		Audition[] audition = { new Audition(11100, "performer", null, 0), new Audition(11200, "performer", null, 0),
				new Audition(11300, "performer", null, 0), new Audition(11400, "performer", null, 0),
				new Audition(11500, "dancer", "tap", 0), new Audition(11600, "dancer", "tap", 0),
				new Audition(11700, "vocal", null, 6) };
		List<Audition> list = Arrays.asList(audition);

		System.out.println("Complete Audition list:");

		// Print the audition from the list....
		for (Audition audition1 : list) {
			if (audition1.getAction().equals("performer")) {
				System.out.print(audition1.performer(list));
			} else if (audition1.getAction().equals("dancer")) {
				System.out.print(audition1.dancer(list));
			} else {
				System.out.print(audition1.vocal(list));
			}

		}
	}

}
