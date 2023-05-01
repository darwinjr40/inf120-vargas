/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf120.vargas;

/**
 *
 * @author darwin
 */
public class Inf120Vargas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        tabla1(10);
        tablaFactoresPrimos(10);
    }

    public static void tabla(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.println(i + "*" + j + "=" + (i * j));
                j = j + 1;
            }
            System.out.println("");
            i = i + 1;
        }
    }

    //alt + shift + f
    public static void tabla1(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                int k = 1;
                while (k <= n) {
                    System.out.println(i + "*" + j + "*" + k + "=" + (i * j * k));
                    k++;
                }
                j++;
            }
            System.out.println("");
            i++;
        }
    }

    public static boolean primo(int n) {   
        int i = 2;
        int lim = n / 2;  //n / 2     5 div 2 = 2
                          //n  / 2.0    5  / 2.0 = 2.5 
        while (i <= lim) {
            if (n % i == 0) {
                return false;
            }
            i = i + 1;
        }
        return true;
    }

    public static void tablaFactoresPrimos(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                if (primo(i) && primo(j)) {
                    System.out.println(i + "*" + j + "=" + (i * j));
                }
                j = j + 1;
            }
            System.out.println("");
            i = i + 1;
        }
    }

}
