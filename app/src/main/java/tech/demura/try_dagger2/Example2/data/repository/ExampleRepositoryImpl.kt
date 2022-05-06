package tech.demura.try_dagger2.Example2.data.repository

import tech.demura.try_dagger2.Example2.data.datasource.ExampleLocalDataSource
import tech.demura.try_dagger2.Example2.data.datasource.ExampleRemoteDataSource
import tech.demura.try_dagger2.Example2.data.mapper.ExampleMapper
import tech.demura.try_dagger2.Example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}