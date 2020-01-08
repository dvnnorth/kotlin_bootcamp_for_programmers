package Aquarium

import kotlin.math.pow

class TowerTank : Aquarium() {
  override val volume: Double
    get() = Math.PI * (width / 2.0).pow(2.0) * height

  override val water = volume * 0.8
}