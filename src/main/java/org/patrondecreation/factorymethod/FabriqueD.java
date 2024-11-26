package org.patrondecreation.factorymethod;

public class FabriqueD extends Fabrique {
    @Override
    public Produit creerProduit() {
        return new ProduitD();
    }
}

