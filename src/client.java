import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {

        List<String> platyat = new ArrayList<>(); // пустой пополняемый список

        System.out.println(platyat);
        System.out.println("Размер: " + platyat.size());



        Scanner Client = new Scaner(System.in);
        System.out.println("Имя :");

        String Name = Client.nextLine();
        System.out.println("\nНовое имя клиента :" + Name);
        platyat.add("\n"Name);







    }











}
