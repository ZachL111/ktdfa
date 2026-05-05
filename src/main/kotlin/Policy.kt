data class Signal(val demand: Int, val capacity: Int, val latency: Int, val risk: Int, val weight: Int)

object Policy {
    private const val threshold = 150
    private const val riskPenalty = 7
    private const val latencyPenalty = 3
    private const val weightBonus = 3

    fun score(signal: Signal): Int =
        signal.demand * 2 + signal.capacity + signal.weight * weightBonus -
            signal.latency * latencyPenalty - signal.risk * riskPenalty

    fun classify(signal: Signal): String = if (score(signal) >= threshold) "accept" else "review"
}
