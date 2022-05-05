package tech.demura.try_dagger2

import javax.inject.Inject

class ComputerTower @Inject constructor(
    storage: Storage,
    memory: Memory,
    processor: Processor
) {
}