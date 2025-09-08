import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Biblioteka biblioteka = new Biblioteka();
    public static void main(String[] args) {
        //Wyswietlanie menu wyboru uzytkownika
        int opcja;
        do {
            System.out.println("==MENU GLOWNE SYMULATORA APLIKACJI SPOTIFY==");
            System.out.println("1. Dodaj nowa piosenke.");
            System.out.println("2. Wyswietl dostepne utwory.");
            System.out.println("3. Utworz nowa playliste.");
            System.out.println("4. Dodaj utwor do playlisty.");
            System.out.println("5. Wyswietl dostepne playlisty.");
            System.out.println("6. Odtworz wybrany utwor.");
            System.out.println("7. Edytuj Piosenke.");
            System.out.println("Wybierz opcje.");
            opcja = scanner.nextInt();
            scanner.nextLine();
            //logika wyborow za pomoca switch i case oraz wywolanie poszczegolnych metod
            switch (opcja) {
                case 1:
                    DodajPiosenke();
                    break;
                case 2:
                    biblioteka.wyswietlPiosenki();
                    break;
                case 3:
                    UtworzPlayliste();
                    break;
                case 4:
                    System.out.println("Podaj nazwę playlisty");
                    String nazwa = scanner.nextLine();
                    System.out.println("Podaj numer piosenki");
                    int numer = scanner.nextInt();
                    biblioteka.dodajPiosenkeDoPlaylisty(nazwa, numer-1);
                    break;
                case 5:
                    biblioteka.wyswietlPlaylisty();
                    break;
                case 6:
                    odtworzPiosenke();
                    break;
                case 7:
                    System.out.println("Wybierz indeks piosenki do edycji");
                    int indeks = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Podaj nowy tytul");
                    String nowyTytul = scanner.nextLine();
                    System.out.println("Podaj nowego wykonawce");
                    String nowyWykonawca = scanner.nextLine();
                    System.out.println("Podaj nowy gatunek");
                    String nowyGatunek = scanner.nextLine();
                    biblioteka.edytujPiosenke(indeks -1,nowyTytul,nowyWykonawca,nowyGatunek);
                    break;
                default:
                    System.out.println("Proszę wybrać prawidłową opcje.");
            }
        } while (opcja != 0);
    }
        private static void DodajPiosenke(){
        System.out.println("Podaj tytuł piosenki:");
        String tytul = scanner.nextLine();
        System.out.println("Podaj wykonawce:");
        String wykonawca = scanner.nextLine();
        System.out.println("Podaj gatunek muzyczny");
        String gatunek = scanner.nextLine();
        Piosenka p = new Piosenka(tytul,wykonawca,gatunek);
        biblioteka.dodajPiosenke(p);
        System.out.println("Dodano piosenke " + p);
        }

        private static void UtworzPlayliste() {
            System.out.println("Podaj nazwę playlisty:");
            String nazwa = scanner.nextLine();
            biblioteka.utworzPlayliste(nazwa);
        }
        private static void odtworzPiosenke(){
        System.out.println("Proszę podac numer piosenki");
        int numer = scanner.nextInt();
        Piosenka p = biblioteka.getPiosenka(numer - 1);
        if(p != null){
            Player.odtworz(p);

        }else{
            System.out.println("Nie ma takiej piosenki");
        }
        }
        private static void usunPiosenke(){
        System.out.println("Podaj numer piosenki do usuniecia");
        int numer = Integer.parseInt(scanner.nextLine());
        biblioteka.usunPiosenke(numer -1);
        }}