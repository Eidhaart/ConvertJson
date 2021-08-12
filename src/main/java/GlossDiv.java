import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GlossDiv {

    private String title;
    @JsonProperty("GlossList")
    private GlossList glossList;

}
