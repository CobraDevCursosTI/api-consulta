package br.com.cobradev.apiconsulta.controller;

import br.com.cobradev.apiconsulta.model.CnpjModel;
import br.com.cobradev.apiconsulta.service.CnpjService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cnpj")
public class CnpjController {

    private final CnpjService cnpjService;

    public CnpjController(CnpjService cnpjService) {
        this.cnpjService = cnpjService;
    }

    @GetMapping("/consulta/{cnpj}")
    public ResponseEntity<CnpjModel> consulta(@PathVariable String cnpj) {
        return new ResponseEntity<>(cnpjService.consultar(cnpj), HttpStatus.OK);
    }
}
