package com.company.task3;

public class MainTask3 {
    public static void main(String[] args) {

        Book  book1 = new Book(1, "F.Dostoevskii", "Prestuplenie i nakazanie", 1800);
        Book  book2 = new Book(2, "W.Shekspire", "Gamlet", 1500);
        Book  book3 = new Book(3, "Parlament", "Constitution KR", 1991);
        Book  book4 = new Book(4, "G.Shildt", "Head first Java", 2010);
        Book  book5 = new Book(5, "R.Martin", "Clean code", 2010);

        Department artDepartment = new Department("Art", 50);
        Department lawDepartment = new Department("Law", 10);
        TechDepartment techDepartment = new TechDepartment("Tech", 25, true);

        artDepartment.addBook(book1, 0);
        artDepartment.addBook(book2, 3);
        lawDepartment.addBook(book3, 0);
        techDepartment.addBook(book4, 1);
        techDepartment.addBook(book5, 2);

        artDepartment.showBooks();
        lawDepartment.showBooks();
        techDepartment.showBooks();

        artDepartment.showInfo();
        lawDepartment.showInfo();
        techDepartment.showInfo();

        lawDepartment.findByAuthor("SomeAuthor");
        techDepartment.findByAuthor("G.Shildt");

        System.out.println("Books in art department are " + artDepartment.getBooksCount());
        System.out.println("Books in law department are " + lawDepartment.getBooksCount());
        System.out.println("Books in tech department are " + techDepartment.getBooksCount());

        System.out.println(artDepartment);
        System.out.println(lawDepartment);
        System.out.println(techDepartment);

        Department[] departments = {artDepartment, lawDepartment, techDepartment};
        Library library = new Library("Aitmatov", "Manas str, 354", departments);
        System.out.println(library);



    }
}
