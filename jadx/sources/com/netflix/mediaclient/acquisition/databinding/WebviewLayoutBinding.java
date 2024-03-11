package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;

/* loaded from: classes3.dex */
public final class WebviewLayoutBinding {
    private final RelativeLayout rootView;
    public final WebView webView;
    public final RelativeLayout webViewContainer;
    public final ProgressBar webViewLoadingSpinner;

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    private WebviewLayoutBinding(RelativeLayout relativeLayout, WebView webView, RelativeLayout relativeLayout2, ProgressBar progressBar) {
        this.rootView = relativeLayout;
        this.webView = webView;
        this.webViewContainer = relativeLayout2;
        this.webViewLoadingSpinner = progressBar;
    }

    public static WebviewLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WebviewLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.webview_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static WebviewLayoutBinding bind(View view) {
        int i = R.id.webView;
        WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
        if (webView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            int i2 = R.id.webViewLoadingSpinner;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i2);
            if (progressBar != null) {
                return new WebviewLayoutBinding(relativeLayout, webView, relativeLayout, progressBar);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
