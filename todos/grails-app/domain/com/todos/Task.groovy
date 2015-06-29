package com.todos

class Task {
    String title
    String description
    Date startDate
    Date endDate
    Boolean isDone

    static constraints = {
    }

    String toString() {
        "$title"
    }
}
