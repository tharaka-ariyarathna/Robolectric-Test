package com.tharaka.robo

import android.widget.TextView
import androidx.fragment.app.testing.launchFragmentInContainer
import junit.framework.Assert.assertNotNull
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class FirstFragmentTest {
    @Test
    fun validateFirstFragmentText(){
        //val fragmentScenario = launchFragmentInContainer<FirstFragment>()
        val scenario = launchFragmentInContainer<FirstFragment>()
        scenario.onFragment { fragment ->
            val textField = fragment.view?.findViewById<TextView>(R.id.textview_first)?.text.toString() ;
            assertThat(textField, textField=="Hello!")
        }

    }

}













