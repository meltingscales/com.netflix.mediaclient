package o;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: o.cjp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6785cjp extends WebViewClient {
    public static final e b = new e(null);
    private final InterfaceC6782cjm e;

    /* renamed from: o.cjp$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("GameControllerWebView");
        }
    }

    public C6785cjp(InterfaceC6782cjm interfaceC6782cjm) {
        C8632dsu.c((Object) interfaceC6782cjm, "");
        this.e = interfaceC6782cjm;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C8632dsu.c((Object) webResourceRequest, "");
        C8632dsu.c((Object) webResourceError, "");
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest.isForMainFrame()) {
            this.e.a(webResourceError);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        b.getLogTag();
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        String path;
        C8632dsu.c((Object) webView, "");
        super.onPageFinished(webView, str);
        b.getLogTag();
        Uri parse = Uri.parse(str);
        if (parse != null && (path = parse.getPath()) != null && path.equals("/NotFound")) {
            this.e.e("http 404");
        }
        C6789cjt.e.c(webView);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C8632dsu.c((Object) webResourceRequest, "");
        C8632dsu.c((Object) webResourceResponse, "");
        b.getLogTag();
        if (webResourceRequest.isForMainFrame()) {
            InterfaceC6782cjm interfaceC6782cjm = this.e;
            int statusCode = webResourceResponse.getStatusCode();
            interfaceC6782cjm.e("http " + statusCode);
        }
    }
}
