package app.repository;

import app.entity.Club;
import app.entity.Judge;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClubRepository extends CrudRepository<Club, Long> {
    List<Club> findByname(String name);
}
