package app.repository;

import app.entity.Judge;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JudgeRepository extends CrudRepository<Judge, Long> {
    List<Judge> findByLastName(String lastName);
}
