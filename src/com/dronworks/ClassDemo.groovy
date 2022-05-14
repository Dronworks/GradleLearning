package com.dronworks

class Patient {
    def firstName, lastName, age
    static tes = 'test'

    // Optional
    void setLastName(lastNam) {
        if (lastNam == null) {
            throw new IllegalArgumentException("last name cannot be null")
        }
        this.lastName = lastNam
    }

    // Optional
    void display() {
        println lastName + " - " + firstName
    }

    static void printtest() {
        print tes
    }
}

p=new Patient()
println p.firstName + " " + p.lastName + " " + p.age

p=new Patient(firstName:'John', lastName:'Bailey', age:40)
println p.firstName + " " + p.lastName + " " + p.age

p.display()
Patient.printtest()

p.setLastName(null)


