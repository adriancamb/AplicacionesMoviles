package com.curso.android.app.tp.tpv3

import com.curso.android.app.tp.tpv3.view.MainViewModel
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Before
import org.junit.Test

class MainViewModelUnitTest {

    private lateinit var viewModel: MainViewModel

    @Before
    fun setUp() {
        viewModel = MainViewModel()
    }

    @Test
    fun mainViewModelCompareString() {
        val result1 = viewModel.compareStrings("hola", "hola")
        val result2 = viewModel.compareStrings("hola", "chau")
        assertTrue(result1)
        assertFalse(result2)
    }
}
