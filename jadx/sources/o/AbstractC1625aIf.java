package o;

import java.io.IOException;
import java.io.OutputStream;
import org.chromium.net.UploadDataProvider;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.aIf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1625aIf extends OutputStream {
    private boolean a;
    private boolean b;
    private IOException d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(IOException iOException) {
        this.d = iOException;
        this.b = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract UploadDataProvider e();

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        if (this.b) {
            c();
            throw new IOException("Writing after request completed.");
        } else if (this.a) {
            throw new IOException("Stream has been closed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        IOException iOException = this.d;
        if (iOException != null) {
            throw iOException;
        }
    }
}
