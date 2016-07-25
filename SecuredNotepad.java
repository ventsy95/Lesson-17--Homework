import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
	private String password;

	public SecuredNotepad(int numberOfPages, String password) {
		super(numberOfPages);
		this.setPassword(password);
	}

	public boolean passwordCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password for notepad: ");
		String pass = sc.nextLine();
		if (pass.equals(this.getPassword())) {
			return true;
		} else {
			System.out.println("Incorrect password!");
			System.out.println("Access denied. Can't perform operation.");
			return false;
		}
	}

	@Override
	public void deleteTextOnPage(int page) {
		if (passwordCheck() && page <= this.pages.length && page > 0) {
			this.pages[page - 1].deleteText();
		}
	}

	@Override
	public void checkOutPages() {
		if (passwordCheck()) {
			if (this.pages != null) {
				for (int index = 0; index < this.pages.length; index++) {
					this.pages[index].readPage();
				}
			}
		}
	}

	@Override
	public void addTextToPage(int page, String text) {
		if (passwordCheck() && page <= this.pages.length && page > 0) {
			this.pages[page - 1].addText(text);
		}
	}

	@Override
	public void insertNewTextOnPage(int page, String text) {
		if (passwordCheck() && page <= this.pages.length && page > 0) {
			this.pages[page - 1].deleteText();
			this.pages[page - 1].setText(text);
		}
	}

	@Override
	public boolean searchWord(String word) {
		if (passwordCheck()) {
			for (int index = 0; index < pages.length; index++) {
				if (pages[index].searchWord(word)) {
					System.out.println("Word found on page " + (index + 1));
					return true;
				}
			}
			System.out.println("Word not found.");
			return false;
		} else {
			return false;
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		if (passwordCheck()) {
			for (int index = 0; index < pages.length; index++) {
				if (pages[index].containsDigits()) {
					pages[index].readPage();
				}
			}
		}

	}

	private String getPassword() {
		return password;
	}

	private void setPassword(String password) {
		if (password != null) {
			this.password = password;
		}
	}

}
