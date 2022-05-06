package tech.demura.try_dagger2.Example2.domain

import javax.inject.Inject

class ExampleUseCase @Inject constructor (private val repository: ExampleRepository) {

    operator fun invoke() {
        repository.method()
    }
}