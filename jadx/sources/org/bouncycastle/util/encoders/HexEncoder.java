package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public class HexEncoder {
    protected final byte[] encodingTable = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    protected final byte[] decodingTable = new byte[128];

    public HexEncoder() {
        initialiseDecodingTable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] decodeStrict(String str, int i, int i2) {
        if (str != null) {
            if (i < 0 || i2 < 0 || i > str.length() - i2) {
                throw new IndexOutOfBoundsException("invalid offset and/or length specified");
            }
            if ((i2 & 1) == 0) {
                int i3 = i2 >>> 1;
                byte[] bArr = new byte[i3];
                int i4 = 0;
                while (i4 < i3) {
                    byte b = this.decodingTable[str.charAt(i)];
                    int i5 = i + 2;
                    int i6 = this.decodingTable[str.charAt(i + 1)] | (b << 4);
                    if (i6 < 0) {
                        throw new IOException("invalid characters encountered in Hex string");
                    }
                    bArr[i4] = (byte) i6;
                    i4++;
                    i = i5;
                }
                return bArr;
            }
            throw new IOException("a hexadecimal encoding must have an even number of characters");
        }
        throw new NullPointerException("'str' cannot be null");
    }

    public int encode(byte[] bArr, int i, int i2, OutputStream outputStream) {
        if (i2 < 0) {
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(36, i3);
            outputStream.write(bArr2, 0, encode(bArr, i, min, bArr2, 0));
            i += min;
            i3 -= min;
        }
        return i2 * 2;
    }

    public int encode(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i;
        int i5 = i3;
        while (i4 < i2 + i) {
            byte b = bArr[i4];
            byte[] bArr3 = this.encodingTable;
            bArr2[i5] = bArr3[(b & 255) >>> 4];
            bArr2[i5 + 1] = bArr3[b & 15];
            i4++;
            i5 += 2;
        }
        return i5 - i3;
    }

    protected void initialiseDecodingTable() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.decodingTable;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.encodingTable;
            if (i >= bArr2.length) {
                byte[] bArr3 = this.decodingTable;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.decodingTable[bArr2[i]] = (byte) i;
            i++;
        }
    }
}
