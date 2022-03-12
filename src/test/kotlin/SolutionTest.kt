import kotlin.test.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val sol: Solution = Solution()
    @Test
    fun getStringDistanceExample1() {
        assertEquals(3, sol.getStringDistance("kitten", "sitting"))
    }
}