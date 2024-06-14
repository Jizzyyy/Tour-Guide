package com.example.nusa_guide.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nusa_guide.model.LoginModel
import com.example.nusa_guide.model.RegisterModel
import com.example.nusa_guide.repository.AuthRepository
import kotlinx.coroutines.launch

class AuthViewModel : ViewModel() {


    private val authRepository = AuthRepository()


    fun login(email: String, password: String) {
        viewModelScope.launch {
            val loginModel = LoginModel(email, password);

            val response =authRepository.login(loginModel);

        }
    }


    fun register(email: String, username: String, password: String ) {
        viewModelScope.launch {
            val registerModel = RegisterModel(email, username, password)

            val response = authRepository.register(registerModel)
        }
    }

}