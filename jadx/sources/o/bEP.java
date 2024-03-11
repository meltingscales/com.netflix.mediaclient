package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;

/* loaded from: classes4.dex */
public final class bEP {
    public final C1204Sr a;
    public final View b;
    public final C1204Sr c;
    public final C1204Sr d;
    public final ConstraintLayout e;
    public final RadioButton f;
    public final RadioButton g;
    public final RadioButton h;
    public final RadioButton i;
    public final RadioButton j;
    public final RadioGroup l;
    public final C1204Sr m;
    private final ConstraintLayout n;

    /* renamed from: o  reason: collision with root package name */
    public final C1203Sq f13498o;

    public ConstraintLayout b() {
        return this.n;
    }

    private bEP(ConstraintLayout constraintLayout, View view, ConstraintLayout constraintLayout2, C1204Sr c1204Sr, C1204Sr c1204Sr2, C1204Sr c1204Sr3, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, RadioButton radioButton5, C1203Sq c1203Sq, RadioGroup radioGroup, C1204Sr c1204Sr4) {
        this.n = constraintLayout;
        this.b = view;
        this.e = constraintLayout2;
        this.d = c1204Sr;
        this.a = c1204Sr2;
        this.c = c1204Sr3;
        this.f = radioButton;
        this.j = radioButton2;
        this.i = radioButton3;
        this.h = radioButton4;
        this.g = radioButton5;
        this.f13498o = c1203Sq;
        this.l = radioGroup;
        this.m = c1204Sr4;
    }

    public static bEP d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(com.netflix.mediaclient.ui.R.i.ai, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return d(inflate);
    }

    public static bEP d(View view) {
        int i = com.netflix.mediaclient.ui.R.g.ab;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = com.netflix.mediaclient.ui.R.g.eQ;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = com.netflix.mediaclient.ui.R.g.eU;
                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr2 != null) {
                    i = com.netflix.mediaclient.ui.R.g.eV;
                    C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr3 != null) {
                        i = com.netflix.mediaclient.ui.R.g.fA;
                        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i);
                        if (radioButton != null) {
                            i = com.netflix.mediaclient.ui.R.g.fz;
                            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i);
                            if (radioButton2 != null) {
                                i = com.netflix.mediaclient.ui.R.g.fG;
                                RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, i);
                                if (radioButton3 != null) {
                                    i = com.netflix.mediaclient.ui.R.g.fF;
                                    RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, i);
                                    if (radioButton4 != null) {
                                        i = com.netflix.mediaclient.ui.R.g.fC;
                                        RadioButton radioButton5 = (RadioButton) ViewBindings.findChildViewById(view, i);
                                        if (radioButton5 != null) {
                                            i = com.netflix.mediaclient.ui.R.g.fQ;
                                            C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                            if (c1203Sq != null) {
                                                i = com.netflix.mediaclient.ui.R.g.gj;
                                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                                if (radioGroup != null) {
                                                    i = com.netflix.mediaclient.ui.R.g.gt;
                                                    C1204Sr c1204Sr4 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                    if (c1204Sr4 != null) {
                                                        return new bEP(constraintLayout, findChildViewById, constraintLayout, c1204Sr, c1204Sr2, c1204Sr3, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, c1203Sq, radioGroup, c1204Sr4);
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
