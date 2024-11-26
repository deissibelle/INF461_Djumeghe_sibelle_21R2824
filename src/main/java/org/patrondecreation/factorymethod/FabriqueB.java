package org.patrondecreation.factorymethod;

public class FabriqueB extends Fabrique {
    @Override
    public Produit creerProduit() {
        return new ProduitB();
    }
}

