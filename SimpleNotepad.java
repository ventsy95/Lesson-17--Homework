import java.util.Scanner;

public class SimpleNotepad implements INotepad {
	private Page[] pages;

	public SimpleNotepad(int numberOfPages) {
		this.pages = new Page[numberOfPages];
		Scanner sc= new Scanner(System.in);
		for(int index=0; index<numberOfPages; index++){
			System.out.println("Enter tytle for page number: "+numberOfPages);
			String title=sc.nextLine();
			System.out.println("Enter text for page number: "+numberOfPages);
			String text=sc.nextLine();
			this.pages[index]=new Page(title, text);
		}
	}

	@Override
	public void deleteTextOnPage(int page) {
		this.pages[page].deleteText();
	}

	@Override
	public void checkOutPages() {
		if (this.pages != null) {
			for (int index = 0; index < this.pages.length; index++) {
				this.pages[index].readPage();
			}
		}
	}

	@Override
	public void addTextToPage(int page, String text) {
		this.pages[page].addText(text);
	}

	@Override
	public void insertNewTextOnPage(int page, String text) {
		this.pages[page].deleteText();
		this.pages[page].addText(text);
	}

}
