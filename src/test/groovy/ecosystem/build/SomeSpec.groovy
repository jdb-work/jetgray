package ecosystem.build

import spock.lang.Specification

class SomeSpec extends Specification {

    def "something exists"() {
        setup:
        def thing

        when:
        thing = new Something()

        then:
        noExceptionThrown()

        expect:
        thing != null
    }
}