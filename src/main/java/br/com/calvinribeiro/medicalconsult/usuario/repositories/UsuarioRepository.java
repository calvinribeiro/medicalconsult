package br.com.calvinribeiro.medicalconsult.usuario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.calvinribeiro.medicalconsult.usuario.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
