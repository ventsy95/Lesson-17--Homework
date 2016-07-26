
public class NotepadDemo {

	public static void main(String[] args) {

		SimpleNotepad simple = new SimpleNotepad(2);

		SecuredNotepad secured= SecuredNotepad.createObject(3, "asDf234");
	
		ElectronicSecuredNotepad elNotepad= ElectronicSecuredNotepad.createObject(3, "pAssw0rd");

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
		
		elNotepad.checkOutPages();
		elNotepad.start();
		elNotepad.addTextToPage(1, "bla bla bla");
		elNotepad.deleteTextOnPage(3);
		elNotepad.printAllPagesWithDigits();
		elNotepad.searchWord("duma");
		elNotepad.checkOutPages();
		elNotepad.stop();
		elNotepad.deleteTextOnPage(2);
		
	}

}
