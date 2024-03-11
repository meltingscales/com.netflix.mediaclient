package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.linphone.core.Privacy;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.aIg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1626aIg extends InputStream {
    private final C1627aIh b;
    private boolean c;
    private IOException d;
    private ByteBuffer e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(IOException iOException) {
        this.d = iOException;
        this.c = true;
        this.e = null;
    }

    public C1626aIg(C1627aIh c1627aIh) {
        this.b = c1627aIh;
    }

    @Override // java.io.InputStream
    public int read() {
        c();
        if (a()) {
            return this.e.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        c();
        if (a()) {
            int min = Math.min(this.e.limit() - this.e.position(), i2);
            this.e.get(bArr, i, min);
            return min;
        }
        return -1;
    }

    private void c() {
        if (this.c) {
            IOException iOException = this.d;
            if (iOException != null) {
                throw iOException;
            }
        } else if (a()) {
        } else {
            if (this.e == null) {
                this.e = ByteBuffer.allocateDirect(Privacy.DEFAULT);
            }
            this.e.clear();
            this.b.d(this.e);
            IOException iOException2 = this.d;
            if (iOException2 != null) {
                throw iOException2;
            }
            ByteBuffer byteBuffer = this.e;
            if (byteBuffer != null) {
                byteBuffer.flip();
            }
        }
    }

    private boolean a() {
        ByteBuffer byteBuffer = this.e;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }
}
