fun main(args: Array<String>) {

    /*
    Try adding program arguments via Run/Debug configuration.
    Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    */

    val squareCabin = SquareCabin(5)
    val roundHut = RoundHut(8)
    val roundTower = RoundTower(15, 6)
    // val dwellings = Dwellings(2)

    with(squareCabin) {
        println("...................................................")
        println(name)
        println("Building Material : $buildingMaterial")
        println("Capacity : $capacity")
        println("Has Room : ${hasRoom()}")
        getRoom()
        if (hasRoom()) {
            println("Kindly make the payment of : Rs $charges")
        }
        println("...................................................")
    }

    with(roundHut) {
        println("...................................................")
        println(name)
        println("Building Material : $buildingMaterial")
        println("Capacity : $capacity")
        println("Has Room : ${hasRoom()}")
        getRoom()
        if (hasRoom()) {
            println("Kindly make the payment of : Rs $charges")
        }
        println("...................................................")
    }

    with(roundTower) {
        println("...................................................")
        println(name)
        println("Building Material : $buildingMaterial")
        println("Capacity : $capacity")
        println("Has Room : ${hasRoom()}")
        getRoom()
        if (hasRoom()) {
            println("Kindly make the payment of : Rs $charges")
        }
        println("...................................................")
    }

    /*
    with(dwellings) {
        println("...................................................")
        println(name)
        println("Building Material : $buildingMaterial")
        println("Capacity : $capacity")
        println("Has Room : ${hasRoom()}")
        getRoom()
        if (hasRoom()) {
            println("Kindly make the payment of : Rs $charges")
        }
        println("...................................................")
    }*/

}

open class Dwellings(resident: Int) {
    lateinit var buildingMaterial: String
    var capacity: Int = 0
    var resident: Int = 0
    lateinit var name: String
    var charges: Double = 0.00

    init {
        this.resident = resident
    }

    fun hasRoom(): Boolean {
        return capacity > resident
    }

    fun getRoom() {
        if (hasRoom()) {
            println("Congratulations!!! We have a room for you.")
        } else {
            println("Sorry!!!. We can't provide a room for you.")
        }
    }
}

class SquareCabin(resident: Int) : Dwellings(resident) {
    init {
        this.buildingMaterial = "Wood"
        this.capacity = 15
        this.name = "Square Cabin"
        this.charges = (3500 * resident).toDouble()
    }
}

class RoundHut(resident: Int) : Dwellings(resident) {
    init {
        this.buildingMaterial = "Straw"
        this.capacity = 8
        this.name = "Round Hut"
        this.charges = (1500 * resident).toDouble()
    }
}

class RoundTower(resident: Int, floor: Int) : Dwellings(resident) {
    init {
        this.buildingMaterial = "Concrete"
        this.capacity = 4 * floor
        this.name = "Round Tower"
        this.charges = (750 * resident).toDouble()
    }
}