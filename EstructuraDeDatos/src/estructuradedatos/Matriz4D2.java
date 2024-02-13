package estructuradedatos;

import java.util.Arrays;

public class Matriz4D2 {
    public static void main(String[] args) {
         
        int[][][][] varMatrix = {
            {
                {
                    {1, 4, 3}, {8, 5, 6}
                }, {
                    {7, 9, 10}, {11, 12, 14, 15}
                }, {
                    {2, 9}, {16, 18, 17}
                }
            }, {
                {
                    {23, 24}, {100, 2, 178, 90}
                }, {
                    {37, 56, 15, 26}, {47, 66, 35, 39}
                }, {
                    {27, 36, 45, 16}, {17, 26, 15, 6}
                }
            }
        };
        
                // Extraemos todos los elementos de la matriz y los almacenamos en un solo arreglo
        int[] flatArray = Arrays.stream(varMatrix)
                                .flatMap(a -> Arrays.stream(a))
                                .flatMap(a -> Arrays.stream(a))
                                .flatMapToInt(Arrays::stream)
                                .toArray();

        // Ordenamos el arreglo
        Arrays.sort(flatArray);
        
        // Reorganizamos los valores ordenados en la matriz
        int index = 0;
        for (int i = 0; i < varMatrix.length; i++) {
            for (int j = 0; j < varMatrix[i].length; j++) {
                for (int k = 0; k < varMatrix[i][j].length; k++) {
                    for (int l = 0; l < varMatrix[i][j][k].length; l++) {
                        varMatrix[i][j][k][l] = flatArray[index++];
                    }
                }
            }
        }

        // Mostramos la matriz ordenada
        for (int[][][] subMatrix3D : varMatrix) {
            for (int[][] subMatrix2D : subMatrix3D) {
                for (int[] subMatrix1D : subMatrix2D) {
                    for (int num : subMatrix1D) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}


