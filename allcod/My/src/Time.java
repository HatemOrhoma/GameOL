// Name : Hatim Mahmoud, T1

import java.util.Scanner;

class Time{
  int Jhr,Mnt,Wch,Tg;				
static Time convert (double Tage) {
  Time t = new Time();
  t.Jhr= (int) (Tage /365.24);
  t.Mnt=(int) ((Tage % 365.24) / 30.43);
  t.Wch=(int)(Tage % 30.43)/7;
  t.Tg= (int) (Tage % 7);

    return t ;
  }

  public static void main(String[]arg){
	  Scanner nTag = new Scanner (System.in);
	  System.out.print("Geben Sie Tage ein ");
	  double Tage = nTag.nextDouble();
          Time t  = convert((double) Tage);
          System.out.println(t.Jhr+":"+t.Mnt+":"+t.Wch+":"+t.Tg); 
          System.out.println("Jahre"+" : "+"Monate"+" : "+"Wochen"+" : "+"Tage");
  
  }
 }


  
  