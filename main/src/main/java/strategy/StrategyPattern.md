# Strategy Pattern

> The strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
> Strategy lets the algorithm vary independently from clients that use it.
> 
> 策略模式定义了算法族，并将其独立于客户封装起来，让他们相互之间可以替换。此模式让算法的变化独立于使用它的客户。 
  
## [Before] Naive solution

In this solution, every kind of duck need to inherit from Duck class and override the three method
when they have different behaviour, which is not reasonable especially when decoy duck, a kind of
duck can neither quack or fly, need to explicitly override the methods it does not need.
Not Reasonable.

总的来说： 抽象类+继承，可以满足部分要求，但强制要求子类实现部分方法，对于并没有具体实现的子类而言没有必要。

此外，无法复用不同方法/算法的代码，造成即使不同子类算法相同，也要分别实现。

## [Middle] Slightly "improved" solution

Seems aware of that duck do not necessarily corresponding to a certain fly or quack method.
So we extract the fly() and quack() method as a interface, which has following disadvantages.

* Super type lose the control of quack or fly method. All subtypes of Duck can only have display() method,
we could barely reuse any code

* Although solve the issue in the "naive case" that duck types like mallard and red head ducks which represents
the majority, needs to repeatedly implement fly() and quack() method.

It's even worse than the first solution

因为具体行为方法是接口，虽然不需要实现接口的子类减少了代码工作量，但是对于需要实现的子类需要自己实现，且无法复用。

此外，超类没有相应的方法，无法面向接口（超类）编程，某种程度上失去了其意义。

## [After] Strategy pattern solution

Normally we use inheritance to reuse some code. DO NOT FORGET the final purpose is REUSE.

Besides inheritance, composition can also achieve this goal, which is meanwhile more flexible.
So bear the following Design Pattern in mind:

> Favor composition over inheritance
> 
> 多用组合，少用继承

## [Instance] Strategy pattern solution with constructor dependency injection

  Use constructor dependency injection to create different duck instances,
  which will avoid creating lots of inheritance of duck class
  
    

