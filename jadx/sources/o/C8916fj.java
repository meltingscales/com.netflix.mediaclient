package o;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;

/* renamed from: o.fj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8916fj extends AbstractC8979gt {
    private final ComponentActivity a;
    private final ViewModelStoreOwner c;
    private final SavedStateRegistry d;
    private final Object e;

    public static /* synthetic */ C8916fj e(C8916fj c8916fj, ComponentActivity componentActivity, Object obj, ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistry savedStateRegistry, int i, Object obj2) {
        if ((i & 1) != 0) {
            componentActivity = c8916fj.a;
        }
        if ((i & 2) != 0) {
            obj = c8916fj.e;
        }
        if ((i & 4) != 0) {
            viewModelStoreOwner = c8916fj.c;
        }
        if ((i & 8) != 0) {
            savedStateRegistry = c8916fj.d;
        }
        return c8916fj.e(componentActivity, obj, viewModelStoreOwner, savedStateRegistry);
    }

    @Override // o.AbstractC8979gt
    public SavedStateRegistry a() {
        return this.d;
    }

    @Override // o.AbstractC8979gt
    public Object b() {
        return this.e;
    }

    @Override // o.AbstractC8979gt
    public ComponentActivity c() {
        return this.a;
    }

    @Override // o.AbstractC8979gt
    public ViewModelStoreOwner d() {
        return this.c;
    }

    public final C8916fj e(ComponentActivity componentActivity, Object obj, ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistry savedStateRegistry) {
        C8632dsu.c((Object) componentActivity, "");
        C8632dsu.c((Object) viewModelStoreOwner, "");
        C8632dsu.c((Object) savedStateRegistry, "");
        return new C8916fj(componentActivity, obj, viewModelStoreOwner, savedStateRegistry);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8916fj) {
            C8916fj c8916fj = (C8916fj) obj;
            return C8632dsu.c(this.a, c8916fj.a) && C8632dsu.c(this.e, c8916fj.e) && C8632dsu.c(this.c, c8916fj.c) && C8632dsu.c(this.d, c8916fj.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        Object obj = this.e;
        return (((((hashCode * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ActivityViewModelContext(activity=" + this.a + ", args=" + this.e + ", owner=" + this.c + ", savedStateRegistry=" + this.d + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C8916fj(androidx.activity.ComponentActivity r1, java.lang.Object r2, androidx.lifecycle.ViewModelStoreOwner r3, androidx.savedstate.SavedStateRegistry r4, int r5, o.C8627dsp r6) {
        /*
            r0 = this;
            r6 = r5 & 4
            if (r6 == 0) goto L5
            r3 = r1
        L5:
            r5 = r5 & 8
            if (r5 == 0) goto L12
            androidx.savedstate.SavedStateRegistry r4 = r1.getSavedStateRegistry()
            java.lang.String r5 = ""
            o.C8632dsu.a(r4, r5)
        L12:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8916fj.<init>(androidx.activity.ComponentActivity, java.lang.Object, androidx.lifecycle.ViewModelStoreOwner, androidx.savedstate.SavedStateRegistry, int, o.dsp):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8916fj(ComponentActivity componentActivity, Object obj, ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistry savedStateRegistry) {
        super(null);
        C8632dsu.c((Object) componentActivity, "");
        C8632dsu.c((Object) viewModelStoreOwner, "");
        C8632dsu.c((Object) savedStateRegistry, "");
        this.a = componentActivity;
        this.e = obj;
        this.c = viewModelStoreOwner;
        this.d = savedStateRegistry;
    }
}
