import java.util.ArrayList;

public class Playlista {
    private String nazwa;
    //Utworzenie list piosenek
    private ArrayList<Piosenka> piosenki = new ArrayList<>();
    public Playlista(String nazwa){
        this.nazwa = nazwa;
    }
    //Metoda dodajPiosenke wykorzystujaca argument Piosenka od p
    public void dodajPiosenke(Piosenka p){
        piosenki.add(p);
    }
    //Zwracanie nazwy
    public String getNazwa() {
        return nazwa;
    }
    //Metoda wyswietl korzystajaca z petli for each
    public void wyswietl(){
        System.out.println("Playlista" + nazwa);
        for(Piosenka p: piosenki){
            System.out.println("-" + p);
        }
    }
}
