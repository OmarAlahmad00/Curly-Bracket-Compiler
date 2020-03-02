# Curly-Bracket-Compiler
To check if the use of curly brackets in Java code is correct

I was given this algorithm to do in order to perpare for my coding compeition on March 7th.
I first wrote the code to check the amount of opening and closing curly brackets and then outputting if any are missing (easy enough).

I then made it more complex. I dont really know how to explain this in words so I will show it:

{ This is an opening missing a closing (easy)
} This is a closing missing an opening (easy)
{} This is not missing anything (easy)
}{ This is a closing missing an opening and an opening missing a closing (hard, for me at least)

What made improving this algorithm hard was that instead of comparing the amount of opening and closing curly brackets, it checks when and
how it is opened. If it were to compare only the amount, }}{{, this would not return an error. And even a script-kiddie would know it should.
That was the hardest part about the algorithm. It was just something extra I did in order to give myself more of a challeneg. It was pretty fun!
