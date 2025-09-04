import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Library library = new Library();
    int opcja;
    do {
        System.out.println("==MENU GLOWNE SYMULATORA APLIKACJI SPOTIFY==");
        System.out.println("1. Dodaj nowa piosenke");
        System.out.println("2. Wyswietl dostepne utwory.");
        System.out.println("3. Utworz nowa playliste.");
        System.out.println("4. Dodaj utwor do playlisty.");
        System.out.println("5. Wyswietl dostepne playlisty.");
        System.out.println("6. Odtworz wybrany utwor.");
        System.out.println("Wybierz opcje.");
        opcja = scanner.nextInt();
        scanner.nextLine();

        switch (opcja){
            case 1:
                //();
                break;
            case 2:
                //();
                break;
            case 3:
                //();
                break;
            case 4:
                //();
                break;
            case 5:
                //();
            case 6:
                //();
                break;
            default:
                System.out.println("Proszę wybrać prawidłową opcje");
        }
    }while (opcja!=0);}}