import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectingDatabase {
     static Connection connection = null;
     static PreparedStatement preparedStatement = null;
     static ResultSet resultSet;
     private static String url ="jdbc:mysql://localhost:3306/cafe";
     private static String user = "root";
     private static String password ="Database24!";

    public static void main(String[] args) {
        try {
            log("\n---------- Making connection with the DB ----------");
            makeConnection();

            log("\n---------- Adding customers to DB ----------");
            add(1,"Asel Esra", "Ozyilmaz", 706197714, "Isakaev/Bishkek");
            add(2,"Osman Yasir", "Ozyilmaz", 706197714, "Kokjar/Bishkek");
            add(3,"Gunduzalp", "Dogrutekin", 706417519, "Djal/Bishkek");

            log("\n---------- Updating a customer from DB ----------");
            update(2,"Osman Yasir", "Ozyilmaz", 551115571, "Kokjar/Bishkek");

            log("\n---------- Deleting a customer from DB ----------");
            delete(3);

            log("\n---------- Getting all Data from DB ----------");
            getData();

            preparedStatement.close();
            connection.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void makeConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }
        try {
            connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                log("Connection Successful!");

            } else {
                log("Failed to make connection!");

            }
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }
    }
    private static void add(int id, String firstName, String lastName, int phoneNumber, String address) throws SQLException {
        try{
        preparedStatement = connection.prepareStatement("INSERT INTO Customers VALUES(?,?,?,?,?)");
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2, firstName);
        preparedStatement.setString(3, lastName);
        preparedStatement.setInt(4, phoneNumber);
        preparedStatement.setString(5, address);

        preparedStatement.executeUpdate();
        log( "Successfully added customer: " + firstName + " " + lastName );
        } catch (SQLException e) {
            log("Couldn't add customer");
            e.printStackTrace();
        }

    }
    private static void getData() {
        try {
            String getQueryStatement = "SELECT * FROM customers";
            preparedStatement = connection.prepareStatement(getQueryStatement);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                int phoneNumber = resultSet.getInt("phoneNumber");
                String address = resultSet.getString("address");

                System.out.format("%s, %s, %s, %s, %s\n",id, firstName, lastName, phoneNumber, address);
            }

        } catch (SQLException e) {
            log("Couldn't get the data");
            e.printStackTrace();
        }

    }
    public static void update(int id, String firstName, String lastName, int phoneNumber, String address){
        try {
            preparedStatement = connection.prepareStatement("UPDATE Customers SET firstname = ? , lastname = ?, phoneNumber = ?, address = ? WHERE id = ?");
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setInt(3, phoneNumber);
            preparedStatement.setString(4, address);
            preparedStatement.setInt(5, id);
            preparedStatement.executeUpdate();
            log("Successfully updated customer data with id: " + id);
            System.out.format("%s, %s, %s, %s, %s\n","New data = " + id, firstName, lastName, phoneNumber, address);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(int id){
        try {
            preparedStatement = connection.prepareStatement("DELETE FROM Customers WHERE id = " + id);
            preparedStatement.executeUpdate();
            log("Successfully deleted customer where id = " + id);
        } catch (SQLException e) {
            log("Couldn't delete data");
            e.printStackTrace();
        }
    }

    private static void log(String string) {
        System.out.println(string);

    }
}


