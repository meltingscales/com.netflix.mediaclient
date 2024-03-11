package o;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;

/* renamed from: o.fs  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8925fs extends AbstractC8979gt {
    private final ComponentActivity a;
    private final Object b;
    private final Fragment c;
    private final ViewModelStoreOwner d;
    private final SavedStateRegistry e;

    public static /* synthetic */ C8925fs b(C8925fs c8925fs, ComponentActivity componentActivity, Object obj, Fragment fragment, ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistry savedStateRegistry, int i, Object obj2) {
        if ((i & 1) != 0) {
            componentActivity = c8925fs.a;
        }
        if ((i & 2) != 0) {
            obj = c8925fs.b;
        }
        Object obj3 = obj;
        if ((i & 4) != 0) {
            fragment = c8925fs.c;
        }
        Fragment fragment2 = fragment;
        if ((i & 8) != 0) {
            viewModelStoreOwner = c8925fs.d;
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        if ((i & 16) != 0) {
            savedStateRegistry = c8925fs.e;
        }
        return c8925fs.c(componentActivity, obj3, fragment2, viewModelStoreOwner2, savedStateRegistry);
    }

    @Override // o.AbstractC8979gt
    public SavedStateRegistry a() {
        return this.e;
    }

    @Override // o.AbstractC8979gt
    public Object b() {
        return this.b;
    }

    @Override // o.AbstractC8979gt
    public ComponentActivity c() {
        return this.a;
    }

    public final C8925fs c(ComponentActivity componentActivity, Object obj, Fragment fragment, ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistry savedStateRegistry) {
        C8632dsu.c((Object) componentActivity, "");
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) viewModelStoreOwner, "");
        C8632dsu.c((Object) savedStateRegistry, "");
        return new C8925fs(componentActivity, obj, fragment, viewModelStoreOwner, savedStateRegistry);
    }

    @Override // o.AbstractC8979gt
    public ViewModelStoreOwner d() {
        return this.d;
    }

    public final Fragment e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8925fs) {
            C8925fs c8925fs = (C8925fs) obj;
            return C8632dsu.c(this.a, c8925fs.a) && C8632dsu.c(this.b, c8925fs.b) && C8632dsu.c(this.c, c8925fs.c) && C8632dsu.c(this.d, c8925fs.d) && C8632dsu.c(this.e, c8925fs.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        Object obj = this.b;
        return (((((((hashCode * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "FragmentViewModelContext(activity=" + this.a + ", args=" + this.b + ", fragment=" + this.c + ", owner=" + this.d + ", savedStateRegistry=" + this.e + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C8925fs(androidx.activity.ComponentActivity r7, java.lang.Object r8, androidx.fragment.app.Fragment r9, androidx.lifecycle.ViewModelStoreOwner r10, androidx.savedstate.SavedStateRegistry r11, int r12, o.C8627dsp r13) {
        /*
            r6 = this;
            r13 = r12 & 8
            if (r13 == 0) goto L6
            r4 = r9
            goto L7
        L6:
            r4 = r10
        L7:
            r10 = r12 & 16
            if (r10 == 0) goto L14
            androidx.savedstate.SavedStateRegistry r11 = r9.getSavedStateRegistry()
            java.lang.String r10 = ""
            o.C8632dsu.a(r11, r10)
        L14:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8925fs.<init>(androidx.activity.ComponentActivity, java.lang.Object, androidx.fragment.app.Fragment, androidx.lifecycle.ViewModelStoreOwner, androidx.savedstate.SavedStateRegistry, int, o.dsp):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8925fs(ComponentActivity componentActivity, Object obj, Fragment fragment, ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistry savedStateRegistry) {
        super(null);
        C8632dsu.c((Object) componentActivity, "");
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) viewModelStoreOwner, "");
        C8632dsu.c((Object) savedStateRegistry, "");
        this.a = componentActivity;
        this.b = obj;
        this.c = fragment;
        this.d = viewModelStoreOwner;
        this.e = savedStateRegistry;
    }
}
