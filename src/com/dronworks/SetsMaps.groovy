package com.dronworks

s=['java','js','python', 'js'] as Set
println s
println s.class

m=[courseName:'Groovy', rating:5, price:20F]
m.each {
    k,v ->
        println k +":"+v
}

println m.courseName
println m['rating']
println m.get('price')

m.review="course is awesome"
println m.review
m['more']='more'
println m


