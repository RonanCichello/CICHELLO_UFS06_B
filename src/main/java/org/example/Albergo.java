package org.example;
public class Albergo
{
    private String descrizione;
    private int id;
    private String name;
    private double price;
    private boolean suite;

    public Albergo(String descrizione ,int id, String name, double price, boolean suite)    // Creiamo il costruttore
    {
        this.descrizione = descrizione ;
        this.id = id;
        this.name = name;
        this.price = price;
        this.suite = suite;
    }


    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getSuite() {
        return suite;
    }

    public void setSuite(boolean suite) {
        this.suite = suite;


    }
}
