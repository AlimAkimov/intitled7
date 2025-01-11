
    public static void main(String[] args) {
    Author george = new Author("Джордж Оруэлл");
    Author oruell = new Author("Оруэлл Джордж");

    Book oneNineEightFour = new Book("1984", 1949, george);
    Book barnyard = new Book("Скотный двор", 1945, oruell);

    oneNineEightFour.setYearOfPublication(2025);
        System.out.println(barnyard.toString());
    }

