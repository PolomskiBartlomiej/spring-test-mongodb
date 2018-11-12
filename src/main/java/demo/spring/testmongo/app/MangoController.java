package demo.spring.testmongo.app;

import demo.spring.testmongo.domain.Mango;
import demo.spring.testmongo.domain.MangoService;
import demo.spring.testmongo.domain.MangoTypeEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
class MangoController {

    final MangoService mangoService;

    @ResponseStatus(HttpStatus.CREATED)
    void saveMango(Mango mango) {
        mangoService.save(mango);
    }

    List<Mango> getByType(MangoTypeEnum type) {
       return mangoService.getByType(type);
    }

    List<Mango> getByPart(String part) {
        return mangoService.getByPart(UUID.fromString(part));
    }
}
