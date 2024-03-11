package o;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.netflix.cl.Logger;
import com.netflix.cl.model.context.NonmemberSharedContext;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import o.C1163Rc;
import o.C8284dhV;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class cVD extends bZV {
    private static final String COOKIE_SUFFIX = "; ";
    private static final String DEFAULT_LOCALE = "en";
    private static final String TAG = "WebViewAccountActivity";
    protected static final String USE_LATEST_COOKIES = "useDynecomCookies";
    private static int c = 1;
    private static int d = 0;
    private static byte e$ss2$3913 = 24;
    private View loadingIndicator;
    private Long mSharedContexId;
    private UUID mSharedContextSessionUuid = AbstractC8266dhD.c();
    private cVC mUiBoot;
    private WebView mWebView;
    private cVA mWebViewClient;
    private boolean mWebViewLoaded;
    private boolean mWebViewVisibility;

    public abstract Object createJSBridge();

    public cVC getBootLoader() {
        return this.mUiBoot;
    }

    public abstract String getBootUrl();

    public abstract Runnable getErrorHandler();

    public abstract Runnable getNextTask();

    public abstract long getTimeout();

    public WebView getWebView() {
        return this.mWebView;
    }

    public boolean isWebViewLoaded() {
        return this.mWebViewLoaded;
    }

    protected void onWebViewRedirect(String str) {
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean handleBackPressed() {
        WebView webView = this.mWebView;
        return webView != null && webView.canGoBackOrForward(-1);
    }

    @TargetApi(19)
    private void enableWebViewDebugging() {
        WebView.setWebContentsDebuggingEnabled(true);
    }

    @Override // o.bZV, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.netflix.mediaclient.ui.R.i.bt);
        this.loadingIndicator = findViewById(com.netflix.mediaclient.ui.R.g.dk);
        this.mWebView = (WebView) findViewById(com.netflix.mediaclient.ui.R.g.fI);
        this.mWebViewClient = createWebViewClient();
        C8054ddD.d((Activity) this);
    }

    public cVA createWebViewClient() {
        return new cVA(this) { // from class: o.cVD.2
            boolean b;
            private cVG e;

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                this.b = false;
                this.e = null;
            }

            @Override // o.cVA, android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                this.b = true;
                cVD.this.onWebViewRedirect(str);
                return super.shouldOverrideUrlLoading(webView, str);
            }

            @Override // o.cVA, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (this.b) {
                    return;
                }
                cVD.this.onWebViewLoaded(this.e);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                this.e = new cVG(i, str, str2);
            }
        };
    }

    @SuppressLint({"JavascriptInterface"})
    public void setViews(ServiceManager serviceManager) {
        Intent intent = getIntent();
        String bootUrl = getBootUrl();
        C8240dge.d.a(this.mWebView.getSettings());
        this.mWebView.addJavascriptInterface(createJSBridge(), "nfandroid");
        this.mWebView.setWebViewClient(this.mWebViewClient);
        this.mWebView.setOnTouchListener(new View.OnTouchListener() { // from class: o.cVD.3
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if ((action == 0 || action == 1) && !view.hasFocus()) {
                    view.requestFocus();
                    return false;
                }
                return false;
            }
        });
        this.mUiBoot = new cVC(serviceManager, bootUrl, getDeviceLanguage(), String.valueOf(this.mSharedContextSessionUuid));
        if (intent.getStringExtra("nextUrl") != null) {
            String stringExtra = intent.getStringExtra("nextUrl");
            String bootUrl2 = getBootUrl();
            Uri parse = Uri.parse(bootUrl2);
            if (stringExtra != null) {
                bootUrl2 = parse.getScheme() + "://" + parse.getHost() + stringExtra;
            }
            getBootLoader().a(bootUrl2);
        }
        C1044Mm.a(TAG, "URL: %s", this.mUiBoot.c());
        this.mSharedContexId = Long.valueOf(Logger.INSTANCE.addContext(new NonmemberSharedContext(this.mSharedContextSessionUuid.toString())));
        saveSharedContext();
        C8284dhV.b(new C8284dhV.a() { // from class: o.cVz
            @Override // o.C8284dhV.a
            public final void d(CookieManager cookieManager) {
                cVD.lambda$setViews$0(cookieManager);
            }
        });
        writeForceCountryCookie(serviceManager);
        this.mWebView.loadUrl(this.mUiBoot.c());
        C1044Mm.e(TAG, "Adding timeout for webview to load");
        if (getHandler() != null) {
            getHandler().postDelayed(getNextTask(), getTimeout());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setViews$0(CookieManager cookieManager) {
        String cookie = cookieManager.getCookie("https://netflix.com");
        C1044Mm.e(TAG, "All the cookies in a string:" + cookie);
    }

    private void saveSharedContext() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("webSignup", true);
            Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
        } catch (JSONException unused) {
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (getHandler() != null) {
            getHandler().removeCallbacks(getNextTask());
        }
    }

    public void onWebViewLoaded(cVG cvg) {
        C1044Mm.e(TAG, "UI ready to interact");
        if (getHandler() != null) {
            getHandler().removeCallbacks(getNextTask());
        }
        runOnUiThread(new Runnable() { // from class: o.cVD.5
            @Override // java.lang.Runnable
            public void run() {
                if (cVD.this.mWebViewLoaded) {
                    return;
                }
                cVD.this.webViewVisibility(true);
                cVD.this.mWebViewLoaded = true;
            }
        });
    }

    public void webViewVisibility(boolean z) {
        if (z != this.mWebViewVisibility) {
            C1044Mm.e(TAG, "WebView visibility:" + this.mWebViewVisibility);
            this.loadingIndicator.setVisibility(z ? 8 : 0);
            this.mWebView.setVisibility(z ? 0 : 4);
            this.mWebViewVisibility = !this.mWebViewVisibility;
        }
    }

    public void provideDialog(String str, Runnable runnable) {
        displayDialog(C1163Rc.e(this, this.handler, new C1907aSr(null, str, getString(com.netflix.mediaclient.ui.R.o.f13253fi), runnable)));
    }

    public void provideTwoButtonDialog(String str, Runnable runnable) {
        displayDialog(C1163Rc.e(this, this.handler, new C1163Rc.e(null, str, getString(com.netflix.mediaclient.ui.R.o.f13253fi), runnable, getString(com.netflix.mediaclient.ui.R.o.cL), null)));
    }

    public void noConnectivityWarning() {
        runOnUiThread(new Runnable() { // from class: o.cVD.1
            private static int a = 0;
            private static int b = 1;
            private static byte e$ss2$32 = 24;

            @Override // java.lang.Runnable
            public void run() {
                int i = 2 % 2;
                int i2 = a + 77;
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    String string = cVD.this.getString(com.netflix.mediaclient.ui.R.o.gx);
                    if (string.startsWith("'!#+")) {
                        int i3 = b + 75;
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            Object[] objArr = new Object[1];
                            c(string.substring(4), objArr);
                            string = ((String) objArr[0]).intern();
                            int i4 = 10 / 0;
                        } else {
                            Object[] objArr2 = new Object[1];
                            c(string.substring(4), objArr2);
                            string = ((String) objArr2[0]).intern();
                        }
                    }
                    C1907aSr c1907aSr = new C1907aSr(null, string, cVD.this.getString(com.netflix.mediaclient.ui.R.o.f13253fi), null);
                    cVD cvd = cVD.this;
                    cVD.this.displayDialog(C1163Rc.e(cvd, cvd.handler, c1907aSr));
                    int i5 = b + NetflixImageView.DEFAULT_LAYER_GRAVITY;
                    a = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                cVD.this.getString(com.netflix.mediaclient.ui.R.o.gx).startsWith("'!#+");
                throw null;
            }

            private void c(String str, Object[] objArr) {
                byte[] decode = Base64.decode(str, 0);
                byte[] bArr = new byte[decode.length];
                for (int i = 0; i < decode.length; i++) {
                    bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$32);
                }
                objArr[0] = new String(bArr, StandardCharsets.UTF_8);
            }
        });
    }

    public void showToast(int i) {
        int i2 = 2 % 2;
        int i3 = c + 107;
        d = i3 % 128;
        int i4 = i3 % 2;
        String string = getString(i);
        if (string.startsWith("'!#+")) {
            int i5 = c + 1;
            d = i5 % 128;
            int i6 = i5 % 2;
            String substring = string.substring(4);
            if (i6 != 0) {
                Object[] objArr = new Object[1];
                g(substring, objArr);
                ((String) objArr[0]).intern();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            g(substring, objArr2);
            string = ((String) objArr2[0]).intern();
        }
        showToast(string);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void showToast(String str) {
        showDebugToast(str);
    }

    public void startNextActivity(Intent intent) {
        startActivity(intent);
        C1044Mm.e(TAG, "Removing jumpToSignIn");
        if (getHandler() != null) {
            getHandler().removeCallbacks(getNextTask());
            overridePendingTransition(0, 0);
        }
    }

    public void reload(aOV aov, boolean z) {
        if (z) {
            C8284dhV.b(getApplicationContext(), new ValueCallback<Boolean>() { // from class: o.cVD.4
                @Override // android.webkit.ValueCallback
                /* renamed from: d */
                public void onReceiveValue(Boolean bool) {
                    cVD.this.reloadAfterClearCookies();
                }
            });
        } else {
            reloadAfterClearCookies();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reloadAfterClearCookies() {
        this.mWebViewClient.d();
        cVC cvc = this.mUiBoot;
        if (cvc == null || !C8168dfL.h(cvc.c())) {
            return;
        }
        this.mWebView.loadUrl(this.mUiBoot.c());
    }

    public String getDeviceLanguage() {
        return getServiceManager().c() ? C4984bqG.b.e(this).d() : "en";
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, o.AbstractActivityC1635aIp, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Logger.INSTANCE.removeContext(this.mSharedContexId);
        C8284dhV.b(new cVE());
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        C8284dhV.b(new cVE());
    }

    private void writeForceCountryCookie(ServiceManager serviceManager) {
        C1815aPg.e(serviceManager.g().j().b());
    }

    private static /* synthetic */ void lambda$writeForceCountryCookie$1(String str, CookieManager cookieManager) {
        cookieManager.setCookie("https://.netflix.com", str);
        cookieManager.flush();
    }

    private void g(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$3913);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
