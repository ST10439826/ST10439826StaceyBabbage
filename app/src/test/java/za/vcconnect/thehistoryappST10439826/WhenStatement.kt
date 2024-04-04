package za.vcconnect.thehistoryappST10439826

import junit.framework.TestCase.assertEquals
import org.junit.Test

class WhenStatement{
    @Test
    fun testWhenStatement() {
        //Test case for a when statement
        val result = when (25) {
            96 -> "Queen Elizabeth II is the former Queen of the United Kingdom of Great Britain" +
                    " and Northern Ireland. She was the longest reigning monarch and " +
                    "served as Queen for 70 years. She passed away at age 96. "

            50 -> "Michael Jackson was an extremely successful " +
                    "American musician, songwriter and dancer famously referred to as the “King of Pop”." +
                    " He passed away at age 50. "

            36 -> "Diana, Princess of Wales was the former wife of Charles, Prince of Wales (currently King Charles III)." +
                    " She was universally beloved and affectionately referred to as the 'The People’s Princess'. " +
                    "She passed away at age 36. "

            else-> "Nobody known to me died at this age"
        }
        assertEquals("Nobody known to me died at this age", result)
    }
}
