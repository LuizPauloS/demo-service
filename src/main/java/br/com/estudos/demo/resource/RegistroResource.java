package br.com.estudos.demo.resource;

import br.com.estudos.demo.model.Registro;
import br.com.estudos.demo.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registros")
public class RegistroResource {

    @Autowired
    private RegistroService registroService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Registro registro) {
        return ResponseEntity.ok(this.registroService.save(registro));
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(this.registroService.findAll());
    }

    @GetMapping("/example")
    public ResponseEntity<?> findExampleRegister() {
        return ResponseEntity.ok(this.registroService.findExampleRegister());
    }
}
