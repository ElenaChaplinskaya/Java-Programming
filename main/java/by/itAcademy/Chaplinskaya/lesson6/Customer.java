package by.itAcademy.Chaplinskaya.lesson6;


import java.util.Scanner;

public class Customer {
    private String fullName;
    private int yearOfBirthday;
    private long creditCard;
    private String bankAccount;

    public Customer(String name, int year, long card, String account) {
        fullName = name;
        yearOfBirthday = year;
        creditCard = card;
        bankAccount = account;
    }

    public String getName() {
        return fullName;
    }

    public void setName(String name) {
        fullName = name;
    }

    public int getYear() {
        return yearOfBirthday;
    }

    public void setYear(int year) {
        yearOfBirthday = year;
    }

    public long getCard() {
        return creditCard;
    }

    public void setCard(long card) {
        creditCard = card;
    }

    public String getAccount() {
        return bankAccount;
    }

    public void setAccount(String account) {
        bankAccount = account;
    }

    public void infoCustomer() {
        System.out.println("Ф.И.О.:" + fullName + "\nГод рождения:" + yearOfBirthday + "\nНомер кредитной карты:" + creditCard + "\nНомер банковского счета:" + bankAccount);
    }

    public static  int ageCustomer(Customer user) {
        int t=2021;
        return t- user.getYear();

        }
    }

