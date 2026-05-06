fun main() {
    val signalcase_1 = Signal(78, 106, 8, 21, 12)
    check(Policy.score(signalcase_1) == 127)
    check(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(74, 82, 14, 20, 7)
    check(Policy.score(signalcase_2) == 69)
    check(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(96, 81, 23, 21, 4)
    check(Policy.score(signalcase_3) == 69)
    check(Policy.classify(signalcase_3) == "review")
    val domainReview = DomainReview(43, 37, 13, 60)
    check(DomainReviewLens.score(domainReview) == 144)
    check(DomainReviewLens.lane(domainReview) == "ship")
}
