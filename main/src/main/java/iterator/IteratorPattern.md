# Iterator Pattern

# [before] Naive implementation

Different restaurants have their own implementation for menus.
When waitress(client) want to traverse different menus,
he/she needs to know how the menus are implemented 
and treat different menu with different methods.

This causes the couple between client and implementation.

# [middle] Encapsulate the iterator

Although the "iterate" seems to be a behaviour rather than an object.
It is possible to encapsulate this behavior, this is what we called iterator.

__Key Points:__

* hasNext()
* next()

# [after] Implement with Java iterator

Clean the code with Java internal java.util.Iterator,
which is slightly different with ours: one more method.

__Key Points:__

* hasNext()
* next()
* remove() : default implementation throw an Unsupported Exception

__About Iterable:__

If you implements Iterable\<T> in a class, 
must provide an iterator() method which returns: Iterator\<T>

