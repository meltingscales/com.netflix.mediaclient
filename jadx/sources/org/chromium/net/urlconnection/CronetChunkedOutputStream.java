package org.chromium.net.urlconnection;

import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class CronetChunkedOutputStream extends CronetOutputStream {
    private final ByteBuffer mBuffer;
    private final CronetHttpURLConnection mConnection;
    private boolean mLastChunk;
    private final MessageLoop mMessageLoop;
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
    @Override // org.chromium.net.urlconnection.CronetOutputStream
    public void setConnected() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CronetChunkedOutputStream(CronetHttpURLConnection cronetHttpURLConnection, int i, MessageLoop messageLoop) {
        cronetHttpURLConnection.getClass();
        if (i <= 0) {
            throw new IllegalArgumentException("chunkLength should be greater than 0");
        }
        this.mBuffer = ByteBuffer.allocate(i);
        this.mConnection = cronetHttpURLConnection;
        this.mMessageLoop = messageLoop;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        ensureBufferHasRemaining();
        this.mBuffer.put((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        checkNotClosed();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, this.mBuffer.remaining());
            this.mBuffer.put(bArr, (i + i2) - i3, min);
            i3 -= min;
            ensureBufferHasRemaining();
        }
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        if (this.mLastChunk) {
            return;
        }
        this.mLastChunk = true;
        ByteBuffer byteBuffer = (ByteBuffer) this.mBuffer.flip();
    }

    /* loaded from: classes6.dex */
    class UploadDataProviderImpl extends UploadDataProvider {
        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return -1L;
        }

        private UploadDataProviderImpl() {
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() >= CronetChunkedOutputStream.this.mBuffer.remaining()) {
                byteBuffer.put(CronetChunkedOutputStream.this.mBuffer);
                ByteBuffer byteBuffer2 = (ByteBuffer) CronetChunkedOutputStream.this.mBuffer.clear();
                uploadDataSink.onReadSucceeded(CronetChunkedOutputStream.this.mLastChunk);
                if (CronetChunkedOutputStream.this.mLastChunk) {
                    return;
                }
                CronetChunkedOutputStream.this.mMessageLoop.quit();
                return;
            }
            int limit = CronetChunkedOutputStream.this.mBuffer.limit();
            ByteBuffer byteBuffer3 = (ByteBuffer) CronetChunkedOutputStream.this.mBuffer.limit(CronetChunkedOutputStream.this.mBuffer.position() + byteBuffer.remaining());
            byteBuffer.put(CronetChunkedOutputStream.this.mBuffer);
            ByteBuffer byteBuffer4 = (ByteBuffer) CronetChunkedOutputStream.this.mBuffer.limit(limit);
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
        }
    }

    private void ensureBufferHasRemaining() {
        if (this.mBuffer.hasRemaining()) {
            return;
        }
        uploadBufferInternal();
    }

    private void uploadBufferInternal() {
        checkNotClosed();
        ByteBuffer byteBuffer = (ByteBuffer) this.mBuffer.flip();
        this.mMessageLoop.loop();
        checkNoException();
    }
}
