package designpat.websearch;

/**
 * This filter checks if a query exceeds a certain size limit.
 */
public class SizeFilter implements QueryFilter{
   public final int limit;
   
   public SizeFilter(int limit) {
      this.limit = limit;
   }
   
   public boolean check(String query) {
      int n = query.length();
      return n > limit;
   }
}