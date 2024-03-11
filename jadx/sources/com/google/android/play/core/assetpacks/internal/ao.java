package com.google.android.play.core.assetpacks.internal;

import java.io.InputStream;

/* loaded from: classes5.dex */
public final class ao extends an {
    private final an a;
    private final long b;
    private final long c;

    public ao(an anVar, long j, long j2) {
        this.a = anVar;
        long d = d(j);
        this.b = d;
        this.c = d(d + j2);
    }

    private final long d(long j) {
        if (j < 0) {
            return 0L;
        }
        return j > this.a.a() ? this.a.a() : j;
    }

    @Override // com.google.android.play.core.assetpacks.internal.an
    public final long a() {
        return this.c - this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.core.assetpacks.internal.an
    public final InputStream b(long j, long j2) {
        long d = d(this.b);
        return this.a.b(d, d(j2 + d) - d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
