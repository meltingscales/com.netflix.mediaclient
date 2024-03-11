package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import o.C3895bOq;

/* loaded from: classes4.dex */
public final class bOV {
    public final ViewPager2 a;
    public final C1203Sq b;
    public final TabLayout c;
    public final C1193Sg d;
    public final C1203Sq e;
    private final CardView f;
    public final C1203Sq g;

    public CardView a() {
        return this.f;
    }

    private bOV(CardView cardView, C1203Sq c1203Sq, C1193Sg c1193Sg, C1203Sq c1203Sq2, ViewPager2 viewPager2, TabLayout tabLayout, C1203Sq c1203Sq3) {
        this.f = cardView;
        this.b = c1203Sq;
        this.d = c1193Sg;
        this.e = c1203Sq2;
        this.a = viewPager2;
        this.c = tabLayout;
        this.g = c1203Sq3;
    }

    public static bOV e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C3895bOq.c.aa, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public static bOV a(View view) {
        int i = C3895bOq.b.e;
        C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
        if (c1203Sq != null) {
            i = C3895bOq.b.i;
            C1193Sg c1193Sg = (C1193Sg) ViewBindings.findChildViewById(view, i);
            if (c1193Sg != null) {
                i = C3895bOq.b.k;
                C1203Sq c1203Sq2 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                if (c1203Sq2 != null) {
                    i = C3895bOq.b.H;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                    if (viewPager2 != null) {
                        i = C3895bOq.b.I;
                        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i);
                        if (tabLayout != null) {
                            i = C3895bOq.b.S;
                            C1203Sq c1203Sq3 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                            if (c1203Sq3 != null) {
                                return new bOV((CardView) view, c1203Sq, c1193Sg, c1203Sq2, viewPager2, tabLayout, c1203Sq3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
