package Ejercicios;

import java.util.Objects;
import java.util.Scanner;

public class TareaConTodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        String user = "david";
        String phone = "321";
        String password = "abc";
        String usering = " ";
        String userphone = " ";
        String passwording = " ";
        double inversion = 0;
        int days = 0;
        double interests = 1;
        double benefit;
        double myarray [] = new double[6];
        int probablydays = 60;
        double totalinterests = 0;


        System.out.println("Bienvenido seleccione una opción para ingresar al sistema");


        while (opc !=3 && (!user.equals(usering) && !passwording.equals(passwording) || !phone.equals(userphone) && !Objects.equals(passwording, password))){
        System.out.println("1.Ingresar con usuario 2.Ingresar con telefono 3.Para salir ");
        opc = sc.nextInt();
        sc.nextLine();


        switch (opc){
            case 1:
                System.out.println("ingrese su usuario");
                usering = sc.nextLine();
                break;
            case 2:
                System.out.println("ingrese su teléfono");
                userphone = sc.nextLine();
                break;

            case 3:
                System.out.println("Hasta pronto");
                break;

            default:
                System.out.println("Por favor ingrese una opción válida");
        }
            System.out.println("ingrese su contraseña");
            passwording = sc.nextLine();
        }



        if (user.equals(usering) && password.equals(passwording) || phone.equals(userphone) && password.equals(passwording)){

            System.out.println("Bienvendido");
            while (opc !=3 && interests == 1){
                System.out.println("Vamos a calcular un cdt virtual");
                System.out.println("ELIJE UNA OPCIÓN 1.Calcular inversion 2.Ver la información 3.Salir" );
                sc.nextInt();
                sc.nextLine();
                System.out.println("Cuanto vas a invertir");
                inversion = sc.nextDouble();
                System.out.println("A cuantos dias vas a hacer la inversión? minimo 60 días máximo 540 días");
                days = sc.nextInt();
                sc.nextLine();



                if (days>=60){
                    interests = 0.05;
                } else if (days>= 120) {
                    interests = 0.0650;

                } else if (days >= 180) {
                    interests = 0.0750;

                } else if (days >= 240) {
                    interests = 0.0850;

                } else if (days >= 300) {
                    interests = 0.09;

                } else if (days == 365) {
                    interests = 0.0950;

                } else {
                    System.out.println("elija una opción valida");

                }}


                benefit = inversion + (inversion * interests);
                totalinterests = (inversion * interests);
                System.out.println("Se calcula para una inversion de " + " $ " + inversion + " un total de $ " + benefit + " y los intereses fueron $ " + totalinterests);
                double sixty = inversion + (inversion * 0.05);
                double onetwenty = inversion + (inversion * 0.0650);
                double oneeighty = inversion + (inversion * 0.0750);
                double twoforty = inversion + (inversion * 0.0850);
                double threehundred = inversion + (inversion * 0.09);
                double year = inversion + (inversion * 0.0950);


                myarray[0] = sixty;
                myarray[1] = onetwenty;
                myarray[2] = oneeighty;
                myarray[3] = twoforty;
                myarray[4] = threehundred;
                myarray[5] = year;


                for (int i =0; i < myarray.length; i++) {

                    System.out.println("para una inversion de " + (probablydays) + " días un total de " + myarray[i]);
                    probablydays += 60;}


                

                   }
               }

                }



