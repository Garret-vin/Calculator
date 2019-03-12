public class Calculator {

    private double num1;                //первое значение
    private double num2;                //второе значение
    private char operator;              //оператор действия над значениями (+,-,*,/)
    private int calc;                   //флаг для различия арабских чисел от римских
    private String[] inputLineInParts;  //массив в котором содержатся отдельно num1, operator и num2 (именно в таком порядке)

    public Calculator(String inputLine, int calculus) {
        this.inputLineInParts = inputLine.trim().split(" "); //разделяю введенное выражение и по-элементно присваниваю в массив
        this.calc = calculus;
        parse();
    }

    //Спарсиваем введенные данные с массива и присваиваем их переменным для дальнейших операций
    //Также проверяем сразу на корректность введенных данных
    private void parse() {
        if (this.calc == 1) {
            try {
                this.num1 = Double.parseDouble(this.inputLineInParts[0]);
                this.num2 = Double.parseDouble(this.inputLineInParts[2]);
            } catch (Exception e) {
                System.out.println("Вы ввели неверный формат чисел.");
                System.exit(0);
            }
        } else {
            this.num1 = convert(this.inputLineInParts[0]);
            this.num2 = convert(this.inputLineInParts[2]);
        }
        this.operator = this.inputLineInParts[1].charAt(0);
    }

    //Метод для конвертации Римских чисел в арабские и присвоения в переменные
    //с проверкой на корректность введеных данных
    private double convert (String input){
        switch (input) {
            case "I": return 1;
            case "II": return 2;
            case "III": return 3;
            case "IV": return 4;
            case "V": return 5;
            case "VI": return 6;
            case "VII": return 7;
            case "VIII": return 8;
            case "IX": return 9;
            case "X": return 10;
            default:
                System.out.println("Вы ввели неверный формат чисел.");
                System.exit(0);
        }
        return 0;
    }

    //метод для проведения вычислений и вывода их на экран
    public void calculate() {

        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                else System.out.println("Деление на 0 запрещено!");
                break;
            default:
                System.out.println("Вы ввели неверный оператор!");
                break;
        }
    }

}
