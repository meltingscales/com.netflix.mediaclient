package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import o.C7142cqd;

/* renamed from: o.cqa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7139cqa {
    public final C1203Sq a;
    public final RelativeLayout b;
    private final RelativeLayout c;
    public final DownloadButton d;
    public final C1206St e;

    private C7139cqa(RelativeLayout relativeLayout, C1206St c1206St, DownloadButton downloadButton, C1203Sq c1203Sq, RelativeLayout relativeLayout2) {
        this.c = relativeLayout;
        this.e = c1206St;
        this.d = downloadButton;
        this.a = c1203Sq;
        this.b = relativeLayout2;
    }

    public static C7139cqa c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C7142cqd.a.h, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return e(inflate);
    }

    public static C7139cqa e(View view) {
        int i = C7142cqd.b.c;
        C1206St c1206St = (C1206St) ViewBindings.findChildViewById(view, i);
        if (c1206St != null) {
            i = C7142cqd.b.i;
            DownloadButton downloadButton = (DownloadButton) ViewBindings.findChildViewById(view, i);
            if (downloadButton != null) {
                i = C7142cqd.b.p;
                C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
                if (c1203Sq != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    return new C7139cqa(relativeLayout, c1206St, downloadButton, c1203Sq, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
