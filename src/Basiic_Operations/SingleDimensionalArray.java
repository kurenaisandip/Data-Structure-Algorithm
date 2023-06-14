package Basiic_Operations;

public class SingleDimensionalArray {

    int arr[] = null;

    public SingleDimensionalArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++){
        arr[i] = Integer.MIN_VALUE;
}
    }

    //Insertion
    public void insert(int location, int valueToBeInserted){
        try{
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.printf("Sucessfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index to access array");
        }
    }

    // Array Traversal
    public void traverseArray(){
        try{
            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i] + "");
            }
        }
        catch (Exception e){
            System.out.println("Array no longer exists");
        }
    }

    // Search for an element in the given Array
    public void searchInArray(int valueToSearch){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == valueToSearch){
                System.out.println("Value is found at the index of " +i);
                return;
            }
        }
        System.out.println(valueToSearch + "is not found");
    }

    // delete value from array
    public void deleteValue(int valueToBeDeleteIndex){
        try{
            arr[valueToBeDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted sucessfully");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The value that is provided is not in the range of array");
        }
    }

    public static void main(String[] args) {
        int sizeOfArray = 6;
        SingleDimensionalArray sd = new SingleDimensionalArray(sizeOfArray);


        sd.insert(0, 1);
        sd.insert(1, 2);
        sd.insert(2, 3);
        sd.insert(3, 4);
        sd.insert(4, 5);
        sd.insert(5, 6);


        sd.traverseArray();




    }
}
