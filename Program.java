import java.util.Scanner;

public class Program {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           X perem1 = new X();
           H perem2 = new H();
           Y perem3 = new Y();
           perem1.setXY(scanner.nextInt());
           perem2.setHU(scanner.next().charAt(0));
           perem3.setYX(scanner.nextInt());
           int x = perem1.getXY();
           char h = perem2.getHU();
           int y = perem3.getYX();
           try {
               switch (h) {
                   case '+':
                       System.out.print(x + y);
                       break;
                   case '-':
                       System.out.print(x - y);
                       break;
                   case '*':
                       System.out.print(x * y);
                       break;
                   case '/':
                       System.out.print(x / y);
                       break;
               }
           } catch (Exception e) {
               System.out.print("Делить на ноль нельзя");
           }
       }
   }
