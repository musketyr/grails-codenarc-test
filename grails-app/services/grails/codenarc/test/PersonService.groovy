package grails.codenarc.test

import grails.gorm.transactions.Transactional

@Transactional
class PersonService {

    Person create(String firstName, String lastName) {
        return new Person(firstName: firstName, lastName: lastName).save()
    }

}
