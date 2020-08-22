package home;


import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner loginPass = new Scanner(System.in);
    System.out.println("Введите логин: ");
    String login = loginPass.next();
    System.out.println("Введите пароль: ");
    String password = loginPass.next();

    Product.list.add(new Product(1423, "19/07/2020", 5, "MILK", Type.Milk));
    Product.list.add(new Product(5612, "10/07/2020", 8, "BREAD", Type.Bread));
    Product.list.add(new Product(3865, "15/05/2020", 10, "POTATO", Type.Potato));
    Product.list.add(new Product(8245, "20/06/2020", 3, "WATER", Type.Water));

    if (login.equals(Customer.login)) {
      if (password.equals(Customer.password)) {
        Menu.menu();
      } else {
        System.out.println("Неверный пароль");
      }
    } else {
      System.out.println("Неверный логин");
    }


  }
}
