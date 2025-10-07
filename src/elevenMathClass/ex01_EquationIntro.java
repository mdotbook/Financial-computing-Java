package elevenMathClass;

public class ex01_EquationIntro
{
    public static void main(String[] args) {
        int assets = 100;
        int liabilities = 40;
        int equity = assets - liabilities;

        System.out.println("Accounting Equation: Assets = Liabilities + Equity");
        System.out.println(assets + " = " + liabilities + " + " + equity);

        //5 Math.abs example
        System.out.println("Absolute value of -equity: " + Math.abs(-equity));
        //6 Math.max example
        System.out.println("Maximum of assets and liabilities: " + Math.max(assets, liabilities));
        //7 Math.pow example
        System.out.println("Assets to the power of 2: " + Math.pow(assets, 2));
        //8 Math.round and cast float to int
        float assetFloat = 123.75f;
        int roundedAsset = Math.round(assetFloat); // Cast float to int via rounding
        System.out.println("Rounded asset value: " + roundedAsset);
        //9 Math.PI example
        System.out.println("Value of PI: " + Math.PI);

        //10 Math.random example (0 to 99)
        int randomValue = (int)(Math.random() * 100);
        System.out.println("Random value (0-99): " + randomValue);

    }
}
