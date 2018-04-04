package app.Controller;

import app.entity.Competitor;
import app.repository.CompetitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CompetitorRestController {

    @Autowired
    CompetitorRepository repository;

    @GetMapping(value="/competitor",  produces= MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public List<Competitor> getAll() {
        List<Competitor> list = new ArrayList<>();
        Iterable<Competitor> competitors = repository.findAll();
        competitors.forEach(list::add);
        return list;
    }

    @GetMapping(value="/competitor/{id}",  produces= MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public List<Competitor> getByClubId(@PathVariable("id") long id){
        return repository.findByClubId(id);
    }
}
