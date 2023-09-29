package pl.xpu

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class SavedSearchSpec extends Specification implements DomainUnitTest<SavedSearch> {

     void "test domain constraints"() {
        when:
        SavedSearch domain = new SavedSearch()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
