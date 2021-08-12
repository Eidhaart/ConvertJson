package convertjson;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Glossary {


    private String title;
    @JsonProperty("convertjson.GlossDiv")
    private GlossDiv glossDiv;
}
