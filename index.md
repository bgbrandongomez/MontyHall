---
---
### What It Is

This is to demonstrate that the probability of getting a car as opposed to a goat if playing the MontyHall puzzle is really 2/3 and not 1/2.

This is a mini project to prove that the probability of getting the car is 2/3 when you switch doors when Monty Hall offers you a chance to switch as opposed to the 1/3 chance when you keep your original guess.

Run the commandline program with: java MontyHall

### Scenario

So you are in Monty Hall's tv show and you have made it to the point of the show where you have 3 doors. You must choose one door out of the three doors. Two of them have goats and one has a car. After making your first choice, Monty Hall shows you a door that has a goat in it, but it is not the door you chose. Now you only have the door you chose and one other door. You must choose whether to stick with your first choice or switch to the other door. What do you do?

You know switching gives you a 2/3 chance of getting the car and a 1/3 chance of getting a goat, while the opposite is true if you keep you current choice, but you don't know why.

### Explanation

1. You have three doors. You have Xray vision and see doors one and two have goats and door three has the car.
2. You decide the play the game because no one is supposed to know you have Xray. You purposely choose a goat door on the first try.
3. Monty decides to reveal the second door which is the other goat door. Originally you had a 2/3 chance of getting a goat door on the first try if you played legitimately. Now the other goat door is removed leaving two choices.
4. Since you had a 2/3 chance of getting it wrong the first try, you were more likely to start off with a goat door, 2/3 to be precise. This original measurement is really a measurement of how likely you are to get it wrong.
5. Removing the other goat door allows the chances to function like a not gate (for you electricians). If you switch doors, you flip the 2/3 wrong to a 2/3 right and the 1/3 right to a 1/3 wrong. The chances flip.
6. Out of those two choices, getting the car has turned to the player's favor. The odds are with the player.
7. It is not 1/2 like most people think, the two events are correlated and the first event influences the second event. If it was only the second event, yes it would be 1/2, and if only the first event, yes 2/3 wrong and 1/3 correct. However, due to the not gate like functionality, the player has a 2/3 chance of getting the car and a 1/3 chance of getting a goat if the player changes doors in the second part of the scenario.

### Why I Made It

The Monty Hall Door simulation was designed to prove that the probability of getting a car when switching was 2/3 of the time instead of 1/2 of the time. I know the code is terrible, but granted this was a quick, five minute project after not programming in Java for a year and a half, or really too much programming at all. Now as for the game, it was a Wednesday night, and I just figured out how the probability was 2/3 and I tried to explain to some people. They did not believe me and I already had the idea that I may make a simulator to test the math out, so after I got .home, I spent around 5 minutes writing the code to this simulator and ran it all night and continued to run it for the next day while I was at school. Sure enough, 8,338,764 iterations later, the program proclaimed that it was successful in getting the car 2/3 of the time after switching doors. The output of that test is below.

### Test Output

{% highlight text %}
This program will automatically prove the 2/3 chance Monty Hall Theory
Not Switched: 2795248 Switched: 5593516 Total: 8388764 --- Not Switched %: 33.321335 Switched %: 66.678665
{% endhighlight %}
