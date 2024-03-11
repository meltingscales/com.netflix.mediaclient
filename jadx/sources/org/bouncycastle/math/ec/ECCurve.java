package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Random;
import java.util.Set;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.endo.ECEndomorphism;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.FiniteFields;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Properties;
import org.chromium.net.NetError;

/* loaded from: classes5.dex */
public abstract class ECCurve {
    public ECFieldElement a;
    public ECFieldElement b;
    public BigInteger cofactor;
    protected FiniteField field;
    public BigInteger order;
    public int coord = 0;
    protected ECEndomorphism endomorphism = null;
    protected ECMultiplier multiplier = null;

    /* loaded from: classes6.dex */
    public static abstract class AbstractF2m extends ECCurve {
        private BigInteger[] si;

        public AbstractF2m(int i, int i2, int i3, int i4) {
            super(buildField(i, i2, i3, i4));
            this.si = null;
        }

        private static FiniteField buildField(int i, int i2, int i3, int i4) {
            return FiniteFields.getBinaryExtensionField((i3 | i4) == 0 ? new int[]{0, i2, i} : new int[]{0, i2, i3, i4, i});
        }

        private static BigInteger implRandomFieldElementMult(SecureRandom secureRandom, int i) {
            BigInteger createRandomBigInteger;
            do {
                createRandomBigInteger = BigIntegers.createRandomBigInteger(i, secureRandom);
            } while (createRandomBigInteger.signum() <= 0);
            return createRandomBigInteger;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2) {
            ECFieldElement fromBigInteger = fromBigInteger(bigInteger);
            ECFieldElement fromBigInteger2 = fromBigInteger(bigInteger2);
            int coordinateSystem = getCoordinateSystem();
            if (coordinateSystem == 5 || coordinateSystem == 6) {
                if (!fromBigInteger.isZero()) {
                    fromBigInteger2 = fromBigInteger2.divide(fromBigInteger).add(fromBigInteger);
                } else if (!fromBigInteger2.square().equals(getB())) {
                    throw new IllegalArgumentException();
                }
            }
            return createRawPoint(fromBigInteger, fromBigInteger2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected ECPoint decompressPoint(int i, BigInteger bigInteger) {
            ECFieldElement eCFieldElement;
            ECFieldElement fromBigInteger = fromBigInteger(bigInteger);
            if (fromBigInteger.isZero()) {
                eCFieldElement = getB().sqrt();
            } else {
                ECFieldElement solveQuadraticEquation = solveQuadraticEquation(fromBigInteger.square().invert().multiply(getB()).add(getA()).add(fromBigInteger));
                if (solveQuadraticEquation != null) {
                    if (solveQuadraticEquation.testBitZero() != (i == 1)) {
                        solveQuadraticEquation = solveQuadraticEquation.addOne();
                    }
                    int coordinateSystem = getCoordinateSystem();
                    eCFieldElement = (coordinateSystem == 5 || coordinateSystem == 6) ? solveQuadraticEquation.add(fromBigInteger) : solveQuadraticEquation.multiply(fromBigInteger);
                } else {
                    eCFieldElement = null;
                }
            }
            if (eCFieldElement != null) {
                return createRawPoint(fromBigInteger, eCFieldElement);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
            int fieldSize = getFieldSize();
            return fromBigInteger(implRandomFieldElementMult(secureRandom, fieldSize)).multiply(fromBigInteger(implRandomFieldElementMult(secureRandom, fieldSize)));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public ECFieldElement solveQuadraticEquation(ECFieldElement eCFieldElement) {
            ECFieldElement eCFieldElement2;
            ECFieldElement.AbstractF2m abstractF2m = (ECFieldElement.AbstractF2m) eCFieldElement;
            boolean hasFastTrace = abstractF2m.hasFastTrace();
            if (!hasFastTrace || abstractF2m.trace() == 0) {
                int fieldSize = getFieldSize();
                if ((fieldSize & 1) != 0) {
                    ECFieldElement halfTrace = abstractF2m.halfTrace();
                    if (hasFastTrace || halfTrace.square().add(halfTrace).add(eCFieldElement).isZero()) {
                        return halfTrace;
                    }
                    return null;
                } else if (eCFieldElement.isZero()) {
                    return eCFieldElement;
                } else {
                    ECFieldElement fromBigInteger = fromBigInteger(ECConstants.ZERO);
                    Random random = new Random();
                    do {
                        ECFieldElement fromBigInteger2 = fromBigInteger(new BigInteger(fieldSize, random));
                        ECFieldElement eCFieldElement3 = eCFieldElement;
                        eCFieldElement2 = fromBigInteger;
                        for (int i = 1; i < fieldSize; i++) {
                            ECFieldElement square = eCFieldElement3.square();
                            eCFieldElement2 = eCFieldElement2.square().add(square.multiply(fromBigInteger2));
                            eCFieldElement3 = square.add(eCFieldElement);
                        }
                        if (!eCFieldElement3.isZero()) {
                            return null;
                        }
                    } while (eCFieldElement2.square().add(eCFieldElement2).isZero());
                    return eCFieldElement2;
                }
            }
            return null;
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class AbstractFp extends ECCurve {
        public AbstractFp(BigInteger bigInteger) {
            super(FiniteFields.getPrimeField(bigInteger));
        }

        private static BigInteger implRandomFieldElementMult(SecureRandom secureRandom, BigInteger bigInteger) {
            while (true) {
                BigInteger createRandomBigInteger = BigIntegers.createRandomBigInteger(bigInteger.bitLength(), secureRandom);
                if (createRandomBigInteger.signum() > 0 && createRandomBigInteger.compareTo(bigInteger) < 0) {
                    return createRandomBigInteger;
                }
            }
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected ECPoint decompressPoint(int i, BigInteger bigInteger) {
            ECFieldElement fromBigInteger = fromBigInteger(bigInteger);
            ECFieldElement sqrt = fromBigInteger.square().add(this.a).multiply(fromBigInteger).add(this.b).sqrt();
            if (sqrt != null) {
                if (sqrt.testBitZero() != (i == 1)) {
                    sqrt = sqrt.negate();
                }
                return createRawPoint(fromBigInteger, sqrt);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
            BigInteger characteristic = getField().getCharacteristic();
            return fromBigInteger(implRandomFieldElementMult(secureRandom, characteristic)).multiply(fromBigInteger(implRandomFieldElementMult(secureRandom, characteristic)));
        }
    }

    /* loaded from: classes6.dex */
    public class Config {
        protected int coord;
        protected ECEndomorphism endomorphism;
        protected ECMultiplier multiplier;

        Config(int i, ECEndomorphism eCEndomorphism, ECMultiplier eCMultiplier) {
            this.coord = i;
            this.endomorphism = eCEndomorphism;
            this.multiplier = eCMultiplier;
        }

        public ECCurve create() {
            if (ECCurve.this.supportsCoordinateSystem(this.coord)) {
                ECCurve cloneCurve = ECCurve.this.cloneCurve();
                if (cloneCurve != ECCurve.this) {
                    synchronized (cloneCurve) {
                        cloneCurve.coord = this.coord;
                        cloneCurve.endomorphism = this.endomorphism;
                        cloneCurve.multiplier = this.multiplier;
                    }
                    return cloneCurve;
                }
                throw new IllegalStateException("implementation returned current curve");
            }
            throw new IllegalStateException("unsupported coordinate system");
        }

        public Config setEndomorphism(ECEndomorphism eCEndomorphism) {
            this.endomorphism = eCEndomorphism;
            return this;
        }
    }

    /* loaded from: classes6.dex */
    public static class F2m extends AbstractF2m {
        private ECPoint.F2m infinity;
        private int k1;
        private int k2;
        private int k3;
        private int m;

        public F2m(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i, i2, i3, i4);
            this.m = i;
            this.k1 = i2;
            this.k2 = i3;
            this.k3 = i4;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.infinity = new ECPoint.F2m(this, null, null);
            this.a = fromBigInteger(bigInteger);
            this.b = fromBigInteger(bigInteger2);
            this.coord = 6;
        }

        protected F2m(int i, int i2, int i3, int i4, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i, i2, i3, i4);
            this.m = i;
            this.k1 = i2;
            this.k2 = i3;
            this.k3 = i4;
            this.order = bigInteger;
            this.cofactor = bigInteger2;
            this.infinity = new ECPoint.F2m(this, null, null);
            this.a = eCFieldElement;
            this.b = eCFieldElement2;
            this.coord = 6;
        }

        public F2m(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected ECCurve cloneCurve() {
            return new F2m(this.m, this.k1, this.k2, this.k3, this.a, this.b, this.order, this.cofactor);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return new ECPoint.F2m(this, eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            if (bigInteger != null && bigInteger.signum() >= 0) {
                int bitLength = bigInteger.bitLength();
                int i = this.m;
                if (bitLength <= i) {
                    int i2 = this.k2;
                    int i3 = this.k3;
                    return new ECFieldElement.F2m(i, (i2 | i3) == 0 ? new int[]{this.k1} : new int[]{this.k1, i2, i3}, new LongArray(bigInteger));
                }
            }
            throw new IllegalArgumentException("x value invalid in F2m field element");
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public int getFieldSize() {
            return this.m;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint getInfinity() {
            return this.infinity;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean supportsCoordinateSystem(int i) {
            return i == 0 || i == 1 || i == 6;
        }
    }

    /* loaded from: classes6.dex */
    public static class Fp extends AbstractFp {
        private static final Set<BigInteger> knownQs = Collections.synchronizedSet(new HashSet());
        private static final BigIntegers.Cache validatedQs = new BigIntegers.Cache();
        ECPoint.Fp infinity;
        BigInteger q;
        BigInteger r;

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            this(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, false);
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, boolean z) {
            super(bigInteger);
            if (z) {
                this.q = bigInteger;
                knownQs.add(bigInteger);
            } else {
                if (!knownQs.contains(bigInteger)) {
                    BigIntegers.Cache cache = validatedQs;
                    if (!cache.contains(bigInteger)) {
                        int asInteger = Properties.asInteger("org.bouncycastle.ec.fp_max_size", 1042);
                        int asInteger2 = Properties.asInteger("org.bouncycastle.ec.fp_certainty", 100);
                        int bitLength = bigInteger.bitLength();
                        if (asInteger < bitLength) {
                            throw new IllegalArgumentException("Fp q value out of range");
                        }
                        if (Primes.hasAnySmallFactors(bigInteger) || !Primes.isMRProbablePrime(bigInteger, CryptoServicesRegistrar.getSecureRandom(), ECCurve.getNumberOfIterations(bitLength, asInteger2))) {
                            throw new IllegalArgumentException("Fp q value not prime");
                        }
                        cache.add(bigInteger);
                    }
                }
                this.q = bigInteger;
            }
            this.r = ECFieldElement.Fp.calculateResidue(bigInteger);
            this.infinity = new ECPoint.Fp(this, null, null);
            this.a = fromBigInteger(bigInteger2);
            this.b = fromBigInteger(bigInteger3);
            this.order = bigInteger4;
            this.cofactor = bigInteger5;
            this.coord = 4;
        }

        protected Fp(BigInteger bigInteger, BigInteger bigInteger2, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.q = bigInteger;
            this.r = bigInteger2;
            this.infinity = new ECPoint.Fp(this, null, null);
            this.a = eCFieldElement;
            this.b = eCFieldElement2;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.coord = 4;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected ECCurve cloneCurve() {
            return new Fp(this.q, this.r, this.a, this.b, this.order, this.cofactor);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return new ECPoint.Fp(this, eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(this.q) >= 0) {
                throw new IllegalArgumentException("x value invalid for Fp field element");
            }
            return new ECFieldElement.Fp(this.q, this.r, bigInteger);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public int getFieldSize() {
            return this.q.bitLength();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint getInfinity() {
            return this.infinity;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint importPoint(ECPoint eCPoint) {
            int coordinateSystem;
            return (this == eCPoint.getCurve() || getCoordinateSystem() != 2 || eCPoint.isInfinity() || !((coordinateSystem = eCPoint.getCurve().getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) ? super.importPoint(eCPoint) : new ECPoint.Fp(this, fromBigInteger(eCPoint.x.toBigInteger()), fromBigInteger(eCPoint.y.toBigInteger()), new ECFieldElement[]{fromBigInteger(eCPoint.zs[0].toBigInteger())});
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean supportsCoordinateSystem(int i) {
            return i == 0 || i == 1 || i == 2 || i == 4;
        }
    }

    protected ECCurve(FiniteField finiteField) {
        this.field = finiteField;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getNumberOfIterations(int i, int i2) {
        if (i >= 1536) {
            if (i2 <= 100) {
                return 3;
            }
            if (i2 <= 128) {
                return 4;
            }
            return 4 + ((i2 + NetError.ERR_PROXY_AUTH_REQUESTED) / 2);
        } else if (i >= 1024) {
            if (i2 <= 100) {
                return 4;
            }
            if (i2 <= 112) {
                return 5;
            }
            return ((i2 + NetError.ERR_TUNNEL_CONNECTION_FAILED) / 2) + 5;
        } else if (i < 512) {
            if (i2 <= 80) {
                return 40;
            }
            return 40 + ((i2 - 79) / 2);
        } else if (i2 <= 80) {
            return 5;
        } else {
            if (i2 <= 100) {
                return 7;
            }
            return 7 + ((i2 - 99) / 2);
        }
    }

    protected void checkPoint(ECPoint eCPoint) {
        if (eCPoint == null || this != eCPoint.getCurve()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    protected void checkPoints(ECPoint[] eCPointArr, int i, int i2) {
        if (eCPointArr == null) {
            throw new IllegalArgumentException("'points' cannot be null");
        }
        if (i < 0 || i2 < 0 || i > eCPointArr.length - i2) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ECPoint eCPoint = eCPointArr[i + i3];
            if (eCPoint != null && this != eCPoint.getCurve()) {
                throw new IllegalArgumentException("'points' entries must be null or on this curve");
            }
        }
    }

    protected abstract ECCurve cloneCurve();

    public Config configure() {
        Config config;
        synchronized (this) {
            config = new Config(this.coord, this.endomorphism, this.multiplier);
        }
        return config;
    }

    public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2) {
        return createRawPoint(fromBigInteger(bigInteger), fromBigInteger(bigInteger2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2);

    public ECPoint decodePoint(byte[] bArr) {
        ECPoint infinity;
        int fieldSize = (getFieldSize() + 7) / 8;
        byte b = bArr[0];
        if (b != 0) {
            if (b == 2 || b == 3) {
                if (bArr.length != fieldSize + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                infinity = decompressPoint(b & 1, BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize));
                if (!infinity.implIsValid(true, true)) {
                    throw new IllegalArgumentException("Invalid point");
                }
            } else if (b != 4) {
                if (b != 6 && b != 7) {
                    throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b, 16));
                } else if (bArr.length != (fieldSize * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                } else {
                    BigInteger fromUnsignedByteArray = BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize);
                    BigInteger fromUnsignedByteArray2 = BigIntegers.fromUnsignedByteArray(bArr, fieldSize + 1, fieldSize);
                    if (fromUnsignedByteArray2.testBit(0) != (b == 7)) {
                        throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                    }
                    infinity = validatePoint(fromUnsignedByteArray, fromUnsignedByteArray2);
                }
            } else if (bArr.length != (fieldSize * 2) + 1) {
                throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
            } else {
                infinity = validatePoint(BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize), BigIntegers.fromUnsignedByteArray(bArr, fieldSize + 1, fieldSize));
            }
        } else if (bArr.length != 1) {
            throw new IllegalArgumentException("Incorrect length for infinity encoding");
        } else {
            infinity = getInfinity();
        }
        if (b == 0 || !infinity.isInfinity()) {
            return infinity;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    protected abstract ECPoint decompressPoint(int i, BigInteger bigInteger);

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ECCurve) && equals((ECCurve) obj));
    }

    public boolean equals(ECCurve eCCurve) {
        return this == eCCurve || (eCCurve != null && getField().equals(eCCurve.getField()) && getA().toBigInteger().equals(eCCurve.getA().toBigInteger()) && getB().toBigInteger().equals(eCCurve.getB().toBigInteger()));
    }

    public abstract ECFieldElement fromBigInteger(BigInteger bigInteger);

    public ECFieldElement getA() {
        return this.a;
    }

    public ECFieldElement getB() {
        return this.b;
    }

    public BigInteger getCofactor() {
        return this.cofactor;
    }

    public int getCoordinateSystem() {
        return this.coord;
    }

    public FiniteField getField() {
        return this.field;
    }

    public abstract int getFieldSize();

    public abstract ECPoint getInfinity();

    public BigInteger getOrder() {
        return this.order;
    }

    public int hashCode() {
        return (getField().hashCode() ^ Integers.rotateLeft(getA().toBigInteger().hashCode(), 8)) ^ Integers.rotateLeft(getB().toBigInteger().hashCode(), 16);
    }

    public ECPoint importPoint(ECPoint eCPoint) {
        if (this == eCPoint.getCurve()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return getInfinity();
        }
        ECPoint normalize = eCPoint.normalize();
        return createPoint(normalize.getXCoord().toBigInteger(), normalize.getYCoord().toBigInteger());
    }

    public void normalizeAll(ECPoint[] eCPointArr) {
        normalizeAll(eCPointArr, 0, eCPointArr.length, null);
    }

    public void normalizeAll(ECPoint[] eCPointArr, int i, int i2, ECFieldElement eCFieldElement) {
        checkPoints(eCPointArr, i, i2);
        int coordinateSystem = getCoordinateSystem();
        if (coordinateSystem == 0 || coordinateSystem == 5) {
            if (eCFieldElement != null) {
                throw new IllegalArgumentException("'iso' not valid for affine coordinates");
            }
            return;
        }
        ECFieldElement[] eCFieldElementArr = new ECFieldElement[i2];
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i + i4;
            ECPoint eCPoint = eCPointArr[i5];
            if (eCPoint != null && (eCFieldElement != null || !eCPoint.isNormalized())) {
                eCFieldElementArr[i3] = eCPoint.getZCoord(0);
                iArr[i3] = i5;
                i3++;
            }
        }
        if (i3 == 0) {
            return;
        }
        ECAlgorithms.montgomeryTrick(eCFieldElementArr, 0, i3, eCFieldElement);
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = iArr[i6];
            eCPointArr[i7] = eCPointArr[i7].normalize(eCFieldElementArr[i6]);
        }
    }

    public PreCompInfo precompute(ECPoint eCPoint, String str, PreCompCallback preCompCallback) {
        Hashtable hashtable;
        PreCompInfo precompute;
        checkPoint(eCPoint);
        synchronized (eCPoint) {
            hashtable = eCPoint.preCompTable;
            if (hashtable == null) {
                hashtable = new Hashtable(4);
                eCPoint.preCompTable = hashtable;
            }
        }
        synchronized (hashtable) {
            PreCompInfo preCompInfo = (PreCompInfo) hashtable.get(str);
            precompute = preCompCallback.precompute(preCompInfo);
            if (precompute != preCompInfo) {
                hashtable.put(str, precompute);
            }
        }
        return precompute;
    }

    public abstract ECFieldElement randomFieldElementMult(SecureRandom secureRandom);

    public boolean supportsCoordinateSystem(int i) {
        return i == 0;
    }

    public ECPoint validatePoint(BigInteger bigInteger, BigInteger bigInteger2) {
        ECPoint createPoint = createPoint(bigInteger, bigInteger2);
        if (createPoint.isValid()) {
            return createPoint;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }
}
