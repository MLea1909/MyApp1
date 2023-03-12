package com.example.myapp1.activities

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapp1.R
import com.example.myapp1.databinding.ActivityCouplesBinding
import com.example.myapp1.databinding.FragmentRegistrationFragmentBinding
import com.example.myapp1.repository.CoupleRepository

class RegistrationFragment : Fragment() {

    private lateinit var binding: FragmentRegistrationFragmentBinding

    companion object {
        fun newInstance() = RegistrationFragment()
    }

    private lateinit var viewModel: RegistrationFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistrationFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RegistrationFragmentViewModel::class.java)
        // TODO: Use the ViewModel

        binding.addBtn.setOnClickListener {

            val couple = RegistrationFragmentViewModel();
            couple.femaleDancer = binding.maleDancer.text.toString()
            couple.maleDancer = binding.femaleDancer.text.toString()
            couple.coreographyName = binding.couplesCategoryName.text.toString()
            couple.couplesCategoryName = binding.coreographyName.text.toString()

            CoupleRepository.addCouple(couple)
        }
    }

}