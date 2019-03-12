
public class Main {

    public static void main(String[] args) {

        //Создаем экземпляр класса для корректного считывания с клавиатуры
        Reader reader = new Reader();

        //Ввод необходимых данных
        System.out.print("Укажите какие числа будут использоваться: 1 - арабские, 2 - римские: ");
        int calculus = reader.readInt();

        System.out.print("Введите выражение через пробел (например: 2 + 2 или II + II): ");
        String inputLine = reader.readString();

        //Создаем объект калькулятора и проводим вычисления
        Calculator calculator = new Calculator(inputLine, calculus);
        calculator.calculate();

    }
}
