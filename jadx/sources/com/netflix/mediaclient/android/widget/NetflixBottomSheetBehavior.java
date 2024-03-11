package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.C1596aHd;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dqE;

/* loaded from: classes3.dex */
public class NetflixBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    public NetflixBottomSheetBehavior() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetflixBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) attributeSet, "");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C8632dsu.c((Object) coordinatorLayout, "");
        C8632dsu.c((Object) v, "");
        C8632dsu.c((Object) motionEvent, "");
        try {
            return super.onTouchEvent(coordinatorLayout, v, motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) coordinatorLayout, "");
        C8632dsu.c((Object) v, "");
        C8632dsu.c((Object) motionEvent, "");
        try {
            return super.onInterceptTouchEvent(coordinatorLayout, v, motionEvent);
        } catch (NullPointerException e) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd(null, e, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
            return false;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        C8632dsu.c((Object) coordinatorLayout, "");
        C8632dsu.c((Object) v, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) iArr, "");
        try {
            super.onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr, i3);
        } catch (NullPointerException unused) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        C8632dsu.c((Object) coordinatorLayout, "");
        C8632dsu.c((Object) v, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) iArr, "");
        try {
            super.onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        C8632dsu.c((Object) coordinatorLayout, "");
        C8632dsu.c((Object) v, "");
        C8632dsu.c((Object) view, "");
        try {
            return super.onNestedPreFling(coordinatorLayout, v, view, f, f2);
        } catch (NullPointerException unused) {
            return false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        C8632dsu.c((Object) coordinatorLayout, "");
        C8632dsu.c((Object) v, "");
        C8632dsu.c((Object) view, "");
        try {
            super.onStopNestedScroll(coordinatorLayout, v, view);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        C8632dsu.c((Object) coordinatorLayout, "");
        C8632dsu.c((Object) v, "");
        C8632dsu.c((Object) view, "");
        try {
            super.onStopNestedScroll(coordinatorLayout, v, view, i);
        } catch (NullPointerException unused) {
        }
    }
}
