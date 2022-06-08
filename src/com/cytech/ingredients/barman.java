package com.cytech.ingredients;

import java.io.FileWriter;
import java.io.IOException;
//import java.io.FileWriter;
//import java.io.IOException;
import java.util.ArrayList;

public interface barman {
	public void generer(Cocktail c);

	public float facture(Cocktail c);

	public Cocktail composer(ArrayList<BoissonNonAlcoolisee> boissonNA, ArrayList<BoissonAlcoolisee> boissonA,
			String nom, FileWriter carte) throws IOException;

}
