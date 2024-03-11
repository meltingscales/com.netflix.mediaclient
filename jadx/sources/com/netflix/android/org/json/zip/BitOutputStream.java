package com.netflix.android.org.json.zip;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public class BitOutputStream implements BitWriter {
    private OutputStream out;
    private int unwritten;
    private long nrBits = 0;
    private int vacant = 8;

    @Override // com.netflix.android.org.json.zip.BitWriter
    public long nrBits() {
        return this.nrBits;
    }

    public BitOutputStream(OutputStream outputStream) {
        this.out = outputStream;
    }

    @Override // com.netflix.android.org.json.zip.BitWriter
    public void one() {
        write(1, 1);
    }

    @Override // com.netflix.android.org.json.zip.BitWriter
    public void pad(int i) {
        int i2 = i - ((int) (this.nrBits % i));
        int i3 = i2 & 7;
        if (i3 > 0) {
            write(0, i3);
            i2 -= i3;
        }
        while (i2 > 0) {
            write(0, 8);
            i2 -= 8;
        }
        this.out.flush();
    }

    @Override // com.netflix.android.org.json.zip.BitWriter
    public void write(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i2 <= 0 || i2 > 32) {
            throw new IOException("Bad write width.");
        }
        while (i2 > 0) {
            int i3 = this.vacant;
            int i4 = i2 > i3 ? i3 : i2;
            i2 -= i4;
            int i5 = i3 - i4;
            int i6 = this.unwritten | (((i >>> i2) & BitInputStream.mask[i4]) << i5);
            this.unwritten = i6;
            this.nrBits += i4;
            this.vacant = i5;
            if (i5 == 0) {
                this.out.write(i6);
                this.unwritten = 0;
                this.vacant = 8;
            }
        }
    }

    @Override // com.netflix.android.org.json.zip.BitWriter
    public void zero() {
        write(0, 1);
    }
}
