package org.chromium.net.urlconnection;

import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class CronetFixedModeOutputStream extends CronetOutputStream {
    private static int sDefaultBufferLength = 16384;
    private final ByteBuffer mBuffer;
    private long mBytesWritten;
    private final CronetHttpURLConnection mConnection;
    private final long mContentLength;
    private final MessageLoop mMessageLoop;
    private final UploadDataProvider mUploadDataProvider = new UploadDataProviderImpl();

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
    public CronetFixedModeOutputStream(CronetHttpURLConnection cronetHttpURLConnection, long j, MessageLoop messageLoop) {
        cronetHttpURLConnection.getClass();
        if (j < 0) {
            throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
        }
        this.mContentLength = j;
        this.mBuffer = ByteBuffer.allocate((int) Math.min(j, sDefaultBufferLength));
        this.mConnection = cronetHttpURLConnection;
        this.mMessageLoop = messageLoop;
        this.mBytesWritten = 0L;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        checkNotClosed();
        checkNotExceedContentLength(1);
        ensureBufferHasRemaining();
        this.mBuffer.put((byte) i);
        this.mBytesWritten++;
        uploadIfComplete();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        checkNotClosed();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        checkNotExceedContentLength(i2);
        int i3 = i2;
        while (i3 > 0) {
            ensureBufferHasRemaining();
            int min = Math.min(i3, this.mBuffer.remaining());
            this.mBuffer.put(bArr, (i + i2) - i3, min);
            i3 -= min;
        }
        this.mBytesWritten += i2;
        uploadIfComplete();
    }

    private void ensureBufferHasRemaining() {
        if (this.mBuffer.hasRemaining()) {
            return;
        }
        uploadBufferInternal();
    }

    private void uploadIfComplete() {
        if (this.mBytesWritten == this.mContentLength) {
            uploadBufferInternal();
        }
    }

    private void uploadBufferInternal() {
        checkNotClosed();
        ByteBuffer byteBuffer = (ByteBuffer) this.mBuffer.flip();
        this.mMessageLoop.loop();
        checkNoException();
    }

    private void checkNotExceedContentLength(int i) {
        long j = this.mBytesWritten;
        long j2 = this.mContentLength;
        if (i + j <= j2) {
            return;
        }
        throw new ProtocolException("expected " + (j2 - j) + " bytes but received " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.chromium.net.urlconnection.CronetOutputStream
    public void checkReceivedEnoughContent() {
        if (this.mBytesWritten < this.mContentLength) {
            throw new ProtocolException("Content received is less than Content-Length.");
        }
    }

    /* loaded from: classes6.dex */
    class UploadDataProviderImpl extends UploadDataProvider {
        private UploadDataProviderImpl() {
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return CronetFixedModeOutputStream.this.mContentLength;
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() >= CronetFixedModeOutputStream.this.mBuffer.remaining()) {
                byteBuffer.put(CronetFixedModeOutputStream.this.mBuffer);
                ByteBuffer byteBuffer2 = (ByteBuffer) CronetFixedModeOutputStream.this.mBuffer.clear();
                uploadDataSink.onReadSucceeded(false);
                CronetFixedModeOutputStream.this.mMessageLoop.quit();
                return;
            }
            int limit = CronetFixedModeOutputStream.this.mBuffer.limit();
            ByteBuffer byteBuffer3 = (ByteBuffer) CronetFixedModeOutputStream.this.mBuffer.limit(CronetFixedModeOutputStream.this.mBuffer.position() + byteBuffer.remaining());
            byteBuffer.put(CronetFixedModeOutputStream.this.mBuffer);
            ByteBuffer byteBuffer4 = (ByteBuffer) CronetFixedModeOutputStream.this.mBuffer.limit(limit);
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
        }
    }
}
