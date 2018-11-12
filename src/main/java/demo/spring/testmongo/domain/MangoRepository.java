package demo.spring.testmongo.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
interface MangoRepository extends MongoRepository<Mango,Integer> {

    List<Mango> findMangoByType(MangoTypeEnum type);

    List<Mango> findMangoByPart(UUID part);
}
