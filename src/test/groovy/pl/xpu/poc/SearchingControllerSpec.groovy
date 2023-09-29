package pl.xpu.poc

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class SearchingControllerSpec extends Specification implements ControllerUnitTest<SearchingController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
