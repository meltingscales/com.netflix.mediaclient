package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.DrawableCompat;

/* renamed from: o.yD  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9870yD {
    public static Drawable a(Drawable drawable, ColorStateList colorStateList, int i) {
        if (drawable == null) {
            return null;
        }
        Drawable wrap = DrawableCompat.wrap(drawable.mutate());
        int intrinsicWidth = (int) (i * (wrap.getIntrinsicWidth() / wrap.getIntrinsicHeight()));
        if (i > 0) {
            wrap.setBounds(0, 0, intrinsicWidth, i);
        }
        if (colorStateList != null) {
            DrawableCompat.setTintList(wrap, colorStateList);
        }
        return wrap;
    }

    public static Drawable d(Drawable drawable, int i) {
        if (drawable == null) {
            return null;
        }
        Drawable wrap = DrawableCompat.wrap(drawable.mutate());
        DrawableCompat.setTint(wrap, i);
        return wrap;
    }

    public static int c(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int b(Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void b(View view, int i, int i2) {
        if (view != null) {
            int paddingStart = view.getPaddingStart();
            int paddingTop = view.getPaddingTop();
            int paddingEnd = view.getPaddingEnd();
            int paddingBottom = view.getPaddingBottom();
            if (i == 0) {
                view.setPaddingRelative(i2, paddingTop, paddingEnd, paddingBottom);
            } else if (i == 1) {
                view.setPaddingRelative(paddingStart, i2, paddingEnd, paddingBottom);
            } else if (i == 2) {
                view.setPaddingRelative(paddingStart, paddingTop, i2, paddingBottom);
            } else if (i == 3) {
                view.setPaddingRelative(paddingStart, paddingTop, paddingEnd, i2);
            } else if (i == 4) {
                view.setPaddingRelative(paddingStart, i2, paddingEnd, i2);
            } else if (i != 5) {
            } else {
                view.setPaddingRelative(i2, paddingTop, i2, paddingBottom);
            }
        }
    }

    public static void d(View view, int i, int i2) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (i == 0) {
                marginLayoutParams.setMarginStart(i2);
            } else if (i == 1) {
                marginLayoutParams.topMargin = i2;
            } else if (i == 2) {
                marginLayoutParams.setMarginEnd(i2);
            } else if (i == 3) {
                marginLayoutParams.bottomMargin = i2;
            } else if (i == 4) {
                marginLayoutParams.topMargin = i2;
                marginLayoutParams.bottomMargin = i2;
            } else if (i == 5) {
                marginLayoutParams.setMarginStart(i2);
                marginLayoutParams.setMarginEnd(i2);
            }
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new IllegalArgumentException("View must be in a layout that supports margins");
    }

    public static void d(final View view, final int i, final int i2, final int i3, final int i4) {
        if (view != null) {
            final View view2 = (View) view.getParent();
            if (view2 != null) {
                view2.post(new Runnable() { // from class: o.yz
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9870yD.e(view, i, i2, i3, i4, view2);
                    }
                });
            } else {
                InterfaceC1598aHf.a("no parent while expanding touch area");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(View view, int i, int i2, int i3, int i4, View view2) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= i;
        rect.left -= i2;
        rect.right += i3;
        rect.bottom += i4;
        view2.setTouchDelegate(new TouchDelegate(rect, view));
    }

    public static void c(final View view, Drawable drawable, final int i) {
        if ((C8141del.a() && (drawable instanceof Animatable)) || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            return;
        }
        final float intrinsicHeight = i * (drawable.getIntrinsicHeight() / drawable.getIntrinsicWidth());
        view.post(new Runnable() { // from class: o.yH
            @Override // java.lang.Runnable
            public final void run() {
                C9870yD.b(view, i, intrinsicHeight);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(View view, int i, float f) {
        view.getLayoutParams().width = i;
        view.getLayoutParams().height = (int) f;
        view.requestLayout();
    }

    @SuppressLint({"InlinedApi"})
    public static void e(View view) {
        b(view, 16);
    }

    @SuppressLint({"InlinedApi"})
    public static void b(View view) {
        e(view, 16);
    }

    @SuppressLint({"InlinedApi"})
    public static void c(View view) {
        b(view, 8192);
    }

    @SuppressLint({"InlinedApi"})
    public static void a(View view) {
        e(view, 8192);
    }

    private static void b(View view, int i) {
        view.setSystemUiVisibility(i | view.getSystemUiVisibility());
    }

    private static void e(View view, int i) {
        view.setSystemUiVisibility((~i) & view.getSystemUiVisibility());
    }
}
