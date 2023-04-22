/*
Joel Avery Module 11
CSD 320 Java Programming 
02/24/23
*/

/*
This code has four methods and each of the first two return the largest element
of the array passed to the method. Two for largest and two for smallest. 
*/
public class MultiDimensionalArrays {
// This is the main method of the class
public static void main(String[] args) {
}

// This method takes a two-dimensional double array as input and returns an array of two integers 
// that represents the location of the largest element in the input array
public static int[] locateLargest(double[][] arrayParam){
    // Create an array of two integers to store the location of the largest element
    int [] largestLoc = new int[2];
    // Initialize the variable 'largest' to the first element of the input array
    double largest = arrayParam[0][0];
    // Loop through the rows of the input array
    for (int i = 0; i < arrayParam.length; i++) {
        // Loop through the columns of the input array
        for (int j = 0; j < arrayParam[i].length; j++) {
            // If an element in the input array is greater than 'largest', update the value of 'largest'
            // and store the location of the largest element in the 'largestLoc' array
            if (arrayParam[i][j] > largest) {
                largest = arrayParam[i][j];
                largestLoc[0] = i;
                largestLoc[1] = j;
            }
        }
    }
    // Return the 'largestLoc' array
    return largestLoc;
}

 // This method takes a two-dimensional integer array as input and returns an array of two integers 
// that represents the location of the largest element in the input array
public static int [] locateLargest (int [][] arrayParam) {
    // Create an array of two integers to store the location of the largest element
    int [] largestLoc = new int[2];
    // Initialize the variable 'largest' to the first element of the input array
    int largest = arrayParam[0][0];
    // Loop through the rows of the input array
    for (int i = 0; i < arrayParam.length; i++) {
        // Loop through the columns of the input array
        for (int j = 0; j < arrayParam[i].length; j++) {
            // If an element in the input array is greater than 'largest', update the value of 'largest'
            // and store the location of the largest element in the 'largestLoc' array
            if (arrayParam[i][j] > largest) {
                largest = arrayParam[i][j];
                largestLoc[0] = i;
                largestLoc[1] = j;
            }
        }
    }
    // Return the 'largestLoc' array
    return largestLoc;
}

  // This method takes a 2D double array as input and returns the index of the smallest element.
public static int [] locateSmallest (double [][] arrayParam) {
    // Create an array of length 2 to store the index of the smallest element.
    int [] smallestLoc = new int[2];
    // Initialize smallest to the first element of the array.
    double smallest = arrayParam[0][0];
    // Loop through the array to find the smallest element and its index.
    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {
            // If the current element is smaller than the current smallest, update smallest and smallestLoc.
            if (arrayParam[i][j] < smallest) {
                smallest = arrayParam[i][j];
                smallestLoc[0] = i;
                smallestLoc[1] = j;
            }
        }
    }
    // Return the index of the smallest element.
    return smallestLoc;
}

// This method takes a 2D integer array as input and returns the index of the smallest element.
public static int [] locateSmallest (int [][] arrayParam) {
    // Create an array of length 2 to store the index of the smallest element.
    int [] smallestLoc = new int[2];
    // Initialize smallest to the first element of the array.
    int smallest = arrayParam[0][0];
    // Loop through the array to find the smallest element and its index.
    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {
            // If the current element is smaller than the current smallest, update smallest and smallestLoc.
            if (arrayParam[i][j] < smallest) {
                smallest = arrayParam[i][j];
                smallestLoc[0] = i;
                smallestLoc[1] = j;
            }
        }
    }
    // Return the index of the smallest element.
    return smallestLoc;
}

}