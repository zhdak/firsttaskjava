import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("recept.txt");
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Рецепт блинчиков");
        System.out.println("Укажите кол-во яиц: ");
        int egg = scanner.nextInt();
        System.out.println("Укажите сколько нужно молока: ");
        int milk = scanner.nextInt();
        System.out.println("Укажите сколько нужно соли: ");
        int salt = scanner.nextInt();
        System.out.println("Укажите сколько нужно сахара: ");
        int sugar = scanner.nextInt();
        System.out.println("Укажите сколько нужно муки: ");
        int flower = scanner.nextInt();
        System.out.println("Укажите сколько нужно растительного масла: ");
        int oil = scanner.nextInt();
        System.out.println("Напишите как приготовить блинчиков: ");
        scanner.nextLine();
        pw.println("Рецепт блинчиков:" +
                "\n1. Яйца: " + egg + " штук" +
                "\n2. Молоко: " + milk + " милилитров" +
                "\n3. Соль: " + salt + " грамм" +
                "\n4. Сахар: " + sugar + " грамм\n5. Мука: " + flower + " грамм" +
                "\n6. Масло растительное: " + oil + " ст. ложек");
        pw.close();
        Scanner scanner2 = new Scanner(new File("recept.txt"));
        while (scanner2.hasNextLine()) {
            System.out.println(scanner2.nextLine());
        }
        scanner2.close();
    }
}