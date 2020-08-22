package home;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Menu {

  static String menuStart = "Меню:\n"
      + "1. Список товаров\n"
      + "2. Купить товар\n"
      + "3. Посмотреть корзину\n"
      + "4. Распечатать покупки\n"
      + "5. Выйти";
  static ArrayList<Product> cart = new ArrayList<>();


  public static void menu() {
    System.out.println(menuStart);
    Scanner options = new Scanner(System.in);
    System.out.println("Введите пункт из меню:");
    String option = options.next();

    switch (option) {
      case ("1"):
        list();
        menu();
        break;
      case ("2"):
        buy();
        menu();
        break;
      case ("3"):
        cart();
        menu();
        break;
      case ("4"):
        printCard();
        break;
      case ("5"):
        break;
      default:
        System.out.println("Нет такого пункта!");
        menu();
    }


  }

  public static void list() {
    Product.list();
  }

  public static void buy() {
    int i = 0;
    System.out.println("Введите id товара: ");
    Scanner buy = new Scanner(System.in);
    Integer idP = Integer.valueOf(buy.next());

    Iterator<Product> itr = Product.list.iterator();
    while (itr.hasNext()) {
      Product product = itr.next();
      if (idP == product.getId()) {
        i++;
        try {

          if (Customer.money >= product.getCost()) {

            Customer.money = Customer.money - product.getCost();
            System.out.println("У вас осталось : " + Customer.money);
            cart.add(product);
          } else {
            throw new NotEnoughMoneyException();
          }
        } catch (NotEnoughMoneyException e) {
          System.out.println(e.toString());
        }
      }

    }
    try {
      if (i == 0) {
        throw new NotFoundIDException();
      }
    } catch (NotFoundIDException e) {
      System.out.println(e.toString());
    }
  }

  public static void cart() {
    for (Product c : cart) {
      System.out.println(c);
    }

  }

  public static void printCard() {

    try {
      FileWriter fstream = new FileWriter("list.txt");
      BufferedWriter out = new BufferedWriter(fstream);
      for (Product c : cart) {
        String s = c.toString();

        out.write(s + "\r\n");
        out.newLine();


      }
      out.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}



