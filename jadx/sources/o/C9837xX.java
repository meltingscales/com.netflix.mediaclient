package o;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import androidx.viewbinding.ViewBindings;
import o.C9834xU;

/* renamed from: o.xX  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9837xX {
    public final Space a;
    public final C1203Sq b;
    public final ImageView c;
    public final C1193Sg d;
    public final ConstraintLayout e;
    public final Space f;
    public final C1203Sq g;
    public final C1203Sq h;
    public final Space i;
    public final Space j;
    public final C1203Sq k;
    public final C1203Sq l;
    public final C1203Sq m;

    /* renamed from: o  reason: collision with root package name */
    private final View f13925o;

    private C9837xX(View view, ConstraintLayout constraintLayout, C1203Sq c1203Sq, C1193Sg c1193Sg, ImageView imageView, Space space, Space space2, Space space3, Space space4, C1203Sq c1203Sq2, C1203Sq c1203Sq3, C1203Sq c1203Sq4, C1203Sq c1203Sq5, C1203Sq c1203Sq6) {
        this.f13925o = view;
        this.e = constraintLayout;
        this.b = c1203Sq;
        this.d = c1193Sg;
        this.c = imageView;
        this.a = space;
        this.i = space2;
        this.f = space3;
        this.j = space4;
        this.h = c1203Sq2;
        this.g = c1203Sq3;
        this.m = c1203Sq4;
        this.l = c1203Sq5;
        this.k = c1203Sq6;
    }

    public static C9837xX a(View view) {
        int i = C9834xU.g.h;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C9834xU.g.m;
            C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
            if (c1203Sq != null) {
                i = C9834xU.g.f13915o;
                C1193Sg c1193Sg = (C1193Sg) ViewBindings.findChildViewById(view, i);
                if (c1193Sg != null) {
                    i = C9834xU.g.G;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C9834xU.g.O;
                        Space space = (Space) ViewBindings.findChildViewById(view, i);
                        if (space != null) {
                            i = C9834xU.g.Q;
                            Space space2 = (Space) ViewBindings.findChildViewById(view, i);
                            if (space2 != null) {
                                i = C9834xU.g.W;
                                Space space3 = (Space) ViewBindings.findChildViewById(view, i);
                                if (space3 != null) {
                                    i = C9834xU.g.V;
                                    Space space4 = (Space) ViewBindings.findChildViewById(view, i);
                                    if (space4 != null) {
                                        i = C9834xU.g.U;
                                        C1203Sq c1203Sq2 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                        if (c1203Sq2 != null) {
                                            i = C9834xU.g.Z;
                                            C1203Sq c1203Sq3 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                            if (c1203Sq3 != null) {
                                                i = C9834xU.g.ab;
                                                C1203Sq c1203Sq4 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                                if (c1203Sq4 != null) {
                                                    i = C9834xU.g.aa;
                                                    C1203Sq c1203Sq5 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                                    if (c1203Sq5 != null) {
                                                        i = C9834xU.g.Y;
                                                        C1203Sq c1203Sq6 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                                        if (c1203Sq6 != null) {
                                                            return new C9837xX(view, constraintLayout, c1203Sq, c1193Sg, imageView, space, space2, space3, space4, c1203Sq2, c1203Sq3, c1203Sq4, c1203Sq5, c1203Sq6);
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
