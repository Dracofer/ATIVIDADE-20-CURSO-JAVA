import java.util.Scanner;
import java.util.Locale;

public class Main {
  public static void main(String[] args) {  
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    for(int i=0 ; i!=n ; i=i+1){
    double v1 = sc.nextDouble();
        v1=v1 * 2;
    double v2 = sc.nextDouble();    
        v2=v2 * 3;
    double v3 = sc.nextDouble();    
        v3=v3 * 5;
        
     double medp=(v1 + v2 + v3) / 10;
        System.out.printf("%.1f%n", medp);
    }
    sc.close();
  }
}
