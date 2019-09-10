
public class trsh {

}

int[] e = new int[100];



e[0] = 1;

e[1] = 2;
e[2] = 7;
int overflow = e.length;
int n = 3;
System.out.print("bevor ");
for (int i=0; i<n; i++)
System.out.print(e[i] + " ");
System.out.println();

// Inserting key
n = insert(e, 3, 4, overflow);

System.out.print("danach ");
for (int i=0; i<n; i++)
System.out.print(e[i] + " ");
arr=e[i];