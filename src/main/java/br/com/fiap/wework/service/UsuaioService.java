package br.com.fiap.wework.service;

import br.com.fiap.wework.domain.usuario.Usuario;
import br.com.fiap.wework.dto.UsuarioResponseDTO;
import br.com.fiap.wework.repositories.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuaioService {

    private UsuarioRepository usuarioRepository;
    private PerfilService perfilService;

    public UsuarioResponseDTO save(Usuario usuario) {
        var perfil = this.perfilService.findByDescricao(usuario.getPerfil().getDescricao());

        usuario.setPerfil(perfil);
        var save = this.usuarioRepository.save(usuario);

        return new UsuarioResponseDTO(
                save.getId(),
                save.getNome(),
                save.getCpfCnpj(),
                UsuarioResponseDTO.parseDate(save.getDataNascimento()),
                UsuarioResponseDTO.parseDate(save.getDataAbertura()),
                save.getEmail(),
                save.getSenha(),
                perfil);
    }

}
