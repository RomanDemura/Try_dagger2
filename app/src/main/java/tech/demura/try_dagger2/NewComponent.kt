package tech.demura.try_dagger2

import dagger.Component

@Component
interface NewComponent {

    fun getKeyboard(): Keyboard
    fun getMonitor(): Monitor

    fun inject(activity: Activity)
}