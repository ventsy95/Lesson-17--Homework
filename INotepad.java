
public interface INotepad {
	void addTextToPage(int page, String text);
	void insertNewTextOnPage(int page, String text);
	void deleteTextOnPage(int page);
	void checkOutPages();
}
