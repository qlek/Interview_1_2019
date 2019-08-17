package com.company;
//Zadanie
// tablica z 10 cyframi
// metoda co rozwija je w liczbe, dodaje jeden i zwraca liczbe
// metoda co zmienia calosc w tablice ponownie
public class Main {
    //struktury danych

    private static int[] table = new int[]{0, 0, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        System.out.println(makeNumber(table));
        System.out.println(makeTable(makeNumber(table)));
    }

    private static int makeNumber(int[] data) {
        int myNumber = 0;
        for (int i = 0; i < 10; i++) {
            myNumber += (data[i] * ((int) Math.round(Math.pow(10, 10 - i))) / 10);
        }
        myNumber++;
        return myNumber;
    }

    private static int[] makeTable(Integer number) {
        int[] dataToReturn = new int[10];
        String numberSplit =number.toString();
        int counter = 10 - numberSplit.length();
        for (int i=0; i<counter;i++)
        {
            numberSplit= "0" + numberSplit;
        }
        for (int i =0; i <numberSplit.length(); i++)
        {
            dataToReturn[i] = Character.getNumericValue( numberSplit.charAt(i));
            System.out.println("Testing " + dataToReturn[i]);
        }
        return dataToReturn;
    }

}
