
public class Classe {

	/**
	 * @return the nomClasse
	 */
	public int getNomClasse() {
		return nomClasse;
	}
	/**
	 * @param nomClasse the nomClasse to set
	 */
	public void setNomClasse(int nomClasse) {
		this.nomClasse = nomClasse;
	}
	/**
	 * @return the profPrincipale
	 */
	public String getProfPrincipale() {
		return profPrincipale;
	}
	/**
	 * @param profPrincipale the profPrincipale to set
	 */
	public void setProfPrincipale(String profPrincipale) {
		this.profPrincipale = profPrincipale;
	}
	/**
	 * @return the anneeScolaire
	 */
	public int getAnneeScolaire() {
		return anneeScolaire;
	}
	/**
	 * @param anneeScolaire the anneeScolaire to set
	 */
	public void setAnneeScolaire(int anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}
	/**
	 * @return the specialite
	 */
	public String getSpecialite() {
		return specialite;
	}
	/**
	 * @param specialite the specialite to set
	 */
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	/**
	 * @return the numeroClasse
	 */
	public int getNumeroClasse() {
		return numeroClasse;
	}
	/**
	 * @param numeroClasse the numeroClasse to set
	 */
	public void setNumeroClasse(int numeroClasse) {
		this.numeroClasse = numeroClasse;
	}
	/**
	 * @return the totalEleve
	 */
	public int getTotalEleve() {
		return totalEleve;
	}
	/**
	 * @param totalEleve the totalEleve to set
	 */
	public void setTotalEleve(int totalEleve) {
		this.totalEleve = totalEleve;
	}
	private int nomClasse;
	private String profPrincipale;
	private int anneeScolaire;
	private String specialite;
	private int numeroClasse;
	private int totalEleve;
	
	
	
	
	  //Constructeur par d�faut
	  public Classe(){
	    System.out.println("Cr�ation d'une classe !");          
	    nomClasse = 0;
	    profPrincipale = "Inconnu";
	    anneeScolaire = 0;
	    specialite = "Inconnu";
	    numeroClasse = 0;
	    totalEleve = 0;
	  }
	 
	  //Constructeur avec param�tres
	  //J'ai ajout� un � p � en premi�re lettre des param�tres.
	  //Ce n'est pas une convention, mais �a peut �tre un bon moyen de les rep�rer.
	  public Classe(int pNomClasse, String pProfPrincipale, int pAnneeScolaire, String pSpecialite, int pTotalEleve)
	  {
	    System.out.println("Cr�ation d'une classe avec des param�tres !");
	    nomClasse = pNomClasse;
	    profPrincipale = pProfPrincipale;
	    anneeScolaire = pAnneeScolaire;
	    specialite = pSpecialite;
	    numeroClasse =  Integer.valueOf(pAnneeScolaire + pNomClasse);
	    totalEleve = pTotalEleve;
	  }    
	
	
	
}

