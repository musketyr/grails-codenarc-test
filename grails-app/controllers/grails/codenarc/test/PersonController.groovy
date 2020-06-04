package grails.codenarc.test

import grails.converters.JSON

class PersonController {

    def index() {
        render Person.list() as JSON
    }

}
