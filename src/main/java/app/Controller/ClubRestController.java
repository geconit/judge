package app.Controller;

import app.entity.Club;
import app.entity.Judge;
import app.repository.ClubRepository;
import app.repository.JudgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClubRestController {

    @Autowired
    ClubRepository repository;

    @GetMapping(value="/club",  produces= MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public List<Club> getAll() {
        List<Club> list = new ArrayList<>();
        Iterable<Club> clubs = repository.findAll();
        clubs.forEach(list::add);
        return list;
    }

    @GetMapping(value="/club/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public Club findById(@PathVariable("id") long id) {
        return repository.findOne(id);
    }
}
