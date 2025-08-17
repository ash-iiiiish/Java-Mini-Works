//Currency Converter

import java.util.Map;

import java.util.Scanner;

import java.util.HashMap;

public class Currency_Convertor {

    private Map<String,Double> exchange_Rates;
    public Currency_Convertor(){

        exchange_Rates= new HashMap<>();

        exchange_Rates.put("USD",1.0);   //base currency (US Dollar )
        exchange_Rates.put("EUR", 0.86);    //Euro
        exchange_Rates.put("GBP", 0.74);    //BRITISH found
        exchange_Rates.put("JPY", 109.78);  //Japanse Yen
        exchange_Rates.put("CAD", 1.26);    //Canadian Dollar
        exchange_Rates.put("AUD", 1.35);    //Australian Dollar
        exchange_Rates.put("INR", 73.92);   //Indaian Rupee
        exchange_Rates.put("CNY", 6.44);    //Chinese Yuen
    }

    public double convert_Currency(double amount,String from_Currency,String to_Currency)
    {

        if(exchange_Rates.containsKey(from_Currency) && exchange_Rates.containsKey(to_Currency))
        {

            double fromRate=exchange_Rates.get(from_Currency);

            double toRate=exchange_Rates.get(to_Currency);

            return amount*(toRate/fromRate);
        }

        else
        {

            System.out.println("Invalid currency codes.");
            return -1.0;

        }
    }

    public static void main(String[] args)
    {
        Currency_Convertor convertor=new Currency_Convertor();
        Scanner sc=new Scanner(System.in);

        System.out.println("Currency Convertor");
        System.out.println("Enter the amount");
        double amount =sc.nextDouble();

        System.out.println("Enter the source currency code (e.g. \nUSD    \nEUR  \nGBP  \nJPY  \nCAD  \nAUD  \nINR  \nCNY");
        String from_Currency= sc.next().toUpperCase();

        System.out.println("Enter the target currency code (e.g.. \nUSD    \nEUR  \nGBP  \nJPY  \nCAD  \nAUD  \nINR  \nCNY");
        String to_Currency=sc.next().toUpperCase();

        double converted_currencyAmount= convertor.convert_Currency(amount,from_Currency,to_Currency);

        if(converted_currencyAmount!= -1.0)
        {
            System.out.println(amount +" " + from_Currency + " is equal to " + converted_currencyAmount + " " + to_Currency);
        }
    }
}



