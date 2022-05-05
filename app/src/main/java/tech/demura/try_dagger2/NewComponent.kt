package tech.demura.try_dagger2

import dagger.Component

@Component(modules = [ComputerModule::class, ComputerTowerModule::class])
interface NewComponent {

    fun inject(activity: Activity)
}