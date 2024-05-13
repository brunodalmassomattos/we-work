package br.com.fiap.wework.dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


public record UsuarioResponseDTO(
        String id,
        String nome,
        String cpfCnpj,
        String dataNascimento,
        String dataAbertura,
        String email,
        String senha,
        br.com.fiap.wework.domain.usuario.Perfil perfil) implements Serializable {

    public static String parseDate(Date data) {
        if (data == null) {
            return null;
        }

        return new SimpleDateFormat("yyyy-MM-dd").format(data);
    }
}
