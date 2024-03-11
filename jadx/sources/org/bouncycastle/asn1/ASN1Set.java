package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Iterator;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Iterable;

/* loaded from: classes6.dex */
public abstract class ASN1Set extends ASN1Primitive implements Iterable<ASN1Encodable> {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Set.class, 17) { // from class: org.bouncycastle.asn1.ASN1Set.1
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitConstructed(ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.toASN1Set();
        }
    };
    protected final ASN1Encodable[] elements;
    protected ASN1Encodable[] sortedElements;

    /* JADX INFO: Access modifiers changed from: protected */
    public ASN1Set() {
        ASN1Encodable[] aSN1EncodableArr = ASN1EncodableVector.EMPTY_ELEMENTS;
        this.elements = aSN1EncodableArr;
        this.sortedElements = aSN1EncodableArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ASN1Set(ASN1EncodableVector aSN1EncodableVector, boolean z) {
        ASN1Encodable[] takeElements;
        if (aSN1EncodableVector == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        if (!z || aSN1EncodableVector.size() < 2) {
            takeElements = aSN1EncodableVector.takeElements();
        } else {
            takeElements = aSN1EncodableVector.copyElements();
            sort(takeElements);
        }
        this.elements = takeElements;
        if (!z && takeElements.length >= 2) {
            takeElements = null;
        }
        this.sortedElements = takeElements;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1Set(boolean z, ASN1Encodable[] aSN1EncodableArr) {
        this.elements = aSN1EncodableArr;
        if (!z && aSN1EncodableArr.length >= 2) {
            aSN1EncodableArr = null;
        }
        this.sortedElements = aSN1EncodableArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1Set(ASN1Encodable[] aSN1EncodableArr, ASN1Encodable[] aSN1EncodableArr2) {
        this.elements = aSN1EncodableArr;
        this.sortedElements = aSN1EncodableArr2;
    }

    private static byte[] getDEREncoded(ASN1Encodable aSN1Encodable) {
        try {
            return aSN1Encodable.toASN1Primitive().getEncoded("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static ASN1Set getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1Set) TYPE.getContextInstance(aSN1TaggedObject, z);
    }

    private static boolean lessThanOrEqual(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & 223;
        int i2 = bArr2[0] & 223;
        if (i != i2) {
            return i < i2;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < min; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        return (bArr[min] & 255) <= (bArr2[min] & 255);
    }

    private static void sort(ASN1Encodable[] aSN1EncodableArr) {
        int i;
        int length = aSN1EncodableArr.length;
        if (length < 2) {
            return;
        }
        ASN1Encodable aSN1Encodable = aSN1EncodableArr[0];
        ASN1Encodable aSN1Encodable2 = aSN1EncodableArr[1];
        byte[] dEREncoded = getDEREncoded(aSN1Encodable);
        byte[] dEREncoded2 = getDEREncoded(aSN1Encodable2);
        if (lessThanOrEqual(dEREncoded2, dEREncoded)) {
            aSN1Encodable2 = aSN1Encodable;
            aSN1Encodable = aSN1Encodable2;
        } else {
            dEREncoded2 = dEREncoded;
            dEREncoded = dEREncoded2;
        }
        for (int i2 = 2; i2 < length; i2++) {
            ASN1Encodable aSN1Encodable3 = aSN1EncodableArr[i2];
            byte[] dEREncoded3 = getDEREncoded(aSN1Encodable3);
            if (lessThanOrEqual(dEREncoded, dEREncoded3)) {
                aSN1EncodableArr[i2 - 2] = aSN1Encodable;
                aSN1Encodable = aSN1Encodable2;
                dEREncoded2 = dEREncoded;
                aSN1Encodable2 = aSN1Encodable3;
                dEREncoded = dEREncoded3;
            } else if (lessThanOrEqual(dEREncoded2, dEREncoded3)) {
                aSN1EncodableArr[i2 - 2] = aSN1Encodable;
                aSN1Encodable = aSN1Encodable3;
                dEREncoded2 = dEREncoded3;
            } else {
                int i3 = i2 - 1;
                while (true) {
                    i = i3 - 1;
                    if (i <= 0) {
                        break;
                    }
                    ASN1Encodable aSN1Encodable4 = aSN1EncodableArr[i3 - 2];
                    if (lessThanOrEqual(getDEREncoded(aSN1Encodable4), dEREncoded3)) {
                        break;
                    }
                    aSN1EncodableArr[i] = aSN1Encodable4;
                    i3 = i;
                }
                aSN1EncodableArr[i] = aSN1Encodable3;
            }
        }
        aSN1EncodableArr[length - 2] = aSN1Encodable;
        aSN1EncodableArr[length - 1] = aSN1Encodable2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1Set) {
            ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
            int size = size();
            if (aSN1Set.size() != size) {
                return false;
            }
            DERSet dERSet = (DERSet) toDERObject();
            DERSet dERSet2 = (DERSet) aSN1Set.toDERObject();
            for (int i = 0; i < size; i++) {
                ASN1Primitive aSN1Primitive2 = dERSet.elements[i].toASN1Primitive();
                ASN1Primitive aSN1Primitive3 = dERSet2.elements[i].toASN1Primitive();
                if (aSN1Primitive2 != aSN1Primitive3 && !aSN1Primitive2.asn1Equals(aSN1Primitive3)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        int length = this.elements.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += this.elements[length].toASN1Primitive().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<ASN1Encodable> iterator() {
        return new Arrays.Iterator(toArray());
    }

    public int size() {
        return this.elements.length;
    }

    public ASN1Encodable[] toArray() {
        return ASN1EncodableVector.cloneElements(this.elements);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        if (this.sortedElements == null) {
            ASN1Encodable[] aSN1EncodableArr = (ASN1Encodable[]) this.elements.clone();
            this.sortedElements = aSN1EncodableArr;
            sort(aSN1EncodableArr);
        }
        return new DERSet(true, this.sortedElements);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return new DLSet(this.elements, this.sortedElements);
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i = 0;
        while (true) {
            stringBuffer.append(this.elements[i]);
            i++;
            if (i >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }
}
