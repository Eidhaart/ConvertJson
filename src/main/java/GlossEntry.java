import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GlossEntry {
    @JsonProperty("ID")
    private String id;
    @JsonProperty("SortAs")
    private String sortAs;
    @JsonProperty("GlossTerm")
    private String glossTerm;
    @JsonProperty("Acronym")
    private String acronym;
    @JsonProperty("Abbrev")
    private String abbrev;
    @JsonProperty("GlossDef")
    private GlossDef glossDef;
    @JsonProperty("GlossSee")
    private String glossSee;
}
