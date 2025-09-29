package fc17_Naming_Variables;

public class ex04_EquationExampleMixed {
    public static void main(String[] args) { //3 Main
        double assetsValue = 75.75; //4 camelCase
        int LiabilitiesAmount = 25; //5 PascalCase
        double equity_total = assetsValue - LiabilitiesAmount; //6 snake_case
        System.out.println("Assets = Liabilities + Equity"); //7 Print
        System.out.println(assetsValue + " = " + LiabilitiesAmount + " + " + equity_total); //8 Print numbers

    }
}