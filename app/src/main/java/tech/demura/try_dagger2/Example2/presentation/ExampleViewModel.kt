package tech.demura.try_dagger2.Example2.presentation

import tech.demura.try_dagger2.Example2.domain.ExampleUseCase

class ExampleViewModel(
    private val useCase: ExampleUseCase
) {

    fun method(){
        useCase()
    }
}