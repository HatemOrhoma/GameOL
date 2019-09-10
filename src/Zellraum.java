class Zellraum {
	
	int zeilen;
	int spalten;
	int[][] zelle;
	
	public Zellraum(int zeilen, int spalten) {
		
		this.zeilen = zeilen;
		this.spalten = spalten;
		this.zelle = new int [zeilen][spalten];

	
	}
	
	void setZellen(int[][] neueZellen) {
		for (int i = 0; i < zeilen; i++) {
			for (int j = 0; j < spalten; j++) {
				this.zelle[i][j] = neueZellen[i][j];
			}
		}
	}
	
	int[][] getZellen() {
		int[][] zelle = new int[this.zeilen][this.spalten];
		for (int i = 0; i < zeilen; i++) {
			for (int j = 0; j < spalten; j++) {
				zelle[i][j] = this.zelle[i][j];
			}
		}
		return zelle;
	}
	
	public int getZeilen() {
		return this.zeilen;
	}
	
	public int getSpalten() {
		return this.spalten;
	}
	
}