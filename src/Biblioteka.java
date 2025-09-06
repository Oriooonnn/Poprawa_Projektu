import java.util.ArrayList;

public class Biblioteka {
    //Ponowna deklaracja zbiorow piosenek i tym razem jeszcze playlist
    private ArrayList<Piosenka> piosenki = new ArrayList<>();
    private ArrayList<Playlista> playlisty = new ArrayList<>();

    public void dodajPiosenke(Piosenka p) {
        piosenki.add(p);

    }
    //Metoda wyswietlPiosenki ktora pierw sprawdza czy lista piosenki jest pusta nastepnie petla for ograniczona o rozmiar listy wyswietla podane piosenki
    public void wyswietlPiosenki() {
        if (piosenki.isEmpty()) {
            System.out.println("Brak piosenek do wyświetlenia");
        } else {
            for (int i = 0; i < piosenki.size(); i++) {
                System.out.println((i + 1) + ". " + piosenki.get(i));
            }
        }
    }

    public Piosenka getPiosenka(int indeks) {
        if (indeks >= 0 && indeks < piosenki.size()) {
            return piosenki.get(indeks);
        }
        return null;
    }
    public void utworzPlayliste(String nazwa){
        playlisty.add(new Playlista(nazwa));
        System.out.println("Dodano playliste " + nazwa);
    }
    public void dodajPiosenkeDoPlaylisty(String nazwa, int indeks){
        for(Playlista p: playlisty){
            if(p.getNazwa().equalsIgnoreCase(nazwa)){
                Piosenka song = getPiosenka(indeks);
                if(song != null){
                    p.dodajPiosenke(song);
                    System.out.println("Dodano do playlisty" + song);

                }else{
                    System.out.println("Nie ma takiej piosenki");
                }return;
            }
        }
        System.out.println("Nie ma takiej playlisty");
    }
    public void wyswietlPlaylisty(){
        if(playlisty.isEmpty()){
            System.out.println("Nie posiadasz playlist do wyswietlenia");
        }else{
            for(Playlista p: playlisty){
                p.wyswietl();
            }
        }
    }
}
