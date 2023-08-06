package com.curso.android.app.tp.tpv3.view

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.curso.android.app.tp.tpv3.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testCompareStrings_DifferentStrings() {

        onView(withId(R.id.editText1))
            .perform(typeText("Hola"))
        onView(withId(R.id.editText2))
            .perform(typeText("Chau"))

        onView(withId(R.id.compareButton))
            .perform(click())

        onView(withId(R.id.resultTextView))
            .check(matches(withText("Las cadenas son distintas")))
    }
    @Test
    fun testCompareStrings_EqualStrings() {

        onView(withId(R.id.editText1))
            .perform(typeText("Hola"))
        onView(withId(R.id.editText2))
            .perform(typeText("Hola"))

        onView(withId(R.id.compareButton))
            .perform(click())

        onView(withId(R.id.resultTextView))
            .check(matches(withText("Las cadenas son iguales")))
    }

}