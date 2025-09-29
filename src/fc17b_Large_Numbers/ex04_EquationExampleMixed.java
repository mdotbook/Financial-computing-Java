package fc17b_Large_Numbers;

public class ex04_EquationExampleMixed {
    public static void main(String[] args) { //3 Main
        double assetsValue = 7_500_000.75; //4 Large double
        int LiabilitiesAmount = 2_500_000; //5 Large int
        double equity_total = assetsValue - LiabilitiesAmount; //6 Calculation
        System.out.println("Assets = Liabilities + Equity"); //7 Print
        System.out.println(assetsValue + " = " + LiabilitiesAmount + " + " + equity_total); //8 Print numbers

    }
}