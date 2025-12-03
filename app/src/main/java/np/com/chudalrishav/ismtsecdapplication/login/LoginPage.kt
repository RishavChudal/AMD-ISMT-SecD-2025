package np.com.chudalrishav.ismtsecdapplication.login

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import np.com.chudalrishav.ismtsecdapplication.login.LoginScreen
import np.com.chudalrishav.ismtsecdapplication.ui.theme.ISMTSecDApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    onForgotPasswordClicked: () -> Unit,
    onSignUpClicked: () -> Unit,
    onTermsAndConditionClicked: () -> Unit,
    onValidationSuccess: (String, String) -> Unit
) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome Back!", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(32.dp))

        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Email") },
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = "Email Icon") },
            modifier = Modifier.padding(16.dp).fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "Password Icon") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                println("Attempting login with username: $username and password: $password")
                //TODO Validation
                onValidationSuccess(username, password)
            },
            modifier = Modifier.padding(16.dp).fillMaxWidth()
        ) {
            Text("Login")
        }

        Spacer(modifier = Modifier.height(16.dp))

        TextButton(
            onClick = {
                onForgotPasswordClicked()
            }
        ) {
            Text("Forgot Password?")
        }

        TextButton(
            onClick = {
                onSignUpClicked()
            },
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text("Sign Up")
        }

        TextButton(
            onClick = {
                onTermsAndConditionClicked()
            },
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text("Terms and Conditions")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    ISMTSecDApplicationTheme {
        LoginScreen(
            onForgotPasswordClicked = {},
            onSignUpClicked = {},
            onTermsAndConditionClicked = {},
            onValidationSuccess = { email, password ->

            }
        )
    }
}