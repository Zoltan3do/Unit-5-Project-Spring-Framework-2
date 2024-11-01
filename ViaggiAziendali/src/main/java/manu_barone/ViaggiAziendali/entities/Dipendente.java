package manu_barone.ViaggiAziendali.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "dipendenti")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Dipendente {
    @Id
    @Column(unique=true)
    private String username;
    private String nome;
    private String cognome;
    private String email;


    public Dipendente(String username, String nome, String cognome, String email) {
        this.username = username;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

}
