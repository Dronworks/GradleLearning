package com.dronworks

int sum(int x, int y) {
    return x+y
}

println sum(5,2)

// Same as:
def sum2(x=3,y=1){
    x+y
}
def res = sum 5,2
println res
println sum2()

void display(Map productDetails) {
    println productDetails.name
    println productDetails.price
}
display([name:'Iphone', price:1000])
display(price:123, name:'Android')

void gav(Map dependency) {
    println dependency.group +":" + dependency.artifact + ":" + dependency.version
}
gav group:"com.dronworks",artifact:'groovy',version:1.0