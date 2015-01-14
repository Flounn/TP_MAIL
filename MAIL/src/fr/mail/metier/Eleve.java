package fr.mail.metier;


public class Eleve {

	private String nom;
	private String prenom;
	private long id;
	private Classe classe;

	public Eleve() {
		this.nom = "Inconnue";
		this.prenom = "Inconnue";
		this.id = 0;
	}
	
	public Eleve(String nom, String prenom, long id, Classe classe) {
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
		this.classe = classe;
		classe.addEleve(this);
	}

		
	/**
	 * @return the classe
	 */
	public Classe getClasse() {
		return classe;
	}
	/**
	 * @param classe the classe to set
	 */
	public void setClasse(Classe classe) {
		this.classe = classe;
		classe.addEleve(this);
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		if (this.id!=0)
			new IllegalAccessException();
		this.id = id;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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
		this.nom = nom;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this==obj)
			return true;
		if (!(obj instanceof Eleve))
			return false;
		Eleve obj1 = (Eleve) obj;
		if (obj1.getId()==this.getId())
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "id="+id+", nom="+nom+", prenom="+prenom+", classe={"+classe.toString()+"}";
	}

}
