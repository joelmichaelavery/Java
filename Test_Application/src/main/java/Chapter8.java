import java.util.Scanner;
public class Chapter8 {
    public static void main(String[] args) {
        int [][] triangleArray = new int [5][];
        triangleArray[0] = new int [5]; 
        triangleArray[1] = new int [4]; 
        triangleArray[2] = new int [3]; 
        triangleArray[3] = new int [2]; 
        triangleArray[4] = new int [1]; 
        
        triangleArray[0][3] = 4; 
        triangleArray[4][0] = 5;
        //System.out.print(triangleArray[2].length);
        
        //initializing a matrix with input values
        
        int [][] matrix = new int [10][10];
        /*java.util.Scanner input = new java.util.Scanner(System.in); 
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextInt(); 
            }
        }*/
        
        //initializing arrays with random variables. 
        for (int row = 0; row < matrix.length; row ++){
            for (int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = (int)(Math.random() * 100); 
            }
        }
        
        //printing a two dimensional array
        /*
        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){
                System.out.print("[" + row + "]" + "[" + column + "]" + matrix[row][column] + " ");
            }
        }*/
        //summing all elements
        /*int total = 0; 
        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){
                total += matrix[row][column]; 
        
            }
        
        }
     //System.out.print("Total is " + total);   */
        
        //summing elements by column 
        /*for (int column = 0; column < matrix[0].length; column++){
            int total = 0; 
            for (int row = 0; row < matrix.length; row++){
                total += matrix[row][column]; 
            }
        System.out.println("Sum for column " + column + " is " + total);
        }*/
        
        //Find which row has the largest sum
        /*int maxRow = 0; 
        int indexOfMaxRow = 0; 
        
        //get sum of the first row in the matrix
        for (int column = 0; column < matrix[0].length; column++){
            maxRow += matrix[0][column];
        }
        for (int row = 1; row < matrix.length; row++){
            int totalOfThisRow = 0; 
            for (int column = 0; column < matrix[row].length; column++){
                totalOfThisRow += matrix[row][column]; 
            }
            if (totalOfThisRow > maxRow){
                maxRow = totalOfThisRow; 
                indexOfMaxRow = row; 
            }
        }
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);*/
        

