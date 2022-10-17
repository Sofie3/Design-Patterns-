package designpat.websearch;

/**
 * Interface for filter objects.
 */
interface QueryFilter {
   public boolean check(String query);
}