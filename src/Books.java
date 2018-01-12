public class Books {

    // main method
    public static void main (String[] args) {

        // objects
        Book book1 = new Book();
        book1.title = "Nerwy puscily. Czyli kupa wariatow.";
        book1.author = "Janusz Korwin-Mikke";
        book1.editor = "Red Horse";
        book1.chapters = 6;
        book1.pages = 271;

        Book book2 = new Book();
        book2.title = "Michnikowszczyzna.";
        book2.author = "Rafal A. Ziemkiewicz";
        book2.editor = "Fabryka Slow";
        book2.chapters = 7;
        book2.pages = 377;

        // print message
        System.out.println("Book 1:");
        System.out.printf("Title: %s\nAuthor: %s\nEditor: %s\nChapters: %s\nPages: %s\n",
                book1.title, book1.author, book1.editor, book1.chapters, book1.pages);
        System.out.print("------------------------------------------------------------\n");
        System.out.println("Book 2:");
        System.out.printf("Title: %s\nAuthor: %s\nEditor: %s\nChapters: %s\nPages: %s\n",
                book2.title, book2.author, book2.editor, book2.chapters, book2.pages);
        System.out.print("------------------------------------------------------------\n");
    }
}
