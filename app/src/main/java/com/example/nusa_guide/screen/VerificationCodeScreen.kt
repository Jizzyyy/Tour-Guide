package com.example.nusa_guide.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nusa_guide.R
import com.example.nusa_guide.navigation.NavigationTourScreen
import com.example.nusa_guide.ui.theme.brandPrimary500
import com.example.nusa_guide.ui.theme.gray
import com.example.nusa_guide.ui.theme.gray700
import com.example.nusa_guide.ui.theme.grayText
import com.example.nusa_guide.widget.ButtonStyle
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester

@Composable
fun VerificationCodeScreen(navController: NavController) {
    var code1 by remember { mutableStateOf(TextFieldValue()) }
    var code2 by remember { mutableStateOf(TextFieldValue()) }
    var code3 by remember { mutableStateOf(TextFieldValue()) }
    var code4 by remember { mutableStateOf(TextFieldValue()) }

    val focusRequester1 = remember { FocusRequester() }
    val focusRequester2 = remember { FocusRequester() }
    val focusRequester3 = remember { FocusRequester() }
    val focusRequester4 = remember { FocusRequester() }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(36.dp))

        Text(
            text = "Verifikasi Kode",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = gray700,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(40.dp))

        Image(
            painter = painterResource(id = R.drawable.verification_code_img),
            contentDescription = null,
            modifier = Modifier.size(280.dp)
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "Masukkan kode verifikasi yang sudah kami kirimkan ke email yang sudah kamu masukkan!",
            fontSize = 16.sp,
            color = grayText,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Kode Verifikasi",
            fontSize = 17.sp,
            color = Color(0XFF1F2A37),
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            OutlinedTextField(
                value = code1,
                shape = RoundedCornerShape(10.dp),
                onValueChange = {
                    if (it.text.length <= 1) {
                        code1 = it
                        if (it.text.isNotEmpty()) focusRequester2.requestFocus()
                    }
                },
                modifier = Modifier
                    .size(60.dp)
                    .padding(1.dp)
                    .focusRequester(focusRequester1),
                singleLine = true,
                textStyle = TextStyle(
                    fontSize = 18.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                ),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = brandPrimary500,
                    unfocusedBorderColor = gray
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                )
            )
            OutlinedTextField(
                value = code2,
                shape = RoundedCornerShape(10.dp),
                onValueChange = {
                    if (it.text.length <= 1) {
                        code2 = it
                        if (it.text.isNotEmpty()) focusRequester3.requestFocus()
                    }
                },
                modifier = Modifier
                    .size(60.dp)
                    .padding(1.dp)
                    .focusRequester(focusRequester2),
                singleLine = true,
                textStyle = TextStyle(
                    fontSize = 18.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                ),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = brandPrimary500,
                    unfocusedBorderColor = gray
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                )
            )
            OutlinedTextField(
                value = code3,
                shape = RoundedCornerShape(10.dp),
                onValueChange = {
                    if (it.text.length <= 1) {
                        code3 = it
                        if (it.text.isNotEmpty()) focusRequester4.requestFocus()
                    }
                },
                modifier = Modifier
                    .size(60.dp)
                    .padding(1.dp)
                    .focusRequester(focusRequester3),
                singleLine = true,
                textStyle = TextStyle(
                    fontSize = 18.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                ),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = brandPrimary500,
                    unfocusedBorderColor = gray
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                )
            )
            OutlinedTextField(
                value = code4,
                shape = RoundedCornerShape(10.dp),
                onValueChange = {
                    if (it.text.length <= 1) {
                        code4 = it
                    }
                },
                modifier = Modifier
                    .size(60.dp)
                    .padding(1.dp)
                    .focusRequester(focusRequester4),
                singleLine = true,
                textStyle = TextStyle(
                    fontSize = 18.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                ),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = brandPrimary500,
                    unfocusedBorderColor = gray
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                )
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        ButtonStyle(
            onClicked = {
                navController.navigate(NavigationTourScreen.ChangePasswordSuccessScreen.name)
            },
            text = "Konfirmasi"
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextButton(onClick = {
            navController.popBackStack()
        }) {
            Text(
                text = "Kembali",
                color = brandPrimary500,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun VerificationCodeScreenPreview() {
    VerificationCodeScreen(rememberNavController())
}
