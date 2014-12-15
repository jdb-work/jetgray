package ecosystem.build

import spock.lang.Specification

class SomeSpec extends Specification {

    def "thing:SomeType exists"() {
        setup:
        def thing

        when:
        thing = new SomeThing()

        then:
        noExceptionThrown()

        expect:
        thing != null
    }
}