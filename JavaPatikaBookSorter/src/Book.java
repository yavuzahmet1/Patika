public class Book {
    private int pageNumber;
    private String bookName;
    private String writerName;

    public Book(int pageNumber,String bookName,String writerName){
        this.pageNumber=pageNumber;
        this.bookName=bookName;
        this.writerName=writerName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }
}
