package com.ib.testexercise.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.LifecycleOwner
import com.ib.testexercise.R
import com.ib.testexercise.databinding.FragmentListBinding
import com.ib.testexercise.myviewmodel.MyViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListFragment : Fragment() {
    private val myViewModel: MyViewModel by viewModels()
    lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(layoutInflater)
        myViewModel.getApi("simpsons+characters", "json")
        getApiResultToTextView()
        return binding.root
    }
    fun getApiResultToTextView(){
        myViewModel.currentData.observe(this as LifecycleOwner){
            binding.textApiName.text = it.AbstractText
        }
    }
}