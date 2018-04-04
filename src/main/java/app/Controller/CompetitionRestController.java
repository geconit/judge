package app.Controller;

import app.entity.Competition;
import app.repository.CompetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CompetitionRestController {

    @Autowired
    CompetitionRepository repository;

    @GetMapping(value="/competition",  produces= MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public List<Competition> getAll() {
        List<Competition> list = new ArrayList<>();
        Iterable<Competition> clubs = repository.findAll();
        clubs.forEach(list::add);
        return list;
    }

    @GetMapping(value="/competition/{season}")
    @CrossOrigin(origins = "*")
    public List<Competition> getByClubId(@PathVariable("season") Integer season){
        return repository.findBySeason(season);
    }
}
