package convertjson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GlossMap {

    private static final String API_KEY = "access_key=87173741dfa24ee2ddbad9a55c877479";

    public static void main(String[] args) throws IOException, InterruptedException {
        callApi();
    }

    public static GlossaryMaster callApi() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("http://api.exchangeratesapi.io/v1/latest?" + API_KEY))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        int responseCode = response.statusCode();
        String body = response.body();
        ObjectMapper objectMapper = new ObjectMapper();
        GlossaryMaster glossaryMaster = objectMapper.readValue(json(), GlossaryMaster.class);
        System.out.printf("Response code %d with body %s%n", responseCode, body);
        return glossaryMaster;
    }

    public static String json() {
        return "{\n" +
                "  \"glossary\": {\n" +
                "    \"title\": \"example glossary\",\n" +
                "    \"convertjson.GlossDiv\": {\n" +
                "      \"title\": \"S\",\n" +
                "      \"convertjson.GlossList\": {\n" +
                "        \"convertjson.GlossEntry\": {\n" +
                "          \"ID\": \"SGML\",\n" +
                "          \"SortAs\": \"SGML\",\n" +
                "          \"GlossTerm\": \"Standard Generalized Markup Language\",\n" +
                "          \"Acronym\": \"SGML\",\n" +
                "          \"Abbrev\": \"ISO 8879:1986\",\n" +
                "          \"convertjson.GlossDef\": {\n" +
                "            \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\n" +
                "            \"GlossSeeAlso\": [\"GML\", \"XML\"]\n" +
                "          },\n" +
                "          \"GlossSee\": \"markup\"\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "}";
    }

}
