
**Primitive Types**
* byte
* short
* int
* long
* char
* float
* double
* boolean

**String**

*Immutability*


**Bitwise & 



**Multi Threading**

Thread stack - memory allocated to Thread 

Thread shares heap

Thread suspensions - do research 

synchronized keyword
synchronized block 

Never use Local string variables for synchronized block 

Thread interference 


We can't guarantee the order in which the threads run, it all depends on the computer how it schedule tasks.

Implements Runnable vs extends Thread
most developers use Runnable for flexibility 
implement run method and call start 


A ReentrantLock is unstructured, unlike synchronized constructs -- i.e. you don't need to use a block structure for locking and can even hold a lock across methods.



Memory :

**Stack Memory:**
* Used in Java for static memory allocation and the execution of a thread.
* Exists as long as the current method is running.
* Much smaller compared to Heap Memory
* Comparatively much faster to allocate when compared to Heap
* It is accessed using LIFO memory allocation system
* Stores only primitive variables and references to object that are created in Heap Space

**Heap Memory**
* The entire application uses Heap space during runtime
* All newly created objects live in heap space
* Heap space exists as long as the application runs


** OOPS

* Abstraction
    *
* Encapsulation
    * Hide implementation details behind a public programming interface
    * The ability to make changes in your implementation code without breaking the code of others who use your code is the key benefit of encapsulation
    * Offers maintainability and flexibility
    * Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of own class in which they are declared.

* Polymorphism

    * Polymorphism is the ability of an object to take on many forms.
    * The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
    * Any Java object that can pass more than one IS-A test is considered to be polymorphic.

* Inheritance
* Composition
* Association
* Aggregation

1) Bootstrap ClassLoader - JRE/lib/rt.jar
2) Extension ClassLoader - JRE/lib/ext or any directory denoted by java.ext.dirs
3) Application ClassLoader - CLASSPATH environment variable, -classpath or -cp option, Class-Path attribute of Manifest inside JAR file.





