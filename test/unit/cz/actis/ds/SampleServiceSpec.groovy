package cz.actis.ds

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(SampleService)
class SampleServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "call service method success"() {
        setup:
        boolean connectionValid

        when:
        connectionValid = service.serviceMethod()

        then:
        connectionValid
    }
}
