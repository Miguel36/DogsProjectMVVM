package com.mmontilla.dogs.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.mmontilla.dogs.R
import kotlinx.android.synthetic.main.fragment_list.*


class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    /**
     * This method is called once the view has been created for make sure that elements
     * are created before we access them
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonDetails.setOnClickListener {
            val action = ListFragmentDirections.listFragmentToDetailFragment()
            action.dogUid = 10
            Navigation.findNavController(it).navigate(action)
        }
    }
}