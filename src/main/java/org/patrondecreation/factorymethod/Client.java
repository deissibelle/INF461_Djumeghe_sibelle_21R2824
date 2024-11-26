package org.patrondecreation.factorymethod;
public class Client{
    public static void main(String[] args) {
        Fabrique fabrique = new FabriqueD();
        Produit produit = fabrique.creerProduit();
        produit.afficherType();
    }
}

