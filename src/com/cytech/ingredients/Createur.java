package com.cytech.ingredients;


import java.io.FileWriter;
import java.io.IOException;
//import java.io.FileWriter;
//import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class Createur implements barman{

		private UUID idCreateur;
		private int nom;
		private int prenom;

		public Createur(int nom, int prenom) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.idCreateur = UUID.randomUUID();
		}

		public UUID getIdCreateur() {
			return idCreateur;
		}

		public void setIdCreateur(UUID idCreateur) {
			this.idCreateur = idCreateur;
		}

		public int getNom() {
			return nom;
		}

		public void setNom(int nom) {
			this.nom = nom;
		}

		public int getPrenom() {
			return prenom;
		}

		public void setPrenom(int prenom) {
			this.prenom = prenom;
		}

		/* méthodes */

		public void generer(Cocktail c) {
			for (int i = 0; i < c.getListeBoissonA().size(); i++) {
				c.getListeBoissonA().get(i).enleverStock(c.getListeBoissonA().get(i).getContenance()/10);
			}
			for (int i = 0; i < c.getListeBoissonNA().size(); i++) {
				c.getListeBoissonNA().get(i).enleverStock(c.getListeBoissonNA().get(i).getContenance()/10);
			}
		}
		
		
		public void generer(int valeur, Boisson b) {
			b.ajouterStock(valeur);
		}

		public float facture(Cocktail c) {
			float p;
			p = 0;
			for (int i = 0; i < c.getListeBoissonA().size(); i++) {
				p = p + c.getListeBoissonA().get(i).getPrix();
			}
			for (int i = 0; i < c.getListeBoissonNA().size(); i++) {
				p = p + c.getListeBoissonNA().get(i).getPrix();
			}
			return p * ((float) 1.1);
		}

		public Cocktail composer(ArrayList<BoissonNonAlcoolisee> boissonNA, ArrayList<BoissonAlcoolisee> boissonA,
				String nom, FileWriter carte) throws IOException {
			Cocktail c = new Cocktail(nom, boissonNA, boissonA);
			c.afficherCocktail(carte);
			return (c);
			
		}
		
	}

