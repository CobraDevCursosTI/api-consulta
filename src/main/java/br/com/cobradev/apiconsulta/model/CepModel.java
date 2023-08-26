package br.com.cobradev.apiconsulta.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CepModel implements Serializable {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
}
