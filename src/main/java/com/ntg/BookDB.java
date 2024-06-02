package com.ntg;

import java.sql.*;

public class BookDB {
    String DB_URL = "jdbc:mysql://localhost:3306/console_book_management";
    String USERNAME = "root";
    String PASSWORD = "";


    public void editBook(int bookId, String title, String isbnCode, int authorId, int publicationYear, int genreId, int publisherId, int price, int totalPage){
        try {
            // ket noi csdl
            String sql = "UPDATE book SET book_title = '" + title + "' , isbn_code = '" + isbnCode + "', author_id = '" + authorId + "', publication_year = '" + publicationYear + "', genre_id = '" + genreId + "', publisher_id = '" + publisherId + "', selling_price = '" + price + "', page_number = '" + totalPage + "' WHERE id =  " + bookId  ;
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // tao cau lenh sql va thuc thi
            Statement stmt = conn.createStatement();
            // executeupdate: insert, update, delete
            stmt.executeUpdate(sql);

            System.out.println("Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editBookPage (int bookId, int totalPage){
        try {
            // ket noi csdl
            String sql = "UPDATE book SET page_number = '" + totalPage + "' WHERE id = " + bookId;
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // tao cau lenh sql va thuc thi
            Statement stmt = conn.createStatement();
            // executeupdate: insert, update, delete
            stmt.executeUpdate(sql);

            System.out.println("Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editBookPrice (int bookId, int price){
        try {
            // ket noi csdl
            String sql = "UPDATE book SET selling_price = '" + price + "' WHERE id = " + bookId;
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // tao cau lenh sql va thuc thi
            Statement stmt = conn.createStatement();
            // executeupdate: insert, update, delete
            stmt.executeUpdate(sql);

            System.out.println("Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void editBookPublisher (int bookId, int publisherId){
        try {
            // ket noi csdl
            String sql = "UPDATE book SET publisher_id = '" + publisherId + "' WHERE id = " + bookId;
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // tao cau lenh sql va thuc thi
            Statement stmt = conn.createStatement();
            // executeupdate: insert, update, delete
            stmt.executeUpdate(sql);

            System.out.println("Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editBookGenre (int bookId, int genreId){
        try {
            // ket noi csdl
            String sql = "UPDATE book SET genre_id = '" + genreId + "' WHERE id = " + bookId;
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // tao cau lenh sql va thuc thi
            Statement stmt = conn.createStatement();
            // executeupdate: insert, update, delete
            stmt.executeUpdate(sql);

            System.out.println("Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editBookPublishing (int bookId, int publicationYear){
        try {
            // ket noi csdl
            String sql = "UPDATE book SET publication_year = '" + publicationYear + "' WHERE id = " + bookId;
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // tao cau lenh sql va thuc thi
            Statement stmt = conn.createStatement();
            // executeupdate: insert, update, delete
            stmt.executeUpdate(sql);

            System.out.println("Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editBookAuthor (int bookId, int authorId){
        try {
            // ket noi csdl
            String sql = "UPDATE book SET author_id = '" + authorId + "' WHERE id = " + bookId;
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // tao cau lenh sql va thuc thi
            Statement stmt = conn.createStatement();
            // executeupdate: insert, update, delete
            stmt.executeUpdate(sql);

            System.out.println("Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editBookIsbn (int bookId, String isbnCode){
        try {
            // ket noi csdl
            String sql = "UPDATE book SET isbn_code = '" + isbnCode + "' WHERE id = " + bookId;
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // tao cau lenh sql va thuc thi
            Statement stmt = conn.createStatement();
            // executeupdate: insert, update, delete
            stmt.executeUpdate(sql);

            System.out.println("Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editBookTitle (int bookId, String title){
        try {
            // ket noi csdl
            String sql = "UPDATE book SET book_title = '" + title + "' WHERE id = " + bookId;
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // tao cau lenh sql va thuc thi
            Statement stmt = conn.createStatement();
            // executeupdate: insert, update, delete
            stmt.executeUpdate(sql);

            System.out.println("Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void insertBook(String title, String isbnCode, int authorId, int publicationYear, int genreId, int publisherId, int price, int totalPage) throws SQLException {
        try {
            // ket noi csdl
            String sql = "INSERT INTO book (book_title, isbn_code, author_id, publication_year, genre_id, publisher_id, selling_price, page_number)"
                    + "VALUES ('" + title + "', '" + isbnCode + "', " + authorId + ", '" + publicationYear + "',  " + genreId + ", " + publisherId + ", '" + price + "', '" + totalPage + "')";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // tao cau lenh sql va thuc thi
            Statement stmt = conn.createStatement();
            // executeupdate: insert, update, delete
            stmt.executeUpdate(sql);

            System.out.println("Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertGenre(String genreName){
        try {
            // ket noi csdl
            String sql = "INSERT INTO genre (genre_name) VALUES ('" + genreName + "')";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // tao cau lenh sql va thuc thi
            Statement stmt = conn.createStatement();
            // executeupdate: insert, update, delete
            stmt.executeUpdate(sql);

            System.out.println("Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertPublisher(String publisherName){
        try {
            // ket noi csdl
            String sql = "INSERT INTO publisher (publisher_name) VALUES ('" + publisherName + "')";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // tao cau lenh sql va thuc thi
            Statement stmt = conn.createStatement();
            // executeupdate: insert, update, delete
            stmt.executeUpdate(sql);

            System.out.println("Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertAuthor(String authorName){
        try {
            // ket noi csdl
            String sql = "INSERT INTO author (author_name) VALUES ('" + authorName + "')";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // tao cau lenh sql va thuc thi
            Statement stmt = conn.createStatement();
            // executeupdate: insert, update, delete
            stmt.executeUpdate(sql);

            System.out.println("Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayPublisher(){
        try {
            String sql = "SELECT * FROM publisher";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                //Display values
                int id = rs.getInt("id");
                String publisher = rs.getString("publisher_name");

                System.out.println("id: " + id + " || " + "publisher: " + publisher);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayGenre(){
        try {
            String sql = "SELECT * FROM genre";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                //Display values
                int id = rs.getInt("id");
                String genre = rs.getString("genre_name");

                System.out.println("id: " + id + " || " + "genre: " + genre);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayAuthor(){
        try {
            String sql = "SELECT * FROM author";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                //Display values
                int id = rs.getInt("id");
                String author = rs.getString("author_name");

                System.out.println("id: " + id + " || " + "author: " + author);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayBook() throws SQLException {
        try {
            String sql = "SELECT b.id, b.book_title, b.isbn_code, a.author_name, b.publication_year, g.genre_name, p.publisher_name, b.selling_price, b.page_number FROM book b JOIN author a ON b.author_id = a.id JOIN genre g ON b.genre_id = g.id JOIN publisher p ON b.publisher_id = p.id ORDER BY b.id ASC";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                //Display values
                int id = rs.getInt("id");
                String book_title = rs.getString("book_title");
                String isbn = rs.getString("isbn_code");
                String author = rs.getString("author_name");
                int publication_year = rs.getInt("publication_year");
                String genre = rs.getString("genre_name");
                String publisher = rs.getString("publisher_name");
                float selling_price = rs.getFloat("selling_price");
                int page_number = rs.getInt("page_number");

                System.out.println("id: " + id + " || " + "book_title: " + book_title + " || " + "isbn_code: " + isbn + " || " + "author: " + author + " || " + "publishing year: " + publication_year + " || " + "genre: " + genre + " || " + "publisher: " + publisher + " || " + "selling price: " + selling_price + " || " + "total page: " + page_number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void displayBook(int bookId) throws SQLException {
        try {
            String sql = "SELECT b.id, b.book_title, b.isbn_code, a.author_name, b.publication_year, g.genre_name, p.publisher_name, b.selling_price, b.page_number FROM book b JOIN author a ON b.author_id = a.id JOIN genre g ON b.genre_id = g.id JOIN publisher p ON b.publisher_id = p.id WHERE b.id = " + bookId;
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                //Display values
                int id = rs.getInt("id");
                String book_title = rs.getString("book_title");
                String isbn = rs.getString("isbn_code");
                String author = rs.getString("author_name");
                int publication_year = rs.getInt("publication_year");
                String genre = rs.getString("genre_name");
                String publisher = rs.getString("publisher_name");
                float selling_price = rs.getFloat("selling_price");
                int page_number = rs.getInt("page_number");

                System.out.println("id: " + id + " || " + "book_title: " + book_title + " || " + "isbn_code: " + isbn + " || " + "author: " + author + " || " + "publishing year: " + publication_year + " || " + "genre: " + genre + " || " + "publisher: " + publisher + " || " + "selling price: " + selling_price + " || " + "total page: " + page_number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}