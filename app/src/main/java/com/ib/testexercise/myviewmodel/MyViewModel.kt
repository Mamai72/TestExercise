package com.ib.testexercise.myviewmodel

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ib.testexercise.api.ApiService
import com.ib.testexercise.data.Simpsons
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import okhttp3.internal.wait
import retrofit2.http.GET
import retrofit2.http.Url
import java.net.URL
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val apiService: ApiService
): ViewModel(){
    var currentData = MutableLiveData<Simpsons>()
    fun getApi(q: String, format: String) {
        CoroutineScope(Dispatchers.IO).launch {
            delay(1500)
            val result = apiService.getApi(q, format).execute()
            Handler(Looper.getMainLooper()).post { currentData.value = result.body() }
            val body = result?.body()
//            if (body != null)
//                repository.saveRequest(result.body())
        }
    }
}