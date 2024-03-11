package o;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* loaded from: classes5.dex */
public final class dHW extends ProxySelector {
    public static final dHW e = new dHW();

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    private dHW() {
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        List<Proxy> e2;
        if (uri == null) {
            throw new IllegalArgumentException("uri must not be null".toString());
        }
        e2 = C8566dqi.e(Proxy.NO_PROXY);
        return e2;
    }
}
