class Stu{

 static Studierende suche(Studierende[] d, int m){
 int i = 0;
 int n = d.length;
 while ((i < n) && (d[i].gibMatrikelnummer() != m))
 i = i + 1;
 if (i < n)
 return d[i];
 else return null;
 }

 public static void main(String[] args){

 Studierende[] testd = new Studierende[2];
 testd[0] = new Studierende("Thorsten Meier", 88188, 1980);
 testd[1] = new Studierende("Monika Schmidt", 88633, 1981);
 testd[2] = new Studierende("Monika Schneider", 88755, 1980);
 int m = 88633;
 boolean gefunden = (suche(testd,m) != null);
 if (gefunden)
 System.out.println(m + " gefunden");
 else System.out.println(m + " nicht gefunden");
 }
 }