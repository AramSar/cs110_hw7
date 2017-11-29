package utils;

public class ArrayUtils {
  public static int[] reverse (int[] arr) {
    int[] empty = new int[arr.length];
    for(int i = 0; i < arr.length; i++) {
      empty[i] = arr[arr.length -1 - i];
    }
    return empty;
  }
public static String stringifyArray  (int[] arr) {
  	String result = "";
  	for(int i = 0; i < arr.length; i++) {
  	  if(i == arr.length - 1) {
    	  result += arr[arr.length - 1];
    	  return result;
  	  }
  		result += arr[i] + ", ";
  	}
  	return result;
  }
}

