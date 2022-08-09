package kg.megacom.hello.controllers;


import kg.megacom.hello.controllers.base.CrudMethods;
import kg.megacom.hello.models.Department;
import kg.megacom.hello.models.Position;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController implements CrudMethods<Department> {
//CrudMethods<Department> - вместо Т указываем нужный Класс

    @Override
    public List<Department> findAll() {
        return null;
    }

    @Override
    public Department getById(Long id) {
        return null;
    }

    @Override
    public Department save(Position position) {
        return null;
    }
}
