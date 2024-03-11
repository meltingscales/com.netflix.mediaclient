package o;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: o.bmo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4806bmo extends UploadDataProvider {
    private final byte[] c;
    private int d;

    public C4806bmo(byte[] bArr) {
        this.c = bArr;
    }

    @Override // org.chromium.net.UploadDataProvider
    public long getLength() {
        return this.c.length;
    }

    @Override // org.chromium.net.UploadDataProvider
    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int min = Math.min(byteBuffer.remaining(), this.c.length - this.d);
        byteBuffer.put(this.c, this.d, min);
        this.d += min;
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public void rewind(UploadDataSink uploadDataSink) {
        this.d = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
