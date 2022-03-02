import java.util.Arrays;
public class Sort{
   public static void main(String args[]){
      int array[] = {97, 10, 85, 20, 25, 85, 63, 96, 57, 1};
      int size = array.length;
      Arrays.sort(array);
      System.out.println("sorted Array ::"+Arrays.toString(array));
      int res = array[size-1];
      System.out.println("largest element is ::"+res);
   }
}