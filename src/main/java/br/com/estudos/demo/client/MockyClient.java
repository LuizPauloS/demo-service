package br.com.estudos.demo.client;

import br.com.estudos.demo.model.Registro;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name="mockyio", url="${mockyio.url}", decode404 = true)
public interface MockyClient {

    @GetMapping
    Registro findExempleRegister();
}
