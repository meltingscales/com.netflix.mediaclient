package o;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: o.rQ  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9533rQ extends InputStream {
    protected final ByteBuffer b;

    public C9533rQ(ByteBuffer byteBuffer) {
        this.b = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.b.remaining();
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.b.hasRemaining()) {
            return this.b.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.b.hasRemaining()) {
            int min = Math.min(i2, this.b.remaining());
            this.b.get(bArr, i, min);
            return min;
        }
        return -1;
    }
}
