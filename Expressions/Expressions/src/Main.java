public class Main {
    public static void main(String[] args) {

        ArithmeticExpression one = new Number(1);
        ArithmeticExpression ten = new Number(10);
        ArithmeticExpression add = new Expression(one, ten, Operation.ADD);

        ArithmeticExpression parentExpression = new Expression(add, ten, Operation.MULTIPLY);
        System.out.println(parentExpression.evaluate());
    }
}