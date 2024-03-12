import appendixB.Totaller
import io.kotest.core.spec.style.StringSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class AnotherTotallerTest: StringSpec ({
    "should be able to add 3 and 4" {
        val totaller = Totaller()

        totaller.add(3) shouldBe 3
        totaller.add(4) shouldBe 7
        totaller.total shouldBe 7
    }

    "should be able to add all lots of different numbers" {
        forAll(
            row(1, 2, 3),
            row(19, 47, 66),
            row(11, 21, 32),
        ) { x, y, expectedTotal ->
            val totaller = Totaller(x)
            totaller.add(y) shouldBe expectedTotal
        }
    }
})