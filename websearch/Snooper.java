package designpat.websearch;

/**
 * Watches the search queries
 */
public class Snooper {
    private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;
        
        QueryFilter filter1 = new WordFilter("friend");
        QueryFilter filter2 = new SizeFilter(60);
        
        // Adds the first filter with an observer.
        model.addQueryObserver(filter1, new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("Oh Yes!     " + query);
            }
        });
        
        // Adds the second filter with an observer.
        model.addQueryObserver(filter2, new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("So long....     " + query);
            }
        });
    }
}
