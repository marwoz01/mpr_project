package pl.edu.pjatk.MPR_2.services;

import org.springframework.stereotype.Component;
import pl.edu.pjatk.MPR_2.model.Capybara;

import java.util.ArrayList;
import java.util.List;

@Component
public class CapybaraService {
    List<Capybara> capybaraList = new ArrayList<>();

    public CapybaraService() {
        capybaraList.add(new Capybara("Michał", "brown"));
        capybaraList.add(new Capybara("Bartosz", "gray"));
        capybaraList.add(new Capybara("Marcel", "beige"));
    }

    public List<Capybara> getCapybaraList() {
        return this.capybaraList;
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
}
