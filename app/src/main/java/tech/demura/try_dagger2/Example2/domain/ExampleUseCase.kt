package tech.demura.try_dagger2.Example2.domain

import tech.demura.try_dagger2.Example2.data.repository.ExampleRepositoryImpl

class ExampleUseCase(private val repository: ExampleRepository) {

    operator fun invoke() {
        repository.method()
    }
}