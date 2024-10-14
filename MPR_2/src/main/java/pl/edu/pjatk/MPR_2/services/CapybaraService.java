package pl.edu.pjatk.MPR_2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.pjatk.MPR_2.model.Capybara;
import pl.edu.pjatk.MPR_2.repository.CapybaraRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CapybaraService {
    private CapybaraRepository capybaraRepository;

    List<Capybara> capybaraList = new ArrayList<>();

    @Autowired
    public CapybaraService(CapybaraRepository repository) {
        this.capybaraRepository = repository;

        this.capybaraRepository.save(new Capybara("Michał", "brown"));
        this.capybaraRepository.save(new Capybara("Bartosz", "gray"));
        this.capybaraRepository.save(new Capybara("Marcel", "beige"));
    }

    public List<Capybara> getCapybaraByName(String name) {
        return this.capybaraRepository.findByName(name);
    }

    public List<Capybara> getAllCapybaras() {
        return (List<Capybara>) this.capybaraRepository.findAll();
    }

    public Capybara getCapybaraById(int id) {
        if (id >= 0 && id < capybaraList.size()) {
            return capybaraList.get(id);
        }
        return null;
    }

    public void createCapybara(Capybara capybara) {
        this.capybaraList.add(capybara);
    }

    public void deleteCapybara(int id) {
        if (id >= 0 && id < capybaraList.size()) {
            capybaraList.remove(id);
        }
    }

    public void updateCapybara(int id, Capybara updatedCapybara) {
        if (id >= 0 && id < capybaraList.size()) {
            capybaraList.set(id, updatedCapybara);
        }
    }

    public Optional<Capybara> get(Long id) {
        return this.capybaraRepository.findById(id);
    }
}
