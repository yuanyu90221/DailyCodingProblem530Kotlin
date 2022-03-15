import kotlin.test.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val sol: Solution = Solution()
    @Test
    fun getStringDistanceExample1() {
        assertEquals(4, sol.getStringDistance("kitten", "sitting"))
    }
}