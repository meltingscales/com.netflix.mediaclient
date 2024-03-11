package o;

import android.webkit.WebSettings;

/* renamed from: o.dge  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8240dge {
    public static final C8240dge d = new C8240dge();

    private C8240dge() {
    }

    public final void a(WebSettings webSettings) {
        C8632dsu.c((Object) webSettings, "");
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(false);
        webSettings.setBuiltInZoomControls(false);
        webSettings.setAllowFileAccess(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
        webSettings.setSupportMultipleWindows(false);
        webSettings.setAllowContentAccess(false);
        webSettings.setSaveFormData(false);
        webSettings.setSavePassword(false);
    }
}
