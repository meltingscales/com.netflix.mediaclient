package com.google.android.play.core.assetpacks.internal;

import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes5.dex */
public abstract class an implements Closeable {
    public abstract long a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract InputStream b(long j, long j2);

    public final InputStream c() {
        InputStream b;
        synchronized (this) {
            b = b(0L, a());
        }
        return b;
    }
}
