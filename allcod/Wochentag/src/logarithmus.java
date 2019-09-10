public class logarithmus {
public static void main(String[] args) {
int start = Integer.parseInt(args[0]);
int end = Integer.parseInt(args[1]);
int step = Integer.parseInt(args[2]);
int i = start;
while ((step >0 && i <= end) || (step < 0 && i >= end))  {
System.out.println(i);
i = i + step;
}
}
}