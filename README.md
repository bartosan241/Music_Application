# Music-Application-

Bienvenue dans mon projet de gestion de Proprietaire & salles de musique. Ce projet permet de gérer des propriétaires de salles de musique ainsi que les détails associés à chaque salle. Vous pouvez ajouter, modifier et supprimer des salles et des propriétaires à l'aide de notre API.Le projet a été développé en utilisant Java avec le framework Spring Boot, intégrant une base de données MySQL pour la gestion des propriétaires et des salles de musique.

°Utilisation de l'API

L'API expose des endpoints pour gérer les salles et les propriétaires. Vous pouvez utiliser des outils comme Postman ou CURL pour interagir avec l'API.

Propriétaires: 

Obtenir tous les propriétaires :
Endpoint: /api/proprio/
Méthode : GET

Obtenir un propriétaire par ID :
Endpoint: /api/proprio/{id}
Méthode : GET

Ajouter un propriétaire :
Endpoint: /api/proprio/add
Méthode : POST

Modifier un propriétaire :
Endpoint: /api/proprio/update
Méthode : PUT

Supprimer un propriétaire :
Endpoint: /api/proprio/delete/{id}
Méthode : DELETE


Salles

Obtenir toutes les salles :
Endpoint: /api/salle/
Méthode : GET

Obtenir une salle par ID :
Endpoint: /api/salle/{id}
Méthode : GET

Ajouter une salle :
Endpoint: /api/salle/add
Méthode : POST

Modifier une salle :
Endpoint: /api/salle/update
Méthode : PUT

Supprimer une salle :
Endpoint: /api/salle/delete/{id}
Méthode : DELETE
Fonctions Impléme


°Fonctions Implémentées dans les Contrôleurs

ProprietaireController:

getAllProprietaire(): Obtenir tous les propriétaires.
getProprietaireById(Long id): Obtenir un propriétaire par ID.
addProprietaire(Proprietaire proprietaire): Ajouter un propriétaire.
updateProprietaire(Proprietaire proprietaire): Mettre à jour un propriétaire.
deleteProprietaire(Long id): Supprimer un propriétaire.


SalleController:

getAllSalles(): Obtenir toutes les salles.
getSalleById(Long id): Obtenir une salle par ID.
addSalle(Salle salle): Ajouter une salle.
updateSalle(Salle salle): Mettre à jour une salle.
deleteSalle(Long id): Supprimer une salle.



