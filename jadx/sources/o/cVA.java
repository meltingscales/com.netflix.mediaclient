package o;

import android.net.Uri;
import android.net.http.SslError;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class cVA extends WebViewClient {
    private static int e = 0;
    private static byte e$ss2$115 = 24;
    private static int j = 1;
    private final cVD b;
    private boolean c;
    private boolean a = false;
    private String d = null;

    public void d() {
        this.a = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public cVA(cVD cvd) {
        this.b = cvd;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        String originalUrl = webView.getOriginalUrl();
        if (this.a && !C8168dfL.d(this.d, originalUrl)) {
            webView.clearHistory();
            this.a = false;
        }
        this.d = originalUrl;
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (d(str)) {
            webView.loadUrl(str);
            return true;
        } else if (c(str) != NflxHandler.Response.NOT_HANDLING) {
            C1044Mm.e("AccountWebViewClient", "=========> URL handled by Nflx protocol" + str);
            return true;
        } else {
            C1044Mm.d("AccountWebViewClient", "=========> Invalid URL scheme, protocol not handled" + str);
            cVD cvd = this.b;
            cvd.showToast("Invalid URL scheme " + str);
            return true;
        }
    }

    private NflxHandler.Response c(String str) {
        try {
            return C1588aGw.e(this.b).d(Uri.parse(str), 0L);
        } catch (Throwable th) {
            C1044Mm.e("AccountWebViewClient", "Failed to parse nflx url ", th);
            return NflxHandler.Response.NOT_HANDLING;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        b(str);
        super.onLoadResource(webView, str);
    }

    private boolean d(String str) {
        if (str == null) {
            return false;
        }
        return str.trim().toLowerCase(Locale.US).startsWith("https");
    }

    private void b(String str) {
        int i = 2 % 2;
        int i2 = j + 3;
        int i3 = i2 % 128;
        e = i3;
        int i4 = i2 % 2;
        if (this.c) {
            C1044Mm.d("AccountWebViewClient", "We already failed. Ignoring to prevent multiple dialogs! URL: " + str);
            cVD cvd = this.b;
            cvd.showToast("Loading insecure resource, ERROR:" + str);
        } else if (str != null) {
            int i5 = i3 + 17;
            j = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                e(str.toLowerCase(Locale.US).trim());
                obj.hashCode();
                throw null;
            }
            String trim = str.toLowerCase(Locale.US).trim();
            if (e(trim) || trim.startsWith("https")) {
                return;
            }
            this.c = true;
            cVD cvd2 = this.b;
            cvd2.showToast("Loading insecure resource, ERROR:" + str);
            C1044Mm.d("AccountWebViewClient", "Trying to load from unsecure location in release build. Prevent loading, security breach! URL: " + str);
            String string = this.b.getString(com.netflix.mediaclient.ui.R.o.lD);
            if (string.startsWith("'!#+")) {
                int i6 = e + 37;
                j = i6 % 128;
                int i7 = i6 % 2;
                String substring = string.substring(4);
                if (i7 == 0) {
                    Object[] objArr = new Object[1];
                    f(substring, objArr);
                    ((String) objArr[0]).intern();
                    obj.hashCode();
                    throw null;
                }
                Object[] objArr2 = new Object[1];
                f(substring, objArr2);
                string = ((String) objArr2[0]).intern();
            }
            cVD cvd3 = this.b;
            cvd3.provideDialog(string, cvd3.getErrorHandler());
        }
    }

    private boolean e(String str) {
        return str.startsWith("data:image") || str.endsWith(".png") || str.contains(".png?") || str.endsWith(".jpg") || str.contains(".jpg?") || str.endsWith(".gif") || str.contains(".gif?");
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C1044Mm.d("AccountWebViewClient", "SSL error: " + sslError);
        cVD cvd = this.b;
        cvd.showToast("SSL Failure loading ERROR: " + sslError.getUrl());
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    private void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$115);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
