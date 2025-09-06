//Wczesniej wspomniane dziedziczenie po klasie Media
class Piosenka extends Media {
    private String wykonawca;
    public Piosenka(String tytul, String wykonawca){
        super(tytul); //Wykorzystanie super aby odwolac sie do klasy Media
        this.wykonawca = wykonawca;
    }

    public String getWykonawca() {
        return wykonawca;
    }

    @Override
    public String toString() {
        return "Piosenka{" + tytul + " " +
                "wykonawca='" + wykonawca + '\'' +
                '}';
    }
}