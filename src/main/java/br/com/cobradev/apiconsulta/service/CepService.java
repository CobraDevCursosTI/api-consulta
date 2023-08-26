package br.com.cobradev.apiconsulta.service;

import br.com.cobradev.apiconsulta.model.CepModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CepService {

    private final RestTemplate restTemplate;

    public CepService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CepModel consultar(String cep) {
        CepModel cepModel = restTemplate.getForEntity("https://viacep.com.br/ws/" + cep + "/json/", CepModel.class).getBody();
        cepModel.setCep(cepModel.getCep().replace("-", ""));
        return cepModel;
    }
}
