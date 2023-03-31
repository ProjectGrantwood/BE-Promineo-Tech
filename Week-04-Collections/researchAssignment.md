# Week 04 Research Assignment 

*Note: All answers are a synthesis of what I've learned from the class materials, unless a source is linked specifically.*

## **Prompt:** Write a line of code that shows how you would instantiate a HashMap of String, String.

### **Response:**

```Java
import java.util.Map;
import java.util.Hashmap;

//simplest declaration:

Map<String, String> myHashMap = new HashMap<String, String>();

//or, with double brace syntax...

Map<String, String> mySecondHashMap = <String, String>() {{
    put("myFirstKey", "myFirstValue");
    put("mySecondKey", "mySecondValue");
}}

```