package com.coolcats.unittesting

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest{

    private val testText = "Hello my name is testing."

    @JvmField
    @Rule
    val rule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun checkInputCorrect(){
        Espresso.onView(withId(R.id.input_edittext)).perform(typeText(testText))
        Espresso.onView(withId(R.id.input_edittext))
            .check(matches(withText(testText)))
    }


    @Test
    fun performButtonClickAfterInput(){
        Espresso.onView(withId(R.id.input_edittext)).perform(typeText(testText))
        Espresso.closeSoftKeyboard()
        Thread.sleep(3000)
        Espresso.onView(withId(R.id.capitalize_button)).perform(click())
    }

    @Test
    fun openSecondActivity(){
        Espresso.onView(withId(R.id.input_edittext)).perform(typeText(testText))
        Espresso.closeSoftKeyboard()
        Espresso.onView(withId(R.id.capitalize_button)).perform(click())

        Espresso.onView(withId(R.id.cap_textview)).check(matches(isDisplayed()))
    }


    @Test
    fun openSecondActivityDisplayTextCapitalized(){
        Espresso.onView(withId(R.id.input_edittext)).perform(typeText(testText))
        Espresso.closeSoftKeyboard()
        Espresso.onView(withId(R.id.capitalize_button)).perform(click())

        Espresso.onView(withId(R.id.cap_textview)).check(matches(isDisplayed()))
        Espresso.onView(withId(R.id.cap_textview)).check(matches(withText(testText.uppercase())))
    }

    @Test
    fun handleEmptyText(){
        Espresso.onView(withId(R.id.capitalize_button)).perform(click())

        Espresso.onView(withText(rule.activity.getString(R.string.empty_text))).check(matches(
            isDisplayed()))
    }

}