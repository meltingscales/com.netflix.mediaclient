package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Arrays;

/* loaded from: classes5.dex */
public class X9Curve extends ASN1Object implements X9ObjectIdentifiers {
    private ECCurve curve;
    private ASN1ObjectIdentifier fieldIdentifier = null;
    private byte[] seed;

    public X9Curve(ECCurve eCCurve, byte[] bArr) {
        this.curve = eCCurve;
        this.seed = Arrays.clone(bArr);
        setFieldIdentifier();
    }

    private void setFieldIdentifier() {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        if (ECAlgorithms.isFpCurve(this.curve)) {
            aSN1ObjectIdentifier = X9ObjectIdentifiers.prime_field;
        } else if (!ECAlgorithms.isF2mCurve(this.curve)) {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        } else {
            aSN1ObjectIdentifier = X9ObjectIdentifiers.characteristic_two_field;
        }
        this.fieldIdentifier = aSN1ObjectIdentifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0060  */
    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        /*
            r3 = this;
            org.bouncycastle.asn1.ASN1EncodableVector r0 = new org.bouncycastle.asn1.ASN1EncodableVector
            r1 = 3
            r0.<init>(r1)
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = r3.fieldIdentifier
            org.bouncycastle.asn1.ASN1ObjectIdentifier r2 = org.bouncycastle.asn1.x9.X9ObjectIdentifiers.prime_field
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2e
            org.bouncycastle.asn1.x9.X9FieldElement r1 = new org.bouncycastle.asn1.x9.X9FieldElement
            org.bouncycastle.math.ec.ECCurve r2 = r3.curve
            org.bouncycastle.math.ec.ECFieldElement r2 = r2.getA()
            r1.<init>(r2)
            org.bouncycastle.asn1.ASN1Primitive r1 = r1.toASN1Primitive()
            r0.add(r1)
            org.bouncycastle.asn1.x9.X9FieldElement r1 = new org.bouncycastle.asn1.x9.X9FieldElement
            org.bouncycastle.math.ec.ECCurve r2 = r3.curve
            org.bouncycastle.math.ec.ECFieldElement r2 = r2.getB()
            r1.<init>(r2)
            goto L55
        L2e:
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = r3.fieldIdentifier
            org.bouncycastle.asn1.ASN1ObjectIdentifier r2 = org.bouncycastle.asn1.x9.X9ObjectIdentifiers.characteristic_two_field
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5c
            org.bouncycastle.asn1.x9.X9FieldElement r1 = new org.bouncycastle.asn1.x9.X9FieldElement
            org.bouncycastle.math.ec.ECCurve r2 = r3.curve
            org.bouncycastle.math.ec.ECFieldElement r2 = r2.getA()
            r1.<init>(r2)
            org.bouncycastle.asn1.ASN1Primitive r1 = r1.toASN1Primitive()
            r0.add(r1)
            org.bouncycastle.asn1.x9.X9FieldElement r1 = new org.bouncycastle.asn1.x9.X9FieldElement
            org.bouncycastle.math.ec.ECCurve r2 = r3.curve
            org.bouncycastle.math.ec.ECFieldElement r2 = r2.getB()
            r1.<init>(r2)
        L55:
            org.bouncycastle.asn1.ASN1Primitive r1 = r1.toASN1Primitive()
            r0.add(r1)
        L5c:
            byte[] r1 = r3.seed
            if (r1 == 0) goto L6a
            org.bouncycastle.asn1.DERBitString r1 = new org.bouncycastle.asn1.DERBitString
            byte[] r2 = r3.seed
            r1.<init>(r2)
            r0.add(r1)
        L6a:
            org.bouncycastle.asn1.DERSequence r1 = new org.bouncycastle.asn1.DERSequence
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.x9.X9Curve.toASN1Primitive():org.bouncycastle.asn1.ASN1Primitive");
    }
}
