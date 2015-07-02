package com.todos

class User {
    String fullName
    String userName
    String password
    String email
    String bio

    String toString() { fullName }

    static constraints = {
        fullName()
        userName()
        email()
        bio maxSize: 5000
    }
}
