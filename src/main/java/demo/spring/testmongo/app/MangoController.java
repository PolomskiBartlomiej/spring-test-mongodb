package demo.spring.testmongo.app;

import demo.spring.testmongo.domain.Mango;
import demo.spring.testmongo.domain.MangoService;
import demo.spring.testmongo.domain.MangoTypeEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mangos")
class MangoController {

    final MangoService mangoService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    void saveMango(@RequestBody Mango mango) {
        mangoService.save(mango);
    }

    @GetMapping
    List<Mango> getByType(@PathVariable MangoTypeEnum type) {
       return mangoService.getByType(type);
    }

    @GetMapping
    List<Mango> getByPart(@PathVariable String part) {
        return mangoService.getByPart(part);
    }
}
