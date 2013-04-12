package behavioralPatterns;

public class Hund extends Tier{

	Hund(){
	name = "AlphaDog";
		anzahlBeine = 4;
		lautVerhalten = new Bellen();	
	}
	Hund(String name){
		this.name = name;
			anzahlBeine = 4;
			lautVerhalten = new Bellen();	
		}	
}


