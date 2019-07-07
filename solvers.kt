package solvers

import dna.countNucleotides
import java.io.File

fun solveDNA(filename: String) {
    val dna = File(filename).readLines().joinToString()
    println(countNucleotides(dna).joinToString(" "))
}