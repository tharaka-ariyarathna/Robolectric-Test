package com.tharaka.robo

import android.util.Log
import android.widget.TextView
import junit.framework.Assert.assertNotNull
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner


@RunWith(RobolectricTestRunner::class)
class SecondActivityTest {
    private var activity: SecondActivity? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        activity = Robolectric.buildActivity(SecondActivity::class.java)
            .create()
            .resume()
            .get()
    }

    @Test
    fun validateTextView(){
        val text = activity?.findViewById<TextView>(R.id.textView)?.text.toString() ;
        assertThat(text, text=="Hola")
    }
}