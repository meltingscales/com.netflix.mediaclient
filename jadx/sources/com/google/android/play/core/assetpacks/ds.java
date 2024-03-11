package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* loaded from: classes5.dex */
final class ds {
    private byte[] a = new byte[4096];
    private int b;
    private long c;
    private long d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private String i;

    public ds() {
        d();
    }

    private final int e(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.b;
        if (i4 < i) {
            int min = Math.min(i3, i - i4);
            System.arraycopy(bArr, i2, this.a, this.b, min);
            int i5 = this.b + min;
            this.b = i5;
            if (i5 < i) {
                return -1;
            }
            return min;
        }
        return 0;
    }

    public final int a() {
        return this.f;
    }

    public final int b(byte[] bArr, int i, int i2) {
        int e = e(30, bArr, i, i2);
        if (e != -1) {
            if (this.c == -1) {
                long c = br.c(this.a, 0);
                this.c = c;
                if (c == 67324752) {
                    this.h = false;
                    this.d = br.c(this.a, 18);
                    this.g = br.a(this.a, 8);
                    this.e = br.a(this.a, 26);
                    int a = this.e + 30 + br.a(this.a, 28);
                    this.f = a;
                    int length = this.a.length;
                    if (length < a) {
                        do {
                            length += length;
                        } while (length < a);
                        this.a = Arrays.copyOf(this.a, length);
                    }
                } else {
                    this.h = true;
                }
            }
            int e2 = e(this.f, bArr, i + e, i2 - e);
            if (e2 == -1) {
                return -1;
            }
            if (!this.h && this.i == null) {
                this.i = new String(this.a, 30, this.e);
            }
            return e + e2;
        }
        return -1;
    }

    public final eu c() {
        int i = this.b;
        int i2 = this.f;
        if (i < i2) {
            return new bq(this.i, this.d, this.g, true, this.h, Arrays.copyOf(this.a, i));
        }
        bq bqVar = new bq(this.i, this.d, this.g, false, this.h, Arrays.copyOf(this.a, i2));
        d();
        return bqVar;
    }

    public final void d() {
        this.b = 0;
        this.e = -1;
        this.c = -1L;
        this.h = false;
        this.f = 30;
        this.d = -1L;
        this.g = -1;
        this.i = null;
    }
}
