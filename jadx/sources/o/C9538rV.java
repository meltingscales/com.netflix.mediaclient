package o;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: o.rV  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9538rV extends OutputStream {
    protected final ByteBuffer e;

    public C9538rV(ByteBuffer byteBuffer) {
        this.e = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.e.put((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.e.put(bArr, i, i2);
    }
}
