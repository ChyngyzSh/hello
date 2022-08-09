package kg.megacom.hello.controllers;

import kg.megacom.hello.models.Position;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/position")
public class PositionController {

    //save
    //update
    //select
    //delete
    @GetMapping("/all")
    public List<Position> findAll(){
        return Arrays.asList(
                new Position(1l, "Head", true),
                new Position(2l, "deputy", true),
                new Position(3l, "lead specialist", true),
                new Position(4l, "senior specialist", true)
        );

    }

    @GetMapping("/id")
    public Position getById(@PathVariable Long id){   // непонятно как работает?
        return new Position(id, "head", true);

    }


    @PostMapping("/save")
    public Position save(@RequestBody Position position){
        position.setId(100L);
        return position;
    }


}
