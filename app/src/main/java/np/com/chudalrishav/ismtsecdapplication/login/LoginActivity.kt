package np.com.chudalrishav.ismtsecdapplication.login

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import np.com.chudalrishav.ismtsecdapplication.login.ui.theme.ISMTSecDApplicationTheme
import np.com.chudalrishav.ismtsecdapplication.signup.SignUpActivity

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ISMTSecDApplicationTheme {
                LoginScreen(
                    onForgotPasswordClicked = {
                        //TODO Open Forgot Password Page
                    },
                    onSignUpClicked = {
                        openSignUpActivity()
                    },
                    onTermsAndConditionClicked = {
                        //TODO Open Terms and Condition Page
                    },
                    onValidationSuccess = { email, password ->
                        //TODO DO Authentication by calling Firebase or backend server
                    }
                )
            }
        }
    }

    fun openSignUpActivity() {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
        finish()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ISMTSecDApplicationTheme {
        Greeting("Android")
    }
}