package o;

import com.netflix.model.leafs.ArtworkColors;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: o.sG  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9575sG extends FilterInputStream {
    private final int a;
    private C9579sL d;
    private byte[] f;
    private byte[] g;
    private byte[] h;
    private int i;
    private int[] j;
    private int l;
    private int m;

    /* renamed from: o  reason: collision with root package name */
    private int f13901o;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public C9575sG(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) {
        super(new BufferedInputStream(inputStream, 4096));
        this.l = Integer.MAX_VALUE;
        int min = Math.min(Math.max(i, 3), 16);
        this.a = min;
        this.g = new byte[8];
        byte[] bArr2 = new byte[8];
        this.f = bArr2;
        this.h = new byte[8];
        this.j = new int[2];
        this.i = 8;
        this.f13901o = 8;
        this.m = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.d = new C9579sL(iArr, min, true, z);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        b();
        int i = this.i;
        if (i >= this.f13901o) {
            return -1;
        }
        byte[] bArr = this.g;
        this.i = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            b();
            int i5 = this.i;
            if (i5 >= this.f13901o) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.g;
            this.i = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        b();
        return this.f13901o - this.i;
    }

    private void a() {
        if (this.m == 2) {
            byte[] bArr = this.g;
            System.arraycopy(bArr, 0, this.h, 0, bArr.length);
        }
        byte[] bArr2 = this.g;
        C9582sO.e(((bArr2[0] << 24) & ArtworkColors.DEFAULT_BACKGROUND_COLOR) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255), ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255), false, this.a, this.d.b, this.d.d, this.j);
        int[] iArr = this.j;
        int i = iArr[0];
        int i2 = iArr[1];
        byte[] bArr3 = this.g;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.m == 2) {
            c();
            byte[] bArr4 = this.h;
            System.arraycopy(bArr4, 0, this.f, 0, bArr4.length);
        }
    }

    private void c() {
        for (int i = 0; i < 8; i++) {
            byte[] bArr = this.g;
            bArr[i] = (byte) (bArr[i] ^ this.f[i]);
        }
    }

    private int b() {
        if (this.l == Integer.MAX_VALUE) {
            this.l = this.in.read();
        }
        if (this.i == 8) {
            byte[] bArr = this.g;
            int i = this.l;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = this.in.read(this.g, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            a();
            int read2 = this.in.read();
            this.l = read2;
            this.i = 0;
            this.f13901o = read2 < 0 ? 8 - (this.g[7] & 255) : 8;
        }
        return this.f13901o;
    }
}
