package org.patrondecreation.factorymethod;



public class FabriqueC extends Fabrique {
    @Override
    public Produit creerProduit() {
        return new ProduitC();
    }
}

