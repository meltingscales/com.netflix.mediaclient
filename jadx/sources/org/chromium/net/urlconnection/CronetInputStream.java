package org.chromium.net.urlconnection;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.linphone.core.Privacy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class CronetInputStream extends InputStream {
    private ByteBuffer mBuffer;
    private IOException mException;
    private final CronetHttpURLConnection mHttpURLConnection;
    private boolean mResponseDataCompleted;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setResponseDataCompleted(IOException iOException) {
        this.mException = iOException;
        this.mResponseDataCompleted = true;
        this.mBuffer = null;
    }

    public CronetInputStream(CronetHttpURLConnection cronetHttpURLConnection) {
        this.mHttpURLConnection = cronetHttpURLConnection;
    }

    @Override // java.io.InputStream
    public int read() {
        getMoreDataIfNeeded();
        if (hasUnreadData()) {
            return this.mBuffer.get() & 255;
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
        getMoreDataIfNeeded();
        if (hasUnreadData()) {
            int min = Math.min(this.mBuffer.limit() - this.mBuffer.position(), i2);
            this.mBuffer.get(bArr, i, min);
            return min;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int available() {
        if (!this.mResponseDataCompleted) {
            if (hasUnreadData()) {
                return this.mBuffer.remaining();
            }
            return 0;
        }
        IOException iOException = this.mException;
        if (iOException == null) {
            return 0;
        }
        throw iOException;
    }

    private void getMoreDataIfNeeded() {
        if (this.mResponseDataCompleted) {
            IOException iOException = this.mException;
            if (iOException != null) {
                throw iOException;
            }
        } else if (hasUnreadData()) {
        } else {
            if (this.mBuffer == null) {
                this.mBuffer = ByteBuffer.allocateDirect(Privacy.DEFAULT);
            }
            ByteBuffer byteBuffer = (ByteBuffer) this.mBuffer.clear();
            this.mHttpURLConnection.getMoreData(this.mBuffer);
            IOException iOException2 = this.mException;
            if (iOException2 != null) {
                throw iOException2;
            }
            ByteBuffer byteBuffer2 = this.mBuffer;
            if (byteBuffer2 != null) {
                ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer2.flip();
            }
        }
    }

    private boolean hasUnreadData() {
        ByteBuffer byteBuffer = this.mBuffer;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }
}
