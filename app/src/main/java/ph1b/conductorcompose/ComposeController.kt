package ph1b.conductorcompose

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import com.bluelinelabs.conductor.Controller

class ComposeController : Controller() {

    init {
        OwnViewTreeLifecycleAndRegistry.own(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup,
        savedViewState: Bundle?
    ): View {
        return ComposeView(container.context).apply {
            setContent {
                LongNumberList()
            }
        }
    }
}