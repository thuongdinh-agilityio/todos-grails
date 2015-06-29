import com.todos.*

class BootStrap {

    def init = { servletContext ->
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
                     isDone: false)

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
                     isDone: false)
        
         if (!task02.save()) {
             task02.errors.allErrors.each{error ->
                 println "An error occured with task02: ${error}"
             }
         }
    }
    def destroy = {
    }
}
