public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    long amount = 1000_60;
    boolean registered = true;

   //service.calculate(amount, registered);
    long bonus = service.calculate(amount, registered);
    System.out.println (bonus);
  }
}

//mvn spotbugs:check
//Данная команда запускает анализ и сообщает о неудачной сборке, если обнаруживает какие-либо ошибки из спектра spotbugs.

