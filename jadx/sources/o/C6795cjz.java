package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBindings;
import o.C6792cjw;

/* renamed from: o.cjz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6795cjz {
    public final C1203Sq a;
    public final ProgressBar b;
    public final C1204Sr c;
    public final LinearLayout d;
    public final C1203Sq e;
    public final WebView g;
    private final FrameLayout h;

    public FrameLayout e() {
        return this.h;
    }

    private C6795cjz(FrameLayout frameLayout, LinearLayout linearLayout, C1204Sr c1204Sr, C1203Sq c1203Sq, ProgressBar progressBar, C1203Sq c1203Sq2, WebView webView) {
        this.h = frameLayout;
        this.d = linearLayout;
        this.c = c1204Sr;
        this.e = c1203Sq;
        this.b = progressBar;
        this.a = c1203Sq2;
        this.g = webView;
    }

    public static C6795cjz d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C6792cjw.e.d, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public static C6795cjz a(View view) {
        int i = C6792cjw.c.c;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C6792cjw.c.a;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = C6792cjw.c.d;
                C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
                if (c1203Sq != null) {
                    i = C6792cjw.c.b;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                    if (progressBar != null) {
                        i = C6792cjw.c.e;
                        C1203Sq c1203Sq2 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                        if (c1203Sq2 != null) {
                            i = C6792cjw.c.h;
                            WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
                            if (webView != null) {
                                return new C6795cjz((FrameLayout) view, linearLayout, c1204Sr, c1203Sq, progressBar, c1203Sq2, webView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
