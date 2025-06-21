package com.AnunciosLoc.AnunciosLoc.bd.perfilDoUtilizador;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListarPerfil {

    private boolean status;
    private String mensagem;

    private List<ParChaveValorDTO> profile;

    
}