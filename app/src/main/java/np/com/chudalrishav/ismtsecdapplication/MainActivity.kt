package np.com.chudalrishav.ismtsecdapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import np.com.chudalrishav.ismtsecdapplication.login.LoginScreen
import np.com.chudalrishav.ismtsecdapplication.ui.theme.ISMTSecDApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("::: MainActivity OnCreate :::")
        Log.i("MainActivity", "onCreate: ")
        enableEdgeToEdge()
        setContent {
            ISMTSecDApplicationTheme {
//                LoginScreen()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        println("::: MainActivity OnStart :::")
        Log.i("MainActivity", "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        println("::: MainActivity OnResume :::")
    }

    override fun onPause() {
        super.onPause()
        println("::: MainActivity OnPause :::")
    }

    override fun onStop() {
        super.onStop()
        println("::: MainActivity OnStop :::")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("::: MainActivity OnDestroy :::")
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello $name!"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ISMTSecDApplicationTheme {
        Greeting("Android")
    }
}