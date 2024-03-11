package org.chromium.net.urlconnection;

import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class CronetBufferedOutputStream extends CronetOutputStream {
    private ByteBuffer mBuffer;
    private boolean mConnected;
    private final CronetHttpURLConnection mConnection;
    private final int mInitialContentLength;
    private final UploadDataProvider mUploadDataProvider = new UploadDataProviderImpl();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.chromium.net.urlconnection.CronetOutputStream
    public void checkReceivedEnoughContent() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.chromium.net.urlconnection.CronetOutputStream
    public UploadDataProvider getUploadDataProvider() {
        return this.mUploadDataProvider;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CronetBufferedOutputStream(CronetHttpURLConnection cronetHttpURLConnection, long j) {
        if (cronetHttpURLConnection == null) {
            throw new NullPointerException("Argument connection cannot be null.");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        }
        if (j < 0) {
            throw new IllegalArgumentException("Content length < 0.");
        }
        this.mConnection = cronetHttpURLConnection;
        int i = (int) j;
        this.mInitialContentLength = i;
        this.mBuffer = ByteBuffer.allocate(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CronetBufferedOutputStream(CronetHttpURLConnection cronetHttpURLConnection) {
        cronetHttpURLConnection.getClass();
        this.mConnection = cronetHttpURLConnection;
        this.mInitialContentLength = -1;
        this.mBuffer = ByteBuffer.allocate(16384);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        checkNotClosed();
        ensureCanWrite(1);
        this.mBuffer.put((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        checkNotClosed();
        ensureCanWrite(i2);
        this.mBuffer.put(bArr, i, i2);
    }

    private void ensureCanWrite(int i) {
        if (this.mInitialContentLength != -1) {
            int position = this.mBuffer.position() + i;
            int i2 = this.mInitialContentLength;
            if (position > i2) {
                throw new ProtocolException("exceeded content-length limit of " + i2 + " bytes");
            }
        }
        if (this.mConnected) {
            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for writing after connect");
        }
        if (this.mInitialContentLength == -1 && this.mBuffer.limit() - this.mBuffer.position() <= i) {
            ByteBuffer allocate = ByteBuffer.allocate(Math.max(this.mBuffer.capacity() * 2, this.mBuffer.capacity() + i));
            ByteBuffer byteBuffer = (ByteBuffer) this.mBuffer.flip();
            allocate.put(this.mBuffer);
            this.mBuffer = allocate;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.chromium.net.urlconnection.CronetOutputStream
    public void setConnected() {
        this.mConnected = true;
        if (this.mBuffer.position() < this.mInitialContentLength) {
            throw new ProtocolException("Content received is less than Content-Length");
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.mBuffer.flip();
    }

    /* loaded from: classes6.dex */
    class UploadDataProviderImpl extends UploadDataProvider {
        private UploadDataProviderImpl() {
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            if (CronetBufferedOutputStream.this.mInitialContentLength == -1) {
                return CronetBufferedOutputStream.this.mConnected ? CronetBufferedOutputStream.this.mBuffer.limit() : CronetBufferedOutputStream.this.mBuffer.position();
            }
            return CronetBufferedOutputStream.this.mInitialContentLength;
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (remaining < CronetBufferedOutputStream.this.mBuffer.remaining()) {
                byteBuffer.put(CronetBufferedOutputStream.this.mBuffer.array(), CronetBufferedOutputStream.this.mBuffer.position(), remaining);
                ByteBuffer byteBuffer2 = (ByteBuffer) CronetBufferedOutputStream.this.mBuffer.position(CronetBufferedOutputStream.this.mBuffer.position() + remaining);
            } else {
                byteBuffer.put(CronetBufferedOutputStream.this.mBuffer);
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            ByteBuffer byteBuffer = (ByteBuffer) CronetBufferedOutputStream.this.mBuffer.position(0);
            uploadDataSink.onRewindSucceeded();
        }
    }
}
