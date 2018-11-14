package demo.spring.testmongo.domain;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class MangoService {

    private final MangoRepository mangoRepository;

    public void save(Mango mango) {
        mangoRepository.save(mango);
    }

    public List<Mango> getByType(MangoTypeEnum type) {
        return mangoRepository.findMangoByType(type);
    }

    public List<Mango> getByPart(String part) {
        return mangoRepository.findMangoByPart(part);
    }
}
