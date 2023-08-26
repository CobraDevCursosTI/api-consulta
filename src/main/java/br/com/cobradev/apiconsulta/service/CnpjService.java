package br.com.cobradev.apiconsulta.service;

import br.com.cobradev.apiconsulta.model.CepModel;
import br.com.cobradev.apiconsulta.model.CnpjModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CnpjService {

    private final RestTemplate restTemplate;

    public CnpjService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CnpjModel consultar(String cnpj) {
        return restTemplate.getForEntity("https://brasilapi.com.br/api/cnpj/v1/" + cnpj, CnpjModel.class).getBody();
    }
}
