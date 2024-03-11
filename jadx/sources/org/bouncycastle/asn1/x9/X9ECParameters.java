package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.util.Arrays;

/* loaded from: classes5.dex */
public class X9ECParameters extends ASN1Object implements X9ObjectIdentifiers {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private ECCurve curve;
    private X9FieldID fieldID;
    private X9ECPoint g;
    private BigInteger h;
    private BigInteger n;
    private byte[] seed;

    public X9ECParameters(ECCurve eCCurve, X9ECPoint x9ECPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        X9FieldID x9FieldID;
        this.curve = eCCurve;
        this.g = x9ECPoint;
        this.n = bigInteger;
        this.h = bigInteger2;
        this.seed = Arrays.clone(bArr);
        if (ECAlgorithms.isFpCurve(eCCurve)) {
            x9FieldID = new X9FieldID(eCCurve.getField().getCharacteristic());
        } else if (!ECAlgorithms.isF2mCurve(eCCurve)) {
            throw new IllegalArgumentException("'curve' is of an unsupported type");
        } else {
            int[] exponentsPresent = ((PolynomialExtensionField) eCCurve.getField()).getMinimalPolynomial().getExponentsPresent();
            if (exponentsPresent.length == 3) {
                x9FieldID = new X9FieldID(exponentsPresent[2], exponentsPresent[1]);
            } else if (exponentsPresent.length != 5) {
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            } else {
                x9FieldID = new X9FieldID(exponentsPresent[4], exponentsPresent[1], exponentsPresent[2], exponentsPresent[3]);
            }
        }
        this.fieldID = x9FieldID;
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(new ASN1Integer(ONE));
        aSN1EncodableVector.add(this.fieldID);
        aSN1EncodableVector.add(new X9Curve(this.curve, this.seed));
        aSN1EncodableVector.add(this.g);
        aSN1EncodableVector.add(new ASN1Integer(this.n));
        if (this.h != null) {
            aSN1EncodableVector.add(new ASN1Integer(this.h));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
