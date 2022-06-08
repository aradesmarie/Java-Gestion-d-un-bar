package com.cytech.ingredients;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Cocktail {
	private int idCocktail;
	private String nom;
	private ArrayList<BoissonNonAlcoolisee> listeBoissonNA;
	private ArrayList<BoissonAlcoolisee> listeBoissonA;
	private float prix;
	private float degreAlcool;
	private float degreSucre;
	private boolean disponibilite;

	/* constructeur */

	public Cocktail(String nom, ArrayList<BoissonNonAlcoolisee> listeBoissonNA,
			ArrayList<BoissonAlcoolisee> listeBoissonA) {
		super();
		this.nom = nom;
		this.listeBoissonNA = listeBoissonNA;
		this.listeBoissonA = listeBoissonA;

		this.prix = CalculerPrix(listeBoissonNA, listeBoissonA);
		this.degreAlcool = CalculAlcool(listeBoissonA);
		this.degreSucre = CalculSucre(listeBoissonNA);
		this.setDisponibilite(CalculDisponibilite(listeBoissonNA, listeBoissonA));
	}

	public Cocktail(String nom, ArrayList<BoissonNonAlcoolisee> listeBoissonNA,
			ArrayList<BoissonAlcoolisee> listeBoissonA, float prix, float alcool, float sucre) {
		super();
		this.nom = nom;
		this.listeBoissonNA = listeBoissonNA;
		this.listeBoissonA = listeBoissonA;

		this.prix = prix;
		this.degreAlcool = alcool;
		this.degreSucre = sucre;
	}

	/* getters et setters */

	public int getIdCocktail() {
		return idCocktail;
	}

	public void setIdCocktail(int idCocktail) {
		this.idCocktail = idCocktail;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public float getDegreAlcool() {
		return degreAlcool;
	}

	public void setDegreAlcool(float degreAlcool) {
		this.degreAlcool = degreAlcool;
	}

	public float getDegreSucre() {
		return degreSucre;
	}

	public void setDegreSucre(float degreSucre) {
		this.degreSucre = degreSucre;
	}

	public ArrayList<BoissonNonAlcoolisee> getListeBoissonNA() {
		return listeBoissonNA;
	}

	public void setListeBoissonNA(ArrayList<BoissonNonAlcoolisee> listeBoissonNA) {
		this.listeBoissonNA = listeBoissonNA;
	}

	public ArrayList<BoissonAlcoolisee> getListeBoissonA() {
		return listeBoissonA;
	}

	public void setListeBoissonA(ArrayList<BoissonAlcoolisee> listeBoissonA) {
		this.listeBoissonA = listeBoissonA;
	}

	public boolean isDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}

	/* méthodes */

	public float CalculerPrix(ArrayList<BoissonNonAlcoolisee> listeBoissonNA,
			ArrayList<BoissonAlcoolisee> listeBoissonA) {
		float p;
		p = 0;
		for (int i = 0; i < listeBoissonNA.size(); i++) {
			p = p + listeBoissonNA.get(i).getPrix();
		}

		for (int i = 0; i < listeBoissonA.size(); i++) {
			p = p + listeBoissonA.get(i).getPrix();
		}

		return p * ((float) 1.1);
	}

	public float CalculSucre(ArrayList<BoissonNonAlcoolisee> listeBoissonNA) {
		float s = 0;

		for (int i = 0; i < listeBoissonNA.size(); i++) {
			s = s + (listeBoissonNA.get(i).getDegreSucre() * listeBoissonNA.get(i).getContenance());
		}
		return s;
	}

	public float CalculAlcool(ArrayList<BoissonAlcoolisee> listeBoissonA) {
		float a = 0;
		for (int i = 0; i < listeBoissonA.size(); i++) {
			a = a + (listeBoissonA.get(i).getDegreAlcool() * listeBoissonA.get(i).getContenance());
		}
		return a;
	}

	public boolean CalculDisponibilite(ArrayList<BoissonNonAlcoolisee> listeBoissonNA,
			ArrayList<BoissonAlcoolisee> listeBoissonA) {
		boolean res;
		res = true;
		for (int i = 0; i < listeBoissonNA.size(); i++) {
			if (listeBoissonNA.get(i).getStock() < listeBoissonNA.get(i).getContenance()) {
				res = false;
			}
		}
		for (int i = 0; i < listeBoissonA.size(); i++) {
			if (listeBoissonA.get(i).getStock() < listeBoissonA.get(i).getContenance()) {
				res = false;
			}
		}

		return res;
	}

	public float CalculTaille() {
		float t = 0;
		for (int i = 0; i < this.getListeBoissonA().size(); i++) {
			t = t + this.getListeBoissonA().get(i).getContenance();
		}
		for (int j = 0; j < this.getListeBoissonNA().size(); j++) {
			t = t + this.getListeBoissonNA().get(j).getContenance();
		}
		return (t);
	}

	public void afficherCocktail(FileWriter fic) throws IOException{
		fic.write("cocktail"+"\r\n"+ " compo : " + "id : " + this.getIdCocktail() + "Nom : " + this.getNom() + " Prix : " + this.getPrix() + " Taux de sucre : " + this.getDegreSucre() + " Degré d'alcool : " + this.getDegreAlcool());
		fic.write("\n Liste des boissons Alcolisée de "+ this.getNom() + " ");
		for (int i =0 ; i<this.getListeBoissonA().size();i++) {
			fic.write(this.getListeBoissonA().get(i).getNom() + " ");
		}
		fic.write("\n Liste des boissons Non Alcolisée de "+ this.getNom() + " ");
		for (int i =0 ; i<this.getListeBoissonNA().size();i++) {
			fic.write(this.getListeBoissonNA().get(i).getNom() + " ");
		}
	}
}
