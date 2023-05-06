# Week 09 Research Assignment 

*Note: All answers are a synthesis of what I've learned from the class materials, unless a source is linked specifically.*

---

## **Prompt:** 

What are ten different data types MySQL provides?

## **Response:** 

- some numeric data types:
  - ```INTEGER``` or ```INT``` (these are synonymous)
  - ```DECIMAL```
  - ```BOOLEAN``` or ```BOOL``` (also syonymous)

- some string data types:
  - ```CHAR```
  - ```VARCHAR```
  - ```TEXT```
  - ```ENUM```

- some Date/Time data types:
  - ```DATE```
  - ```TIMESTAMP```
  - ```DATETIME```
  
---

## **Prompt:**

How is each data type you described used, and what makes it unique?

## **Response:**

- The ```INT``` data type is used to represent integer values. Being 4 bytes in size, an ```INT```'s value can range from 0 to 2<sup>32</sup> - 1. It can also be signed, in which case its value can range from -(2<sup>31</sup>) to 2<sup>31</sup> - 1. There are also four other related data types that represent smaller or larger sizes of byte storage: ```TINYINT```, ```SMALLINT```, ```MEDIUMINT```, and ```BIGINT```.

- The ```DECIMAL``` data type is used to represent exact decimal values. In order for ```DECIMAL``` to maintain this characteristic of being exact--and what distinguishes it from similar approximate-value data types like ```DOUBLE``` and ```FLOAT```--is that it is declared along with two values: its total length in digits, and the number of digits to be expected after the decimal point. A ```DECIMAL``` declaration for a 5-digit number with 2 fractional digits would look like this: ```DECIMAL(5, 2)```.

- The ```BOOL``` data type is used to represent truth states, and has two values: either 0 or 1. It can also be represented with the constants ```FALSE``` or ```TRUE```. Some programming languages have a separate set of primitive values for booleans, like Java or Javascript, but in MySQL, the primitive values of the ```BOOL``` data type truly are the numeric values 0 and 1.

- The ```CHAR``` data type is used to represent a fixed number of characters. If we declare a table with a column that uses the ```CHAR``` type, we'd want to know beforehand the exact number of characters any value in that column must have. For example, if we wanted to represent US states using their two-letter abbreviation in a table, we would declare its type like this: ```CHAR(2)```.

- The ```VARCHAR``` data type is much like ```CHAR```, but can represent a variable number of characters up to a maximum of 255. If we wanted to create a table containing a column with the names of exoplanets, we might give that column the type ```VARCHAR(255)```.

- The ```TEXT``` data type is for strings of much longer length, on the order of multiple sentences or even paragraphs.

- The ```ENUM``` data type represents a list of string values, and any value in a column with the ```ENUM``` type can only contain a value listed in the ```ENUM```. If we were to keep a table containing data about books from only a handful of different genres, but still wanted to keep track of which book belonged to which genre, we might represent that as an ```ENUM```. If the genres we were tracking happen to be Magical Realism, Hysterical Realism, and Contemporary Adult Fiction, the data type would look like ```ENUM("Magical Realism", "Hysterical Realism", "Contemporary Adult Fiction")```.

- The ```DATE``` data type allows us to store dates in the ```YYYY-MM-DD``` format. For example, May 6th 2023 would be written ```2023-05-06```.

- The ```TIMESTAMP``` data type allows us to have finer granularity when storing data about when events occurred, but the human readable format (like we see in ```DATE```) is not incredibly important. MySQL uses UNIX timestamps, which are reresented as a count of total seconds since January 1st 1970. This data type is most useful when storing records of digital transactions, for example storing timestamps to track when specific users performed specific kinds of data updates on specific servers, or storing a timestamp whenever our server receives information from a remote source.
  
- The ```TIME``` data type allows us to store times in the format ```hh:mm:ss```. For example, 1:06:33 in the afternoon would be written ```13:06:33```.

---

## **References:**

Both of the above prompts are based on information on MySQL data types as provided by:

- w3schools.com (https://www.w3schools.com/mysql/mysql_datatypes.asp)
  
- The MySQL reference manual, Chapter 11 (https://dev.mysql.com/doc/refman/8.0/en/data-types.html): *Specifically subchapters 11.1-11.3 as well as the Chapter 11 introduction*.