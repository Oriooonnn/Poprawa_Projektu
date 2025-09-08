import java.util.ArrayList;

public class Biblioteka {
    private ArrayList<Piosenka> piosenki = new ArrayList<>();
    private ArrayList<Playlista> playlisty = new ArrayList<>();

    public void dodajPiosenke(Piosenka p) {
        piosenki.add(p);

    }

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
            if(p.getNazwa().equals(nazwa)){
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
    //metoda sprawdzajaca czy numer piosenki znajduje sie w zapisanych piosenkach, jesli tak metoda usuwa podana pozycje
    }public void usunPiosenke(int indeks){
        if(indeks >=0 && indeks < piosenki.size()){
            Piosenka usunieta = piosenki.remove(indeks);
            System.out.println("Usunieto " + usunieta);
        }else {
            System.out.println("Nie ma takiej piosenki");
        }

    }
    public void edytujPiosenke(int indeks, String nowyTytul, String nowyWykonawca, String nowyGatunek){
        if(indeks >=0 && indeks<piosenki.size()){
            Piosenka p =piosenki.get(indeks);
            p.setTytul(nowyTytul);
            p.setWykonawca(nowyWykonawca);
            p.setGatunek(nowyGatunek);
            System.out.println("Zmiany zostaly zapisane");

        }else {
            System.out.println("Nie ma takiej piosenki");
        }
    }
}


