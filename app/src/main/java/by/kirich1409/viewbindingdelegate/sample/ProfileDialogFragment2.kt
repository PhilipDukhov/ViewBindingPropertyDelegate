@file:Suppress("unused")

package by.kirich1409.viewbindingdelegate.sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import by.kirich1409.viewbindingdelegate.viewBinding
import by.kirich1409.viewbindingdelegate.dialogViewBinding
import by.kirich1409.viewbindingdelegate.sample.databinding.FragmentProfileBinding

class ProfileDialogFragment2 : DialogFragment() {

    private val viewBindingUsingReflection: FragmentProfileBinding by dialogViewBinding(R.id.container)

    // Creating via default way will work too for that case
    // private val viewBinding: ProfileBinding by viewBinding()

    private val viewBindingWithoutReflection by viewBinding(FragmentProfileBinding::bind)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }
}
