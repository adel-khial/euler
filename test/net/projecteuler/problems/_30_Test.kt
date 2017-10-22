package net.projecteuler.problems

import net.projecteuler.api.*
import org.junit.Assert
import org.junit.Test

class _30_Test {

    @Test
    fun getDigit() {
        Assert.assertEquals(1, 1232145.getDigit(0))
        Assert.assertEquals(5, 1232145.getDigit(10))
        Assert.assertEquals(2, 1232145.getDigit(3))
    }

    @Test
    fun getLength() {
        Assert.assertEquals(5, 12345.length())
        Assert.assertEquals(1, 0.length())
        Assert.assertEquals(1, 5.length())
    }

    @Test
    fun isSumExpressible() {
        Assert.assertEquals(true, 1634.isSumExpressible(4))
        Assert.assertEquals(false, 8209.isSumExpressible(4))
    }
}