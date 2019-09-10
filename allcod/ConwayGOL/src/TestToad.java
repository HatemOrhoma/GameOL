public class TestToad {

    public static void main(String[] args) throws InterruptedException {
        Zellraum zr = new Zellraum(6, 6);
        zr.setZellen(new int[][]{{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,1,1,1,0},{0,1,1,1,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}});
        Nachbarschaft nb = new Nachbarschaft();
        nb.setMoore();
        Automat at = new Automat(zr, nb);

        for(int i = 0; i < 10; i++){
            at.naechsteGenerationBerechnen();
            int[][] zln = zr.getZellen();
            for(int[] zeile : zln){
                for (int spalte : zeile){
                    System.out.print(spalte);
                }
                System.out.println();
            }
            System.out.println();
            Thread.sleep(1000);
        }
    }
}
