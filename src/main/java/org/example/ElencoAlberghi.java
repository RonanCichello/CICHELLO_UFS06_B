package org.example;        //il package è la cartella nella quale si trovano i file .java

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class ElencoAlberghi {
    private static ElencoAlberghi istance;                                    // Creiamo un attributo "static" della classe in cui ci troviamo
    private static List<Albergo> alberghiList = new ArrayList();                // Creiamo un attributo "static" che conterrà la lista delle macchine
    private static List<ClientHandler> clientList = new ArrayList<>();  // Creiamo un attributo "static" che conterrà la lista dei client che si connettono

    private ElencoAlberghi() {
        buildList();
    }       // Creiamo un costruttore "private" che richiama il metodo buildList()

    public static ElencoAlberghi getInstance() {     // Creiamo un metodo "static" per creare l'oggetto ElencoAlberghi se non esiste
        if (istance == null) {                  // Se esiste già l'oggetto non viene ricreato
            istance = new ElencoAlberghi();
        }
        return istance;
    }

     static void buildList() {       // Nel metodo buildList mettiamo i dati di esempio inserendoli nella lista di macchine
        alberghiList.add(new Albergo("l'Hotel è bellissimo",3,"Gran Mjaestic", 2500.94,true));
        alberghiList.add(new Albergo("",2,"ciao", 100000,false));
        alberghiList.add(new Albergo("sulle colline toscane....",34, "Albergo dei Re",303,false));
        System.out.println(alberghiList);
   }
    // Metodi per gestire la lista di client connessi (add, remove, nOfClients)
    void add(ClientHandler clientHandler)
    {
        this.clientList.add(clientHandler);
    }

    void remove(ClientHandler clientHandler)
    {
        this.clientList.remove(clientHandler);
    }

    int nOfClients()
    {
        return this.clientList.size();
    }

    public String all() {       // Metodo che converte tutta la lista di macchine in una stringa Json
        Gson gson = new Gson();
        String s = gson.toJson(alberghiList);       // Viene creato un oggetto Gson (l'oggetto Json di Google)
        // che converte la lista di macchine in una stringa Json
        return s;
    }

    public String more_expensive() {            // Metodo che converte l'albergo con Prezzo maggiore in una stringa Json
        double max=0;
        Albergo c_max = null;

        for(Albergo albergo : alberghiList)                 // Viene trovata l'albergo con prezzo maggiore
        {
            if(albergo.getPrice()>max)
            {
                max=albergo.getPrice();
                c_max=albergo;
            }
        }

        Gson gson = new Gson();                 // L'albergo c_max viene convertita in una stringa Json
        String s = gson.toJson(c_max);

        return s;
    }
    public String more_expensive_suite() {            // Metodo che converte l'albergo con Prezzo maggiore in una stringa Json
        double max=0;
        Albergo c_max = null;

        for(Albergo albergo : alberghiList)                 // Viene trovata l'albergo con prezzo maggiore
        {
            if(albergo.getPrice()>max && albergo.getSuite())
            {
                max=albergo.getPrice();
                c_max=albergo;
            }
        }

        Gson gson = new Gson();                 // L'albergo c_max viene convertita in una stringa Json
        String s = gson.toJson(c_max);

        return s;
    }



    public String all_sorted() {            // Metodo che ordina la lista di alberghi e la converte in una stringa Json

        List<Albergo> albergoList_sorted = new ArrayList(alberghiList);

        albergoList_sorted.sort((o1, o2) -> {                       // Facciamo l'ordinamento
            return o1.getName().compareTo(o2.getName());
        });

        Gson gson = new Gson();                                 // La lista ordinata viene convertita in una stringa Json
        String s = gson.toJson(albergoList_sorted);

        return s;
    }


}



