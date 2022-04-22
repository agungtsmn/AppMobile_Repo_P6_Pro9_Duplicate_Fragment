package id.ac.polbeng.amandaagungpermata.p7pro8

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.book_titles.*

class BookTitle : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.book_titles, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        rbSatu.setOnClickListener(this)
        rbDua.setOnClickListener(this)
        rbTiga.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var index : Int = 0
        when (v?.id) {
            R.id.rbSatu -> {
                index = 0
            }
            R.id.rbDua -> {
                index = 1
            }
            R.id.rbTiga -> {
                index = 2
            }
        }
        val activity = activity
        if (activity is Coordinator) {
            activity.onBookChange(index)
        }
    }
}