package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes6.dex */
public class SecT193R1Curve extends ECCurve.AbstractF2m {
    private static final ECFieldElement[] SECT193R1_AFFINE_ZS = {new SecT193FieldElement(ECConstants.ONE)};
    protected SecT193R1Point infinity;

    public SecT193R1Curve() {
        super(193, 15, 0, 0);
        this.infinity = new SecT193R1Point(this, null, null);
        this.a = fromBigInteger(new BigInteger(1, Hex.decodeStrict("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.order = new BigInteger(1, Hex.decodeStrict("01000000000000000000000000C7F34A778F443ACC920EBA49"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecT193R1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecT193R1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT193FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return 193;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 6;
    }
}
