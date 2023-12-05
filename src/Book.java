import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int publishingYear;

    public Book(String name, Author author, int publishingYear) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Название: " + this.name + ", автор: " + this.author + ", год издания: " + this.publishingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b2 = (Book) other;
        return name.equals(b2.name) && author.equals(b2.author) && publishingYear == b2.publishingYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publishingYear);
    }
}
