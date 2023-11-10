package securi.com.example.sucuri.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import securi.com.example.sucuri.Login;

import java.util.List;

@RestController
@RequestMapping("/api/login")
public class testeControler {

    @Autowired
    private LoginRepository loginRepository;

    @GetMapping("/{id}")
    public Login getLoginById(@PathVariable long id) {
        return loginRepository.findById(id).orElse(null);
    }

    @GetMapping("/nome/{nome}")
    public Login getLoginByNome(@PathVariable String nome) {
        return loginRepository.findByNome(nome).orElse(null);
    }

    @GetMapping("/todos")
    public List<Login> getAllLogins() {
        return loginRepository.findAll();
    }

    @PostMapping("/adicionar")
    public Login addLogin(@RequestBody Login login) {
        return loginRepository.save(login);
    }

    @PutMapping("/atualizar/{id}")
    public Login updateLogin(@PathVariable long id, @RequestBody Login login) {
        if (loginRepository.existsById(id)) {
            login.setId(id);
            return loginRepository.save(login);
        }
        return null; // Ou lança uma exceção indicando que o login não existe
    }

    @DeleteMapping("/remover/{id}")
    public void deleteLogin(@PathVariable long id) {
        loginRepository.deleteById(id);
    }
}