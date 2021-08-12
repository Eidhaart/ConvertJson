import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GlossList {

    @JsonProperty("GlossEntry")
    GlossEntry glossEntry;

}
