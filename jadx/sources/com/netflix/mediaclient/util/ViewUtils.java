package com.netflix.mediaclient.util;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_DisplayCutoutDisable;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.util.ViewUtils;
import java.util.Comparator;
import o.C1044Mm;
import o.C1596aHd;
import o.C8054ddD;
import o.C8168dfL;
import o.InterfaceC1598aHf;

/* loaded from: classes.dex */
public class ViewUtils {
    public static final Comparator<a> c = new Comparator<a>() { // from class: com.netflix.mediaclient.util.ViewUtils.1
        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(a aVar, a aVar2) {
            Rect b = ViewUtils.b(aVar.e(), true);
            Rect b2 = ViewUtils.b(aVar2.e(), true);
            int i = b.bottom;
            int i2 = b2.bottom;
            if (i < i2) {
                return 1;
            }
            return i > i2 ? -1 : 0;
        }
    };

    /* loaded from: classes5.dex */
    public enum Visibility {
        VISIBLE,
        INVISIBLE,
        GONE
    }

    public static void d(DialogFragment dialogFragment, FragmentManager fragmentManager, FragmentTransaction fragmentTransaction, String str) {
        if (dialogFragment == null || fragmentManager == null || C8168dfL.g(str) || fragmentTransaction == null) {
            return;
        }
        fragmentManager.executePendingTransactions();
        if (dialogFragment.isAdded()) {
            return;
        }
        if (fragmentManager.findFragmentByTag(str) == null) {
            dialogFragment.show(fragmentTransaction, str);
            return;
        }
        d(str, dialogFragment);
        fragmentTransaction.commitAllowingStateLoss();
    }

    private static void d(String str, DialogFragment dialogFragment) {
        String format = String.format("SPY-8702, tried to add %s frag %s twice", dialogFragment.getClass().getName(), str);
        C1044Mm.d("ViewUtils", format);
        InterfaceC1598aHf.a(new C1596aHd(format).b(false));
    }

    public static void d(View view, boolean z) {
        d(view, z ? Visibility.VISIBLE : Visibility.GONE);
    }

    public static void a(View view, boolean z) {
        d(view, z ? Visibility.VISIBLE : Visibility.INVISIBLE);
    }

    @Deprecated
    public static void d(View view, Visibility visibility) {
        int i;
        if (view == null || visibility == null) {
            return;
        }
        if (visibility == Visibility.VISIBLE) {
            i = 0;
        } else {
            i = visibility == Visibility.INVISIBLE ? 4 : 8;
        }
        view.setVisibility(i);
    }

    public static void b(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(view.getContext().getString(R.o.fJ));
        }
    }

    public static void d(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(view.getContext().getString(R.o.dS));
        }
    }

    public static void a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public static boolean e(View view) {
        Context context = view.getContext();
        if (context instanceof Activity) {
            return C8054ddD.l((Activity) context);
        }
        return false;
    }

    public static void d(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static Bitmap d(Bitmap bitmap) {
        int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(max, max, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0);
        canvas.drawBitmap(bitmap, (max - bitmap.getWidth()) / 2, (max - bitmap.getHeight()) / 2, (Paint) null);
        return createBitmap;
    }

    public static void d(View view, Rect rect) {
        rect.left = (int) view.getX();
        rect.top = (int) view.getY();
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
    }

    public static Rect b(View view, boolean z) {
        C1044Mm.e("ViewUtils", "getRect");
        if (z) {
            Object tag = view.getTag();
            if (tag instanceof Rect) {
                C1044Mm.e("ViewUtils", "Rectangle was known from before, use it");
                return (Rect) tag;
            }
            C1044Mm.e("ViewUtils", "Rectangle was NOT known from before, calculate");
            Rect rect = new Rect();
            d(view, rect);
            view.setTag(rect);
            return rect;
        }
        Rect rect2 = new Rect();
        d(view, rect2);
        return rect2;
    }

    /* loaded from: classes5.dex */
    public static class a implements Comparable<a> {
        private final View d;
        public static final Comparator<a> c = new Comparator<a>() { // from class: com.netflix.mediaclient.util.ViewUtils.a.4
            @Override // java.util.Comparator
            /* renamed from: b */
            public int compare(a aVar, a aVar2) {
                Rect b2 = ViewUtils.b(aVar.e(), true);
                Rect b3 = ViewUtils.b(aVar2.e(), true);
                int i = b2.top;
                int i2 = b3.top;
                if (i < i2) {
                    return 1;
                }
                return i > i2 ? -1 : 0;
            }
        };
        public static final Comparator<a> b = new Comparator<a>() { // from class: com.netflix.mediaclient.util.ViewUtils.a.2
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(a aVar, a aVar2) {
                Rect b2 = ViewUtils.b(aVar.e(), true);
                Rect b3 = ViewUtils.b(aVar2.e(), true);
                int i = b2.top;
                int i2 = b3.top;
                if (i < i2) {
                    return -1;
                }
                return i > i2 ? 1 : 0;
            }
        };
        public static final Comparator<a> e = new Comparator<a>() { // from class: com.netflix.mediaclient.util.ViewUtils.a.5
            @Override // java.util.Comparator
            /* renamed from: e */
            public int compare(a aVar, a aVar2) {
                Rect b2 = ViewUtils.b(aVar.e(), true);
                Rect b3 = ViewUtils.b(aVar2.e(), true);
                int i = b2.bottom;
                int i2 = b3.bottom;
                if (i < i2) {
                    return -1;
                }
                return i > i2 ? 1 : 0;
            }
        };

        public View e() {
            return this.d;
        }

        @Override // java.lang.Comparable
        /* renamed from: d */
        public int compareTo(a aVar) {
            Rect b2 = ViewUtils.b(this.d, true);
            Rect b3 = ViewUtils.b(aVar.e(), true);
            int i = b2.bottom;
            int i2 = b3.bottom;
            if (i < i2) {
                return -1;
            }
            return i > i2 ? 1 : 0;
        }
    }

    public static int d(Context context) {
        return context.getResources().getDimensionPixelSize(R.b.m);
    }

    public static void e(TextView textView) {
        textView.setTypeface(Typeface.create(textView.getTypeface(), 1));
    }

    public static void b(TextView textView, int i) {
        textView.setTextSize(0, textView.getResources().getDimensionPixelOffset(i));
    }

    public static int c(Context context, boolean z) {
        int identifier = context.getResources().getIdentifier(z ? "navigation_bar_height" : "navigation_bar_height_landscape", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        C1044Mm.d("ViewUtils", "Nav bar height uknown!");
        return 0;
    }

    public static int b(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        C1044Mm.d("ViewUtils", "Status bar height uknown!");
        return 0;
    }

    public static void a(TextView textView) {
        textView.setAlpha(1.0f);
    }

    public static void c(TextView textView) {
        textView.setAlpha(0.7f);
    }

    public static void a(TextView textView, int i) {
        textView.setTextAppearance(i);
    }

    public static void d(Drawable drawable, int i) {
        DrawableCompat.setTint(DrawableCompat.wrap(drawable), i);
    }

    public static void a(Window window) {
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (!Config_FastProperty_DisplayCutoutDisable.Companion.a()) {
                attributes.layoutInDisplayCutoutMode = 1;
            } else {
                attributes.layoutInDisplayCutoutMode = 0;
            }
            window.setAttributes(attributes);
        }
    }

    public static void b(Window window) {
        if (Build.VERSION.SDK_INT >= 30) {
            window.setDecorFitsSystemWindows(false);
        } else {
            window.setFlags(1024, 1024);
        }
        window.setLayout(-1, -1);
    }

    public static void b(final View view, int i, boolean z) {
        if (z) {
            ValueAnimator ofInt = ValueAnimator.ofInt(view.getPaddingBottom(), i);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.dfZ
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ViewUtils.c(view, valueAnimator);
                }
            });
            ofInt.setDuration(150L);
            ofInt.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(View view, ValueAnimator valueAnimator) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
