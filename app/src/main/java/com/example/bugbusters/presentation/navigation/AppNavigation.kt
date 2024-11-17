package com.example.bugbusters.presentation.navigation

enum class Screen{
    HOME,
    SCREEN_ONE_YES,
    SCREEN_ONE_ONE_YES,
    SCREEN_TWO_YES,
    SCREEN_THREE_YES,
    SCREEN_FOUR_YES,
    SCREEN_ONE_NO,
    SCREEN_TWO_NO,
    SCREEN_THREE_NO,
    SCREEN_FOUR_NO,
    SCREEN_FIVE_NO,
    SCREEN_FORM
}

sealed class NavigationItem(val route: String) {
    object Home: NavigationItem(Screen.HOME.name)
    object ScreenOneYes: NavigationItem(Screen.SCREEN_ONE_YES.name)
    object ScreenOneOneYes: NavigationItem(Screen.SCREEN_ONE_ONE_YES.name)
    object ScreenTwoYes: NavigationItem(Screen.SCREEN_TWO_YES.name)
    object ScreenThreeYes: NavigationItem(Screen.SCREEN_THREE_YES.name)
    object ScreenFourYes: NavigationItem(Screen.SCREEN_FOUR_YES.name)
    object ScreenOneNo: NavigationItem(Screen.SCREEN_ONE_NO.name)
    object ScreenTwoNo: NavigationItem(Screen.SCREEN_TWO_NO.name)
    object ScreenThreeNo: NavigationItem(Screen.SCREEN_THREE_NO.name)
    object ScreenFourNo: NavigationItem(Screen.SCREEN_FOUR_NO.name)
    object ScreenFiveNo: NavigationItem(Screen.SCREEN_FIVE_NO.name)
    object ScreenForm: NavigationItem(Screen.SCREEN_FORM.name)
}