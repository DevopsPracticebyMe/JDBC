# Spring JDBC Project

## Overview
This project demonstrates the use of Spring JDBC to manage Employee data. It includes basic CRUD operations for employee records in a MySQL database.

## Project Structure
- **src/main/java/com/abj/spring/**: Contains the Java source files for the application.
  - `App.java`: The main class that runs the Spring application.
  - `Employee.java`: A model class representing the Employee entity.
  - `EmployeeDao.java`: An interface defining the methods for CRUD operations.
  - `EmployeeDaoImpl.java`: The implementation of the `EmployeeDao` interface using Spring JDBC.
  - `EmployeeBusiness.java`: An interface for business logic related to employees.
  - `EmployeeBusinessImpl.java`: The implementation of the `EmployeeBusiness` interface.

## Dependencies
The project uses the following dependencies, managed via Maven:
- Spring Context
- Spring JDBC
- MySQL Connector
- JUnit (for testing)

## Setup Instructions
1. **Clone the repository**:
   ```bash
   git clone <repository-url>
# Navigate to the project directory
cd springjdbc
# Configure the MySQL database

# Create a database named springjdbc (or any name of your choice).
# Update the application.properties file with your database credentials.
# Build the project using Maven
 mvn clean install

# Run the application
mvn spring-boot:run
# Employee.java: This is the model class representing the employee entity.
public class Employee {
    private int id;
    private String name;
    private String role;
    // getters and setters
}

# EmployeeDao.java: This interface defines the CRUD operations for Employee
public interface EmployeeDao {
    void addEmployee(Employee employee);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);
}
# EmployeeBusiness.java: This interface defines business logic methods related to Employe
public interface EmployeeBusiness {
    void addEmployee(Employee employee);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);
}

# EmployeeBusinessImpl.java: This class implements the EmployeeBusiness interface.
@Service
public class EmployeeBusinessImpl implements EmployeeBusiness {
    @Autowired
    private EmployeeDao employeeDao;

    // Implementation of business logic methods
}
# App.java: The main class that runs the Spring application.
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
## Database Configuration
# Ensure your application.properties file contains the correct database configurations
spring.datasource.url=jdbc:mysql://localhost:3306/springjdbc
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update


# To run the tests
mvn test

# Contact
For any inquiries or support, please contact [aswinbhargav1@gmail.com].
