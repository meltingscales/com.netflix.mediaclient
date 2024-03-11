package o;

import android.view.ViewGroup;

/* renamed from: o.vB  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9687vB {
    public static final int a(ViewGroup.LayoutParams layoutParams) {
        C8632dsu.c((Object) layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final int e(ViewGroup.LayoutParams layoutParams) {
        C8632dsu.c((Object) layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int d(ViewGroup.LayoutParams layoutParams) {
        C8632dsu.c((Object) layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int c(ViewGroup.LayoutParams layoutParams) {
        C8632dsu.c((Object) layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.getMarginStart();
        }
        return 0;
    }

    public static final int b(ViewGroup.LayoutParams layoutParams) {
        C8632dsu.c((Object) layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.getMarginEnd();
        }
        return 0;
    }
}
