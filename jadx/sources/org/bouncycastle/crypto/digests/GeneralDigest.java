package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Memoable;

/* loaded from: classes5.dex */
public abstract class GeneralDigest implements ExtendedDigest, Memoable {
    private long byteCount;
    protected final CryptoServicePurpose purpose;
    private final byte[] xBuf;
    private int xBufOff;

    protected GeneralDigest() {
        this(CryptoServicePurpose.ANY);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public GeneralDigest(CryptoServicePurpose cryptoServicePurpose) {
        this.xBuf = new byte[4];
        this.purpose = cryptoServicePurpose;
        this.xBufOff = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public GeneralDigest(GeneralDigest generalDigest) {
        this.xBuf = new byte[4];
        this.purpose = generalDigest.purpose;
        copyIn(generalDigest);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void copyIn(GeneralDigest generalDigest) {
        byte[] bArr = generalDigest.xBuf;
        System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
        this.xBufOff = generalDigest.xBufOff;
        this.byteCount = generalDigest.byteCount;
    }

    protected abstract CryptoServiceProperties cryptoServiceProperties();

    public void finish() {
        long j = this.byteCount;
        byte b = Byte.MIN_VALUE;
        while (true) {
            update(b);
            if (this.xBufOff == 0) {
                processLength(j << 3);
                processBlock();
                return;
            }
            b = 0;
        }
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    protected abstract void processBlock();

    protected abstract void processLength(long j);

    protected abstract void processWord(byte[] bArr, int i);

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.byteCount = 0L;
        this.xBufOff = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.xBuf;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        byte[] bArr = this.xBuf;
        int i = this.xBufOff;
        int i2 = i + 1;
        this.xBufOff = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            processWord(bArr, 0);
            this.xBufOff = 0;
        }
        this.byteCount++;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        if (this.xBufOff != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= max) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.xBuf;
                int i5 = this.xBufOff;
                int i6 = i5 + 1;
                this.xBufOff = i6;
                int i7 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (i6 == 4) {
                    processWord(bArr2, 0);
                    this.xBufOff = 0;
                    i3 = i7;
                    break;
                }
                i4 = i7;
            }
        }
        while (i3 < max - 3) {
            processWord(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < max) {
            byte[] bArr3 = this.xBuf;
            int i8 = this.xBufOff;
            this.xBufOff = i8 + 1;
            bArr3[i8] = bArr[i3 + i];
            i3++;
        }
        this.byteCount += max;
    }
}
