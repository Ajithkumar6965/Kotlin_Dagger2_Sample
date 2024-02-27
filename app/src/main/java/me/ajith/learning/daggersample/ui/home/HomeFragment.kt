package me.ajith.learning.daggersample.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import me.ajith.learning.daggersample.R

class HomeFragment : Fragment() {

    companion object{

        const val TAG = "HOME_FRAGMENT"
        fun newInstance():HomeFragment{
            val args = Bundle()
            val homeFragment = HomeFragment()
            homeFragment.arguments = args
            return homeFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)
    }

}