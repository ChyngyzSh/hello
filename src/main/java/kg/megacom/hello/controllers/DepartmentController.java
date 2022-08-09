package kg.megacom.hello.controllers;


import kg.megacom.hello.controllers.base.CrudMethods;
import kg.megacom.hello.models.Department;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController implements CrudMethods<Department> {
//CrudMethods<Department> - вместо Т указываем нужный Класс

    @Override
    public List<Department> findAll() {
        return Arrays.asList(
                new Department(1L, "monitoring", true),
                new Department(2L, "financing", true),
                new Department(3L, "IT", true)
        );
    }

    @Override
    public Department getById(Long id) {
        return new Department(id, "Accountant", true);
    }

    @Override
    public Department save(Department department) {
        department.setId(101L);
        return department;
    }

    @Override
    public Department update(Department department) {
        department.setName("security");
        return department;
    }

    @Override
    public Department remove(Long id) {
        return new Department(id, "IT", true);
    }
}
