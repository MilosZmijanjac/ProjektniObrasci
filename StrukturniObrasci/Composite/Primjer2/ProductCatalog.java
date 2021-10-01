package StrukturniObrasci.Composite.Primjer2;

import java.util.ArrayList;

public class ProductCatalog implements CatalogComponent{
    private ArrayList<CatalogComponent> items=new ArrayList<>();
    private String name;
    public ProductCatalog(String name){
        this.name=name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void print(){

        for(CatalogComponent comp : items)
        {
            comp.print();
        }
    }


    public void add(CatalogComponent catalogComponent){
        items.add(catalogComponent);
    }


    public void remove(CatalogComponent catalogComponent){
        items.remove(catalogComponent);
    }

}