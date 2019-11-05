package io.github.afs.hse_ruz_schedule_bot

import me.ruslanys.telegraff.core.dto.request.MarkdownMessage
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class RoflHandlerTests : HandlerTests("/rofl") {

    @Test
    fun processTest() {
        val response = handler.process(state, emptyMap())

        assertThat(response).isEqualTo(MarkdownMessage("Лупа и Пупа пошли получать зарплату ,но в бухгалтерии все перепутали, Лупа получил за Пупу, а Пупа заЛупу"))
    }
}
