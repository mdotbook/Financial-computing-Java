package fc14PrimitiveDataTypes.ex03_threeDataTypes;

public class EquationExampleLarge {
    public static void main(String[] args) { //3 Main
        long assets = 200L; //4 Long type
        byte liabilities = 50; //5 Byte type
        long equity = assets - liabilities; //6 Calculation with long
        System.out.println("Assets = Liabilities + Equity"); //7 Print equation
        System.out.println(assets + " = " + liabilities + " + " + equity); //8 Print numbers

    }
}
