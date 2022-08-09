package kg.megacom.hello.controllers;

import kg.megacom.hello.controllers.base.CrudMethods;
import kg.megacom.hello.models.Position;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/position")
public class PositionController implements CrudMethods<Position> {

    //save
    //update
    //select
    //delete
    @GetMapping("/all")
    public List<Position> findAll(){
        return Arrays.asList(
                new Position(1L, "Head", true),
                new Position(2L, "deputy", true),
                new Position(3L, "lead specialist", true),
                new Position(4L, "senior specialist", true)
        );
    }

    @GetMapping("/id")
    public Position getById(@PathVariable Long id){
        return new Position(id, "head", true);
    }

    @PostMapping("/save")
    public Position save(@RequestBody Position position){
        position.setId(100L);
        return position;
    }

    @Override
    public Position update(Position position) {
        position.setName("teacher");
        return position;
    }

    @Override
    public Position remove(Long id) {
        return new Position(id,"deputy", true);
    }
}
