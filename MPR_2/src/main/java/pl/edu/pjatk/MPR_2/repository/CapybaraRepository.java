package pl.edu.pjatk.MPR_2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.pjatk.MPR_2.model.Capybara;

import java.util.List;

@Repository
//@Component
public interface CapybaraRepository extends CrudRepository<Capybara, Long> {
    public List<Capybara> findByName(String name);
}
