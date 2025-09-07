 class Piosenka extends Media {
     private static final String[] GATUNKI = {"rock", "pop", "metal", "inne"};
     private String wykonawca;
     private String gatunek;

     public Piosenka(String tytul, String wykonawca, String gatunek) {
         super(tytul);
         this.wykonawca = wykonawca;
         this.gatunek = sprawdzGatunek(gatunek);
     }

     private String sprawdzGatunek(String g) {
         for (String gat : GATUNKI) {
             if (gat.equals(g)) {
                 return gat;
             }
         }
         return "inne";
     }

     public String getWykonawca() {
         return wykonawca;
     }

     public String getGatunek() {
         return gatunek;
     }
     //Na potrzeby estetyki zmiana ToString aby program ladnie pokazywal dane
     @Override
     public String toString() {
         return "Piosenka{" +
                 "tytuł='" + tytul + '\'' +
                 ", wykonawca='" + wykonawca + '\'' +
                 ", gatunek='" + gatunek + '\'' +
                 '}';
     }
     public void setTytul(String tytul){
         this.tytul = tytul;
     }
     public void setWykonawca(String wykonawca){
         this.wykonawca = wykonawca;
     }
     public void setGatunek(String gatunek){
         this.gatunek = sprawdzGatunek(gatunek);
     }
 }