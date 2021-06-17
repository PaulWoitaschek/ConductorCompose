package ph1b.conductorcompose

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun LongNumberList() {
    MaterialTheme {
        LazyColumn {
            items((0..100).toList()) {
                Text(text = it.toString())
            }
        }
    }
}