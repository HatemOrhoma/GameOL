import java.util.Scanner;
public class UOP {
 public static void main(String[] args)
 {
  long bin1, bin2;
  int i = 0, speicher = 0;
  int[] r = new int[20];
  Scanner in = new Scanner(System.in);

  System.out.print("Input first binary number: ");
  bin1 = in.nextLong();
  System.out.print("Input second binary number: ");
  bin2 = in.nextLong();

  while (bin1 != 0 || bin2 != 0) 
  {
   r[i++] = (int)((bin1 % 10 + bin2 % 10 + speicher) % 2);
   speicher = (int)((bin1 % 10 + bin2 % 10 + speicher) / 2);
   bin1 = bin1 / 10;
   bin2 = bin2 / 10;
  }
  if (speicher != 0) {
   r[i++] = speicher;
  }
  --i;
  System.out.print("Sum of two binary numbers: ");
  while (i >= 0) {
   System.out.print(r[i--]);
  }
   System.out.print("\n");  
 }
}


