# CROSSWORD
___

We **did** _solve the crosswords_ 

___

>Work in progress

___

#### How Does It Works?

* User inputs the default corssword.
 * User inputs the word(s) to find.
* Output as 
 
 ['...XXXXXX',  
  '.XXX.X...',  
  '.....X.XX',  
  'XXXX.X...',  
  'XX...X.XX',  
  'XX.XXX.X.',  
  'X......X.',  
  'XX.X.XXX.',  
  'XXXX.....'] 
 
 * ![alt text](https://i.stack.imgur.com/ofiXW.png "Solved Crossword")



<br><br><br>
But I have to admit, logic:

- [x] provide useful functionality.
- [ ] do work for you.


___
___

# Introduction

The Logic Class Provides You Some Helpful Functions:

- Output Of Index(es) Of The First Charechter Of The Word.
- Checking Out Of The The Character Next To Any Index.
  - Which Returns True or False.
  - Which Returns Index(ex) Of Following Character(s).
- Output The DDA With Found Word In Upper Case.  

<br><br>

## Index Function [^](#introduction)

**Arguments** : `String [] [] DDA` and `String Word`

**Return Type** : `String []`

**Return** : *An Array With All The Index(es) Contating The First Character In The Double Dimention Array.*

### Example
```java
import java.util.*;
class Index {
  void main () {
    String [] [] DDA = {  {"A","B","C","D"},
                          {"B","F","G","A"},
                          {"I","A","K","L"},
                          {"M","N","A","P"}  };
    logic ex = new logic () ;
    String [] ind = ex.index( DDA, "ABC" );
    System.out.println( Arrays.toString( ind ) );
    }
}
```
> Output :  `[0/0, 1/3, 2/1, 3/2]`

<br><br>


## Check Function [^](#index-function-)

**Arguments** : `String [] [] DDA`, `String Index` and `String Character`

**Return Type** : `String []`

**Return** : *An Array With All The Index(es) Contating The Given Character In The Double Dimention Array Around The Provided Index.*

### Example
```java
import java.util.*;
class Check {
  void main () {
    String [] [] DDA = {  {"A","B","C","D"},
                          {"B","F","G","A"},
                          {"I","A","K","L"},
                          {"M","N","A","P"}  };
    logic ex = new logic () ;
    String [] ind = ex.check( DDA, "0/0", "B" );
    System.out.println( Arrays.toString( ind ) );
    }
}
```

> Output :  `[0/1, 1/0]`


<br><br>


## Trust Factor Function [^](#check-function-)

**Arguments** : `String [] [] DDA`, `String Index` and `String Character`

**Return Type** : `boolean`

**Return** : *True or False Whether The Given Character In The Double Dimention Array Around The Provided Index Exists Or Not.*

### Example
```java
import java.util.*;
class TrustFactor {
  void main () {
    String [] [] DDA = {  {"A","B","C","D"},
                          {"B","F","G","A"},
                          {"I","A","K","L"},
                          {"M","N","A","P"}  };
    logic ex = new logic () ;
    boolean ind = ex.trustfactor( DDA, "0/0", "B" );
    System.out.println( ind );
    }
}
```

> Output :  `true`


<br><br>


## Output Function [^](#trust-factor-function-)

**Arguments** : `String [] [] DDA` and `String Index` 

**Return Type** : `String [] []`

**Return** : *True or False Whether The Given Character In The Double Dimention Array Around The Provided Index Exists Or Not.*

### Example
```java
import java.util.*;
class TrustFactor {
  void main () {
    String [] [] DDA = {  {"A","B","C","D"},
                          {"B","F","G","A"},
                          {"I","A","K","L"},
                          {"M","N","A","P"}  };
    String [] indexes = { "0/0", "1/1", "2/2", "3/3" } ;                          
    logic ex = new logic () ;
    String [] [] ind = ex.output( DDA, indexes );
    System.out.println( Arrays.deepToString( ind ) );
    }
}
```

> Output :  `[[A, b, c, d], 
              [b, F, g, h], 
              [i, j, K, l], 
              [m, n, o, P]]`

<br><br>

<div align="center">
  :broken_heart: :copyright: :snowflake: 
  <br>
  <a href="http://dragoon.ooo">Dragoon Firestormar</a>
</div>
