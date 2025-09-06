class Piosenka extends Media {
    private String wykonawca;
    public Piosenka(String tytul, String wykonawca){
        super(tytul);
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