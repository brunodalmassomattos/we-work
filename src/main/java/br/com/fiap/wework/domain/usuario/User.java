package br.com.fiap.wework.domain.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    enum Perfil { LOCADOR, LOCATARIO, ADMINISTRADOR; }

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    @Column(name = "CPF_CNPJ")
    private String cpfCnpj;

    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @Temporal(TemporalType.DATE)
    private Date dataAbertura;

    @Column(unique = true)
    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Perfil perfil;
}
