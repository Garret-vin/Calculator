import java.util.Scanner;

public class Reader {

    //метод для считывания целого числа
    public int readInt(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    //метод для считывания строки
    public String readString(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
