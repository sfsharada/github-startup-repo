public class Dancer {

	private String id;
	
	private String style;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	@Override
	public String toString() {
		return "Dancer [id=" + id + ", style=" + style + "]";
	}
	
	
	
	
}
