package demo.spring.testmongo.domain;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Value
@Builder
public class Mango {
    @Id
    UUID id;

    String part;

    MangoTypeEnum type;
}
