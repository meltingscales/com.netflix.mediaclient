package o;

import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.aIc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1622aIc extends AbstractC1625aIf {
    private final C1627aIh a;
    private final UploadDataProvider b = new a();
    private boolean c = false;
    private final ExecutorC1629aIj d;
    private final ByteBuffer e;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC1625aIf
    public void a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC1625aIf
    public void b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC1625aIf
    public UploadDataProvider e() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1622aIc(C1627aIh c1627aIh, int i, ExecutorC1629aIj executorC1629aIj) {
        c1627aIh.getClass();
        if (i <= 0) {
            throw new IllegalArgumentException("chunkLength should be greater than 0");
        }
        this.e = ByteBuffer.allocate(i);
        this.a = c1627aIh;
        this.d = executorC1629aIj;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        h();
        this.e.put((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        d();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, this.e.remaining());
            this.e.put(bArr, (i + i2) - i3, min);
            i3 -= min;
            if (!C1865aRc.m() || i3 > 0) {
                h();
            }
        }
    }

    @Override // o.AbstractC1625aIf, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        if (this.c) {
            return;
        }
        this.c = true;
        this.e.flip();
    }

    /* renamed from: o.aIc$a */
    /* loaded from: classes3.dex */
    class a extends UploadDataProvider {
        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return -1L;
        }

        private a() {
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() >= C1622aIc.this.e.remaining()) {
                byteBuffer.put(C1622aIc.this.e);
                C1622aIc.this.e.clear();
                uploadDataSink.onReadSucceeded(C1622aIc.this.c);
                if (C1622aIc.this.c) {
                    return;
                }
                C1622aIc.this.d.d();
                return;
            }
            int limit = C1622aIc.this.e.limit();
            C1622aIc.this.e.limit(C1622aIc.this.e.position() + byteBuffer.remaining());
            byteBuffer.put(C1622aIc.this.e);
            C1622aIc.this.e.limit(limit);
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
        }
    }

    private void h() {
        if (this.e.hasRemaining()) {
            return;
        }
        i();
    }

    private void i() {
        d();
        this.e.flip();
        this.d.c();
        c();
    }
}
