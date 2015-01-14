package fr.mail.metier;
import java.util.ArrayList;


public class Classe {
	
	private String nom;
	private int annee;
	private String specialite;
	private int numero;
	
	private ArrayList<Eleve> eleves = new ArrayList<Eleve>();
	
	//Constructeur par défaut sans paramètres
	  public Classe(){
	    System.out.println("Création d'une classe sans paramètre !");
	    this.nom="Inconnu";
	    this.annee=2014;
	    this.specialite = "Inconnue";   
	  }
	
	//Constructeur avec paramètres
	  //J'ai ajouté un « p » en première lettre des paramètres.
	  //Ce n'est pas une convention, mais ça peut être un bon moyen de les repérer.
	  public Classe(String nom, int annee, String specialite,int numero)
	  {
	    System.out.println("Création d'une classe avec des paramètres !");
	    this.nom=nom;
	    this.annee=annee;
	    this.specialite = specialite;
	    this.numero=numero;

	  }

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		if (nom==null||nom.isEmpty())
			throw new IllegalArgumentException ();
		this.nom = nom;
	}

	/**
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
	}

	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(int annee) {
		if (annee==0)
			throw new IllegalArgumentException ();
		this.annee = annee;
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
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		if (this.numero!=0)
			new IllegalAccessException();
		this.numero = numero;
	}

	/**
	 * @param eleve the eleve to remove
	 * @return true if removed, else false 
	 */
	public boolean removeEleve(Eleve eleve) {
		eleve.setClasse(null);
		return eleves.remove(eleve);
	}

	/**
	 * @param eleve the eleve to add
	 * @return true if added, else false 
	 */
	public boolean addEleve(Eleve eleve) {
		if (eleve.getClasse()==null||eleve.getClasse()!=this)
			eleve.setClasse(this);
		if (!isInscris(eleve))
			return eleves.add(eleve);
		return false;
		
	}     
	
	/**
	 * @return nb eleves ds la classe
	 */
	public int getNbEleves(){
		return eleves.size();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this==obj)
			return true;
		if (!(obj instanceof Classe))
			return false;
		Classe obj1 = (Classe) obj;
		if (obj1.getNumero()==this.getNumero())
			return true;
		return false;
	}
	
	public boolean isInscris(Eleve eleve){
		return eleves.contains(eleve);
	}


	@Override
	public String toString() {
		return "numero="+numero+", nom="+nom+", annee="+annee+", specialite="+specialite+", nb eleves="+getNbEleves();
	}
	
}

