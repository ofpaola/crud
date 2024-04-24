package br.com.crud.usuarios.external.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class UsuarioDTO {
    private String id;
    @NotBlank
    private String nome;
    @NotBlank
    private String email;
    @NotBlank
    private String documento;

    public UsuarioDTO(String id, String nome, String email, String documento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.documento = documento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
