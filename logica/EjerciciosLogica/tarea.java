import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* variables para iniciar sesion*/

        String option = "0";
        String user = "david";
        String usering;
        String phone = "321";
        String userphone;
        String password = "abc";
        String passwording;

        /* variables y array para cálculos de cdt virtual*/
        double inversion = 0;
        int days = 0;
        double interests = 1;
        double benefit;
        double[] myarray = new double[6];
        int probablydays = 60;
        double totalinterests;
        boolean login = false;

        /*Menu para iniciar sesión y se lee la opcion en la variable option*/

        System.out.println("Bienvenido seleccione una opción para ingresar al sistema");
        while (login == false) {
            System.out.println("1.Para usuario");
            System.out.println("2.Para teléfono");
            option = sc.nextLine();

            /* Se evalua la variable option para ver como va a ingresar el usuario*/

            switch (option) {
                case "1":
                    System.out.println("Ingrese su usuario");
                    usering = sc.nextLine();
                    System.out.println("ingrese su contraseña");
                    passwording = sc.nextLine();

                    /* condicional, si cumple el login sera verdadero sino sera falso*/


                    if (usering.equals(user) && passwording.equals(password)) {
                        login = true;
                    } else {
                        System.out.println("valide sus credenciales");
                        login = false;
                    }
                    break;
                case "2":
                    System.out.println("ingrese su telefono");
                    userphone = sc.nextLine();
                    System.out.println("ingrese su contraseña");
                    passwording = sc.nextLine();
                    if (userphone.equals(phone) && passwording.equals(password)) {
                        login = true;
                    } else {
                        System.out.println("valide sus credenciales");
                        login = false;
                    }
                    break;
                case "3":
                    System.out.println("Saliendo...");

                default:
                    System.out.println("ingrese una opcion valida");
                    break;
            }
        }

        /* si el login es verdadero entonces se procede con los calculos del cdt virtual*/
        while (login) {
            System.out.println("Bienvendido");
            System.out.println("Vamos a calcular un cdt virtual");
            System.out.println("Cuanto vas a invertir");
            inversion = sc.nextDouble();


            System.out.println("A cuantos dias vas a hacer la inversión? minimo 60 días máximo 365 días");
            days = sc.nextInt();
            sc.nextLine();

            if (days > 365) {
                interests = 0;
                System.out.println("elija una opcion valida");
            } else if (days >= 60) {
                interests = 0.05;
            } else if (days >= 120) {
                interests = 0.0650;

            } else if (days >= 180) {
                interests = 0.0750;

            } else if (days >= 240) {
                interests = 0.0850;

            } else if (days >= 300) {
                interests = 0.09;

            } else if (days == 365) {
                interests = 0.0950;

            }
            if (days > 0 && interests != 0 ) {
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


                for (double v : myarray) {

                    System.out.println("para una inversion de " + (probablydays) + " días un total de " + v);
                    probablydays += 60;
                }

            }
        }
    }
}










