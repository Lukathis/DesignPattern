# Strategy Pattern

## [before] Naive solution

In this solution, every kind of duck need to inherit from Duck class and override the three method
when they have different behaviour, which is not reasonable especially when decoy duck, a kind of
duck can neither quack or fly, need to explicitly override the methods it does not need.
Not Reasonable.


## [middle] Slightly "improved" solution

Seems aware of that duck do not necessarily corresponding to a certain fly or quack method.
So we extract the fly() and quack() method as a interface, which has following disadvantages.

* Super type lose the control of quack or fly method. All subtypes of Duck can only have display() method,
we could barely reuse any code

* Although solve the issue in the "naive case" that duck types like mallard and red head ducks which represents
the majority, needs to repeatedly implement fly() and quack() method.

It's even worse than the first solution

## [after] Strategy pattern solution

