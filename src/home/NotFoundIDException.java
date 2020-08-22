package home;

public class NotFoundIDException extends Exception{

  public String toString() {
    return "Ошибка. Нет продуктов с таким ID.";
  }

}
