package ph1b.conductorcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bluelinelabs.conductor.Conductor
import com.bluelinelabs.conductor.asTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val useConductor = true

        if (useConductor) {
            val router = Conductor.attachRouter(
                activity = this,
                container = findViewById(android.R.id.content),
                savedInstanceState = savedInstanceState
            )
            if (!router.hasRootController()) {
                router.setRoot(ComposeController().asTransaction())
            }
        } else {
            if (savedInstanceState == null) {
                supportFragmentManager.beginTransaction()
                    .replace(android.R.id.content, ComposeFragment())
                    .commit()
            }
        }
    }
}