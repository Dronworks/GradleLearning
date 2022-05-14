package com.dronworks

l= [1,2,3]
print(l)
print l.class

println()

LinkedList l= [1,2,3]
println(l)
println l.class

l << 4
println l

l+=[5,6,7]
println l

println l-[3,5]
println l

l.each {println it +'a'}

l.reverseEach {println 0-it}

(l-[1,2,3,4,5]).eachPermutation {println(it)}