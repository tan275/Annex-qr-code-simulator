/
package dados32;
import java.util.Scanner;
public class Dados32 {
public static void main(String[] args) {
final int QUANT = 10;
String [] v = new String[QUANT];
int [] vio = new int[QUANT];
Scanner entrada = new Scanner(System.in);
String s;
int u = -1;
char tecla;
boolean troca, ok = true;
do {
u++;
System.out.print("Nome: ");
v[u] = entrada.nextLine();
System.out.print("Continua [S/N] ?");
vio[u] = 0;
do {
s = entrada.nextLine();
tecla = s.charAt(0);
tecla = Character.toLowerCase(tecla);
} while (tecla != 's' && tecla != 'n');
} while (tecla != 'n' && u <= QUANT);
for (int i = 0;i <= u;i++) {
vio[i] = i;
}
for (int i = 0;i < u;i++) {
for (int j = i+1;j <= u;j++) {
if (v[vio[i]].compareTo(v[vio[j]]) > 0) {
int temp = vio[i];
vio[i] = vio[j];
vio[j] = temp;
}
}
}
System.out.println("Lista de Nomes Ordenados");
for (int i = 0;i <= u;i++) {
System.out.printf("Nome: %s\n",v[vio[i]]);
}
}
}