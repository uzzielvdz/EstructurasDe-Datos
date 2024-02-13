package estructuradedatos;

import java.util.Arrays;

public class Matriz4D{
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
        
        System.out.println("Matriz desordenada: " + Arrays.deepToString(varMatrix));
        
        for (int i = 0; i < varMatrix.length; i++) {
            for (int j = 0; j < varMatrix[i].length; j++) {
                for (int k = 0; k < varMatrix[i][j].length; k++) {
                    for (int l = 0; l < varMatrix[i][j][k].length; l++) {
                        Arrays.sort(varMatrix[i][j][k]);
                    }
                }
            }
        }
        
        System.out.println("Matriz ordenada: " + Arrays.deepToString(varMatrix));
    }
}



    
