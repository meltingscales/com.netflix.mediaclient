package com.netflix.android.widgetry.lolomo;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.os.ParcelableCompat;
import androidx.core.os.ParcelableCompatCreatorCallbacks;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.widgetry.widget.TrackedRecyclerView;
import o.C9893ya;
import o.InterfaceC9907yo;

/* loaded from: classes2.dex */
public class LolomoRecyclerView extends TrackedRecyclerView implements InterfaceC9907yo {
    private final PointF a;
    private C9893ya b;
    private float c;
    private boolean d;
    private final int e;
    private boolean g;

    @Override // com.netflix.android.widgetry.widget.TrackedRecyclerView
    public String c() {
        return "LolomoRecyclerView";
    }

    @Override // o.InterfaceC9907yo
    public RecyclerView d() {
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
    }

    public void setFlingSpeedScale(float f) {
        this.c = f;
    }

    public void setHeaderView(View view) {
    }

    public LolomoRecyclerView(Context context) {
        this(context, null);
    }

    public LolomoRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LolomoRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 0.8f;
        this.a = new PointF();
        this.g = false;
        this.d = false;
        this.e = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        b();
    }

    private void b() {
        setItemAnimator(null);
    }

    public void setLolomoAdapter(BaseVerticalRecyclerViewAdapter baseVerticalRecyclerViewAdapter) {
        super.setAdapter(baseVerticalRecyclerViewAdapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.g || !this.d) {
            return;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent.getAction() == 0) {
            this.a.x = motionEvent.getX();
            this.a.y = motionEvent.getY();
            this.g = false;
            this.d = false;
        } else if (motionEvent.getAction() == 2 && !this.d && !this.g) {
            float abs = Math.abs(this.a.y - motionEvent.getY());
            float abs2 = Math.abs(this.a.x - motionEvent.getX());
            float f = this.e;
            this.g = abs > f;
            if (abs2 > f && abs2 > abs) {
                z = true;
            }
            this.d = z;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setBackgroundItemDecoration(C9893ya c9893ya) {
        e();
        addItemDecoration(c9893ya);
        this.b = c9893ya;
        invalidate();
    }

    @Override // o.InterfaceC9907yo
    public void e() {
        C9893ya c9893ya = this.b;
        if (c9893ya != null) {
            removeItemDecoration(c9893ya);
            if (this.b.b() != null) {
                this.b.b().e();
            }
            this.b = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !e(motionEvent) && super.onInterceptTouchEvent(motionEvent);
    }

    private boolean e(MotionEvent motionEvent) {
        return motionEvent.getAction() == 2 && this.d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @Deprecated
    public void setAdapter(RecyclerView.Adapter adapter) {
        setLolomoAdapter((BaseVerticalRecyclerViewAdapter) adapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        return super.fling(i, (int) (i2 * this.c));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = getAdapter() instanceof BaseVerticalRecyclerViewAdapter ? ((BaseVerticalRecyclerViewAdapter) getAdapter()).a(this) : null;
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (getAdapter() instanceof BaseVerticalRecyclerViewAdapter) {
            ((BaseVerticalRecyclerViewAdapter) getAdapter()).e(savedState.c);
        }
    }

    @Override // o.InterfaceC9907yo
    public void setStaticBackground(Drawable drawable) {
        setBackground(drawable);
    }

    @Override // o.InterfaceC9907yo
    public Drawable a() {
        return getBackground();
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks<SavedState>() { // from class: com.netflix.android.widgetry.lolomo.LolomoRecyclerView.SavedState.3
            @Override // androidx.core.os.ParcelableCompatCreatorCallbacks
            /* renamed from: d */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // androidx.core.os.ParcelableCompatCreatorCallbacks
            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        });
        Parcelable c;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readParcelable(classLoader == null ? RecyclerView.LayoutManager.class.getClassLoader() : classLoader);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, 0);
        }
    }
}
