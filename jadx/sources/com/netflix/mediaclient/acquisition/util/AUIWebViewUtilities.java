package com.netflix.mediaclient.acquisition.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.netflix.mediaclient.acquisition.util.AUIWebViewUtilities;
import o.C1332Xp;
import o.C8054ddD;
import o.C8240dge;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes3.dex */
public final class AUIWebViewUtilities {
    public static final int $stable = 0;
    public static final AUIWebViewUtilities INSTANCE = new AUIWebViewUtilities();
    private static final String JAVASCRIPT_OBJECT_NAME = "__NETFLIX_ANDROID_BRIDGE__";

    private AUIWebViewUtilities() {
    }

    public static /* synthetic */ void initWebView$default(AUIWebViewUtilities aUIWebViewUtilities, WebView webView, BridgeMethodGroup bridgeMethodGroup, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            bridgeMethodGroup = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aUIWebViewUtilities.initWebView(webView, bridgeMethodGroup, z);
    }

    @SuppressLint({"JavascriptInterface"})
    public final void initWebView(final WebView webView, BridgeMethodGroup bridgeMethodGroup, boolean z) {
        C8632dsu.c((Object) webView, "");
        if (z) {
            webView.setWebViewClient(new WebViewClient() { // from class: com.netflix.mediaclient.acquisition.util.AUIWebViewUtilities$initWebView$1
                private final WebViewLogger webViewLogger = new WebViewLogger();

                @Override // android.webkit.WebViewClient
                public void onLoadResource(WebView webView2, String str) {
                    super.onLoadResource(webView2, str);
                    this.webViewLogger.onLoadResource(str);
                }

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView2, String str) {
                    super.onPageFinished(webView2, str);
                    webView.setVisibility(0);
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                    if (str == null || webView2 == null) {
                        return true;
                    }
                    webView2.loadUrl(str);
                    return true;
                }
            });
        }
        C8240dge c8240dge = C8240dge.d;
        WebSettings settings = webView.getSettings();
        C8632dsu.a(settings, "");
        c8240dge.a(settings);
        webView.addJavascriptInterface(new BridgeMethods.Common(), JAVASCRIPT_OBJECT_NAME);
        if (bridgeMethodGroup != null) {
            webView.addJavascriptInterface(bridgeMethodGroup, JAVASCRIPT_OBJECT_NAME);
        }
    }

    /* loaded from: classes3.dex */
    public static final class BridgeMethods {
        public static final int $stable = 0;
        public static final BridgeMethods INSTANCE = new BridgeMethods();

        private BridgeMethods() {
        }

        /* loaded from: classes3.dex */
        public static final class Common implements BridgeMethodGroup {
            public static final int $stable = 0;

            @JavascriptInterface
            public final void showToast(String str) {
                C8632dsu.c((Object) str, "");
                C8054ddD.a((Context) C1332Xp.b(Context.class), str, 0);
            }
        }

        /* loaded from: classes3.dex */
        public static final class VerifyCardWithMd implements BridgeMethodGroup {
            public static final int $stable = 8;
            private final Handler handler;
            private final drX<String, String, dpR> onReceivePaRes;

            /* JADX WARN: Multi-variable type inference failed */
            public VerifyCardWithMd(drX<? super String, ? super String, dpR> drx, Handler handler) {
                C8632dsu.c((Object) drx, "");
                C8632dsu.c((Object) handler, "");
                this.onReceivePaRes = drx;
                this.handler = handler;
            }

            public /* synthetic */ VerifyCardWithMd(drX drx, Handler handler, int i, C8627dsp c8627dsp) {
                this(drx, (i & 2) != 0 ? new Handler(Looper.getMainLooper()) : handler);
            }

            @JavascriptInterface
            public final void handleVerifyCardCallbackWithMd(final String str, final String str2) {
                this.handler.post(new Runnable() { // from class: com.netflix.mediaclient.acquisition.util.AUIWebViewUtilities$BridgeMethods$VerifyCardWithMd$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AUIWebViewUtilities.BridgeMethods.VerifyCardWithMd.handleVerifyCardCallbackWithMd$lambda$0(AUIWebViewUtilities.BridgeMethods.VerifyCardWithMd.this, str, str2);
                    }
                });
            }

            public static final void handleVerifyCardCallbackWithMd$lambda$0(VerifyCardWithMd verifyCardWithMd, String str, String str2) {
                C8632dsu.c((Object) verifyCardWithMd, "");
                verifyCardWithMd.onReceivePaRes.invoke(str, str2);
            }
        }

        /* loaded from: classes3.dex */
        public static final class Emvco implements BridgeMethodGroup {
            public static final int $stable = 8;
            private final Handler handler;
            private final drM<String, dpR> onReceiveFallbackData;
            private final drM<String, dpR> onReceiveJwt;

            /* JADX WARN: Multi-variable type inference failed */
            public Emvco(drM<? super String, dpR> drm, drM<? super String, dpR> drm2, Handler handler) {
                C8632dsu.c((Object) drm, "");
                C8632dsu.c((Object) drm2, "");
                C8632dsu.c((Object) handler, "");
                this.onReceiveJwt = drm;
                this.onReceiveFallbackData = drm2;
                this.handler = handler;
            }

            public /* synthetic */ Emvco(drM drm, drM drm2, Handler handler, int i, C8627dsp c8627dsp) {
                this(drm, drm2, (i & 4) != 0 ? new Handler(Looper.getMainLooper()) : handler);
            }

            @JavascriptInterface
            public final void handleDeviceDataCollectionCallback(final String str) {
                this.handler.post(new Runnable() { // from class: com.netflix.mediaclient.acquisition.util.AUIWebViewUtilities$BridgeMethods$Emvco$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AUIWebViewUtilities.BridgeMethods.Emvco.handleDeviceDataCollectionCallback$lambda$0(AUIWebViewUtilities.BridgeMethods.Emvco.this, str);
                    }
                });
            }

            public static final void handleDeviceDataCollectionCallback$lambda$0(Emvco emvco, String str) {
                C8632dsu.c((Object) emvco, "");
                emvco.onReceiveJwt.invoke(str);
            }

            @JavascriptInterface
            public final void handleDeviceDataCollectionFallback(final String str) {
                this.handler.post(new Runnable() { // from class: com.netflix.mediaclient.acquisition.util.AUIWebViewUtilities$BridgeMethods$Emvco$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AUIWebViewUtilities.BridgeMethods.Emvco.handleDeviceDataCollectionFallback$lambda$1(AUIWebViewUtilities.BridgeMethods.Emvco.this, str);
                    }
                });
            }

            public static final void handleDeviceDataCollectionFallback$lambda$1(Emvco emvco, String str) {
                C8632dsu.c((Object) emvco, "");
                emvco.onReceiveFallbackData.invoke(str);
            }
        }
    }
}
