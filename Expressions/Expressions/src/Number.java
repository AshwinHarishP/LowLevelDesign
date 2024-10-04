public class Number implements ArithmeticExpression {
    public int value;

    Number(int value){
        this.value = value;
    }

    @Override
    public int evaluate(){
        System.out.println("Number is: " + value);
        return value;
    }



}
