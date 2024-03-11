package org.xbill.DNS.config;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes5.dex */
public class AndroidResolverConfigProvider extends BaseResolverConfigProvider {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(AndroidResolverConfigProvider.class);
    private static Context context = null;

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public void initialize() {
        LinkProperties linkProperties;
        Context context2 = context;
        if (context2 == null) {
            throw new InitializationException("Context must be initialized by calling setContext");
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService(ConnectivityManager.class);
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) == null) {
            return;
        }
        for (InetAddress inetAddress : linkProperties.getDnsServers()) {
            addNameserver(new InetSocketAddress(inetAddress, 53));
        }
        parseSearchPathList(linkProperties.getDomains(), ",");
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public boolean isEnabled() {
        return System.getProperty("java.vendor").contains("Android");
    }
}
