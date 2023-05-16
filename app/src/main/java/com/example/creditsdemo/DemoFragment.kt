package com.example.creditsdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.credits.core.domain.OfferType
import com.example.credits.core.navigation.CreditsRouter
import com.example.creditsdemo.databinding.FragmentDemoBinding
import org.koin.android.ext.android.inject

class DemoFragment : Fragment() {

    companion object {
        fun newInstance(): DemoFragment = DemoFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val binding = FragmentDemoBinding.inflate(inflater, container, false)

        val creditsRouter: CreditsRouter by inject()

        binding.car.setOnClickListener {
            creditsRouter.navigateToOffer(OfferType.CREDIT_AUTO)
        }
        binding.mortgage.setOnClickListener {
            creditsRouter.navigateToOffer(OfferType.CREDIT_MORTGAGE)
        }
        binding.other.setOnClickListener {
            creditsRouter.navigateToOffer(OfferType.CREDIT_OTHER)
        }

        return binding.root
    }
}
