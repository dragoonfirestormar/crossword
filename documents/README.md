But I have to admit, logic:

- [x] provide helpful functions.
- [ ] doesn't do work for you.


___
___

# Introduction

The Logic Class Provides You Some Of The Helpful Functions:

- Output Of Index(es) Of The First Charechter Of The Word.
- Checking Out Of The The Character Next To Any Index.
  - Which Returns True or False.
  - Which Returns Index(ex) Of Following Character(s).
- Output The DDA With Found Word In Upper Case.  



## Index Function [^](#introduction)

**Arguments** : `String [] [] DDA` and `String Word`

**Return Type** : `String []`

**Return** : *An Array With All The Index(es) Contating The First Character In The Double Dimention Array*

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




## Check Function [^](#index-function-)

**Arguments** : `String [] [] DDA`, `String Index` and `String Word`

**Return Type** : `String []`

**Return** : *An Array With All The Index(es) Contating The Given Character In The Double Dimention Array Around The Provided Index*

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

> Output :  [0/1, 1/0]


<div align="center">
  :broken_heart: :copyright: :snowflake:
</div>
