package kg.megacom.hello.controllers;

import kg.megacom.hello.controllers.base.CrudMethods;
import kg.megacom.hello.models.Employee;
import kg.megacom.hello.models.Position;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //определяет что этот класс работает ?
@RequestMapping("/employee") // указывает путь до опред.класса
public class EmployeeController {
    @GetMapping("/employee/{name}") //создает гет(маршрут) - N-point'y
    public Employee getEmployee(@PathVariable String name){

        Employee employee = new Employee(1L, "name", "surname");
        return employee;
    }
    @GetMapping("/employee")                                        //создает гет(маршрут)
    public Employee get(@RequestParam String name) {        //(передает данные
        Employee employee = new Employee(1l, name, "Sheraliev");
        return employee;
    }

}
