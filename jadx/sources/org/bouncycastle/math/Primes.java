package org.bouncycastle.math;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes6.dex */
public abstract class Primes {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private static final BigInteger THREE = BigInteger.valueOf(3);

    private static void checkCandidate(BigInteger bigInteger, String str) {
        if (bigInteger == null || bigInteger.signum() < 1 || bigInteger.bitLength() < 2) {
            throw new IllegalArgumentException("'" + str + "' must be non-null and >= 2");
        }
    }

    public static boolean hasAnySmallFactors(BigInteger bigInteger) {
        checkCandidate(bigInteger, "candidate");
        return implHasAnySmallFactors(bigInteger);
    }

    private static boolean implHasAnySmallFactors(BigInteger bigInteger) {
        int intValue = bigInteger.mod(BigInteger.valueOf(223092870)).intValue();
        if (intValue % 2 == 0 || intValue % 3 == 0 || intValue % 5 == 0 || intValue % 7 == 0 || intValue % 11 == 0 || intValue % 13 == 0 || intValue % 17 == 0 || intValue % 19 == 0 || intValue % 23 == 0) {
            return true;
        }
        int intValue2 = bigInteger.mod(BigInteger.valueOf(58642669)).intValue();
        if (intValue2 % 29 == 0 || intValue2 % 31 == 0 || intValue2 % 37 == 0 || intValue2 % 41 == 0 || intValue2 % 43 == 0) {
            return true;
        }
        int intValue3 = bigInteger.mod(BigInteger.valueOf(600662303)).intValue();
        if (intValue3 % 47 == 0 || intValue3 % 53 == 0 || intValue3 % 59 == 0 || intValue3 % 61 == 0 || intValue3 % 67 == 0) {
            return true;
        }
        int intValue4 = bigInteger.mod(BigInteger.valueOf(33984931)).intValue();
        if (intValue4 % 71 == 0 || intValue4 % 73 == 0 || intValue4 % 79 == 0 || intValue4 % 83 == 0) {
            return true;
        }
        int intValue5 = bigInteger.mod(BigInteger.valueOf(89809099)).intValue();
        if (intValue5 % 89 == 0 || intValue5 % 97 == 0 || intValue5 % 101 == 0 || intValue5 % 103 == 0) {
            return true;
        }
        int intValue6 = bigInteger.mod(BigInteger.valueOf(167375713)).intValue();
        if (intValue6 % 107 == 0 || intValue6 % 109 == 0 || intValue6 % 113 == 0 || intValue6 % 127 == 0) {
            return true;
        }
        int intValue7 = bigInteger.mod(BigInteger.valueOf(371700317)).intValue();
        if (intValue7 % 131 == 0 || intValue7 % 137 == 0 || intValue7 % 139 == 0 || intValue7 % 149 == 0) {
            return true;
        }
        int intValue8 = bigInteger.mod(BigInteger.valueOf(645328247)).intValue();
        if (intValue8 % 151 == 0 || intValue8 % 157 == 0 || intValue8 % 163 == 0 || intValue8 % 167 == 0) {
            return true;
        }
        int intValue9 = bigInteger.mod(BigInteger.valueOf(1070560157)).intValue();
        if (intValue9 % 173 == 0 || intValue9 % 179 == 0 || intValue9 % 181 == 0 || intValue9 % 191 == 0) {
            return true;
        }
        int intValue10 = bigInteger.mod(BigInteger.valueOf(1596463769)).intValue();
        return intValue10 % 193 == 0 || intValue10 % 197 == 0 || intValue10 % 199 == 0 || intValue10 % 211 == 0;
    }

    private static boolean implMRProbablePrimeToBase(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, BigInteger bigInteger4) {
        BigInteger modPow = bigInteger4.modPow(bigInteger3, bigInteger);
        if (modPow.equals(ONE) || modPow.equals(bigInteger2)) {
            return true;
        }
        for (int i2 = 1; i2 < i; i2++) {
            modPow = modPow.modPow(TWO, bigInteger);
            if (modPow.equals(bigInteger2)) {
                return true;
            }
            if (modPow.equals(ONE)) {
                return false;
            }
        }
        return false;
    }

    public static boolean isMRProbablePrime(BigInteger bigInteger, SecureRandom secureRandom, int i) {
        checkCandidate(bigInteger, "candidate");
        if (secureRandom != null) {
            if (i >= 1) {
                if (bigInteger.bitLength() == 2) {
                    return true;
                }
                if (bigInteger.testBit(0)) {
                    BigInteger subtract = bigInteger.subtract(ONE);
                    BigInteger subtract2 = bigInteger.subtract(TWO);
                    int lowestSetBit = subtract.getLowestSetBit();
                    BigInteger shiftRight = subtract.shiftRight(lowestSetBit);
                    for (int i2 = 0; i2 < i; i2++) {
                        if (!implMRProbablePrimeToBase(bigInteger, subtract, shiftRight, lowestSetBit, BigIntegers.createRandomInRange(TWO, subtract2, secureRandom))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("'iterations' must be > 0");
        }
        throw new IllegalArgumentException("'random' cannot be null");
    }
}
