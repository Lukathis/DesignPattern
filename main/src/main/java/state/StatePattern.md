# State Pattern

## [before] Behaviour Oriented 
The state and their behaviour are deeply coupled.
The implementation is "behaviour oriented":
one behaviour will map to different result according to the state.

## [after] State Oriented 
The implementation is "state oriented".
Every state manage its own behaviour. The behaviour is relatively stable.
So when there's more state, there'll be limited impact on other states.
However, if the behaviours changed or there're more behaviours, 
still need to change quite a lot of code.