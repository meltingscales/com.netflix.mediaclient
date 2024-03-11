package o;

import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class aHZ extends AbstractC1625aIf {
    private ByteBuffer b;
    private final C1627aIh c;
    private final int d;
    private final UploadDataProvider a = new e();
    private boolean e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC1625aIf
    public void a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC1625aIf
    public UploadDataProvider e() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aHZ(C1627aIh c1627aIh, long j) {
        if (c1627aIh == null) {
            throw new NullPointerException("Argument connection cannot be null.");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        }
        if (j < 0) {
            throw new IllegalArgumentException("Content length < 0.");
        }
        this.c = c1627aIh;
        int i = (int) j;
        this.d = i;
        this.b = ByteBuffer.allocate(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aHZ(C1627aIh c1627aIh) {
        c1627aIh.getClass();
        this.c = c1627aIh;
        this.d = -1;
        this.b = ByteBuffer.allocate(16384);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        d();
        c(1);
        this.b.put((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        d();
        c(i2);
        this.b.put(bArr, i, i2);
    }

    private void c(int i) {
        if (this.d != -1 && this.b.position() + i > this.d) {
            throw new ProtocolException("exceeded content-length limit of " + this.d + " bytes");
        } else if (this.e) {
            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for writing after connect");
        } else {
            if (this.d == -1 && this.b.limit() - this.b.position() <= i) {
                ByteBuffer allocate = ByteBuffer.allocate(Math.max(this.b.capacity() * 2, this.b.capacity() + i));
                this.b.flip();
                allocate.put(this.b);
                this.b = allocate;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC1625aIf
    public void b() {
        this.e = true;
        if (this.b.position() < this.d) {
            throw new ProtocolException("Content received is less than Content-Length");
        }
        this.b.flip();
    }

    /* loaded from: classes3.dex */
    class e extends UploadDataProvider {
        private e() {
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            if (aHZ.this.d == -1) {
                return aHZ.this.e ? aHZ.this.b.limit() : aHZ.this.b.position();
            }
            return aHZ.this.d;
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (remaining < aHZ.this.b.remaining()) {
                byteBuffer.put(aHZ.this.b.array(), aHZ.this.b.position(), remaining);
                aHZ.this.b.position(aHZ.this.b.position() + remaining);
            } else {
                byteBuffer.put(aHZ.this.b);
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            aHZ.this.b.position(0);
            uploadDataSink.onRewindSucceeded();
        }
    }
}
