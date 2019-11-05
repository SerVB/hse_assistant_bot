
package handlers

import me.ruslanys.telegraff.core.dsl.handler
import me.ruslanys.telegraff.core.dto.request.MarkdownMessage

handler("/rofl") {

    process { _, _ ->
        MarkdownMessage("Лупа и Пупа пошли получать зарплату ,но в бухгалтерии все перепутали, Лупа получил за Пупу, а Пупа заЛупу")

    }
}