package grails.codenarc.test

import grails.testing.gorm.DomainUnitTest
import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class PersonServiceSpec extends Specification implements ServiceUnitTest<PersonService>, DomainUnitTest<Person> {

    void "test something"() {
        expect:
            service.create('Vladimir', 'Orany')
    }

}
