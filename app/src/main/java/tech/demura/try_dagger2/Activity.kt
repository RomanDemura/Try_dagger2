package tech.demura.try_dagger2

import javax.inject.Inject

class Activity {

    lateinit var computer: Computer

    var component = DaggerNewComponent.create()

    @Inject
    lateinit var keyboard: Keyboard

    @Inject
    lateinit var monitor: Monitor

    @Inject
    lateinit var mouse: Mouse

    init {
        component.inject(this)
    }
}