package org.chromium.net.urlconnection;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import org.chromium.net.ExperimentalCronetEngine;

/* loaded from: classes6.dex */
public class CronetURLStreamHandlerFactory implements URLStreamHandlerFactory {
    private final ExperimentalCronetEngine mCronetEngine;

    public CronetURLStreamHandlerFactory(ExperimentalCronetEngine experimentalCronetEngine) {
        if (experimentalCronetEngine == null) {
            throw new NullPointerException("CronetEngine is null.");
        }
        this.mCronetEngine = experimentalCronetEngine;
    }

    @Override // java.net.URLStreamHandlerFactory
    public URLStreamHandler createURLStreamHandler(String str) {
        if ("http".equals(str) || "https".equals(str)) {
            return new CronetHttpURLStreamHandler(this.mCronetEngine);
        }
        return null;
    }
}
