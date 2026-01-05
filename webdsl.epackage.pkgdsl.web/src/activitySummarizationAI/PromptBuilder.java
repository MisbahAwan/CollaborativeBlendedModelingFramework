package activitySummarizationAI;

public class PromptBuilder {
    public static String buildPrompt(String changeSummary, String username, String timestamp) {
        return """
        You are an assistant summarizing collaborative modeling activity.
        A user made the following changes to the system model:
        %s
        Username: %s
        Time: %s

        Provide a human-readable summary of these changes.
        """.formatted(changeSummary, username, timestamp);
    }
}
