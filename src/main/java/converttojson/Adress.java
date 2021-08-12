package converttojson;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Adress {
    private String postalCode;
    private String street;
}
