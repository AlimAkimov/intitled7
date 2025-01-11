public class Book {
    private String nameBook;
    private int yearOfPublication;
    private Author author;

    public Book(String nameBook, int yearOfPublication, Author author) {
        this.nameBook = nameBook;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Название книги ='" + nameBook + '\'' +
                ", год публикации " + yearOfPublication +
                ", автор " + author;
    }
}
