package com.amqo.composenavigation

const val DETAIL_ARGUMENT_ID = "id"
const val DETAIL_ARGUMENT_NAME = "name"

sealed class Screen(val route: String) {

    object Home: Screen(route = "home_screen")

    object Detail: Screen(route = "detail_screen/{$DETAIL_ARGUMENT_ID}/{$DETAIL_ARGUMENT_NAME}") {

        fun passId(id: Int): String {
            return this.route.replace("{$DETAIL_ARGUMENT_ID}", id.toString())
        }

        fun passIdAndName(
            id: Int,
            name: String
        ): String {
            return passId(id).replace("{$DETAIL_ARGUMENT_NAME}", name)
        }
    }
}
