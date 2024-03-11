package o;

import java.io.BufferedInputStream;
import java.io.InputStream;

/* renamed from: o.sK  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9578sK extends BufferedInputStream {
    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public C9578sK(InputStream inputStream) {
        super(inputStream);
    }
}
