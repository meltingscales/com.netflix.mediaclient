package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes5.dex */
final class bw extends FilterInputStream {
    private final ds a;
    private byte[] b;
    private long c;
    private boolean d;
    private boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bw(InputStream inputStream) {
        super(inputStream);
        this.a = new ds();
        this.b = new byte[4096];
        this.d = false;
        this.e = false;
    }

    private final int e(byte[] bArr, int i, int i2) {
        return Math.max(0, super.read(bArr, i, i2));
    }

    private final boolean f(int i) {
        int e = e(this.b, 0, i);
        if (e != i) {
            int i2 = i - e;
            if (e(this.b, e, i2) != i2) {
                this.a.b(this.b, 0, e);
                return false;
            }
        }
        this.a.b(this.b, 0, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final eu b() {
        byte[] bArr;
        if (this.c > 0) {
            do {
                bArr = this.b;
            } while (read(bArr, 0, bArr.length) != -1);
            if (!this.d || this.e) {
                return new bq(null, -1L, -1, false, false, null);
            }
            if (!f(30)) {
                this.d = true;
                return this.a.c();
            }
            eu c = this.a.c();
            if (c.d()) {
                this.e = true;
                return c;
            } else if (c.b() != 4294967295L) {
                int a = this.a.a() - 30;
                int length = this.b.length;
                long j = a;
                if (j > length) {
                    do {
                        length += length;
                    } while (length < j);
                    this.b = Arrays.copyOf(this.b, length);
                }
                if (!f(a)) {
                    this.d = true;
                    return this.a.c();
                }
                eu c2 = this.a.c();
                this.c = c2.b();
                return c2;
            } else {
                throw new ck("Files bigger than 4GiB are not supported.");
            }
        }
        if (!this.d) {
        }
        return new bq(null, -1L, -1, false, false, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        return this.d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.c;
        if (j <= 0 || this.d) {
            return -1;
        }
        int e = e(bArr, i, (int) Math.min(j, i2));
        this.c -= e;
        if (e == 0) {
            this.d = true;
            return 0;
        }
        return e;
    }
}
