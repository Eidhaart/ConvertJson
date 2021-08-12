import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Glossary {


    private String title;
    @JsonProperty("GlossDiv")
    private GlossDiv glossDiv;
}
