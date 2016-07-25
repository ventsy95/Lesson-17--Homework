
public class Page {
	private String title;
	private String text;

	Page(String title, String text) {
		this.title = title;
		this.text = text;
	}

	public String getTitle() {
		return title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		if (text != null) {
			this.text = text;
		}
	}

	void addText(String text){
		String oldText= this.getText();
		this.setText(oldText + "\n " + text);
	}
	
	void deleteText(){
		this.setText("");
	}
	
	void readPage(){
		System.out.println(this.getTitle());
		System.out.println(this.getText());
	}
}
