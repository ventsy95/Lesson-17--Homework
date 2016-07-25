
public interface INotepad {
	void addTextToPage(int page);
	void insertNewTextOnPage(int page);
	void deleteTextOnPage(int page);
	void checkOutPage(Page[] pages);
}
