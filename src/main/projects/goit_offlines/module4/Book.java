package module4;

import java.io.Serializable;

public class Book implements Serializable , Comparable<Book> {
    private String name;
    private String authorName;
    private int pageCount;

    public Book(String name, String authorName, int pageCount) {
        this.name = name;
        this.authorName = authorName;
        this.pageCount = pageCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (pageCount != book.pageCount) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        return authorName != null ? authorName.equals(book.authorName) : book.authorName == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
        result = 31 * result + pageCount;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.getPageCount() - o.getPageCount();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Book with name " + getName() + " is cleared");
    }
}
