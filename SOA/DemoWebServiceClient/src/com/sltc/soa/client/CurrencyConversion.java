package com.sltc.soa.client;

import com.sltc.soa.client.stub.CurrencyConversionWs;
import com.sltc.soa.client.stub.CurrencyConversionWsService;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: Thilanka<br/>
 * Date: 12/20/2022<br/>
 * Time: 10:31 PM<br/>
 * To change this template use File | Settings | File Templates.
 */
public class CurrencyConversion {
    public static void main(String[] args) {
        CurrencyConversionWsService currencyConversionWsService = new CurrencyConversionWsService();
        CurrencyConversionWs currencyConversionWs = currencyConversionWsService.getCurrencyConversionWsPort();

        System.out.println( "Please input code of source Currency" );
        String sourceCurrency = readInputIntStr();

        System.out.println( "Please input code of target Currency" );
        String targetCurrency = readInputIntStr();

        System.out.println( "Please input amount to convert" );
        float amountInSourceCurrency = readInputFloat();


        float result = (float) currencyConversionWs.convert( amountInSourceCurrency, sourceCurrency , targetCurrency);
        System.out.println(result);




    }
    private static String readInputIntStr()
    {
        Scanner scan = new Scanner( System.in );
        String inputStr = scan.next();
        return inputStr;
    }
    private static float readInputFloat()
    {
        Scanner scan = new Scanner( System.in );
        float inputfloat = scan.nextFloat();
        return inputfloat;
}

}