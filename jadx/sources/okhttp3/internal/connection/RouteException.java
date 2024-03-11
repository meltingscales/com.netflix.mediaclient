package okhttp3.internal.connection;

import java.io.IOException;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class RouteException extends RuntimeException {
    private final IOException b;
    private IOException d;

    public final IOException c() {
        return this.d;
    }

    public final IOException d() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException iOException) {
        super(iOException);
        C8632dsu.d(iOException, "");
        this.b = iOException;
        this.d = iOException;
    }

    public final void b(IOException iOException) {
        C8632dsu.d(iOException, "");
        this.b.addSuppressed(iOException);
        this.d = iOException;
    }
}
