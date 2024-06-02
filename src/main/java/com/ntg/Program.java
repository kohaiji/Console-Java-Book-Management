package com.ntg;

import java.awt.print.Book;
import java.sql.SQLException;
import java.util.Scanner;

public class Program {

    public static void ShowMenu(){
        System.out.println("----------MENU----------");
        System.out.println("a. Add Books \n" +
                "b. Edit Books \n" +
                "c. Show All Books \n" +
                "d. Add Author \n" +
                "e. Add Publisher \n" +
                "f. Add Genre \n" +
                "g. Exit the program ");

    }
    public static void main(String[] args) throws SQLException {
        BookDB BookDB = new BookDB();
        Scanner sc = new Scanner(System.in);
        String option;
        String key;
        do {
            ShowMenu();
            System.out.println("Enter your selection: ");
            option = sc.nextLine();
            switch (option){
                case "a":
                    // lay du lieu tu nguoi dung
                    System.out.println("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.println("Enter ISBN Code: ");
                    String isbnCode = sc.nextLine();
                    System.out.println("----------List Author----------");
                    BookDB.displayAuthor();
                    System.out.println("Enter Author ID: ");
                    int authorId = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter Publishing Year: ");
                    int publicationYear = Integer.parseInt(sc.nextLine());
                    System.out.println("----------List Genre----------");
                    BookDB.displayGenre();
                    System.out.println("Enter Genre ID: ");
                    int genreId = Integer.parseInt(sc.nextLine());
                    System.out.println("----------List Publisher----------");
                    BookDB.displayPublisher();
                    System.out.println("Enter Publisher ID: ");
                    int publisherId = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter Selling Price: ");
                    int price = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter Total Page: ");
                    int totalPage = Integer.parseInt(sc.nextLine());
                    // ket noi den DB va insert
                    BookDB.insertBook(title, isbnCode, authorId, publicationYear, genreId, publisherId, price, totalPage);
                    break;
                case "b":
                    System.out.println("----------List Books----------");
                    BookDB.displayBook();
                    System.out.println("Enter the ID book you want to change: ");
                    int bookId = Integer.parseInt(sc.nextLine());
                    System.out.println("----------List Books----------");
                    BookDB.displayBook(bookId);
                    System.out.println("a. Change Book Title \n" +
                            "b. Change ISBN Code \n" +
                            "c. Change Author Name \n" +
                            "d. Change Publishing Year \n" +
                            "e. Change Genre Name \n" +
                            "f. Change Publisher Name \n" +
                            "g. Change Selling Price \n" +
                            "h. Change Total Page \n" +
                            "i. Exit");
                    System.out.println("What information do you want to change: ");
                    key = sc.nextLine();
                        switch (key){
                            case "a":
                                System.out.println("----------List Books----------");
                                BookDB.displayBook(bookId);
                                System.out.println("Enter Book Title you want to change: ");
                                title = sc.nextLine();
                                BookDB.editBookTitle(bookId, title);
                                break;
                            case "b":
                                System.out.println("----------List Books----------");
                                BookDB.displayBook(bookId);
                                System.out.println("Enter ISBN Code you want to change: ");
                                isbnCode = sc.nextLine();
                                BookDB.editBookIsbn(bookId, isbnCode);
                                break;
                            case "c":
                                System.out.println("----------List Books----------");
                                BookDB.displayBook(bookId);
                                System.out.println("----------List Author----------");
                                BookDB.displayAuthor();
                                System.out.println("Enter Author ID you want to change: ");
                                authorId = Integer.parseInt(sc.nextLine());
                                BookDB.editBookAuthor(bookId, authorId);
                                break;
                            case "d":
                                System.out.println("----------List Books----------");
                                BookDB.displayBook(bookId);
                                System.out.println("Enter Publishing Year you want to change: ");
                                publicationYear = Integer.parseInt(sc.nextLine());
                                BookDB.editBookPublishing(bookId, publicationYear);
                                break;
                            case "e":
                                System.out.println("----------List Books----------");
                                BookDB.displayBook(bookId);
                                System.out.println("----------List Genre----------");
                                BookDB.displayGenre();
                                System.out.println("Enter Genre ID you want to change: ");
                                genreId = Integer.parseInt(sc.nextLine());
                                BookDB.editBookGenre(bookId, genreId);
                                break;
                            case "f":
                                System.out.println("----------List Books----------");
                                BookDB.displayBook(bookId);
                                System.out.println("----------List Publisher----------");
                                BookDB.displayPublisher();
                                System.out.println("Enter Publisher ID you want to change: ");
                                publisherId = Integer.parseInt(sc.nextLine());
                                BookDB.editBookPublisher(bookId, publisherId);
                                break;
                            case "g":
                                System.out.println("----------List Books----------");
                                BookDB.displayBook(bookId);
                                System.out.println("Enter the price you want to change: ");
                                price = Integer.parseInt(sc.nextLine());
                                BookDB.editBookPrice(bookId, price);
                                break;
                            case "h":
                                System.out.println("----------List Books----------");
                                BookDB.displayBook(bookId);
                                System.out.println("Enter the total page you want to change: ");
                                totalPage = Integer.parseInt(sc.nextLine());
                                BookDB.editBookPage(bookId, totalPage);
                                break;
                            case "i":
                                System.out.println("Exit!");
                                break;
                            default:
                                System.out.println("Invalid!");
                                break;
                        }
                    break;
                case "c":
                    System.out.println("----------List Books----------");
                    BookDB.displayBook();
                    break;
                case "d":
                    System.out.println("----------List Author----------");
                    BookDB.displayAuthor();
                    System.out.println("Enter author name: ");
                    String authorName = sc.nextLine();
                    BookDB.insertAuthor(authorName);
                    break;
                case "e":
                    System.out.println("----------List Publisher----------");
                    BookDB.displayPublisher();
                    System.out.println("Enter publisher name: ");
                    String publisherName = sc.nextLine();
                    BookDB.insertPublisher(publisherName);
                    break;
                case "f":
                    System.out.println("----------List Genre----------");
                    BookDB.displayGenre();
                    System.out.println("Enter genre name: ");
                    String genreName = sc.nextLine();
                    BookDB.insertGenre(genreName);
                    break;
                case "g":
                    System.out.println("End Program!");
                    break;
                default:
                    System.out.println("Invalid!");
                    break;
            }
        }
        while (option.compareTo("g") != 0);
        // dong scanner
        sc.close();

    }
}
