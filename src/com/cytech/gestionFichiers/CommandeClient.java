package com.cytech.gestionFichiers;

import java.io.FileWriter;
import java.util.ArrayList;

import com.cytech.ingredients.BoissonAlcoolisee;
import com.cytech.ingredients.BoissonNonAlcoolisee;
import com.cytech.ingredients.Cocktail;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class CommandeClient extends Application {
	public void start(Stage primaryStage) throws Exception {

		String monFichier = "com.cytech.collections";
		/* AJOUTER L'ÉCRITURE DANS LE FICHIER */

		/* création de quelques boissons disponibles */
		BoissonAlcoolisee b1 = new BoissonAlcoolisee("Vodka", 4, (float) 0.2, 10, (float) 0.4);
		BoissonNonAlcoolisee b2 = new BoissonNonAlcoolisee("Pomme", 2, (float) 1, 10, (float) 0.8);
		BoissonAlcoolisee b3 = new BoissonAlcoolisee("Rhum", 5, (float) 0.3, 10, (float) 0.3);
		BoissonAlcoolisee b4 = new BoissonAlcoolisee("Jager", 5, (float) 0.2, 10, (float) 0.35);
		BoissonAlcoolisee b5 = new BoissonAlcoolisee("Whisky", 5, (float) 0.3, 10, (float) 0.4);
		BoissonAlcoolisee b6 = new BoissonAlcoolisee("Pastis", 2, (float) 0.2, 10, (float) 0.45);
		BoissonAlcoolisee b7 = new BoissonAlcoolisee("Gin", 3, (float) 0.3, 10, (float) 0.35);

		BoissonNonAlcoolisee b13 = new BoissonNonAlcoolisee("Pamplemousse", 2, (float) 0.7, 10, (float) 0.2);
		BoissonNonAlcoolisee b8 = new BoissonNonAlcoolisee("RedBull", 3, (float) 0.9, 10, (float) 0.3);
		BoissonNonAlcoolisee b9 = new BoissonNonAlcoolisee("Orange", 2, (float) 1, 10, (float) 0.5);
		BoissonNonAlcoolisee b10 = new BoissonNonAlcoolisee("Eau", 1, (float) 1, 10, (float) 0);
		BoissonNonAlcoolisee b11 = new BoissonNonAlcoolisee("Coca", 3, (float) 0.9, 10, (float) 0.9);
		BoissonNonAlcoolisee b12 = new BoissonNonAlcoolisee("Schweppes", 2, (float) 0.8, 10, (float) 0.5);
		BoissonNonAlcoolisee b14 = new BoissonNonAlcoolisee("Jus de Canne à Sucre", 3, (float) 0.7, 10, (float) 0.6);

		/* création des listes de boissons */
		ArrayList<BoissonNonAlcoolisee> lNA = new ArrayList<BoissonNonAlcoolisee>();
		ArrayList<BoissonAlcoolisee> lA = new ArrayList<BoissonAlcoolisee>();

		lA.add(b1);
		lA.add(b3);
		lA.add(b4);
		lA.add(b5);
		lA.add(b6);
		lA.add(b7);

		lNA.add(b2);
		lNA.add(b8);
		lNA.add(b9);
		lNA.add(b10);
		lNA.add(b11);
		lNA.add(b12);
		lNA.add(b13);
		lNA.add(b14);

		/* création de cocktails */
		ArrayList<BoissonNonAlcoolisee> l1 = new ArrayList<BoissonNonAlcoolisee>();
		ArrayList<BoissonAlcoolisee> l1a = new ArrayList<BoissonAlcoolisee>();
		ArrayList<BoissonNonAlcoolisee> l2 = new ArrayList<BoissonNonAlcoolisee>();
		ArrayList<BoissonAlcoolisee> l2a = new ArrayList<BoissonAlcoolisee>();
		ArrayList<BoissonNonAlcoolisee> l3 = new ArrayList<BoissonNonAlcoolisee>();
		ArrayList<BoissonAlcoolisee> l3a = new ArrayList<BoissonAlcoolisee>();
		ArrayList<BoissonNonAlcoolisee> l4 = new ArrayList<BoissonNonAlcoolisee>();
		ArrayList<BoissonAlcoolisee> l4a = new ArrayList<BoissonAlcoolisee>();
		ArrayList<BoissonNonAlcoolisee> l5 = new ArrayList<BoissonNonAlcoolisee>();
		ArrayList<BoissonAlcoolisee> l5a = new ArrayList<BoissonAlcoolisee>();
		ArrayList<BoissonNonAlcoolisee> l6 = new ArrayList<BoissonNonAlcoolisee>();
		ArrayList<BoissonAlcoolisee> l6a = new ArrayList<BoissonAlcoolisee>();

		l1.add(b2);
		l1a.add(b1);
		l2.add(b8);
		l2a.add(b4);
		l3.add(b11);
		l3a.add(b3);
		l4.add(b8);
		l4a.add(b1);
		l5.add(b9);
		l5.add(b13);
		l5a.add(b3);
		l6.add(b14);
		l6a.add(b5);

		Cocktail c1 = new Cocktail("Le Voyageur imprudent", l1, l1a);
		Cocktail c2 = new Cocktail("Une rose au paradis", l2, l2a);
		Cocktail c3 = new Cocktail("Le Grand Secret", l3, l3a);
		Cocktail c4 = new Cocktail("Ravage", l4, l4a);
		Cocktail c5 = new Cocktail("La Nuit Des Temps", l5, l5a);
		Cocktail c6 = new Cocktail("L'Enchanteur", l6, l6a);

		ArrayList<Cocktail> listeCocktails = new ArrayList<Cocktail>();
		FileWriter csvWriter = new FileWriter(monFichier);

		listeCocktails.add(c1);
		listeCocktails.add(c2);
		listeCocktails.add(c3);
		listeCocktails.add(c4);
		listeCocktails.add(c5);
		listeCocktails.add(c6);

		/* ajout des cocktails au fichier texte */
		for (int i = 0; i < listeCocktails.size(); i++) {
			listeCocktails.get(i).afficherCocktail(csvWriter);
			csvWriter.write("\n");
		}
		csvWriter.flush();
		csvWriter.close();

		/* création d'une liste */
		ListView<String> maListe = new ListView<String>();
		maListe.setOrientation(Orientation.VERTICAL);
		maListe.setPrefSize(200, 100);
		maListe.getItems().add("COMMANDE");

		ListView<String> listeCarte = new ListView<String>();
		listeCarte.setOrientation(Orientation.VERTICAL);
		listeCarte.setPrefSize(400, 600);
		listeCarte.getItems().add("CARTE");
		listeCarte.getItems().add("(prix majoré de 10% pour composer un cocktail)");

		ListView<String> listeCocktail = new ListView<String>();
		listeCocktail.setOrientation(Orientation.VERTICAL);
		listeCocktail.setPrefSize(400, 600);
		listeCocktail.getItems().add("NOS COCKTAILS");

		/* affichage de la carte */
		listeCarte.getItems().add(" ");
		listeCarte.getItems().add("Boissons sans alcool : ");
		for (int i = 0; i < lNA.size(); i++) {

			listeCarte.getItems().add(lNA.get(i).getNom() + " " + lNA.get(i).getPrix());
		}

		listeCarte.getItems().add(" ");
		listeCarte.getItems().add("Boissons avec alcool : ");
		for (int i = 0; i < lA.size(); i++) {

			listeCarte.getItems().add(lA.get(i).getNom() + " " + lA.get(i).getPrix());
		}

		/* affichage de la carte des cocktails */
		listeCocktail.getItems().add(" ");
		for (int i = 0; i < listeCocktails.size(); i++) {

			listeCocktail.getItems().add(listeCocktails.get(i).getNom() + " " + listeCocktails.get(i).getPrix());
		}

		/* création de listes utiles pour l'afichage */
		ArrayList<BoissonNonAlcoolisee> listeBNA = new ArrayList<BoissonNonAlcoolisee>();
		ArrayList<BoissonAlcoolisee> listeBA = new ArrayList<BoissonAlcoolisee>();

		/* zone de texte */
		TextField textField = new TextField();

		/* bouton */
		Button b21 = new Button("Envoyer");
		Button b = new Button("Valider");

		/* créer une fenêtre */
		FlowPane root = new FlowPane();
		root.setPadding(new Insets(10));
		root.setVgap(5);
		root.setHgap(5);

		/* ajouter des éléments à la fenêtre */
		root.getChildren().add(textField);
		root.getChildren().add(b);
		root.getChildren().add(b21);

		/* création d'une alerte */
		Alert alerte = new Alert(AlertType.INFORMATION);
		alerte.setTitle("Commande Client");
		alerte.setHeaderText("Commande");
		alerte.setContentText("Appuyez sur OK pour saisir votre commande");
		alerte.showAndWait();

		/* création d'un évènement sur le boutton b */
		b.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				String contenu = textField.getText();
				maListe.getItems().add(contenu);
				// float prix = 0;
				int k = 0;
				for (int i = 0; i < lNA.size(); i++) {
					if (contenu.contentEquals(lNA.get(i).getNom())) {
						if (lNA.get(i).getStock() == 0) {
							System.out.println(contenu + " n'est plus disponible");
						} else {
							listeBNA.add(lNA.get(i));
							lNA.get(i).enleverStock(1);
							System.out.println("le prix : " + lNA.get(i).getPrix());
							Cocktail c = new Cocktail("nouveauCocktail", listeBNA, listeBA);
							// prix = prix + c.getPrix();
							maListe.getItems().add("le prix est de : " + c.getPrix());
							k = 1;
							System.out.println("Article ajouté");
						}

					}
				}
				if (k == 0) {
					System.out.println("Cette boisson n'est pas dans la carte des boissons non alcoolisées");
				}
				int p = 0;
				for (int i = 0; i < lA.size(); i++) {
					if (contenu.contentEquals(lA.get(i).getNom())) {
						if (lA.get(i).getStock() == 0) {
							System.out.println(contenu + " n'est plus disponible");
						} else {
							listeBA.add(lA.get(i));
							lA.get(i).enleverStock(1);
							Cocktail c = new Cocktail("nouveauCocktail", listeBNA, listeBA);
							// prix = prix + c.getPrix();
							maListe.getItems().add("le prix est de : " + c.getPrix());
							p = 1;
							System.out.println("Article ajouté");
						}

					}
				}
				if (p == 0) {
					System.out.println("Cette boisson n'est pas dans la carte des boissons alcoolisées");
				}

				for (int i = 0; i < listeCocktails.size(); i++) {
					if (contenu.contentEquals(listeCocktails.get(i).getNom())) {
						for (int k1 = 0; k1 < listeCocktails.get(i).getListeBoissonNA().size(); k1++) {
							if (listeCocktails.get(i).getListeBoissonNA().get(k).getStock() == 0) {
								System.out
										.println("Nous ne disposons pas des stocks suffisants pour faire ce cocktails");
							} else {
								/* on gère le stock pour les boissons non alcoolisées */
								for (int j = 0; j < listeCocktails.get(i).getListeBoissonNA().size(); j++) {
									listeCocktails.get(i).getListeBoissonNA().get(j).enleverStock(1);
								}
								/* on gère le stock pour les boissons alcoolisées */
								for (int j = 0; j < listeCocktails.get(i).getListeBoissonA().size(); j++) {
									listeCocktails.get(i).getListeBoissonA().get(j).enleverStock(1);

								}
								// prix = prix + listeCocktails.get(i).getPrix();
								maListe.getItems().add("le prix est de " + listeCocktails.get(i).getPrix());
								System.out.println("Article ajouté");
								System.out.println("le prix est de : " + listeCocktails.get(i).getPrix());
							}

						}
					}

				}

			}
		});

		/* création d'un évènement sur le bouton b21 */
		b21.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event1) {
				System.out.println("Commande envoyée");
			}
		});

		/* on ajoute les éléments saisis à la liste sur la coté */
		root.getChildren().add(maListe);
		root.getChildren().add(listeCarte);
		root.getChildren().add(listeCocktail);

		/* création d'une scene et de son association avec la fenêtre + taille */
		Scene scene = new Scene(root, 1500, 800);

		/* ajouter la scene */
		primaryStage.setScene(scene);

		/* rendre la fenêtre visible */
		primaryStage.show();

	}
}
