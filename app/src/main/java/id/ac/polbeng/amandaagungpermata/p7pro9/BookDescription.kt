package id.ac.polbeng.amandaagungpermata.p7pro8

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.book_description.*

class BookDescription : Fragment() {

    lateinit var arrayBookDescription: Array<String>
    var bookIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        arrayBookDescription = resources.getStringArray(R.array.bookdescriptions)
        bookIndex = if (savedInstanceState?.getInt("bookindex") == null ) 0
        else {
            savedInstanceState.getInt("bookindex")
        }
        return inflater.inflate(R.layout.book_description, container, false)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("bookindex", bookIndex)
    }


    fun changeDescription(index: Int) : Unit {
        bookIndex = index
        println("BOOK INDEX = $bookIndex")
        tvDescription?.text = arrayBookDescription[bookIndex]
        println(arrayBookDescription[bookIndex])
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        changeDescription(bookIndex)
    }
}