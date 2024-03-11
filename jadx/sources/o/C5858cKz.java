package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C5855cKw;

/* renamed from: o.cKz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5858cKz {
    public final C1203Sq a;
    public final C1204Sr b;
    public final FrameLayout c;
    public final C1203Sq d;
    public final NetflixImageView e;
    public final C1203Sq f;
    public final SwitchCompat g;
    public final C1203Sq h;
    public final SwitchCompat i;
    public final NetflixImageView j;
    public final EditText k;
    public final ScrollView l;
    public final C1203Sq m;
    public final C1203Sq n;

    /* renamed from: o  reason: collision with root package name */
    public final ConstraintLayout f13680o;
    private final ConstraintLayout q;
    public final C1203Sq r;

    public ConstraintLayout b() {
        return this.q;
    }

    private C5858cKz(ConstraintLayout constraintLayout, NetflixImageView netflixImageView, FrameLayout frameLayout, C1203Sq c1203Sq, C1204Sr c1204Sr, C1203Sq c1203Sq2, C1203Sq c1203Sq3, NetflixImageView netflixImageView2, C1203Sq c1203Sq4, SwitchCompat switchCompat, SwitchCompat switchCompat2, ConstraintLayout constraintLayout2, C1203Sq c1203Sq5, EditText editText, ScrollView scrollView, C1203Sq c1203Sq6, C1203Sq c1203Sq7) {
        this.q = constraintLayout;
        this.e = netflixImageView;
        this.c = frameLayout;
        this.d = c1203Sq;
        this.b = c1204Sr;
        this.a = c1203Sq2;
        this.h = c1203Sq3;
        this.j = netflixImageView2;
        this.f = c1203Sq4;
        this.g = switchCompat;
        this.i = switchCompat2;
        this.f13680o = constraintLayout2;
        this.n = c1203Sq5;
        this.k = editText;
        this.l = scrollView;
        this.m = c1203Sq6;
        this.r = c1203Sq7;
    }

    public static C5858cKz d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C5855cKw.c.h, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    public static C5858cKz b(View view) {
        int i = C5855cKw.d.e;
        NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
        if (netflixImageView != null) {
            i = C5855cKw.d.b;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C5855cKw.d.g;
                C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
                if (c1203Sq != null) {
                    i = C5855cKw.d.j;
                    C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr != null) {
                        i = C5855cKw.d.f;
                        C1203Sq c1203Sq2 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                        if (c1203Sq2 != null) {
                            i = C5855cKw.d.i;
                            C1203Sq c1203Sq3 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                            if (c1203Sq3 != null) {
                                i = C5855cKw.d.h;
                                NetflixImageView netflixImageView2 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                                if (netflixImageView2 != null) {
                                    i = C5855cKw.d.p;
                                    C1203Sq c1203Sq4 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                    if (c1203Sq4 != null) {
                                        i = C5855cKw.d.x;
                                        SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(view, i);
                                        if (switchCompat != null) {
                                            i = C5855cKw.d.w;
                                            SwitchCompat switchCompat2 = (SwitchCompat) ViewBindings.findChildViewById(view, i);
                                            if (switchCompat2 != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                i = C5855cKw.d.O;
                                                C1203Sq c1203Sq5 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                                if (c1203Sq5 != null) {
                                                    i = C5855cKw.d.Q;
                                                    EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                                                    if (editText != null) {
                                                        i = C5855cKw.d.W;
                                                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                                        if (scrollView != null) {
                                                            i = C5855cKw.d.ah;
                                                            C1203Sq c1203Sq6 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                                            if (c1203Sq6 != null) {
                                                                i = C5855cKw.d.af;
                                                                C1203Sq c1203Sq7 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                                                if (c1203Sq7 != null) {
                                                                    return new C5858cKz(constraintLayout, netflixImageView, frameLayout, c1203Sq, c1204Sr, c1203Sq2, c1203Sq3, netflixImageView2, c1203Sq4, switchCompat, switchCompat2, constraintLayout, c1203Sq5, editText, scrollView, c1203Sq6, c1203Sq7);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
