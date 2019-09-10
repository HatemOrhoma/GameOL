
public class neueParser extends Parser {

	void Programm() {
		VereinbarungsListe();
		accept(print);
		Ausdruck();
		accept(semikolon);
	}
	void VereinbarungsListe(){
		if (nextIs(typeInt)){
		WertVereinbarung();
		VereinbarungsListe();
		}
		else {
			
		}
	}
	void WertVereinbarung(){
		accept(typeInt);
		accept(bezeichner);
		accept(gleich);
		Ausdruck();
		accept(semikolon);
	}
	void Ausdruck(){
		
		if (nextIs(bezeichner)) {
			accept(bezeichner);
			}
		
		
		
		else if (nextIs(zahl)) {
		accept(zahl);
		}
		 else {
		accept(klammerAuf);
		Ausdruck();
		Operator();
		Ausdruck();
		accept(klammerZu);
		}
	}
		
		void Operator(){
			if(nextIs(plus)){
				accept(plus);
			}
			
			else { 
				accept(mult);		
				}
		
		
		
	}
	public static void main(String[] args) {
        neueParser p = new neueParser();
        p.Programm();
        p.ende();
	}
}