package com.example.navigationcomponent


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_camera.*
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class CameraFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_camera, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_photos.setOnClickListener {
            val random = Random()


            // Passing safe argument to action
            // Use ....FragmentDirection only if you are using safe args to pass
            val nextAction = CameraFragmentDirections.nextAction()
            nextAction.numOfPhotos = random.nextInt(100)
            Navigation.findNavController(it).navigate(nextAction)

            /*
            * If you don't want to pass action, you can navigate using id also.
            * */
            //Navigation.findNavController(it).navigate(R.id.destination_setting)


        }
    }


}
