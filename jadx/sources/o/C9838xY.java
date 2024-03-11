package o;

import android.view.View;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBindings;
import o.C9834xU;

/* renamed from: o.xY  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9838xY {
    public final View a;
    public final C1204Sr b;
    private final View c;
    public final C1204Sr d;
    public final ImageButton e;

    private C9838xY(View view, C1204Sr c1204Sr, View view2, ImageButton imageButton, C1204Sr c1204Sr2) {
        this.c = view;
        this.b = c1204Sr;
        this.a = view2;
        this.e = imageButton;
        this.d = c1204Sr2;
    }

    public static C9838xY d(View view) {
        View findChildViewById;
        int i = C9834xU.g.K;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = C9834xU.g.N))) != null) {
            i = C9834xU.g.M;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
            if (imageButton != null) {
                i = C9834xU.g.f13914J;
                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr2 != null) {
                    return new C9838xY(view, c1204Sr, findChildViewById, imageButton, c1204Sr2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
