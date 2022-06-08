package com.cytech.ingredients;

import java.util.ArrayList;
//import java.util.Scanner;
import java.util.UUID;

public class CommandeClient implements client{
	private UUID idCommandeClient;

	public CommandeClient(int idCommandeClient) {
		super();
		this.idCommandeClient = UUID.randomUUID();
	}

	public UUID getIdCommandeClient() {
		return idCommandeClient;
	}

	public void setIdCommandeClient(UUID idCommandeClient) {
		this.idCommandeClient = idCommandeClient;
	}

	public Cocktail commander(String nom, ArrayList<BoissonNonAlcoolisee> listeBoissonNA,
			ArrayList<BoissonAlcoolisee> listeBoissonA) {
		Cocktail c = new Cocktail(nom, listeBoissonNA, listeBoissonA);
		if (c.CalculDisponibilite(listeBoissonNA, listeBoissonA) == false) {
			System.out.println("Vous ne pouvez pas commander ce cocktail, les stocks sont insuffisants");
		}
		return (c);
	}
}
