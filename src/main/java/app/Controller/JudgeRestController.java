package app.Controller;

import app.entity.Judge;
import app.repository.JudgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class JudgeRestController {

    @Autowired
    JudgeRepository repository;

    @RequestMapping("/api/hi")
    public String hi(){
        return "<h1>Hello fucking rest world</h1>";
    }

    @GetMapping(value="/judge",  produces= MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public List<Judge> getAll() {
        List<Judge> list = new ArrayList<>();
        Iterable<Judge> customers = repository.findAll();

        customers.forEach(list::add);
        return list;
    }

    @PostMapping(value="/postjudge")
    public Judge postCustomer(@RequestBody Judge judge) {

        repository.save(new Judge(judge.getFirstName(), judge.getLastName(), judge.getRange()));
        return judge;
    }

    @GetMapping(value="/findbylastname/{lastName}",  produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Judge> findByLastName(@PathVariable String lastName) {

        List<Judge> customers = repository.findByLastName(lastName);
        return customers;
    }

    @DeleteMapping(value="/customer/{id}")
    public void deleteCustomer(@PathVariable long id){
        repository.delete(id);
    }
}
