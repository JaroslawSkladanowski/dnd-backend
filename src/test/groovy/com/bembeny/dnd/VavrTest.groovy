package com.bembeny.dnd

import io.vavr.control.Try
import spock.lang.Specification


class VavrTest extends Specification{

    def "vavr init test"() {
        when:
        def result = Try.success()
        then:
        result.isSuccess()
    }
}
