Note classe fétiche : Classe.
Exemple -> Nom: M2 MIAGE IF, numéro: 16, spécialite: Finance, année: 2015
- Dans une Classe il y a des éleves.
Exemple -> Id : 12, prénom : Florian, nom : Lestic
- Cet élève est également dans la Classe.

-> User Stories et estimation

US01 – Ajouter une nouvelle classe – Role : superAdminEcole
Enregistrer le nom de la classe, le numéro de la classe, l'année scolaire (ex : 2015) et la spécialité (exemple musique). Le total des élèves de la classe doit être automatiquement calculé.
• TST01 : construction de classes cohérentes : ne pas autoriser un nom de classe vide ou une année vide.
• TST02 : vérifier que le total des élèves est valide
• TST03 : vérifier l'unicité sur le champ numéro de classe.
Estimation de charge : 3 points


US02 – Gérer les élèves – Role : AdminEcole
Stocker les élèves – avec nom, prénom, et id – et les associer à leurs classes.
• TST04 : construction des élèves cohérents : ne pas autoriser de nom ou prénom vides.
• TST05 : tout élève doit être associée à une classe cohérente
Estimation de charge : 3 points

US03 – Supprimer une classe – Role : superAdminEcole
• TST06 : suppression classe : ne pas autoriser si au moins un élève correspondant existe sinon oui.
Estimation de charge : 2 points

US04 – Supprimer un élève pour une classe – Role : superAdminEcole & AdminEcole
Supprimer un enregistrement élève
• TST07 : suppression élève pour une classe : vérifier si seul l'enregistrement de l'élève sélectionné pour cette classe a bien été supprimé.
Estimation de charge : 2 points

US05 – Supprimer plusieurs élèves d'une classe – Role : superAdminEcole & AdminEcole
• TST08 : suppression élèves pour d'une classe : Vérifier que l’élève est bien dans cette classe et détacher la classe à l’élève.
Estimation de charge : 3 points

US06 – Modifier les attributs Classes – Role : superAdminEcole
• TST09 : modification des attributs d'une classe : le nom de la classe, l'année scolaire et la spécialité. Le numéro de la classe (entier) n'est pas modifiable.
Estimation de charge : 5 points
