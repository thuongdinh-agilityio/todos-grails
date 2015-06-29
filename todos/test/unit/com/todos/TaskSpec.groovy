package com.todos

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Task)
class TaskSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test toString"() {
        when: "a task has a title"
            def task = new Task(title: 'This is a test title',
                                        description: 'this is a test des')

        then: "the toString method will combine them."
            task.toString() == 'This is a test title'
    }
}
