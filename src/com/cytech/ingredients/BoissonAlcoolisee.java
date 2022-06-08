package com.cytech.ingredients;
import com.cytech.ingredients.Boisson;

public class BoissonAlcoolisee extends Boisson{

		private float degreAlcool;

		// Constructeur
		public BoissonAlcoolisee(String nom, float prix, float contenance, float stock, float degreAlcool) {
			super(nom, prix, contenance, stock);
			this.degreAlcool = degreAlcool;
		}

		// Getters et Setters

		public float getDegreAlcool() {
			return degreAlcool;
		}

		public void setDegreAlcool(float degreAlcool) {
			this.degreAlcool = degreAlcool;
		}
	}

