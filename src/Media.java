//Abstrakcyjna klasa z ktorej dziedziczy klasa Piosenka
abstract class Media {
    protected String tytul;

    public  Media(String tytul){
        this.tytul = tytul;
    }
    //Zwracanie tytulu
    public String getTytul(){
        return tytul;
    }
}

