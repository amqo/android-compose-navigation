package com.amqo.composenavigation.navigation

const val DETAIL_ARGUMENT_ID = "id"
const val DETAIL_ARGUMENT_NAME = "name"
const val DETAIL_ARGUMENT_SURNAME = "surname"

const val AUTHENTICATION_ROUTE = "authentication"
const val HOME_ROUTE = "home"
const val ROOT_ROUTE = "root"

sealed class Screen(val route: String) {

    object Home: Screen(route = "home_screen")

    object Detail: Screen(route = "detail_screen/" +
            "{$DETAIL_ARGUMENT_ID}?" +
            "$DETAIL_ARGUMENT_NAME={$DETAIL_ARGUMENT_NAME}&" +
            "$DETAIL_ARGUMENT_SURNAME={$DETAIL_ARGUMENT_SURNAME}") {

        fun passArgs(
            id: Int,
            name: String? = null,
            surname: String? = null
        ): String {
            val nameFixed = name ?: ""
            val surnameFixed = surname ?: ""
            return "${passId(id)}?" +
                    "$DETAIL_ARGUMENT_NAME=$nameFixed&" +
                    "$DETAIL_ARGUMENT_SURNAME=$surnameFixed"
        }

        private fun passId(id: Int): String {
            return "detail_screen/${id}"
        }
    }

    object Login: Screen(route = "login_screen")
    object SignUp: Screen(route = "signup_screen")
}
