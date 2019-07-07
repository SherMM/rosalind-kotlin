package dna

fun countNucleotides(dna: String): IntArray {
    val counts: IntArray = intArrayOf(0, 0, 0, 0)
    for (nucleotide in dna) {
        when (nucleotide) {
            'A' -> counts[0]++
            'C' -> counts[1]++
            'G' -> counts[2]++
            'T' -> counts[3]++
            else -> throw IllegalArgumentException("No Such Nucleotide")
        }
    }
    return counts
}