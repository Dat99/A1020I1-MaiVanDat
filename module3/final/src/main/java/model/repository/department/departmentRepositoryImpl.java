package model.repository.department;

import model.bean.Department;
import model.repository.DepartmentRepository;

import java.sql.*;

public class departmentRepositoryImpl implements DepartmentRepository {
    private String jdbcURL = "jdbc:mysql://localhost:3306/department";
    private String jdbcUsername = "root";
    private String jdbcPassword = "abc123";
    private static final String INSERT_DER = "insert into mat_bang values (?, ?, ?, ? ,?, ?, ? ,?,?);";
    private static final String SELECT_ALL_DER = "select type_department,price,floors \n" +
            "from department\n";
    private BaseRepository baseRepository = new BaseRepository();

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {

            e.printStackTrace();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public void addNewDepartment(Department department) {
        System.out.println(INSERT_DER);

        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DER)) {
            preparedStatement.setInt(1, department.getId());
            preparedStatement.setInt(2, department.getStatus());
            preparedStatement.setString(3, department.getArea());
            preparedStatement.setString(4, department.getNumberOfFloors());
            preparedStatement.setString(5, department.getStyle());
            preparedStatement.setString(6, department.getPrice());


            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    private void printSQLException(SQLException e) {

    }

    @Override
    public void findAll() {
        Department department = null;

        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_DER)) {
            System.out.println(preparedStatement);

            ResultSet rs = preparedStatement.executeQuery();



    } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        @Override
    public void deleteDepartment(int id) {

    }
}
