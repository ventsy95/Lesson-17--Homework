
public class NotepadDemo {

	public static void main(String[] args) {

		SimpleNotepad simple = new SimpleNotepad(2);

		INotepad secured = new SecuredNotepad(4, "asdf1234");

		simple.checkOutPages();
		simple.deleteTextOnPage(2);
		simple.addTextToPage(1, "bla bla");
		simple.insertNewTextOnPage(2, "New text");
		simple.checkOutPages();

		secured.checkOutPages();
		secured.deleteTextOnPage(3);
		secured.addTextToPage(4, "Some more text");
		secured.insertNewTextOnPage(3, "New text on this page");
		secured.checkOutPages();
	}

}
