package com.amqo.composenavigation.screens.home

const val DETAIL_ARGUMENT_ID = "id"
const val DETAIL_ARGUMENT_NAME = "name"
const val DETAIL_ARGUMENT_SURNAME = "surname"

sealed class HomeScreenContent(val route: String) {

    object Home: HomeScreenContent(route = "home_screen")

    object Detail: HomeScreenContent(route = "detail_screen/" +
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
}
