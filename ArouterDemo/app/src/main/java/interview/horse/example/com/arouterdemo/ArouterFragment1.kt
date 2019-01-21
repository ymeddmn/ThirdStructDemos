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
import kotlinx.android.synthetic.main.fragment_arouter_fragment1.view.*


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ArouterFragment1.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ArouterFragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
@Route(path = "/arou/frag1")
class ArouterFragment1 : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        ARouter.getInstance().inject(this)
        val content = inflater!!.inflate(R.layout.fragment_arouter_fragment1, container, false)
        content.tv_content.setOnClickListener {
            //这种方式可以再fragment1中获取到fragment2的实例，可以对fragment2进行操作 todo
            var fragment: ArouterFragment2 = ARouter.getInstance().build("/arou/frag2").navigation() as ArouterFragment2

            println(fragment.toString())
        }
        return content
    }

}// Required empty public constructor
