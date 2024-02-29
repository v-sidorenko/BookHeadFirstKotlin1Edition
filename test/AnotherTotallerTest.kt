import appendixB.Totaller
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class AnotherTotallerTest: StringSpec ({
    "should be able to add 3 and 4" {
        val totaller = Totaller()

        totaller.add(3) shouldBe 3
        totaller.add(4) shouldBe 7
        totaller.total shouldBe 7
    }
})