package com.netflix.android.org.json.zip;

import java.io.IOException;
import java.io.InputStream;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes5.dex */
public class BitInputStream implements BitReader {
    static final int[] mask = {0, 1, 3, 7, 15, 31, 63, 127, PrivateKeyType.INVALID};
    private int available;
    private InputStream in;
    private long nrBits;
    private int unread;

    @Override // com.netflix.android.org.json.zip.BitReader
    public long nrBits() {
        return this.nrBits;
    }

    public BitInputStream(InputStream inputStream) {
        this.available = 0;
        this.unread = 0;
        this.nrBits = 0L;
        this.in = inputStream;
    }

    public BitInputStream(InputStream inputStream, int i) {
        this.nrBits = 0L;
        this.in = inputStream;
        this.unread = i;
        this.available = 8;
    }

    @Override // com.netflix.android.org.json.zip.BitReader
    public boolean bit() {
        return read(1) != 0;
    }

    @Override // com.netflix.android.org.json.zip.BitReader
    public boolean pad(int i) {
        int i2 = (int) (this.nrBits % i);
        boolean z = true;
        for (int i3 = 0; i3 < i - i2; i3++) {
            if (bit()) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.netflix.android.org.json.zip.BitReader
    public int read(int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        if (i < 0 || i > 32) {
            throw new IOException("Bad read width.");
        }
        while (i > 0) {
            if (this.available == 0) {
                int read = this.in.read();
                this.unread = read;
                if (read < 0) {
                    throw new IOException("Attempt to read past end.");
                }
                this.available = 8;
            }
            int i3 = this.available;
            int i4 = i > i3 ? i3 : i;
            i -= i4;
            int i5 = i3 - i4;
            i2 |= ((this.unread >>> i5) & mask[i4]) << i;
            this.nrBits += i4;
            this.available = i5;
        }
        return i2;
    }
}
