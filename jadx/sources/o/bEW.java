package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.ui.offline.DownloadButton;

/* loaded from: classes4.dex */
public final class bEW {
    public final C1206St a;
    public final NetflixImageView b;
    public final ImageView c;
    public final C1184Rx d;
    public final ProgressBar e;
    public final FrameLayout f;
    public final C1204Sr g;
    public final DownloadButton h;
    public final C1193Sg i;
    public final C1203Sq j;
    public final NetflixImageView k;
    public final C1204Sr l;
    public final C1204Sr m;
    public final LinearLayout n;

    /* renamed from: o  reason: collision with root package name */
    public final C1204Sr f13499o;
    private final FrameLayout t;

    private bEW(FrameLayout frameLayout, NetflixImageView netflixImageView, ImageView imageView, ProgressBar progressBar, C1184Rx c1184Rx, C1206St c1206St, C1204Sr c1204Sr, C1193Sg c1193Sg, FrameLayout frameLayout2, DownloadButton downloadButton, C1203Sq c1203Sq, NetflixImageView netflixImageView2, C1204Sr c1204Sr2, C1204Sr c1204Sr3, C1204Sr c1204Sr4, LinearLayout linearLayout) {
        this.t = frameLayout;
        this.b = netflixImageView;
        this.c = imageView;
        this.e = progressBar;
        this.d = c1184Rx;
        this.a = c1206St;
        this.g = c1204Sr;
        this.i = c1193Sg;
        this.f = frameLayout2;
        this.h = downloadButton;
        this.j = c1203Sq;
        this.k = netflixImageView2;
        this.l = c1204Sr2;
        this.f13499o = c1204Sr3;
        this.m = c1204Sr4;
        this.n = linearLayout;
    }

    public static bEW b(View view) {
        int i = com.netflix.mediaclient.ui.R.g.Z;
        NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
        if (netflixImageView != null) {
            i = com.netflix.mediaclient.ui.R.g.aa;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = com.netflix.mediaclient.ui.R.g.dk;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                if (progressBar != null) {
                    i = com.netflix.mediaclient.ui.R.g.eB;
                    C1184Rx c1184Rx = (C1184Rx) ViewBindings.findChildViewById(view, i);
                    if (c1184Rx != null) {
                        i = com.netflix.mediaclient.ui.R.g.eX;
                        C1206St c1206St = (C1206St) ViewBindings.findChildViewById(view, i);
                        if (c1206St != null) {
                            i = com.netflix.mediaclient.ui.R.g.eT;
                            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                            if (c1204Sr != null) {
                                i = com.netflix.mediaclient.ui.R.g.eW;
                                C1193Sg c1193Sg = (C1193Sg) ViewBindings.findChildViewById(view, i);
                                if (c1193Sg != null) {
                                    FrameLayout frameLayout = (FrameLayout) view;
                                    i = com.netflix.mediaclient.ui.R.g.eZ;
                                    DownloadButton downloadButton = (DownloadButton) ViewBindings.findChildViewById(view, i);
                                    if (downloadButton != null) {
                                        i = com.netflix.mediaclient.ui.R.g.fc;
                                        C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                        if (c1203Sq != null) {
                                            i = com.netflix.mediaclient.ui.R.g.fa;
                                            NetflixImageView netflixImageView2 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                                            if (netflixImageView2 != null) {
                                                i = com.netflix.mediaclient.ui.R.g.eY;
                                                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                if (c1204Sr2 != null) {
                                                    i = com.netflix.mediaclient.ui.R.g.fh;
                                                    C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                    if (c1204Sr3 != null) {
                                                        i = com.netflix.mediaclient.ui.R.g.fd;
                                                        C1204Sr c1204Sr4 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                        if (c1204Sr4 != null) {
                                                            i = com.netflix.mediaclient.ui.R.g.fe;
                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayout != null) {
                                                                return new bEW(frameLayout, netflixImageView, imageView, progressBar, c1184Rx, c1206St, c1204Sr, c1193Sg, frameLayout, downloadButton, c1203Sq, netflixImageView2, c1204Sr2, c1204Sr3, c1204Sr4, linearLayout);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
