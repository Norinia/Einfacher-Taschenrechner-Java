package SimplerRechner;

// Datum des Startes: 1.08.24
// Ende wo ich sagen würde es funktionert 6.8.24 + verbesserung oder so
// hinzufügen von Wurzel 10.8.24

import java.util.Scanner;

public class SimplerRechner {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("erste Zahl:");
        double zahl1 = s.nextDouble();

        System.out.print("zweite Zahl: ");
        double zahl2 = s.nextDouble();

        System.out.print("Rechenzeichnen( + - * / : r): ");
        char operation = s.next().charAt(0);

        double result = rechne(operation,zahl1,zahl2);
        System.out.println(result);


    }

    public static double rechne(char operation, double zahl1, double zahl2) {
        double ergebnis = 0;
        try {
            switch (operation) {
                case '+': return (zahl1 + zahl2); //vorher: ergebnis = zahl1+zahl2; break;
                case '-': return (zahl1 - zahl2);
                case '*': return (zahl1 * zahl2);
                case '/': return (zahl1 / zahl2);

                case '^': return (Math.pow(zahl1, zahl2));
                case 'r': return (Math.pow(zahl1, 1.0 / zahl2));

                default:
                    System.out.println("Unkowen operation");
                    return Double.NaN;
            }
        } catch (ArithmeticException e) {
            System.out.println("Teilen durch 0?");
        }


        return ergebnis;

  }
}