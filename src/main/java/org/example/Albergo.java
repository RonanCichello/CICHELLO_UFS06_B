package org.example;        //il package è la cartella nella quale si trovano i file .java

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

    // Per i metodi set e get bisogna fare la stessa cosa dei costruttori, selezionando Getter and Setter al posto di Constructor
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

    public boolean setSuite(boolean suite) {
        this.suite = suite;

        return suite;//attenzione
    }
}
