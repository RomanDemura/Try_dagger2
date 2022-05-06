package tech.demura.try_dagger2.Example2.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import tech.demura.try_dagger2.Example2.data.datasource.ExampleLocalDataSource
import tech.demura.try_dagger2.Example2.data.datasource.ExampleLocalDataSourceImpl
import tech.demura.try_dagger2.Example2.data.datasource.ExampleRemoteDataSource
import tech.demura.try_dagger2.Example2.data.datasource.ExampleRemoteDataSourceImpl

@Module
abstract class DataModule {

    @Binds
    abstract fun bindExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    abstract fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource


}