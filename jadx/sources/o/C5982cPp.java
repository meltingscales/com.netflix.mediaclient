package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C5980cPn;

/* renamed from: o.cPp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5982cPp {
    public final Barrier a;
    public final C5981cPo b;
    public final C5981cPo c;
    public final C1204Sr d;
    public final SwitchCompat e;
    public final ConstraintLayout f;
    public final C5979cPm g;
    public final C5983cPq h;
    public final C1203Sq i;
    public final NetflixImageView j;
    public final C5981cPo k;
    public final ScrollView l;
    public final C1203Sq m;
    public final RadioButton n;

    /* renamed from: o  reason: collision with root package name */
    public final RadioButton f13692o;
    private final ConstraintLayout p;
    public final RadioGroup q;
    public final RadioButton r;
    public final C5981cPo s;
    public final SwitchCompat t;

    public ConstraintLayout c() {
        return this.p;
    }

    private C5982cPp(ConstraintLayout constraintLayout, C5981cPo c5981cPo, SwitchCompat switchCompat, Barrier barrier, C1204Sr c1204Sr, C5981cPo c5981cPo2, C5979cPm c5979cPm, NetflixImageView netflixImageView, C5983cPq c5983cPq, ConstraintLayout constraintLayout2, C1203Sq c1203Sq, C1203Sq c1203Sq2, ScrollView scrollView, C5981cPo c5981cPo3, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, RadioButton radioButton3, C5981cPo c5981cPo4, SwitchCompat switchCompat2) {
        this.p = constraintLayout;
        this.b = c5981cPo;
        this.e = switchCompat;
        this.a = barrier;
        this.d = c1204Sr;
        this.c = c5981cPo2;
        this.g = c5979cPm;
        this.j = netflixImageView;
        this.h = c5983cPq;
        this.f = constraintLayout2;
        this.i = c1203Sq;
        this.m = c1203Sq2;
        this.l = scrollView;
        this.k = c5981cPo3;
        this.f13692o = radioButton;
        this.n = radioButton2;
        this.q = radioGroup;
        this.r = radioButton3;
        this.s = c5981cPo4;
        this.t = switchCompat2;
    }

    public static C5982cPp d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C5980cPn.a.e, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return e(inflate);
    }

    public static C5982cPp e(View view) {
        int i = C5980cPn.d.c;
        C5981cPo c5981cPo = (C5981cPo) ViewBindings.findChildViewById(view, i);
        if (c5981cPo != null) {
            i = C5980cPn.d.d;
            SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(view, i);
            if (switchCompat != null) {
                i = C5980cPn.d.a;
                Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                if (barrier != null) {
                    i = C5980cPn.d.e;
                    C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr != null) {
                        i = C5980cPn.d.b;
                        C5981cPo c5981cPo2 = (C5981cPo) ViewBindings.findChildViewById(view, i);
                        if (c5981cPo2 != null) {
                            i = C5980cPn.d.f;
                            C5979cPm c5979cPm = (C5979cPm) ViewBindings.findChildViewById(view, i);
                            if (c5979cPm != null) {
                                i = C5980cPn.d.h;
                                NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                                if (netflixImageView != null) {
                                    i = C5980cPn.d.i;
                                    C5983cPq c5983cPq = (C5983cPq) ViewBindings.findChildViewById(view, i);
                                    if (c5983cPq != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i = C5980cPn.d.g;
                                        C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                        if (c1203Sq != null) {
                                            i = C5980cPn.d.j;
                                            C1203Sq c1203Sq2 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                            if (c1203Sq2 != null) {
                                                i = C5980cPn.d.m;
                                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                                if (scrollView != null) {
                                                    i = C5980cPn.d.k;
                                                    C5981cPo c5981cPo3 = (C5981cPo) ViewBindings.findChildViewById(view, i);
                                                    if (c5981cPo3 != null) {
                                                        i = C5980cPn.d.f13691o;
                                                        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i);
                                                        if (radioButton != null) {
                                                            i = C5980cPn.d.l;
                                                            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i);
                                                            if (radioButton2 != null) {
                                                                i = C5980cPn.d.n;
                                                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                                                if (radioGroup != null) {
                                                                    i = C5980cPn.d.r;
                                                                    RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, i);
                                                                    if (radioButton3 != null) {
                                                                        i = C5980cPn.d.p;
                                                                        C5981cPo c5981cPo4 = (C5981cPo) ViewBindings.findChildViewById(view, i);
                                                                        if (c5981cPo4 != null) {
                                                                            i = C5980cPn.d.s;
                                                                            SwitchCompat switchCompat2 = (SwitchCompat) ViewBindings.findChildViewById(view, i);
                                                                            if (switchCompat2 != null) {
                                                                                return new C5982cPp(constraintLayout, c5981cPo, switchCompat, barrier, c1204Sr, c5981cPo2, c5979cPm, netflixImageView, c5983cPq, constraintLayout, c1203Sq, c1203Sq2, scrollView, c5981cPo3, radioButton, radioButton2, radioGroup, radioButton3, c5981cPo4, switchCompat2);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
