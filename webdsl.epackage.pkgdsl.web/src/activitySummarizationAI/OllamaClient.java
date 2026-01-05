package activitySummarizationAI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class OllamaClient {
    public static String queryLLM(String prompt) throws IOException {
        URL url = new URL("http://localhost:11434/api/generate");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Type", "application/json");

        String body = String.format("""
                {
                    "model": "tinyllama",
                    "prompt": "%s",
                    "stream": false
                }
                """, prompt.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n").replace("\t", "\\t"));
        
        System.out.println("llama Call:"+body);

        try (OutputStream os = conn.getOutputStream()) {
            os.write(body.getBytes());
        }

        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
        }
        String fullResponse = result.toString(); // your full result string
        int start = fullResponse.indexOf("\"response\":\"") + 11;
        int end = fullResponse.indexOf("\",\"done\"");
        String modelResponse = fullResponse.substring(start, end);

        // Optional: unescape newlines and quotes
        modelResponse = modelResponse.replace("\\n", "\n").replace("\\\"", "\"");
        
        System.out.println("Result:"+modelResponse);
        
        return modelResponse;//result.toString();
    }
}
