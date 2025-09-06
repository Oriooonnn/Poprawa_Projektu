import java.util.ArrayList;

public class Playlista {
    private String nazwa;
    private ArrayList<Piosenka> piosenki = new ArrayList<>();
    public Playlista(String nazwa){
        this.nazwa = nazwa;
    }
    public void dodajPiosenke(Piosenka p){
        piosenki.add(p);
    }

    public String getNazwa() {
        return nazwa;
    }
    public void wyswietl(){
        System.out.println("Playlista" + nazwa);
        for(Piosenka p: piosenki){
            System.out.println("-" + p);
        }
    }
}
