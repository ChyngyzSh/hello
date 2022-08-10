package kg.megacom.hello.services;

import kg.megacom.hello.models.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> findAll();
    Department save(Department department);
    Department update(Department department);
}
