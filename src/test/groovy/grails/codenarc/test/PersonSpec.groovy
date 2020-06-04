package grails.codenarc.test

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PersonSpec extends Specification implements DomainUnitTest<Person> {

    void "test something"() {
        given:
            new Person(firstName: 'Vladimir', lastName: 'Orany').save()
        expect:
            Person.list()
    }

}
