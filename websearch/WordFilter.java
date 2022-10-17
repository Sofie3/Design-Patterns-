package designpat.websearch;

/**
 * This filter checks if a query exceeds a certain size limit.
 */
public class WordFilter implements QueryFilter{
   public final String target;
   
   public WordFilter(String target) {
      // To make the search case insensitive.
      this.target = target.toLowerCase();
   }
   
   public boolean check(String query) {
      // To make the search case insensitive.
      query = query.toLowerCase();
      
      int n = query.length() - target.length() + 1;
      for (int i = 0; i < n; i++) {
         // Looks for the first letter.
         if (query.charAt(i) == target.charAt(0)) {
            String potentialHit = query.substring(i, i+ target.length());
            
            // Checks if the target word is at this position.
            if(potentialHit.equals(target)) {
               return true;
            }
         }
      }
      return false;
   }
}