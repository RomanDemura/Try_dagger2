package tech.demura.try_dagger2.Example2.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import tech.demura.try_dagger2.Example2.data.repository.ExampleRepositoryImpl
import tech.demura.try_dagger2.Example2.domain.ExampleRepository

@Module
abstract class DomainModule {

    @Binds
    abstract fun provideExampleRepository(impl: ExampleRepositoryImpl): ExampleRepository
}