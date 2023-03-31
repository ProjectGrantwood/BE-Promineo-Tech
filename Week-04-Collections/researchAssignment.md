# Week 04 Research Assignment 

*Note: All answers are a synthesis of what I've learned from the class materials, unless a source is linked specifically.*

## **Prompt:** Write a line of code that shows how you would instantiate a HashMap of String, String.

### **Response:**

```Java
import java.util.Map;
import java.util.Hashmap;

public class HashMapExample {
    
    public static void Main(String[] args) {
        
        //simplest declaration:

        Map<String, String> myHashMap = new HashMap<String, String>();

        //or, with double brace syntax...

        Map<String, String> mySecondHashMap = <String, String>() {{
            put("myFirstKey", "myFirstValue");
            put("mySecondKey", "mySecondValue");
        }}
    }
    
}

```

*For the double brace syntax, I used https://www.baeldung.com/java-initialize-hashmap as a reference.*

---
## **Prompt:** Write a line of code that shows how you would instantiate a HashSet of StringBuilder.

### **Response:**

```Java
import java.util.Set;
import java.util.HashSet;

public class HashSetExample {
    
    public static void Main(String[] args) {
        
        //simple declaration:

        Set<StringBuilder> myHashSet = new HashSet<StringBuilder>();

    }
    
}


```