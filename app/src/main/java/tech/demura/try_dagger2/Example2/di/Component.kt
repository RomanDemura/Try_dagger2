package tech.demura.try_dagger2.Example2.di

import dagger.Component
import tech.demura.try_dagger2.Example2.presentation.MainActivity

@Component(modules = [DataModule::class, DomainModule::class])
interface Component {

    fun inject(activity: MainActivity)
}