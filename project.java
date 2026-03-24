String url = "jdbc:mysql://localhost:3306/studentdb";

String user = "root";

String password = "root"; // your mysql password

try {

// Load Driver

Class.forName("com.mysql.cj.jdbc.Driver");

// Create Connection

Connection con = DriverManager.getConnection(url, user, password);

System.out.println("Connected to MySQL Database!");

// Create Statement

Statement stat con.createStatement();

// Execute Query

ResultSet rs = stmt.executeQuery("SELECT FROM student");

// Display Data