package example

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import com.jakewharton.mosaic.runMosaicBlocking
import com.jakewharton.mosaic.ui.Text
import kotlinx.coroutines.delay

fun main() = runMosaicBlocking {
	val countValue = mutableIntStateOf(0)

	setContent {
		val count by remember { countValue }
		Text("The count is: $count")
	}

	for (i in 1..20) {
		delay(250)
		countValue.value = i
	}
}
