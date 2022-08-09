package kg.megacom.hello.controllers.base;

import kg.megacom.hello.models.Employee;
import kg.megacom.hello.models.Position;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CrudMethods <T>{ //<T> чтобы не привязывать метод к определенному классу, заменяем на Т
    @GetMapping("/all")
    List<T> findAll();

    @GetMapping("/id")
    T getById(@PathVariable Long id);

    @PostMapping("/save")
    T save(@RequestBody T t);

    @PutMapping("/update")
    T update(@RequestBody T t);


    @DeleteMapping("/remove/{id}")
    T remove(@PathVariable Long id);





}
/*
@GetMapping("/all")
    List<Position> findAll();

    @GetMapping("/id")
    Position getById(@PathVariable Long id);

    @PostMapping("/save")
    Position save(@RequestBody Position position);
 */