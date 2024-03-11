package o;

import java.io.ByteArrayOutputStream;

/* renamed from: o.dry  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C8609dry extends ByteArrayOutputStream {
    public C8609dry(int i) {
        super(i);
    }

    public final byte[] d() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        C8632dsu.a(bArr, "");
        return bArr;
    }
}
