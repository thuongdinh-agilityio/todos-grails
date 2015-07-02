import com.todos.*

class BootStrap {

    def init = { servletContext ->
        // Generate User data
        new User(fullName: 'John Doe',
                 userName: 'jdoe',
                 password: 'test@123',
                 email: 'jdoe@domain.com',
                 bio: 'Something good about John').save()
        new User(fullName: 'John Deere',
                 userName: 'tractorman',
                 password: 'test@123',
                 email: 'tractorman@domain.com',
                 bio: 'Something good about John Deere').save()

        // Generate Task
        def task01 = new Task(title: 'This is the first title',
                     startDate: new Date('11/21/2013'),
                     endDate: new Date('11/21/2013'),
                     description: '''This conference will bring coders from
                                     across platforms, languages, and industries
                                      together for an exciting day of tips,
                                     tricks, and tech! Stay sharp! Stay at the
                                     top of your game! But, don't stay home!
                                     Come an join us this fall for the first
                                     annual Gateway Code Camp.''',
                     isDone: false,
                     user: User.findByFullName('John Doe'))

        if (!task01.save()) {
            task01.errors.allErrors.each{error ->
                println "An error occured with task01: ${error}"
            }
        }

        def task02 = new Task(title: 'This is the second title',
                     startDate: new Date('11/21/2013'),
                     endDate: new Date('11/21/2013'),
                     description: '''Join the Perl programmers of the Pork Producers
                                     of America as we hone our skills and ham it up
                                     a bit.  You can show off your programming chops
                                     while trying to win a year's supply of pork
                                     chops in our programming challenge.
                                     Come and join us in historic (and
                                     aromatic), Austin, Minnesota.
                                     You'll know when you're there!''',
                     isDone: false,
                     user: User.findByFullName('John Deere'))

        if (!task02.save()) {
            task02.errors.allErrors.each{error ->
                println "An error occured with task02: ${error}"
            }
        }

        // Generate list of contributes for each task
        def g1 = Task.findByTitle('This is the first title')
        g1.addToContributes(new User(fullName: 'Sarah Martin',
                                     userName: 'sarah',
                                     password: 'test@123',
                                     email: 'sarah@domain.com',
                                     bio: 'Something good about Sarah Martin'))

        g1.addToContributes(new User(fullName: 'Bill Smith',
                                     userName: 'Mr_Bill',
                                     password: 'test@123',
                                     email: 'mrbill@domain.com',
                                     bio: 'Something good about Bill Smith'))

        g1.save()
    }
    def destroy = {
    }
}
