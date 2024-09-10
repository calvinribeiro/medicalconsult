package br.com.calvinribeiro.medicalconsult.usuario.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "USUARIOS")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private Integer idUsuario;
    @Column(name = "NOME_USUARIO")
    private String nomeUsuario;
    @Column(name = "EMAIL_USUARIO")
    private String email;
    @Column(name = "CPF_USUARIO")
    private String cpf;
    @Column(name = "TELEFONE_USUARIO")
    private String telefone;
    @Column(name = "DATA_NASCIMENTO")
    private Date dataNascimento;
    //private Permissao permissao;
    @Column(name = "PERMISSAO")
    private Permissao permissao;

    public Usuario() {
    }
    
}


