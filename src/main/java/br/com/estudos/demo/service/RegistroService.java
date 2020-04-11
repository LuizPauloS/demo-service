package br.com.estudos.demo.service;

import br.com.estudos.demo.client.MockyClient;
import br.com.estudos.demo.model.Registro;
import br.com.estudos.demo.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroService {

    private final MockyClient mockyClient;
    private final RegistroRepository registroRepository;

    @Autowired
    public RegistroService(MockyClient mockyClient,
                           RegistroRepository registroRepository) {
        this.mockyClient = mockyClient;
        this.registroRepository = registroRepository;
    }

    public Registro save(Registro registro) {
        return this.registroRepository.save(registro);
    }

    public List<Registro> findAll() {
        return this.registroRepository.findAll();
    }

    public Registro findExampleRegister() {
        return this.mockyClient.findExempleRegister();
    }
}
