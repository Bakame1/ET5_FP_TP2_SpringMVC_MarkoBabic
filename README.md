# TP2 - Introduction à Spring MVC
#### Polytech Paris-Saclay - Frameworks Profesionnels
#### **Auteur** : Marko Babic

Le but de ce code est d'implémenter les base de l'architecture **Spring MVC** (Modèle-Vue-Contrôleur).

## Technologies

* **Java** : 17
* **Spring MVC** : 5.3.31
* **Serveur** : Apache Tomcat 9
* **Build** : Maven
* **Vues** : JSP / JSTL
* **Format** : JSON (Jackson) pour l'API REST

## Installation et Démarrage

1.  **Cloner le projet** et l'ouvrir avec IntelliJ IDEA.
2.  **Configuration Tomcat** (Run/Debug Configurations) :
    * Ajouter un serveur **Tomcat Local**.
    * Dans l'onglet **Deployment**, ajouter l'artefact : `...:war exploded`.
    * **IMPORTANT** : Dans le champ **Application context**, mettre `/app`.
3.  **Lancer le serveur**.

## URLs accessibles dans le navigateur

Une fois le serveur démarré, les fonctionnalités suivantes sont accessibles via ces URLs   :

| Fonctionnalité | URL | Méthode | Description |
| :--- | :--- | :--- | :--- |
| **Accueil** | `http://localhost:8080/app/home` | `GET` | Affiche une vue JSP simple via `HomeController`. |
| **Modèle** | `http://localhost:8080/app/message` | `GET` | Affiche une donnée passée du contrôleur à la vue via `Model`. |
| **Formulaire** | `http://localhost:8080/app/form` | `GET` | Affiche un formulaire de saisie. |
| **Traitement** | `http://localhost:8080/app/send` | `POST` | Traite la saisie, appelle le Service métier et affiche le résultat. |
| **API REST** | `http://localhost:8080/app/api/message` | `GET` | Renvoie une réponse JSON brute (Bonus). |

## Architecture du code

* **`web.xml`** : Déclare le `DispatcherServlet` comme point d'entrée unique (Front Controller).
* **`dispatcher-servlet.xml`** : Configure le scan des composants (`com.tp.mvc`) et le `ViewResolver` (préfixe/suffixe JSP).
* **Controller** :
    * `HomeController` : Navigation simple.
    * `FormController` : Gestion des formulaires GET/POST.
    * `MessageRestController` : Extension REST (retourne du JSON).
* **Service** :
    * `MessageService` : Contient la logique métier (transformation en majuscules), injecté dans le contrôleur via `@Autowired`.
