package com.example.creditsdemo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen

object DemoScreens {
    object Main : FragmentScreen {
        override fun createFragment(factory: FragmentFactory): Fragment = DemoFragment.newInstance()
    }
}