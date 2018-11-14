package demo.spring.testmongo.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@DataMongoTest
public class MangoRepositoryTest {

    @Autowired
    private MangoRepository repository;

    @Test
    public void saveMango() {

        final Mango mango = Mango.builder()
                .id(UUID.randomUUID())
                .type(MangoTypeEnum.SWEET)
                .part("123#ABC")
                .build();

        repository.save(mango);
    }
}