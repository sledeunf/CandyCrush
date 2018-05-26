# Projet Candy Crush

## 2018-05-27

### Elaboration du routage de l'application

* Création d'une classe Views
* Définition de 2 méthodes pour simplifier le routage
```
addScene(Stage stage, String title, String fxmlfile, int width, int height, boolean resizable)
```
permet de définir des vues nommées, stockées dans une hashmap
```
setScene(String name)
```

### Ecriture du template *menu.fxml*

Arrière plan dans une ImageView superposée à un GridPane contenant les boutons grâce à un StackPane.

Comprend 3 boutons :
1. Nouvelle partie
2. Meilleurs scores
3. Quitter

### Ecriture du controlleur du menu

Les EventHandler des boutons 1. et 2. appelent la methode setScene de la classe Main.

Celui du bouton 3. appelle la commande ```System.exit(0)```



