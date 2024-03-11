package com.netflix.mediaclient.acquisition.util;

import android.webkit.CookieManager;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class WebViewLogger {
    private String previousReadCookies = getCurrentReadCookies();
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes3.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("WebViewLogger");
        }
    }

    public WebViewLogger() {
        Companion.getLogTag();
    }

    private final String getCurrentReadCookies() {
        return CookieManager.getInstance().getCookie("https://netflix.com");
    }

    public final void onLoadResource(String str) {
        Companion companion = Companion;
        companion.getLogTag();
        if (C8632dsu.c((Object) this.previousReadCookies, (Object) getCurrentReadCookies())) {
            return;
        }
        companion.getLogTag();
        this.previousReadCookies = getCurrentReadCookies();
    }
}
