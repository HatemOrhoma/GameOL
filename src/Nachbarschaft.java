
import java.util.HashSet;
import java.util.Set;

class Nachbarschaft{
	 Set<Paar> nachbaren = new HashSet<Paar>();
	 
	 int[][] Moorekoordinaten = {{0,1},{1,0},{-1,0},{0,-1},{1,1},{1,-1},{-1,-1},{-1,1}};
	 int[][] VonNeumannkoordinaten = {{0,1},{1,0},{-1,0},{0,-1}};
	 
	 public void setMoore() 
	 {
		 for (int i = 0; i < 8; i++)
		 {
			 Paar p = new Paar<Integer,Integer>(Moorekoordinaten[i][0], Moorekoordinaten[i][1]);
			 nachbaren.add(p);
		 }
	 }
	 public void setVonNeumann()
	 {	 
		 for (int i = 0; i < 4; i++) 
		 {
			 Paar p = new Paar<Integer,Integer>(VonNeumannkoordinaten[i][0], VonNeumannkoordinaten[i][1]);
			 nachbaren.add(p);
		 }
	 }
	 public Set<Paar> getNachbarschaft() {
		 return this.nachbaren;
	 }
}
