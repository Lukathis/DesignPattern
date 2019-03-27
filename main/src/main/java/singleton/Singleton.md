# Singleton

## classic way

Classic way could make sure that only one object for one class. But not safe when using multi-thread.

## Double-check way

There're two key points for the double-check implementation:
* volatile: make the uniqueInstance volatile which can make sure the class can instantiate correctly under multi-thread
* If uniqueInstance is null and enter the instantiate block, should check the instance again and use synchronized keyword
to make sure only one thread can get the resource(Singleton.class)

## Questions:

Is the volatile keyword mandatory here? What would happen if we do not use volatile?