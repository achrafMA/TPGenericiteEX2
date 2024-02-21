import java.util.List;

public class MetierProduitImpl implements iMetier<Produit,Long>{
    List<Produit>produits;

    public MetierProduitImpl(List<Produit> produits) {
        this.produits = produits;
    }


    @Override
    public void add(Produit o) {
        produits.add(o);

    }

    @Override
    public List getALL() {
        return produits;
    }

    @Override
    public Produit getByID(Long id) {
        for (Produit p:produits){
            if (p.getId()==id)
                return p;
        }
        return null;
    }

    @Override
    public void deleteByID(Long id) {
        Produit produit=this.getByID(id);
        if (produit!=null)
            produits.remove(produit);
    }
}
