package o;

import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.aId  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1623aId extends AbstractC1625aIf {
    private static int d = 16384;
    private long a;
    private final C1627aIh b;
    private final ByteBuffer c;
    private final long e;
    private final UploadDataProvider h = new b();
    private final ExecutorC1629aIj i;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC1625aIf
    public void b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC1625aIf
    public UploadDataProvider e() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1623aId(C1627aIh c1627aIh, long j, ExecutorC1629aIj executorC1629aIj) {
        c1627aIh.getClass();
        if (j < 0) {
            throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
        }
        this.e = j;
        this.c = ByteBuffer.allocate((int) Math.min(j, d));
        this.b = c1627aIh;
        this.i = executorC1629aIj;
        this.a = 0L;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        d();
        e(1);
        g();
        this.c.put((byte) i);
        this.a++;
        i();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        d();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        e(i2);
        int i3 = i2;
        while (i3 > 0) {
            g();
            int min = Math.min(i3, this.c.remaining());
            this.c.put(bArr, (i + i2) - i3, min);
            i3 -= min;
        }
        this.a += i2;
        i();
    }

    private void g() {
        if (this.c.hasRemaining()) {
            return;
        }
        j();
    }

    private void i() {
        if (this.a == this.e) {
            j();
        }
    }

    private void j() {
        d();
        this.c.flip();
        this.i.c();
        c();
    }

    private void e(int i) {
        if (this.a + i <= this.e) {
            return;
        }
        throw new ProtocolException("expected " + (this.e - this.a) + " bytes but received " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC1625aIf
    public void a() {
        if (this.a < this.e) {
            throw new ProtocolException("Content received is less than Content-Length.");
        }
    }

    /* renamed from: o.aId$b */
    /* loaded from: classes3.dex */
    class b extends UploadDataProvider {
        private b() {
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return C1623aId.this.e;
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() >= C1623aId.this.c.remaining()) {
                byteBuffer.put(C1623aId.this.c);
                C1623aId.this.c.clear();
                uploadDataSink.onReadSucceeded(false);
                C1623aId.this.i.d();
                return;
            }
            int limit = C1623aId.this.c.limit();
            C1623aId.this.c.limit(C1623aId.this.c.position() + byteBuffer.remaining());
            byteBuffer.put(C1623aId.this.c);
            C1623aId.this.c.limit(limit);
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
        }
    }
}
