package home;


import java.util.ArrayList;


public class Product {


  private String name;
  private String date;
  private int cost;
  private int id;
  private Type type;

  Product(int id, String date, int cost, String name, Type type) {
    this.name = name;
    this.date = date;
    this.cost = cost;
    this.id = id;
    this.type = type;

  }

  static ArrayList<Product> list = new ArrayList<>();

  public static void list() {

    for (Product p : list) {
      System.out.println(p);
    }
  }

  @Override
  public String toString() {
    return "id='" + id + '\'' +
        ", дата='" + date + '\'' +
        ", стоимость=" + cost +
        ", название=" + name +
        ", тип=" + type;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public int getCost() {
    return cost;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }
}

