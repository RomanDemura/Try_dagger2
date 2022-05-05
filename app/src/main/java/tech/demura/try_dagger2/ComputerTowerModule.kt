package tech.demura.try_dagger2

import dagger.Module
import dagger.Provides

@Module
class ComputerTowerModule {
    @Provides
    fun provideStorage(): Storage{
        return Storage()
    }
    @Provides
    fun provideMemory(): Memory{
        return Memory()
    }
    @Provides
    fun provideProcessor(): Processor{
        return Processor()
    }
    @Provides
    fun provideComputerTower(
        storage: Storage,
        memory: Memory,
        processor: Processor
    ): ComputerTower{
        return ComputerTower(storage, memory, processor)
    }
}