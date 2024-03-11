package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C5855cKw;

/* renamed from: o.cKx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5856cKx {
    public final FrameLayout a;
    public final NetflixImageView b;
    public final C1174Rn c;
    public final C5952cOl d;
    public final NetflixImageView e;
    public final ScrollView g;
    public final FrameLayout h;
    public final EditText i;
    private final FrameLayout j;

    public FrameLayout d() {
        return this.j;
    }

    private C5856cKx(FrameLayout frameLayout, C5952cOl c5952cOl, NetflixImageView netflixImageView, FrameLayout frameLayout2, NetflixImageView netflixImageView2, C1174Rn c1174Rn, FrameLayout frameLayout3, EditText editText, ScrollView scrollView) {
        this.j = frameLayout;
        this.d = c5952cOl;
        this.b = netflixImageView;
        this.a = frameLayout2;
        this.e = netflixImageView2;
        this.c = c1174Rn;
        this.h = frameLayout3;
        this.i = editText;
        this.g = scrollView;
    }

    public static C5856cKx a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C5855cKw.c.d, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    public static C5856cKx b(View view) {
        int i = C5855cKw.d.a;
        C5952cOl c5952cOl = (C5952cOl) ViewBindings.findChildViewById(view, i);
        if (c5952cOl != null) {
            i = C5855cKw.d.e;
            NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
            if (netflixImageView != null) {
                i = C5855cKw.d.b;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C5855cKw.d.h;
                    NetflixImageView netflixImageView2 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                    if (netflixImageView2 != null) {
                        i = C5855cKw.d.D;
                        C1174Rn c1174Rn = (C1174Rn) ViewBindings.findChildViewById(view, i);
                        if (c1174Rn != null) {
                            FrameLayout frameLayout2 = (FrameLayout) view;
                            i = C5855cKw.d.Q;
                            EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                            if (editText != null) {
                                i = C5855cKw.d.W;
                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                if (scrollView != null) {
                                    return new C5856cKx(frameLayout2, c5952cOl, netflixImageView, frameLayout, netflixImageView2, c1174Rn, frameLayout2, editText, scrollView);
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
