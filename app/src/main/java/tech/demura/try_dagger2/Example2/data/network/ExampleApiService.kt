package tech.demura.try_dagger2.Example2.data.network

import android.util.Log
import javax.inject.Inject

class ExampleApiService @Inject constructor() {

    fun method(){
        Log.d(LOG_TAG, "Example api service")
    }

    companion object{

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}