package o;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ViewFlipper;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_FixAccountPageRefresh;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.net.URISyntaxException;

@InterfaceC1639aIt
/* renamed from: o.ddw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class ActivityC8099ddw extends NetflixActivity {
    private boolean a;
    private b b;
    public WebView c;
    private ViewFlipper e;

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showSettingsInMenu() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showSignOutInMenu() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.netflix.mediaclient.ui.R.i.ac);
        this.c = (WebView) findViewById(com.netflix.mediaclient.ui.R.g.bT);
        this.e = (ViewFlipper) findViewById(com.netflix.mediaclient.ui.R.g.bX);
        if (Config_FastProperty_FixAccountPageRefresh.Companion.a()) {
            Intent intent = getIntent();
            if (intent == null) {
                C1044Mm.j("ExternalWeb", "Started with no intent! It should not happen!");
                finish();
                return;
            }
            String stringExtra = intent.getStringExtra(SignupConstants.Field.URL);
            if (!URLUtil.isNetworkUrl(stringExtra)) {
                C1044Mm.d("ExternalWeb", "Url " + stringExtra + " is not a network URL! Destroy activity!");
                finish();
                return;
            }
            c(stringExtra);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (Config_FastProperty_FixAccountPageRefresh.Companion.a()) {
            return;
        }
        Intent intent = getIntent();
        if (intent == null) {
            C1044Mm.j("ExternalWeb", "Started with no intent! It should not happen!");
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra(SignupConstants.Field.URL);
        if (!URLUtil.isNetworkUrl(stringExtra)) {
            C1044Mm.d("ExternalWeb", "Url " + stringExtra + " is not a network URL! Destroy activity!");
            finish();
            return;
        }
        c(stringExtra);
    }

    @SuppressLint({"NewApi", "SetJavaScriptEnabled"})
    public void c(String str) {
        C8240dge.d.a(this.c.getSettings());
        this.c.setWebChromeClient(new e());
        b bVar = new b();
        this.b = bVar;
        this.c.setWebViewClient(bVar);
        this.c.setOnTouchListener(new View.OnTouchListener() { // from class: o.ddw.4
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
        this.b.b();
        C1044Mm.a("ExternalWeb", "Loading URL: " + str);
        this.c.loadUrl(str);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C1044Mm.j("ExternalWeb", "Received new intent when UI is visible");
        if (intent == null) {
            C1044Mm.j("ExternalWeb", "Started with no intent! It should not happen!");
            return;
        }
        String stringExtra = intent.getStringExtra(SignupConstants.Field.URL);
        if (!URLUtil.isNetworkUrl(stringExtra)) {
            C1044Mm.d("ExternalWeb", "Url " + stringExtra + " is not a network URL! Stay!");
            return;
        }
        a(false);
        this.b.b();
        this.c.loadUrl(stringExtra);
    }

    void a(boolean z) {
        if (z != this.a) {
            this.e.showNext();
            this.a = !this.a;
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.webLink;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onConfigureActionBarState(NetflixActionBar.b.C0051b c0051b) {
        c0051b.l(false).b(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ddw$e */
    /* loaded from: classes5.dex */
    public class e extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }

        private e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ddw$b */
    /* loaded from: classes5.dex */
    public class b extends WebViewClient {
        private boolean a;
        private String d;

        public void b() {
            this.a = true;
        }

        private b() {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            String originalUrl = webView.getOriginalUrl();
            if (this.a && !C8168dfL.d(this.d, originalUrl)) {
                webView.clearHistory();
                this.a = false;
            }
            this.d = originalUrl;
            ActivityC8099ddw.this.a(true);
            ActivityC8099ddw.this.endRenderNavigationLevelSession(IClientLogging.CompletionReason.success, null);
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (ConnectivityUtils.l(ActivityC8099ddw.this)) {
                InterfaceC1598aHf.a("Could not load url : " + str2 + " ERR = (" + i + ") " + str);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Intent intent;
            if (webResourceRequest.getUrl().toString().startsWith("intent")) {
                try {
                    intent = Intent.parseUri(webResourceRequest.getUrl().toString(), 1);
                } catch (URISyntaxException e) {
                    InterfaceC1598aHf.e("Unable to parse " + webResourceRequest.getUrl().toString(), e);
                    intent = null;
                }
                if (intent != null) {
                    ActivityC8099ddw.this.startActivity(intent);
                    return true;
                }
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (ConnectivityUtils.l(ActivityC8099ddw.this)) {
                InterfaceC1598aHf.a(new C1596aHd("Could not load url : " + webResourceRequest.getUrl().toString() + " ERR = (" + webResourceError.getErrorCode() + ") " + webResourceError.getDescription().toString()).b(false));
            }
        }
    }
}
