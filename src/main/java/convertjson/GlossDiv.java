package convertjson;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GlossDiv {

    private String title;
    @JsonProperty("convertjson.GlossList")
    private GlossList glossList;

}
