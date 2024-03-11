package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* loaded from: classes2.dex */
public final class CheckedTextViewCompat {
    public static void setCheckMarkTintList(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        Api21Impl.setCheckMarkTintList(checkedTextView, colorStateList);
    }

    public static void setCheckMarkTintMode(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        Api21Impl.setCheckMarkTintMode(checkedTextView, mode);
    }

    public static Drawable getCheckMarkDrawable(CheckedTextView checkedTextView) {
        return Api16Impl.getCheckMarkDrawable(checkedTextView);
    }

    /* loaded from: classes2.dex */
    static class Api21Impl {
        static void setCheckMarkTintList(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        static void setCheckMarkTintMode(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    /* loaded from: classes2.dex */
    static class Api16Impl {
        static Drawable getCheckMarkDrawable(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }
}
