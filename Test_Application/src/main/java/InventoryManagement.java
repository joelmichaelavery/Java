import java.sql.*;

import javax.swing.JOptionPane;

public class InventoryManagement {
    // Create a connection to the database
    static final String USER = "root";
    static final String PASSWORD = "titans28";
    static final String HOST = "127.0.0.1";
    static final String DATABASE = "inventory";
    
    static Connection conn = null;
    
    public static void main(String[] args) {
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + DATABASE, USER, PASSWORD);
            
            // Create a statement to execute queries
            Statement stmt = conn.createStatement();
            
            // Create the table if it does not exist
            String createTableQuery = "CREATE TABLE IF NOT EXISTS inventory ("
                    + "part_number INT PRIMARY KEY,"
                    + "part_name VARCHAR(255),"
                    + "part_description VARCHAR(255),"
                    + "quantity INT"
                    + ")";
            stmt.executeUpdate(createTableQuery);
            
            // Get user input on what situation to handle
            while (true) {
                String[] choices = {"Add an item", "Remove an item", "Update an item", "Exit"};
                String choice = (String) JOptionPane.showInputDialog(null, "What situation would you like to handle?", 
                        "Inventory Management", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
                
                if (choice.equals(choices[0])) { // Add an item
                    String partNumberInput = JOptionPane.showInputDialog("Enter part number:");
                    int partNumber = Integer.parseInt(partNumberInput);
                    String partName = JOptionPane.showInputDialog("Enter part name:");
                    String partDescription = JOptionPane.showInputDialog("Enter part description:");
                    String quantityInput = JOptionPane.showInputDialog("Enter quantity:");
                    int quantity = Integer.parseInt(quantityInput);
                    add_item(partNumber, partName, partDescription, quantity);
                    JOptionPane.showMessageDialog(null, "Item added successfully.");
                } else if (choice.equals(choices[1])) { // Remove an item
                    String partNumberInput = JOptionPane.showInputDialog("Enter part number:");
                    int partNumber = Integer.parseInt(partNumberInput);
                    remove_item(partNumber);
                    JOptionPane.showMessageDialog(null, "Item removed successfully.");
                } else if (choice.equals(choices[2])) { // Update an item
                    String partNumberInput = JOptionPane.showInputDialog("Enter part number:");
                    int partNumber = Integer.parseInt(partNumberInput);
                    String partName = JOptionPane.showInputDialog("Enter new part name (press Cancel to skip):");
                    String partDescription = JOptionPane.showInputDialog("Enter new part description (press Cancel to skip):");
                    String quantityInput = JOptionPane.showInputDialog("Enter new quantity (press Cancel to skip):");
                    Integer quantity = null;
                    if (quantityInput != null && !quantityInput.isEmpty()) {
                        quantity = Integer.parseInt(quantityInput);
                    }
                    update_item(partNumber, partName, partDescription, quantity);
                    JOptionPane.showMessageDialog(null, "Item updated successfully.");
                } else if (choice.equals(choices[3])) { // Exit
                    break;
                }
            }
        } catch (SQLException | ClassNotFoundException e) { // added ClassNotFoundException
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
  public static void add_item(int partNumber, String partName, String partDescription, int quantity) throws SQLException {
    String query = "INSERT INTO inventory (part_number, part_name, part_description, quantity) "
            + "VALUES (?, ?, ?, ?)";
    PreparedStatement pstmt = conn.prepareStatement(query);
    pstmt.setInt(1, partNumber);
    pstmt.setString(2, partName);
    pstmt.setString(3, partDescription);
    pstmt.setInt(4, quantity);
    pstmt.executeUpdate();
}
}