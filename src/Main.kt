import kotlin.math.PI
import kotlin.math.sqrt

class Segitiga(
    private val alas: Double,
    private val tinggi: Double, private val sisi1: Double, private val sisi2: Double, private val sisi3: Double) {

    fun hitungLuas(): Double {
        return 0.5 * alas * tinggi
    }

    fun hitungKeliling(): Double {
        return sisi1 + sisi2 + sisi3
    }
}

class Lingkaran(private val jariJari: Double) {

    fun hitungLuas(): Double {
        return PI * jariJari * jariJari
    }

    fun hitungKeliling(): Double {
        return 2 * PI * jariJari
    }
}

fun main() {
    //  menghitung luas dan keliling untuk segitiga
    val segitiga = Segitiga(alas = 5.0, tinggi = 8.0, sisi1 = 3.0, sisi2 = 4.0, sisi3 = 5.0)
    println("Luas Segitiga: ${segitiga.hitungLuas()}")
    println("Keliling Segitiga: ${segitiga.hitungKeliling()}")

    //  menghitung luas dan keliling untuk lingkaran
    val lingkaran = Lingkaran(jariJari = 4.0)
    println("Luas Lingkaran: ${lingkaran.hitungLuas()}")
    println("Keliling Lingkaran: ${lingkaran.hitungKeliling()}")
}
