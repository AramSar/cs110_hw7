package utils;

public class Math {
  public static int factorial (int num) {
    if(num <= 0) return 1;
    return num * factorial(--num);
  }
  public static int factorialLoop (int num){
  	int fact = 1;
  	for(int i = num; i > 0; i--) {
  		fact *= i;
  	}
  	if(num == 0) return 1;
  	return fact;
  }
}