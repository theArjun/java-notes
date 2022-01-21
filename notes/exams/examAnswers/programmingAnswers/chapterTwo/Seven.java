abstract class Book {
    private String name;
    private String author;
    private int totalPage;
    private String publisher;

    Book(String name, String author, int totalPage, String publisher) {
        this.name = name;
        this.author = author;
        this.totalPage = totalPage;
        this.publisher = publisher;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getTotalPage() {
        return totalPage;
    }
    public String getPublisher() {
        return publisher;
    }
    abstract void getBookType(); // Abstract Method
}

class Novel extends Book {

    Novel(String name, String author, int totalPage, String publisher) {
        super(name, author, totalPage, publisher);
    }

    

    void getBookType() {
        System.out.println("Book Type : "+this.getClass());
        System.out.println("Name : " + getName());
        System.out.println("Author : " + getAuthor());
        System.out.println("Total Page : " + getTotalPage());
        System.out.println("Publisher: " + getPublisher());
    }
}

class Magazine extends Book {

    Magazine(String name, String author, int totalPage, String publisher) {
        super(name, author, totalPage, publisher);
    }

    void getBookType() {
        System.out.println("Book Type : " + this.getClass().getName()); // This returns the class type
        System.out.println("Name : " + getName());
        System.out.println("Author : " + getAuthor());
        System.out.println("Total Page : " + getTotalPage());
        System.out.println("Publisher: " + getPublisher());
    }
}

class Seven{
    public static void main(String[] args){
        Magazine magazineOne = new Magazine("TIME", "Time Editorial", 61, "Time Publishers");
        magazineOne.getBookType();
    }
}