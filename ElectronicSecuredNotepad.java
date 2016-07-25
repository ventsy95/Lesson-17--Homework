
public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {
	private boolean isNotepadStarted;

	public ElectronicSecuredNotepad(int numberOfPages, String password) {
		super(numberOfPages, password);

	}

	@Override
	public void start() {
		if (passwordCheck()) {
			this.isNotepadStarted = true;
		}
	}

	@Override
	public void stop() {
		if (passwordCheck()) {
			this.isNotepadStarted = false;
		}
	}

	@Override
	public boolean isStarted() {
		if (passwordCheck()) {
			if (isNotepadStarted) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public void deleteTextOnPage(int page) {
		if (isStarted()) {
			if (passwordCheck() && page <= this.pages.length && page > 0) {
				this.pages[page - 1].deleteText();
			}
		} else {
			System.out.println("Notepad must first be started.");
		}
	}

	@Override
	public void checkOutPages() {
		if (isStarted()) {
			if (passwordCheck()) {
				if (this.pages != null) {
					for (int index = 0; index < this.pages.length; index++) {
						this.pages[index].readPage();
					}
				}
			}
		} else {
			System.out.println("Notepad must first be started.");
		}
	}

	@Override
	public void addTextToPage(int page, String text) {
		if (isStarted()) {
			if (passwordCheck() && page <= this.pages.length && page > 0) {
				this.pages[page - 1].addText(text);
			}
		} else {
			System.out.println("Notepad must first be started.");
		}
	}

	@Override
	public void insertNewTextOnPage(int page, String text) {
		if (isStarted()) {
			if (passwordCheck() && page <= this.pages.length && page > 0) {
				this.pages[page - 1].deleteText();
				this.pages[page - 1].setText(text);
			}
		} else {
			System.out.println("Notepad must first be started.");
		}
	}

	@Override
	public boolean searchWord(String word) {
		if (isStarted()) {
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
		} else {
			System.out.println("Notepad must first be started.");
			return false;
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		if (isStarted()) {
			if (passwordCheck()) {
				for (int index = 0; index < pages.length; index++) {
					if (pages[index].containtsDigits()) {
						pages[index].readPage();
					}
				}
			}
		} else {
			System.out.println("Notepad must first be started.");
		}

	}

}
