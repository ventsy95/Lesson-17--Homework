
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
		this.text = text;
	}

	void addText(String text) {
		if (text != null) {
			String oldText = this.getText();
			this.setText(oldText + "\n " + text);
		}
	}

	void deleteText() {
		this.setText(null);
	}

	void readPage() {
		System.out.println(this.getTitle());
		System.out.println(this.getText());
	}

	boolean searchWord(String word) {
		if (word != null) {
			if (this.getText().contains(word)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	boolean containtsDigits() {
		if(this.getText()!=null && this.getText().matches(".*\\d.*")){
			return true;
		}else{
			return false;
		}
	}
}
