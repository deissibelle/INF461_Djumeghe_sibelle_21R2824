package org.patrondecreation.factorymethod;


public class FabriqueA extends Fabrique {
    @Override
    public Produit creerProduit() {
        return new ProduitA();
    }
}
