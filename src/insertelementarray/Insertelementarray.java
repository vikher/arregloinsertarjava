/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertelementarray;

import java.util.Arrays;


public class Insertelementarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a1 = {2, 4, 6, 8, 10};
        int elementoInsertado = 1;

        int[] a2 = new int[a1.length + 1];
        Arrays.sort(a1);
        int p = Arrays.binarySearch(a1, elementoInsertado);
        if (p < 0) {
            p = -p - 1;
            System.arraycopy(a1, 0, a2, 0, p);
            System.arraycopy(a1, p, a2, p + 1, a1.length - p);
            a2[p] = elementoInsertado;
        }
        System.out.println(Arrays.toString(a2));
    }

}
