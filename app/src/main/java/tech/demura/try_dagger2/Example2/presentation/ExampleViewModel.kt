package tech.demura.try_dagger2.Example2.presentation

import tech.demura.try_dagger2.Example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) {

    fun method(){
        useCase()
    }
}