public class Books {

    // main method
    public static void main (String[] args) {

        // objects
        Book book1 = new Book("Nerwy puscily. Czyli kupa wariatow.", "Janusz Korwin-Mikke", "Red Horse",
                271, 6);
        Book book2 = new Book("Michnikowszczyzna.", "Rafal A. Ziemkiewicz", "Fabryka Slow",
                377, 7);

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
