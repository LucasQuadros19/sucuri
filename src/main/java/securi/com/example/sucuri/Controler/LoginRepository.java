package securi.com.example.sucuri.Controler;



import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import securi.com.example.sucuri.Login;

import java.util.Optional;
@Repository

public interface LoginRepository extends JpaRepository<Login, Long> {
    Optional<Login> findByNome(String nome);
}