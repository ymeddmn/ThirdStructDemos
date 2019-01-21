package interview.horse.example.com.arouterdemo

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.fragment_arouter_fragment2.*
import kotlinx.android.synthetic.main.fragment_arouter_fragment2.view.*


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ArouterFragment2.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ArouterFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
@Route(path = "/arou/frag2")
class ArouterFragment2 : Fragment() {



    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        ARouter.getInstance().inject(this)
        val content = inflater!!.inflate(R.layout.fragment_arouter_fragment2, container, false)
        content.tv_content.setOnClickListener {
            ARouter.getInstance().build("/arou/frag1").navigation()
        }
        return content
    }



}// Required empty public constructor
