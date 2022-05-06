package tech.demura.try_dagger2.Example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tech.demura.try_dagger2.Example1.Activity
import tech.demura.try_dagger2.Example2.di.DaggerComponent
import tech.demura.try_dagger2.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private var component = DaggerComponent.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}