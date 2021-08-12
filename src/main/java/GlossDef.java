import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class GlossDef {

    private String para;
    @JsonProperty("GlossSeeAlso")
    private List<String> glossSeeAlso;
}
