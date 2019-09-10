import java.util.HashSet;
import java.util.Set;
 
 
class Automat {
    
     Nachbarschaft nachbarschaft;
     Zellraum zellraum;
    
 
    Automat (Zellraum zellraum, Nachbarschaft nachbarschaft)
    {
        this.zellraum = zellraum;
        this.nachbarschaft = nachbarschaft;
    }
    public void naechsteGenerationBerechnen() {
        
        Set<Paar> b = this.nachbarschaft.getNachbarschaft();
        
        int Sp= this.zellraum.getSpalten();
        int Zln=this.zellraum.getZeilen();
        
        
        int[][] Set1 = this.zellraum.getZellen();
        int[][] Set2 = this.zellraum.getZellen();
        int[][] torus = new int[Zln+2][Sp+2];
        int[][] torusTest = new int[Zln+2][Sp+2];
 
        
        // Hier erweitere ich das Array in ein grosseres Array das Nachbaren die ueber den rand hinweg sind. und bringe sie in das obere bzw untere zeile und dann wird verglich auf nachbarschaft
        for (int i = 1; i < Zln+1; i++) 
        {
            for (int j = 1; j < Sp+1; j++) 
            {
                torus[i][j] = Set1[i-1][j-1];
            }
        }
        
        for (int i = 0; i <Sp; i++)
        {
        torus[0][i+1] =     Set1[Zln-1][i];
        torus[Zln+1][i+1] = Set1[0][i];
        }
        
        for (int j = 0; j <Zln; j++)     
        {
        torus[j+1][Sp+1] = Set1[j][0];
        torus[j+1][0] =    Set1[j][Sp-1];
        }
        
        
        
        
        System.arraycopy( Set1, 0, torusTest, 1, Set1.length );
 
        
        torus[0][Sp+1] = Set1[Zln-1][0];
        torus[Zln+1][Sp+1] = Set1[0][0];
        
        torus[0][0] = Set1[Zln-1][Sp-1];
        torus[Zln+1][0] = Set1[0][Sp-1];
        int nachbarenAnzahl = 0;
        for (int i = 0; i < Set1.length; i++) {
            for (int j = 0; j < Set1[i].length; j++) {
                for (Paar p : b) {
                    int t1 = (Integer) p.getT1();
                    int t2 = (Integer) p.getT2();
                    
                    if (torus[t1+i+1][t2+j+1] == 1) 
                    {
                            nachbarenAnzahl++;
                    }
                }
                if (Set2[i][j] == 1 && nachbarenAnzahl < 2) {
                    Set1[i][j] = 0;
                } else if (Set2[i][j] == 1 && (nachbarenAnzahl == 3 || nachbarenAnzahl == 2)) {
                    Set1[i][j] = 1;
                } else if (Set2[i][j] == 1 && nachbarenAnzahl > 3) {
                    Set1[i][j] = 0;
                } else if (Set2[i][j] == 0 && nachbarenAnzahl == 3) {
                    Set1[i][j] = 1;
                }
                nachbarenAnzahl = 0;
            }
            
        }
        this.zellraum.setZellen(Set1);
    }
}