package com.example.talktopus.ui.chat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.talktopus.R
import com.example.talktopus.databinding.FragmentChatBinding
import com.example.talktopus.databinding.FragmentSplashBinding


class ChatFragment : Fragment() {

    private var _binding: FragmentChatBinding? = null
    private val mBinding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding = FragmentChatBinding.inflate(layoutInflater,container,false)
        return mBinding.root
    }

}