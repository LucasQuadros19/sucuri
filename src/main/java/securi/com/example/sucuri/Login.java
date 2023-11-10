package securi.com.example.sucuri;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Getter
@Setter
@Table(name = "login",schema = "public")
public class Login {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable=false,unique=true)
    private long id;
    @Column(name = "nome",nullable = false)
    private String nome;
    @Column(name = "senha",nullable = false)
    private String senha;
    @Column(name = "autorizacao",nullable = false)
    private String autorizacao;
}
