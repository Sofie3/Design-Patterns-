package designpat.websearch;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Perform "web search" (from a file), notify the interested observers of each
 * query.
 */
public class WebSearchModel {
    private final File sourceFile;
    private final List<QueryObserver> observers = new ArrayList<>();
    private final List<QueryFilter> filters = new ArrayList<>();

    public interface QueryObserver {
        void onQuery(String query);
    }

    public WebSearchModel(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public void pretendToSearch() {
        // Source:
        // https://stackoverflow.com/questions/5868369/how-can-i-read-a-large-text-file-line-by-line-using-java
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                notifyAllObservers(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Every observer has a corresponding filter.
    public void addQueryObserver(QueryFilter filter, QueryObserver queryObserver) {
        observers.add(queryObserver);
        filters.add(filter);
    }

    private void notifyAllObservers(String line) {
        for (int i = 0; i < filters.size(); i++) {
            // The filter checks if the observer should be notified.
            if (filters.get(i).check(line)) {
               observers.get(i).onQuery(line);
            }
        }
    }
}
