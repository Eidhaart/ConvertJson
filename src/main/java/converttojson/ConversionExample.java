package converttojson;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConversionExample {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json  = objectMapper.writeValueAsString(
                Person.builder()
                        .firstName("John")
                        .lastName("Doe")
                        .adress(Adress.builder()
                                .postalCode("00-666")
                                .street("Example street 2")
                                .build())
                        .build()
        );
        System.out.println(json);
    }
}
