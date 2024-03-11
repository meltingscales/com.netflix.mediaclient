package com.netflix.mediaclient.util;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.netflix.mediaclient.util.AccessibilityUtils;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import java.util.List;
import o.C1045Mp;
import o.C8600drp;
import o.C8632dsu;
import o.C9671um;
import o.InterfaceC8598drn;

/* loaded from: classes.dex */
public final class AccessibilityUtils extends C1045Mp {
    private static final BehaviorSubject<Boolean> a;
    public static final AccessibilityUtils e = new AccessibilityUtils();

    public static final void c(View view, RoleDescription roleDescription) {
        C8632dsu.c((Object) view, "");
        e(view, roleDescription, null, null, 6, null);
    }

    private AccessibilityUtils() {
        super("nf_utils_a11y");
    }

    static {
        BehaviorSubject<Boolean> create = BehaviorSubject.create();
        C8632dsu.a(create, "");
        a = create;
    }

    public static final Observable<Boolean> c(Context context) {
        C8632dsu.c((Object) context, "");
        BehaviorSubject<Boolean> behaviorSubject = a;
        if (!behaviorSubject.hasObservers()) {
            final AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager != null) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: o.ddF
                    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                    public final void onTouchExplorationStateChanged(boolean z) {
                        AccessibilityUtils.b(accessibilityManager, z);
                    }
                });
            }
            behaviorSubject.onNext(Boolean.valueOf(a(context)));
        }
        return behaviorSubject;
    }

    public static final void b(AccessibilityManager accessibilityManager, boolean z) {
        boolean z2;
        if (z) {
            z2 = true;
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
            if (!enabledAccessibilityServiceList.isEmpty()) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    e.getLogTag();
                }
                a.onNext(Boolean.valueOf(z2));
            }
        }
        z2 = false;
        a.onNext(Boolean.valueOf(z2));
    }

    public static final boolean a(Context context) {
        AccessibilityManager accessibilityManager;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        if (context != null && (accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility")) != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null) {
            r0 = enabledAccessibilityServiceList.size() > 0;
            e.getLogTag();
        }
        return r0;
    }

    public static /* synthetic */ int a(Context context, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return e(context, i, z);
    }

    public static final int e(Context context, int i, boolean z) {
        int recommendedTimeoutMillis;
        if (context == null || Build.VERSION.SDK_INT < 29) {
            return i;
        }
        int i2 = z ? 4 : 3;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager != null) {
            recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(i, i2);
            return recommendedTimeoutMillis;
        }
        return i;
    }

    public static final void b(Context context, CharSequence charSequence) {
        C8632dsu.c((Object) context, "");
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager == null || !a(context)) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
        obtain.getText().add(charSequence);
        obtain.setEnabled(true);
        obtain.setPackageName(context.getPackageName());
        accessibilityManager.sendAccessibilityEvent(obtain);
    }

    public static final void d(ViewGroup viewGroup, View view, boolean z) {
        C8632dsu.c((Object) viewGroup, "");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != view) {
                if (z) {
                    childAt.setTag(C9671um.a.f, Integer.valueOf(ViewCompat.getImportantForAccessibility(childAt)));
                    ViewCompat.setImportantForAccessibility(childAt, 4);
                } else {
                    Integer num = (Integer) childAt.getTag(C9671um.a.f);
                    if (num == null) {
                        num = 0;
                    }
                    ViewCompat.setImportantForAccessibility(childAt, num.intValue());
                }
            }
        }
    }

    public static final boolean e(Context context) {
        AccessibilityManager accessibilityManager;
        boolean isAudioDescriptionRequested;
        if (context != null && (accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility")) != null) {
            isAudioDescriptionRequested = accessibilityManager.isAudioDescriptionRequested();
            if (isAudioDescriptionRequested) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void e(View view, RoleDescription roleDescription, CharSequence charSequence, CharSequence charSequence2, int i, Object obj) {
        if ((i & 1) != 0) {
            roleDescription = null;
        }
        if ((i & 2) != 0) {
            charSequence = null;
        }
        if ((i & 4) != 0) {
            charSequence2 = null;
        }
        a(view, roleDescription, charSequence, charSequence2);
    }

    /* loaded from: classes.dex */
    public static final class c extends AccessibilityDelegateCompat {
        final /* synthetic */ CharSequence a;
        final /* synthetic */ RoleDescription c;
        final /* synthetic */ CharSequence d;

        c(RoleDescription roleDescription, CharSequence charSequence, CharSequence charSequence2) {
            this.c = roleDescription;
            this.a = charSequence;
            this.d = charSequence2;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) accessibilityNodeInfoCompat, "");
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            RoleDescription roleDescription = this.c;
            if (roleDescription != null) {
                accessibilityNodeInfoCompat.setRoleDescription(roleDescription.d());
            }
            CharSequence charSequence = this.a;
            if (charSequence != null) {
                accessibilityNodeInfoCompat.setHintText(charSequence);
            }
            CharSequence charSequence2 = this.d;
            if (charSequence2 != null) {
                accessibilityNodeInfoCompat.addAction(AccessibilityUtils.e.b(charSequence2));
            }
        }
    }

    public static final void a(View view, RoleDescription roleDescription, CharSequence charSequence, CharSequence charSequence2) {
        C8632dsu.c((Object) view, "");
        ViewCompat.setAccessibilityDelegate(view, new c(roleDescription, charSequence, charSequence2));
    }

    /* loaded from: classes5.dex */
    public static final class RoleDescription {
        private static final /* synthetic */ InterfaceC8598drn b;
        private static final /* synthetic */ RoleDescription[] c;
        public static final RoleDescription e = new RoleDescription("BUTTON", 0, "Button");
        private final String a;

        private static final /* synthetic */ RoleDescription[] e() {
            return new RoleDescription[]{e};
        }

        public static RoleDescription valueOf(String str) {
            return (RoleDescription) Enum.valueOf(RoleDescription.class, str);
        }

        public static RoleDescription[] values() {
            return (RoleDescription[]) c.clone();
        }

        public final String d() {
            return this.a;
        }

        private RoleDescription(String str, int i, String str2) {
            super(str, i);
            this.a = str2;
        }

        static {
            RoleDescription[] e2 = e();
            c = e2;
            b = C8600drp.e(e2);
        }
    }

    public final AccessibilityNodeInfoCompat.AccessibilityActionCompat b(CharSequence charSequence) {
        return new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, charSequence);
    }
}
