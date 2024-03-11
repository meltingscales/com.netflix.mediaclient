package org.chromium.net.urlconnection;

import java.io.IOException;
import java.io.OutputStream;
import org.chromium.net.UploadDataProvider;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public abstract class CronetOutputStream extends OutputStream {
    private boolean mClosed;
    private IOException mException;
    private boolean mRequestCompleted;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void checkReceivedEnoughContent();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mClosed = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract UploadDataProvider getUploadDataProvider();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void setConnected();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setRequestCompleted(IOException iOException) {
        this.mException = iOException;
        this.mRequestCompleted = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void checkNotClosed() {
        if (this.mRequestCompleted) {
            checkNoException();
            throw new IOException("Writing after request completed.");
        } else if (this.mClosed) {
            throw new IOException("Stream has been closed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void checkNoException() {
        IOException iOException = this.mException;
        if (iOException != null) {
            throw iOException;
        }
    }
}
