
public class TP2_CLASSE {

	public static void main(String[] args) {
		
		Classe c1 = new Classe(31, "DEBOSS", 20152014, "Musique", 27); 
		Classe c2 = new Classe();  

		c2.setNomClasse(54);
		c2.setProfPrincipale("LEBESS");
		c2.setAnneeScolaire(20152014);
		c2.setSpecialite("Sports");
		c2.setNumeroClasse(54);
		c2.setTotalEleve(28);


		System.out.println(" c1 = "+c1.getNomClasse()+" Classe,  "+c1.getProfPrincipale()+ " Professeur principale, "+c1.getAnneeScolaire() + " Ann�e scolaire, "+c1.getSpecialite()+ " sp�cialit�, "+c1.getNumeroClasse()+ " numero de classe, "+c1.getTotalEleve()+ " �l�ve total.\n");
		System.out.println(" c2 = "+c2.getNomClasse()+" Classe,  "+c2.getProfPrincipale()+ " Professeur principale, "+c2.getAnneeScolaire() + " Ann�e scolaire, "+c2.getSpecialite()+ " sp�cialit�, "+c2.getNumeroClasse()+ " numero de classe, "+c2.getTotalEleve()+ " �l�ve total.\n");
		

	}

}
