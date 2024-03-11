package o;

import android.graphics.Insets;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import o.C9908yp;

/* renamed from: o.cjt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6789cjt {
    public static final C6789cjt e = new C6789cjt();

    private C6789cjt() {
    }

    public final void c(WebView webView) {
        int i;
        int i2;
        int i3;
        int i4;
        String h;
        int safeInsetLeft;
        int i5;
        int safeInsetRight;
        int i6;
        int safeInsetTop;
        int i7;
        int safeInsetBottom;
        int i8;
        C8632dsu.c((Object) webView, "");
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            Display display = webView.getDisplay();
            DisplayCutout cutout = display != null ? display.getCutout() : null;
            if (cutout != null) {
                Insets waterfallInsets = i9 >= 30 ? cutout.getWaterfallInsets() : Insets.NONE;
                C8632dsu.d(waterfallInsets);
                float f = webView.getResources().getDisplayMetrics().density;
                safeInsetLeft = cutout.getSafeInsetLeft();
                i5 = waterfallInsets.left;
                i = dsT.e(Math.max(safeInsetLeft, i5) / f);
                safeInsetRight = cutout.getSafeInsetRight();
                i6 = waterfallInsets.right;
                i3 = dsT.e(Math.max(safeInsetRight, i6) / f);
                safeInsetTop = cutout.getSafeInsetTop();
                i7 = waterfallInsets.top;
                i4 = dsT.e(Math.max(safeInsetTop, i7) / f);
                safeInsetBottom = cutout.getSafeInsetBottom();
                i8 = waterfallInsets.bottom;
                i2 = dsT.e(Math.max(safeInsetBottom, i8) / f);
                C9908yp.d dVar = C9908yp.b;
                h = C8681dup.h("\n                document.documentElement.style.setProperty('--android-safe-area-inset-left', '" + i + "px');\n                document.documentElement.style.setProperty('--android-safe-area-inset-right', '" + i3 + "px');\n                document.documentElement.style.setProperty('--android-safe-area-inset-top', '" + i4 + "px');\n                document.documentElement.style.setProperty('--android-safe-area-inset-bottom', '" + i2 + "px');\n                ");
                webView.evaluateJavascript(h, new ValueCallback() { // from class: o.cjr
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        C6789cjt.b((String) obj);
                    }
                });
            }
        }
        i = 0;
        i2 = 0;
        i3 = 0;
        i4 = 0;
        C9908yp.d dVar2 = C9908yp.b;
        h = C8681dup.h("\n                document.documentElement.style.setProperty('--android-safe-area-inset-left', '" + i + "px');\n                document.documentElement.style.setProperty('--android-safe-area-inset-right', '" + i3 + "px');\n                document.documentElement.style.setProperty('--android-safe-area-inset-top', '" + i4 + "px');\n                document.documentElement.style.setProperty('--android-safe-area-inset-bottom', '" + i2 + "px');\n                ");
        webView.evaluateJavascript(h, new ValueCallback() { // from class: o.cjr
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C6789cjt.b((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str) {
        C9908yp.d dVar = C9908yp.b;
    }
}
