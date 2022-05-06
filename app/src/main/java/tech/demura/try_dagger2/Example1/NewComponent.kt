package tech.demura.try_dagger2.Example1

import dagger.Component

@Component(modules = [ComputerModule::class, ComputerTowerModule::class])
interface NewComponent {

    fun inject(activity: Activity)
}