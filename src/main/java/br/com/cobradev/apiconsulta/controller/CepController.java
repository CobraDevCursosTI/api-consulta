package br.com.cobradev.apiconsulta.controller;

import br.com.cobradev.apiconsulta.model.CepModel;
import br.com.cobradev.apiconsulta.service.CepService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
public class CepController {

    private final CepService cepService;

    public CepController(CepService cepService) {
        this.cepService = cepService;
    }

    @GetMapping("/consulta/{cep}")
    public ResponseEntity<CepModel> consulta(@PathVariable String cep) {
        return new ResponseEntity<>(cepService.consultar(cep), HttpStatus.OK);
    }
}
