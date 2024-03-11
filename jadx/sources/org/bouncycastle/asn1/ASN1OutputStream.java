package org.bouncycastle.asn1;

import java.io.OutputStream;

/* loaded from: classes5.dex */
public class ASN1OutputStream {
    private OutputStream os;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1OutputStream(OutputStream outputStream) {
        this.os = outputStream;
    }

    public static ASN1OutputStream create(OutputStream outputStream) {
        return new ASN1OutputStream(outputStream);
    }

    public static ASN1OutputStream create(OutputStream outputStream, String str) {
        return str.equals("DER") ? new DEROutputStream(outputStream) : str.equals("DL") ? new DLOutputStream(outputStream) : new ASN1OutputStream(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getLengthOfDL(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getLengthOfEncodingDL(boolean z, int i) {
        return (z ? 1 : 0) + getLengthOfDL(i) + i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getLengthOfIdentifier(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void flushInternal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DEROutputStream getDERSubStream() {
        return new DEROutputStream(this.os);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DLOutputStream getDLSubStream() {
        return new DLOutputStream(this.os);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void write(int i) {
        this.os.write(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void write(byte[] bArr, int i, int i2) {
        this.os.write(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeDL(int i) {
        if (i < 128) {
            write(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | 128);
                write(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    void writeElements(ASN1Encodable[] aSN1EncodableArr) {
        for (ASN1Encodable aSN1Encodable : aSN1EncodableArr) {
            aSN1Encodable.toASN1Primitive().encode(this, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeEncodingDL(boolean z, int i, byte b) {
        writeIdentifier(z, i);
        writeDL(1);
        write(b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeEncodingDL(boolean z, int i, byte b, byte[] bArr, int i2, int i3) {
        writeIdentifier(z, i);
        writeDL(i3 + 1);
        write(b);
        write(bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeEncodingDL(boolean z, int i, byte[] bArr) {
        writeIdentifier(z, i);
        writeDL(bArr.length);
        write(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeEncodingDL(boolean z, int i, byte[] bArr, int i2, int i3) {
        writeIdentifier(z, i);
        writeDL(i3);
        write(bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeEncodingDL(boolean z, int i, byte[] bArr, int i2, int i3, byte b) {
        writeIdentifier(z, i);
        writeDL(i3 + 1);
        write(bArr, i2, i3);
        write(b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeEncodingIL(boolean z, int i, ASN1Encodable[] aSN1EncodableArr) {
        writeIdentifier(z, i);
        write(128);
        writeElements(aSN1EncodableArr);
        write(0);
        write(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeIdentifier(boolean z, int i) {
        if (z) {
            write(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeIdentifier(boolean z, int i, int i2) {
        if (z) {
            if (i2 < 31) {
                write(i | i2);
                return;
            }
            byte[] bArr = new byte[6];
            int i3 = 5;
            bArr[5] = (byte) (i2 & 127);
            while (i2 > 127) {
                i2 >>>= 7;
                i3--;
                bArr[i3] = (byte) ((i2 & 127) | 128);
            }
            int i4 = i3 - 1;
            bArr[i4] = (byte) (31 | i);
            write(bArr, i4, 6 - i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writePrimitive(ASN1Primitive aSN1Primitive, boolean z) {
        aSN1Primitive.encode(this, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writePrimitives(ASN1Primitive[] aSN1PrimitiveArr) {
        for (ASN1Primitive aSN1Primitive : aSN1PrimitiveArr) {
            aSN1Primitive.encode(this, true);
        }
    }
}
