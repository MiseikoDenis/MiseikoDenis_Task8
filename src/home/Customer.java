package home;

public class Customer {

  protected static String login = "1";
  protected static String password = "1";
  protected static int money = 10;

  @Override
  public String toString() {
    return "Customer{" +
        "login='" + login + '\'' +
        ", password='" + password + '\'' +
        ", money=" + money +
        '}';
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }
}
