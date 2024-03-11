package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBindings;
import o.C6863clN;

/* renamed from: o.clO  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6864clO {
    public final CardView a;
    public final C1204Sr b;
    public final C1204Sr c;
    public final C1204Sr d;
    public final C1204Sr e;
    public final RadioButton f;
    public final C1204Sr i;
    private final View j;

    private C6864clO(View view, C1204Sr c1204Sr, CardView cardView, C1204Sr c1204Sr2, C1204Sr c1204Sr3, C1204Sr c1204Sr4, RadioButton radioButton, C1204Sr c1204Sr5) {
        this.j = view;
        this.d = c1204Sr;
        this.a = cardView;
        this.b = c1204Sr2;
        this.c = c1204Sr3;
        this.e = c1204Sr4;
        this.f = radioButton;
        this.i = c1204Sr5;
    }

    public static C6864clO c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C6863clN.a.a, viewGroup);
        return e(viewGroup);
    }

    public static C6864clO e(View view) {
        int i = C6863clN.d.a;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = C6863clN.d.c;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = C6863clN.d.j;
                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr2 != null) {
                    i = C6863clN.d.m;
                    C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr3 != null) {
                        i = C6863clN.d.n;
                        C1204Sr c1204Sr4 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                        if (c1204Sr4 != null) {
                            i = C6863clN.d.l;
                            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i);
                            if (radioButton != null) {
                                i = C6863clN.d.k;
                                C1204Sr c1204Sr5 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                if (c1204Sr5 != null) {
                                    return new C6864clO(view, c1204Sr, cardView, c1204Sr2, c1204Sr3, c1204Sr4, radioButton, c1204Sr5);
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
