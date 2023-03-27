package ayuditaessei;

import java.util.Scanner;

public class AyuditaEssei {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        int op = 31;

        do {

            System.out.println("1<-num6\n"
                    + "2<-num7\n"
                    + "3<-num8\n"
                    + "4<-num9\n"
                    + "5<-num11\n"
                    + "6<-num12\n"
                    + "7<-num13\n"
                    + "8<-num14\n"
                    + "9<-num15\n"
                    + "10<-num17\n"
                    + "11<-num18\n"
                    + "12<-num19 and numVar19\n"
                    + "13<-num20\n"
                    + "14<-num21\n");

            System.out.println("Ingrese su opcion: ");
            op = leer.nextInt();

            int size = 21;

            switch (op) {
//------------------------------------------------------------------------------
                case 1:
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if (i == size / 2 || j == size / 2) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
//------------------------------------------------------------------------------
                case 2:
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if (i == j) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }

                        System.out.println();
                    }
                    break;
//------------------------------------------------------------------------------
                case 3:
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if (i + j == size - 1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
//------------------------------------------------------------------------------  
                case 4:
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if (i == j || i + j == size - 1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
//------------------------------------------------------------------------------
                case 5:
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                                System.out.print("*");
                            } else if (i == size / 2 && j == size / 2) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
//------------------------------------------------------------------------------
                case 6:
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if (i == size / 2 || j == size / 2) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
//------------------------------------------------------------------------------
                case 7:
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if (i == j + 1 || i + 1 == j) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }

                    break;
//------------------------------------------------------------------------------
                case 8:
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if (i == size - 2 || j == size - 2 || j == 1 || i == 1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }

                        System.out.println();
                    }
                    break;
//------------------------------------------------------------------------------
                case 9:
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if (i >= 1 && i <= 5 || j >= 1 && j <= 5) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }

                        System.out.println();
                    }

                    break;
//------------------------------------------------------------------------------
                case 10:
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                                System.out.print(" ");
                            } else if (i == 1 || i == size - 2 || j == 1 || j == size - 2) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
//------------------------------------------------------------------------------
                case 11:
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if (i < 5 && j < 5) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }

                        System.out.println();
                    }
                    break;
//------------------------------------------------------------------------------
                case 12:
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if ((i + j) % 2 == 0) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("\n----------------------\n");
                    // 19 part 2
                    break;
//------------------------------------------------------------------------------
                case 13:
                     for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if ( i + j  == 4 || i + j  == 8 ||  i + j  == 12 ||  i + j  == 16 ||  i + j  == 20
                                    || i + j  == 24 || i + j  == 28 || i + j  == 32 || i + j  == 36 || i + j  == 39 ) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                        break;
//------------------------------------------------------------------------------
                        
            case 14:
                   for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if (i == size / 2 && j == 5 || i == size / 2 && j == size - 6 || j == size / 2 && i == 5 || j == size / 2 && i == size - 6 
                                    || j == 6 && i == 8 || j == 6 && i == 9 ||  j == 6 && i == 11 ||  j == 6 && i == 12
                                    || j == size - 7 && i == 8 || j == size - 7  && i == 9 ||  j == size - 7  && i == 11 ||  j == size - 7  && i == 12
                                    || j == 7 && i == 7 ||  j == 7 && i == 13 || j == size - 8 && i == 7 ||  j == size - 8 && i == 13 
                                    || j == 8 && i == 6 || j == 9 && i == 6 || j == 11 && i == 6 || j == 12 && i == 6
                                    || j == 8 && i == size - 7 || j == 9 && i == size - 7 || j == 11 && i == size - 7 || j == 12 && i == size - 7) {
 
                                //Todos los extremos
                                //Todas las lineas verticales left 
                                //Todas las lineas verticales right
                                //Todos los puntos extra left
                                //Todos los puntos extra right
                                //Todas las lineas horizontal left 
                                //Todas las lineas horizontal right
                                
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
//------------------------------------------------------------------------------
            }

        } while (op != 0);
        }
    }
