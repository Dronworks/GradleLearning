package com.dronworks

def a = 10 // Any type integer
def b = 10L // Any type long
def c = 11.1 // Any type big decimal

println a
println a.class

s = 'hello'
print s

s = "hello 2 ${b}" // Groovy String, we can add any parameter defined like this ${param}
print s

s = '''
All the text can be filled here
with out the need of \\n
'''
print s

emailPattern=/[a-zA-Z0-9\._\-]+@[a-zA-Z0-9\.\-_]+\.[a-zA-Z]{2,6}/ // This is a String
print "test@gmail.com"==~ emailPattern // ~ makes it a regular expression