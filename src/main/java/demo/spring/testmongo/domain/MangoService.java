package demo.spring.testmongo.domain;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
public class MangoService {

    private MangoRepository mangoRepository;

    public void save(Mango mango) {
        mangoRepository.save(mango);
    }

    public List<Mango> getByType(MangoTypeEnum type) {
        return mangoRepository.findMangoByType(type);
    }

    public List<Mango> getByPart(UUID part) {
        return mangoRepository.findMangoByPart(part);
    }
}
