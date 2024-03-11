package o;

import java.io.DataOutput;
import java.io.OutputStream;

/* renamed from: o.oi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9392oi extends OutputStream {
    protected final DataOutput d;

    public C9392oi(DataOutput dataOutput) {
        this.d = dataOutput;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.d.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.d.write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.d.write(bArr, i, i2);
    }
}
