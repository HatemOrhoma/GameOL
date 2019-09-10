
public class Ha7 {
public static void main(String[] arg) {
Out.print("Geben Sie eine Zahl ein (Ende = Strg-C): ");
	int x = In.readInt();while (In.done()) {
Out.println(x + ": " + (x / 3600) + ":" + (x % 3600 / 60) + ":" + (x % 60));
		Out.println();
		Out.print("Geben Sie eine Zahl ein (Ende = Strg-C): ");
		x = In.readInt();
		}
		}

}
