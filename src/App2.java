import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        MetierProduitImpl metierProduit = new MetierProduitImpl(new ArrayList<>());
        metierProduit.add(new Produit(1,"p1",13000,3));
        metierProduit.add(new Produit(2,"p2",15000,5));
        metierProduit.add(new Produit(3,"p3",13000,2));
        //System.out.println(metierProduit.getByID(2L));
        metierProduit.deleteByID(3L);
        List<Produit>produits= (List<Produit>) metierProduit.getALL();
        for (Produit produit:produits){
            System.out.println(produit);
        }
    }
}
