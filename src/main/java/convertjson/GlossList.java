package convertjson;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GlossList {

    @JsonProperty("convertjson.GlossEntry")
    GlossEntry glossEntry;

}
