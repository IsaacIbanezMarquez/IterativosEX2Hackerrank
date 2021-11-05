import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


//  ENUNCIADO:

/*  Suposem que podeu retrocedir en el temps i quan us portàveu malament a classe haguéssiu pogut fer ús d'aquest programa. Cal que introduïu un text i un nombre N. Cal que imprimiu N vegades el text per pantalla, una en cada línia diferent.

Input Format

Introduïu un text (String) i un enter N.

Constraints

No n'hi ha

Output Format

Imprimeix N vegades el text introduït

Sample Input 0

Fare sempre la feina de M3 de DAM
5
Sample Output 0

Fare sempre la feina de M3 de DAM
Fare sempre la feina de M3 de DAM
Fare sempre la feina de M3 de DAM
Fare sempre la feina de M3 de DAM
Fare sempre la feina de M3 de DAM

 */




public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String i;
        i = sc.nextLine();
        int n;
        n = sc.nextInt();
        int num = 1;

        while (n >= num) {System.out.println(i);
            num++;

        }

    }
}
