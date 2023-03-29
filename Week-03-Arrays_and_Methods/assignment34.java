package Week_03_04_Assignment;
public class AssignmentWeek34 { 
    public static void main(String[] args) {
        
        // Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
        
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        
        // Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). 
        // Print the result to the console. 
    
        System.out.println("The difference between " + ages[ages.length - 1] + " and " + ages[0] + " is " + firstLastDifference(ages) + ".");
    
        
        // Problem 3: Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
        int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 72}; //added 72
        
        System.out.println("The difference between " + ages2[ages.length - 1] + " and " + ages2[0] + " is " + firstLastDifference(ages2) + ".");
        
        // Use a loop to iterate through the array and calculate the average age. Print the result to the console.
        
        int total = 0;
        
        for (int age: ages){
            total += age;
        }
        
        System.out.println("The average value in the array 'ages' is " + total / ages.length);
        
        // Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
        
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
        
        for (String name: names){
            System.out.println("The length of the name " + name + " is " + name.length() + ".");
        }
        
        // Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
        
        String concatenatedNames = names[0];
        for (int i = 1; i < names.length; i++) {
            concatenatedNames += " " + names[i];
        }
        
        System.out.println("Here is a concatenated String of names: " + concatenatedNames);
        
        // How do you access the last element of any array?
        // How do you access the first element of any array?
        
        String[] questions = {"How do you access the last element of an array?", "How do you access the first element of an array?"};
        String[] answers = {"You access the element at index array.length - 1", "You access the element at index 0"};
        System.out.println(questions[0]);
        System.out.println(answers[answers.length - 1]);
        System.out.println(questions[questions.length - 1]);
        System.out.println(answers[0]);
        
        // Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
        
        int[] nameLengths = new int[names.length];
        
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
        
        // Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
        
        int nameTotal = 0;
        
        for (int len: nameLengths){
            nameTotal += len;
        }
        
        System.out.println(nameTotal);
        
        // Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
        
        System.out.println("The word 'arboreal' repeated 3 times, using a method: " + repeatWord("arboreal", 3));
        
// Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
// Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
// Write a method that takes an array of double and returns the average of all the elements in the array.
// Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
// Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
// Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
    }
    
    public static int firstLastDifference(int[] ages) {
        int dif = ages[ages.length - 1] - ages[0];
        return dif;
    }
    
    public static String repeatWord(String word, int n) {
        result = "";
        for (int i = 0; i < n; i++){
            result += word;
        }
        return result;
    }
    
} 