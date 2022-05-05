package tech.demura.try_dagger2

import javax.inject.Inject

class Computer @Inject constructor(
    monitor: Monitor,
    copmuterTower: ComputerTower,
    keyboard: Keyboard,
    mouse: Mouse
) {
}