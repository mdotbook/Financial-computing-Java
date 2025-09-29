package fc17_Naming_Variables;

public class ex02_EquationExampleSmall {
    public static void main(String[] args) { //3 Main
        float assetsValue = 50.5f; //4 CamelCase
        short LiabilitiesAmount = 20; //5 PascalCase
        float equity_total = assetsValue - LiabilitiesAmount; //6 snake_case
        System.out.println("Assets = Liabilities + Equity"); //7 Print equation
        System.out.println(assetsValue + " = " + LiabilitiesAmount + " + " + equity_total); //8 Print numbers


    }
}