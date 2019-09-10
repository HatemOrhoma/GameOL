class bubble0_Hatim {                               // Name des Programmes 
  public static void main(String[] args) {          // Kopf des Programmes
  int[] a = { 11, 7, 8 ,3 ,13, 9, 19, 0, 4 };       // Array hinzugefügt
    int i, j, k = 0;                                // Varibalen i,j,k hinzugefügt, 
  for (i = 0; i < a.length - 1; i++) {              // bedingung erstellt
    for (j = 0; j < a.length - 1 - i; j++) {        // Unter-bedingung erstellt 
      if (a[j] > a[j + 1]) {                        /* Hier sollte der Programm den                                                  "Nullwert" bzw den ersten Wert mit dem                                            zweiten wert vergleichen,dazu wird den                                           Variable k gebraucht */
        k = a[j];                                   
        a[j] = a[j + 1];
        a[j + 1] = k;
            }
        }
       
     }
    for(int p = 0; p<a.length ; p++){               /*Variable p hilft uns dabei den ganzen                                             Array auf dem Bildschrim auszudrücken*/
              System.out.print(a[p]+",");
          }
    }
}