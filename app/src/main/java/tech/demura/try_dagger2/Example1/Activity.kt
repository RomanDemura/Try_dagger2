package tech.demura.try_dagger2.Example1


import javax.inject.Inject

class Activity {

    private val component = DaggerNewComponent.create()

    @Inject
    lateinit var computer: Computer

    init {
        component.inject(this)
    }
}