package pl.edu.pjatk.MPR_2.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.edu.pjatk.MPR_2.model.Capybara;
import pl.edu.pjatk.MPR_2.services.CapybaraService;

import java.util.List;

@RestController
public class MyRestController {
    private CapybaraService capybaraService;

    @Autowired
    public MyRestController(CapybaraService capybaraService) {
        this.capybaraService = capybaraService;
    }

    @GetMapping("capybara/all")
    public List<Capybara> getAll() {
        return this.capybaraService.getCapybaraList();
    }

    @GetMapping("capybara/{id}")
    public Capybara getById(@PathVariable int id) {
        return this.capybaraService.getCapybaraById(id);
    }

    @PostMapping("capybara")
    public void create(@RequestBody Capybara capybara) {
        this.capybaraService.createCapybara(capybara);
    }

    @DeleteMapping("capybara/{id}")
    public void deleteCapybara(@PathVariable int id) {
        this.capybaraService.deleteCapybara(id);
    }

    @PutMapping("capybara/{id}")
    public void updateCapybara(@PathVariable int id, @RequestBody Capybara updatedCapybara) {
        this.capybaraService.updateCapybara(id, updatedCapybara);
    }
}
