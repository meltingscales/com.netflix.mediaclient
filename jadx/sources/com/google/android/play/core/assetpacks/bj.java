package com.google.android.play.core.assetpacks;

import java.io.InputStream;

/* loaded from: classes5.dex */
final class bj extends InputStream {
    private final InputStream a;
    private long b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bj(InputStream inputStream, long j) {
        this.a = inputStream;
        this.b = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.a.close();
        this.b = 0L;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.b;
        if (j <= 0) {
            return -1;
        }
        this.b = j - 1;
        return this.a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.b;
        if (j <= 0) {
            return -1;
        }
        int read = this.a.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.b -= read;
        }
        return read;
    }
}
