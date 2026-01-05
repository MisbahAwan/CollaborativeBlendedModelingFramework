package activitySummarizationAI;

import java.util.Arrays;
import java.util.List;

public class ChangeExtractor {
    public static String getChanges(String oldModel, String newModel) {
    	
    	System.out.println("Old Model.................................................:"+oldModel);
    	System.out.println("New Model.................................................:"+newModel);
    	
        List<String> oldLines = Arrays.asList(oldModel.split("\n"));
        List<String> newLines = Arrays.asList(newModel.split("\n"));

        StringBuilder changes = new StringBuilder();
        for (String line : newLines) {
            if (!oldLines.contains(line)) {
                changes.append("Added: ").append(line).append("\n");
            }
        }
        for (String line : oldLines) {
            if (!newLines.contains(line)) {
                changes.append("Removed: ").append(line).append("\n");
            }
        }
        return changes.toString();
    }
}
