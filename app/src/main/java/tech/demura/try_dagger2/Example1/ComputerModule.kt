package tech.demura.try_dagger2.Example1

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }

    @Provides
    fun provideKeyboard(): Keyboard {
        return Keyboard()
    }

    @Provides
    fun provideMouse(): Mouse {
        return Mouse()
    }

    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse

    ): Computer {
        return Computer(monitor, computerTower, keyboard, mouse)
    }
}