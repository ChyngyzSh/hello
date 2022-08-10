package kg.megacom.hello.controllers;


import kg.megacom.hello.controllers.base.CrudMethods;
import kg.megacom.hello.models.Department;
import kg.megacom.hello.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController implements CrudMethods<Department> {
//CrudMethods<Department> - вместо Т указываем нужный Класс

    @Autowired
    DepartmentService departmentService;

    @Override
    public List<Department> findAll() {
        return departmentService.findAll();
    }

    @GetMapping("/id")
    public Department getById(Long id) {
        return new Department(id, "Accountant", true);
    }

    @Override
    public Department save(Department department) {
        return departmentService.save(department);
    }

    @Override
    public Department update(Department department) {
        return departmentService.save(department);
    }

    @Override
    public Department remove(Long id) {
        return new Department(id, "IT", true);
    }
}
