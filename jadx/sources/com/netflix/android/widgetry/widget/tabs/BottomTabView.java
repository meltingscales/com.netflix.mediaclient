package com.netflix.android.widgetry.widget.tabs;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.netflix.android.widgetry.widget.tabs.BottomTabView;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import o.C9834xU;
import o.C9933zN;
import o.C9936zQ;

/* loaded from: classes.dex */
public class BottomTabView extends FrameLayout {
    private static final int[] b = {16842912};
    private static final int[] e = {-16842910};
    private b a;
    private c c;
    protected final C9933zN d;
    private boolean f;
    private final List<C9936zQ> i;

    /* loaded from: classes.dex */
    public interface b {
        void c(C9936zQ c9936zQ);
    }

    /* loaded from: classes2.dex */
    public interface c {
        boolean b(C9936zQ c9936zQ);
    }

    public void setOnTabReselectedListener(b bVar) {
        this.a = bVar;
    }

    public void setOnTabSelectedListener(c cVar) {
        this.c = cVar;
    }

    public void setUpdateSuspended(boolean z) {
        this.f = z;
    }

    public BottomTabView(Context context) {
        this(context, null);
    }

    public BottomTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new ArrayList(5);
        this.f = false;
        C9933zN e2 = e(context);
        this.d = e2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        e2.setLayoutParams(layoutParams);
        e2.setTabView(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9834xU.n.g, i, 0);
        if (obtainStyledAttributes.hasValue(C9834xU.n.f)) {
            e2.setIconTintList(obtainStyledAttributes.getColorStateList(C9834xU.n.f));
        } else {
            e2.setIconTintList(f(16842808));
        }
        if (obtainStyledAttributes.hasValue(C9834xU.n.j)) {
            e2.setItemTextColor(obtainStyledAttributes.getColorStateList(C9834xU.n.j));
        } else {
            e2.setItemTextColor(f(16842808));
        }
        if (obtainStyledAttributes.hasValue(C9834xU.n.h)) {
            ViewCompat.setElevation(this, obtainStyledAttributes.getDimensionPixelSize(C9834xU.n.h, 0));
        }
        e2.setItemBackgroundRes(obtainStyledAttributes.getResourceId(C9834xU.n.i, 0));
        obtainStyledAttributes.recycle();
        addView(e2, layoutParams);
        e2.setTabClickListener(new C9933zN.b() { // from class: com.netflix.android.widgetry.widget.tabs.BottomTabView.2
            @Override // o.C9933zN.b
            public boolean b(C9936zQ c9936zQ) {
                return BottomTabView.this.e(c9936zQ);
            }
        });
    }

    protected C9933zN e(Context context) {
        return new C9933zN(context);
    }

    public boolean e(int i) {
        return this.d.c(i);
    }

    public void setTabs(List<C9936zQ> list) {
        if (list != null && list.size() > 5) {
            throw new IllegalArgumentException("BottomTabView only supports 5 tabs");
        }
        setUpdateSuspended(true);
        this.i.clear();
        this.i.addAll(list);
        this.d.a(list);
        setUpdateSuspended(false);
        c(true);
    }

    public void b(final C9936zQ c9936zQ) {
        setUpdateSuspended(true);
        this.i.removeIf(new Predicate() { // from class: o.zM
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean b2;
                b2 = BottomTabView.b(C9936zQ.this, (C9936zQ) obj);
                return b2;
            }
        });
        this.d.a(this.i);
        setUpdateSuspended(false);
        c(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(C9936zQ c9936zQ, C9936zQ c9936zQ2) {
        return c9936zQ2.b() == c9936zQ.b();
    }

    public BadgeView d(int i) {
        return this.d.a(i);
    }

    public BadgeView b(int i) {
        return this.d.d(i);
    }

    public View c(int i) {
        return this.d.b(i);
    }

    public void setTabImageUrl(int i, String str) {
        this.d.setTabImageUrl(i, str);
    }

    public void setBadgeContentDescription(int i, CharSequence charSequence) {
        this.d.setBadgeContentDescription(i, charSequence);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.d.setIconTintList(colorStateList);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.d.setItemTextColor(colorStateList);
    }

    public void setItemBackgroundResource(int i) {
        this.d.setItemBackgroundRes(i);
    }

    public int d() {
        return this.d.a();
    }

    protected C9936zQ a(int i) {
        for (C9936zQ c9936zQ : this.i) {
            if (c9936zQ.b() == i) {
                return c9936zQ;
            }
        }
        return null;
    }

    public void setSelectedTabId(int i, boolean z) {
        C9936zQ a = a(i);
        if (a != null) {
            if (z) {
                if (e(a)) {
                    this.d.setSelectedTab(a);
                    return;
                }
                return;
            }
            this.d.setSelectedTab(a);
        }
    }

    public void setLabelVisibility(boolean z) {
        this.d.setLabelVisibility(z);
    }

    private ColorStateList f(int i) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
                int i2 = typedValue.data;
                int defaultColor = colorStateList.getDefaultColor();
                int[] iArr = e;
                return new ColorStateList(new int[][]{iArr, b, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i2, defaultColor});
            }
            return null;
        }
        return null;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.d.a();
        savedState.d = new Bundle();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.d.e(savedState.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.netflix.android.widgetry.widget.tabs.BottomTabView.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: c */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: d */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        int a;
        Bundle d;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            d(parcel, classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeBundle(this.d);
        }

        private void d(Parcel parcel, ClassLoader classLoader) {
            this.a = parcel.readInt();
            this.d = parcel.readBundle(classLoader);
        }
    }

    public void c(boolean z) {
        if (this.f) {
            return;
        }
        if (z) {
            this.d.d();
        } else {
            this.d.c();
        }
    }

    public boolean e(C9936zQ c9936zQ) {
        if (this.a == null || c9936zQ.b() != d()) {
            c cVar = this.c;
            return cVar != null && cVar.b(c9936zQ);
        }
        this.a.c(c9936zQ);
        return true;
    }
}
