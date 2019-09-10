
public class TageConvert {
	import java.util.Scanner;


	  long Jhr,Mnt,Wch,Tg,h, m, s;				// wobei Jhr=Jahr ; Mnt = Monat ; Wch = Woche ; Tg= Tag 

	static Time convert ( long seconds) {
	  Time t = new Time();
	  t.Jhr=seconds / 31556736 ;
	  t.Mnt=(seconds % 31556736) /2592000;
	  t.Wch=(seconds % 2592000 )/604800;
	  t.Tg= (seconds % 604800 ) / 86400;
	  t.h = (seconds % 86400) / 3600 ;
	  t.m = (seconds % 3600) / 60;
	  t.s = seconds % 60; 
	    return t      ;
	  }
	  
	  public static void main(String[]arg){
		  Scanner sc = new Scanner (System.in);
		  System.out.print("Geben Sie seconds ein ");
		  long seconds = sc.nextLong();
	          Time t  = convert((int) seconds);
	          System.out.println(t.Jhr+":"+t.Mnt+":"+t.Wch+":"+t.Tg+":"+t.h+ ":"+ t.m + ":"+ t.s); 
	  }
	 }


	  
}
