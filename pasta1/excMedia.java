//Allan Maia
package pasta1;
import java.util.scanner;

public class media{
    publi static void main(String[] args){
        double n1, n2, total;

        Scanner sc=new Scanner(System.in);
        System.out.println("Informe nota 1: ");
        n1=sc.nextDouble();
        System.out.println("Informe nota 2: ");
        n2=sc.nextDouble();

        total=(n1+n2)/2;
        System.out.println("Média: " + total);
  }
}
