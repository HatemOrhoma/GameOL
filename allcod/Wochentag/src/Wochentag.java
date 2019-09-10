
public class Wochentag {
public static void main (String []args){
	int q = Integer.parseInt(args[0]);
	int m = Integer.parseInt(args[1]);
	int z = Integer.parseInt(args[2]);
	
	
	
	if (m == 1 || m ==2) {
		m=m+12;
		z--;
	}
	
int j = (int) (z/100);
int k = (int) Math.floorMod(z,100);
int h =(int) Math.floorMod((q+(((13*(m+1))/5))+(k)+((k)/4)+(j/4)-(2*j)) , 7);

String tag;
switch (h){
case 0 : tag = "Samstag";
	break;
case 1 : tag = "Sonntag";
	break;
case 2 : tag = "Montag";
	break;

case 3 : tag = "Dienstag";
	break;

case 4 : tag = "Mitt";
	break;
case 5 : tag = "Don";
	break;
case 6 : tag = "Fri";
	break;
default : tag = "Invaild";
break;
}
System.out.println(h);
System.out.println(tag);
	}
}
