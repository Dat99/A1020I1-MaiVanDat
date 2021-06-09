package model.repository;

import model.bean.Department;

public interface DepartmentRepository {
    void addNewDepartment(Department department);
    void findAll();
    void deleteDepartment(int id);
}
