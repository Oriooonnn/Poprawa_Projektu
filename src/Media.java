//ABSTRAKCYJNA KLASA MEDIA (szczegolnie wazna dla klasy Piosenka)
abstract class Media {
    protected String tytul;
    public  Media(String tytul){
        this.tytul = tytul;
    }
    public String getTytul(){
        return tytul;
    }
}

