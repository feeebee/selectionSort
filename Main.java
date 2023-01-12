import java.util.ArrayList;

/*
 * benefits: with a small array list, it is performs well. 
 * cons: when the array list contains a lot of values, it becomes slow and unefficient.
 * However, it is 100% accurate all the time:)
 */



public class Main{
    public static void main(String[]args){
        ArrayList<Integer> example = new ArrayList<Integer>();
        example.add(3);
        example.add(10);
        example.add(12);
        example.add(1);
        example.add(7);
        example.add(4);
    
    //a for loop runs through the full length of the example arraylist and look at each piece of the array and will keep track of the current lowest and swap value.
    for(int i = 0; i<example.size()-1; i++){
        //holds the index of the smallest value
        int minIndex = i;
        //uses a sequential search to find the smallest number
        for(int searchIndex = i+1; searchIndex<example.size(); searchIndex++){
            //if the value at minIndex is larger than searchIndex, then set minIndex to searchIndex
            if(example.get(searchIndex)<example.get(minIndex)){
                minIndex = searchIndex;
            }
        //creates a variable that gets the value at index i to temporarily hold it  
        int temp = example.get(i);
        //holds the smallest value of the array (at minIndex)
        int smallest = example.get(minIndex);

        //if minIndex doesn't hold the smallest value, then it makes the current index i to the smallest value and minIndex becomes the value of the value that was replaced
        example.set(i,smallest);
        example.set(minIndex, temp);
        
    }
    }
    //prints out the array list
    System.out.print(example);
}
}