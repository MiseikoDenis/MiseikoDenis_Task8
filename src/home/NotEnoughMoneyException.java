package home;

public class NotEnoughMoneyException extends Exception {

  public String toString() {
    return "Ошибка. У вас не хватает денег на покупку.";
  }

}
