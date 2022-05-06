package tech.demura.try_dagger2.Example2.data.datasource

import tech.demura.try_dagger2.Example2.data.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(
    private val apiService: ExampleApiService
        ): ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}