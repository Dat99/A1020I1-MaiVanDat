package model.service;

import model.bean.Department;

public interface departmentService {
    void addNewDepartment(Department department);
    void findAll();
    void deleteDepartment(int id);
}
