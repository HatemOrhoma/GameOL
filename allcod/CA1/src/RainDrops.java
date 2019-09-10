class RaindropConverter {

     static void convert(int number) {
        if (number%3==0) System.out.print("Pling");
        if (number%5==0) System.out.print("Plang");
        if (number%7==0) System.out.print("Plong");
        else System.out.println(number);
    }

}

public class RainDrops {
public static void main (String []args) {
	
	RaindropConverter.convert(105);
}
}

