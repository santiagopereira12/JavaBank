package com.project.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner sc = new Scanner(System.in);
        int numAccount;
        int pass;
        int opc;
        double amount;

        System.out.println("ingrese el numero de cuenta");
        numAccount = sc.nextInt();
        System.out.println("ingrese el password");
        pass = sc.nextInt();

        String password = String.valueOf(pass);

        if (numAccount == 12345678 && password.length() <5) {
            do {
                System.out.println("Bienvenido a Banco creditBank");
                System.out.println("Escoja la opción que desea realizar");
                System.out.println("1. Consultar saldo\n2. Retirar dinero\n3. Depositar dinero\n4. Salir");
                opc = sc.nextInt();
                switch (opc){
                    case 1:
                        account.getAccount();
                        break;
                    case 2:
                        System.out.println("digite la cantidad que desea retirar");
                        System.out.println("1. $20.000\n2. $50.000\n3. $100.000\n4. Ingresar valor.");
                        opc = sc.nextInt();
                        switch (opc){
                            case 1:
                                System.out.println("El retiro es de 20.000 ");
                                amount = 20000.00;
                                account.WithDrawMoney(amount);
                                break;
                            case 2:
                                System.out.println("el retiro es de 50.000 ");
                                amount = 50000.00;
                                account.WithDrawMoney(amount);
                                break;
                            case 3:
                                System.out.println("el retiro es de 100.000 ");
                                amount = 100000.00;
                                account.WithDrawMoney(amount);
                                break;
                            case 4:
                                System.out.println("Ingrese el valor que desea retirar: $");
                                amount = sc.nextDouble();
                                account.WithDrawMoney(amount);
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("digite la cantidad que desea depositar");
                        System.out.println("1. $20.000\n2. $50.000\n3. $100.000\n4. Ingresar valor.");
                        opc = sc.nextInt();
                        switch (opc){
                            case 1:
                                System.out.println("El deposito es de 20.000 ");
                                amount = 20000.00;
                                account.DepositMoney(amount);
                                break;
                            case 2:
                                System.out.println("el deposito es de 50.000 ");
                                amount = 50000.00;
                                account.DepositMoney(amount);
                                break;
                            case 3:
                                System.out.println("el depodito es de 100.000 ");
                                amount = 100000.00;
                                account.DepositMoney(amount);
                                break;
                            case 4:
                                System.out.println("Ingrese el valor que desea depositar: $");
                                amount = sc.nextDouble();
                                account.DepositMoney(amount);
                                break;
                        }
                    default:
                        System.out.println("Opción invalida.");
                }
            }while (opc != 4);
        } else if ( password.length() >4) {
            System.out.println("Contraseña invalida");
        }else {
            System.out.println("Acceso invalido");
        }
    }
}