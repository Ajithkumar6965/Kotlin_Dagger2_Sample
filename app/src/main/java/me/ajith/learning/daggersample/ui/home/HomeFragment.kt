package me.ajith.learning.daggersample.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import me.ajith.learning.daggersample.MyApplication
import me.ajith.learning.daggersample.R
import me.ajith.learning.daggersample.di.components.DaggerFragmentComponent
import me.ajith.learning.daggersample.di.components.FragmentComponent
import me.ajith.learning.daggersample.di.modules.FragmentModule
import javax.inject.Inject

class HomeFragment : Fragment() {

    private lateinit var fragmentComponent: FragmentComponent

    @Inject
    lateinit var homeViewModel: HomeViewModel

    private lateinit var tvMessage:TextView

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getServices()
        setServiceDetails(view)
    }

    private fun getServices(){
        fragmentComponent = DaggerFragmentComponent.builder().applicationComponent((requireActivity().applicationContext as MyApplication).applicationComponent)
            .fragmentModule(FragmentModule(this)).build()
        fragmentComponent.inject(this)
    }

    private fun setServiceDetails(view: View){
        tvMessage = view.findViewById(R.id.tv_message)
        tvMessage.text = homeViewModel.getServiceDetails()
    }

}