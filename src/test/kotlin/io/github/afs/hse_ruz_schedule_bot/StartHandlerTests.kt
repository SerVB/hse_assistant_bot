package io.github.afs.hse_ruz_schedule_bot

import me.ruslanys.telegraff.core.dto.request.MarkdownMessage
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class StartHandlerTests : HandlerTests("/start") {

    @Test
    fun processTest() {
        val response = handler.process(state, emptyMap())

        assertThat(response).isEqualTo(MarkdownMessage("Hi!"))
    }
}
