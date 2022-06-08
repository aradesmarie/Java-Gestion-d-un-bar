package com.cytech.ingredients;

import java.util.ArrayList;

public interface client {
	public Cocktail commander(String nom, ArrayList<BoissonNonAlcoolisee> listeBoissonNA,
			ArrayList<BoissonAlcoolisee> listeBoissonA);
	
	
}
