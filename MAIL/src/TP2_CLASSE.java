import fr.mail.metier.Classe;
import fr.mail.metier.Eleve;


public class TP2_CLASSE {

	public static void main(String[] args) {
		
		
		//Branche Recette!!!!!
		System.out.println("//Branche Recette!!!!!");
		
		
		Classe c1 = new Classe("M2 MIAGE IF", 2015, "Finance", 27); 
		Classe c2 = new Classe();  

		c2.setNom("M2 MIAGE ID");
		c2.setAnnee(2015);
		c2.setSpecialite("Décisionnel");
		c2.setNumero(54);
		
		
		Eleve e1 = new Eleve("Lestic", "Florian", 15, c1);
		
		Eleve e2 = new Eleve("Berdjeghloul", "Kama-Djemel", 17, c1);
		
		
		Eleve e3 = new Eleve();
		e3.setClasse(c2);
		e3.setId(18);
		e3.setNom("Théophile");
		e3.setPrenom("Aimé");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println(c1);
		System.out.println(c2);
		

	}

}
