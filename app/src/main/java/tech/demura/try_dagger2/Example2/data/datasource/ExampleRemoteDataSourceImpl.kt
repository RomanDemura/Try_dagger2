package tech.demura.try_dagger2.Example2.data.datasource

import tech.demura.try_dagger2.Example2.data.network.ExampleApiService

class ExampleRemoteDataSourceImpl (
    private val apiService: ExampleApiService
        ): ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}