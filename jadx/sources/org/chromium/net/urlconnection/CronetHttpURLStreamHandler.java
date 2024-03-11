package org.chromium.net.urlconnection;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import org.chromium.net.ExperimentalCronetEngine;

/* loaded from: classes6.dex */
class CronetHttpURLStreamHandler extends URLStreamHandler {
    private final ExperimentalCronetEngine mCronetEngine;

    public CronetHttpURLStreamHandler(ExperimentalCronetEngine experimentalCronetEngine) {
        this.mCronetEngine = experimentalCronetEngine;
    }

    @Override // java.net.URLStreamHandler
    public URLConnection openConnection(URL url) {
        return this.mCronetEngine.openConnection(url);
    }

    @Override // java.net.URLStreamHandler
    public URLConnection openConnection(URL url, Proxy proxy) {
        return this.mCronetEngine.openConnection(url, proxy);
    }
}
