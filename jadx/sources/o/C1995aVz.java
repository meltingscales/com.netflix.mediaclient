package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.core.content.ContextCompat;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.aVz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1995aVz {
    public static final C1995aVz a = new C1995aVz();

    private C1995aVz() {
    }

    private final Network e(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetwork();
        }
        return null;
    }

    public final List<InetAddress> b(Context context) {
        List<InetAddress> i;
        List<InetAddress> i2;
        LinkProperties linkProperties;
        C8632dsu.c((Object) context, "");
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class);
        Network e = e(connectivityManager);
        if (e == null) {
            i = C8569dql.i();
            return i;
        }
        List<InetAddress> dnsServers = (connectivityManager == null || (linkProperties = connectivityManager.getLinkProperties(e)) == null) ? null : linkProperties.getDnsServers();
        if (dnsServers == null) {
            i2 = C8569dql.i();
            return i2;
        }
        return dnsServers;
    }

    public final boolean e(Context context) {
        C8632dsu.c((Object) context, "");
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class);
        Network[] allNetworks = connectivityManager != null ? connectivityManager.getAllNetworks() : null;
        if (allNetworks != null) {
            if (!(allNetworks.length == 0)) {
                Iterator b = C8621dsj.b(allNetworks);
                while (b.hasNext()) {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities((Network) b.next());
                    if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
