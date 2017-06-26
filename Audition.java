
import java.util.List;

public class Audition {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	private String action;
	private String dType;

	public String getdType() {
		return dType;
	}

	public void setdType(String dType) {
		this.dType = dType;
	}

	public int getVkey() {
		return vkey;
	}

	public void setVkey(int vkey) {
		this.vkey = vkey;
	}

	private int vkey;

	public void dancer(int[] id, String[] type) {
		System.out.printf("%n%s - %d" + "Dancer %n", type, id);
	}

	public void vocal(int[] id, int volume, String s, String key) {
		System.out.printf("%nI sing in they key - " + "%s - at the volume %d - %d%n", key, volume, id);
	}

	public Audition(int id, String action, String dType, int vKey) {
		this.id = id;
		this.action = action;
		this.dType = dType;
		this.vkey = vKey;

	}

	public String performer(List<Audition> list) {
		System.out.printf("%n%d" + "- Performer %n", id);
		return "";
	}

	public String vocal(List<Audition> list) {
		System.out.printf("%nI sing in they key - G " + " - at the volume %d %d %n", vkey, id);
		return "";
	}

	public String dancer(List<Audition> list) {
		System.out.printf("%n%s - %d " + " Dancer %n", dType, id);
		return "";
	}
}
