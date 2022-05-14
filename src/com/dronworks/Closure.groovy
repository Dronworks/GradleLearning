package com.dronworks

c={
    println 'closure'
}

c.call()

d={
    n->
      println n%2==0?"even":"odd"
}

d.call (10)

e={
    n=2->
        println n%2==0?"even":"odd"
}
e.call()
e.call (11)

4.times {x->print(x+1)}
3.times {print it}