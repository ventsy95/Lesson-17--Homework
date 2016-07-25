import java.util.Scanner;

public class SimpleNotepad implements INotepad {
	Page[] pages;

	public SimpleNotepad(int numberOfPages) {
		this.pages = new Page[numberOfPages];
		Scanner sc = new Scanner(System.in);
		for (int index = 0; index < numberOfPages; index++) {
			System.out.println("Enter title for page number: " + (index+1));
			String title = sc.nextLine();
			System.out.println("Enter text for page number: " + (index+1));
			String text = sc.nextLine();
			this.pages[index] = new Page(title, text);
		}
	}

	@Override
	public void deleteTextOnPage(int page) {
		if (page <= this.pages.length && page > 0) {
			this.pages[page-1].deleteText();
		}
	}

	@Override
	public void checkOutPages() {
		for (int index = 0; index < this.pages.length; index++) {
			if (this.pages[index] != null) {
				this.pages[index].readPage();
			} else {
				System.out.println("Page number: " + (index + 1) + " is empty");
			}
		}
	}

	@Override
	public void addTextToPage(int page, String text) {
		if (page <= this.pages.length && page > 0) {
			this.pages[page-1].addText(text);
		}
	}

	@Override
	public void insertNewTextOnPage(int page, String text) {
		if (page <= this.pages.length && page > 0) {
			this.pages[page-1].deleteText();
			this.pages[page-1].setText(text);
		}
	}

}
