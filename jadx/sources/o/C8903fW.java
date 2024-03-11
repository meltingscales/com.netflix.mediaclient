package o;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import o.C8632dsu;
import o.C8970gk;
import o.InterfaceC8888fH;

/* renamed from: o.fW */
/* loaded from: classes2.dex */
public final class C8903fW {
    public static final C8903fW c = new C8903fW();

    private C8903fW() {
    }

    public static /* synthetic */ AbstractC8899fS e(C8903fW c8903fW, Class cls, Class cls2, AbstractC8979gt abstractC8979gt, String str, boolean z, InterfaceC8890fJ interfaceC8890fJ, int i, Object obj) {
        if ((i & 8) != 0) {
            str = cls.getName();
            C8632dsu.a(str, "");
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            interfaceC8890fJ = new C8968gi();
        }
        return c8903fW.d(cls, cls2, abstractC8979gt, str2, z2, interfaceC8890fJ);
    }

    public final <VM extends AbstractC8899fS<S>, S extends InterfaceC8888fH> VM d(final Class<? extends VM> cls, final Class<? extends S> cls2, AbstractC8979gt abstractC8979gt, String str, boolean z, InterfaceC8890fJ<VM, S> interfaceC8890fJ) {
        AbstractC8979gt a;
        C8632dsu.c((Object) cls, "");
        C8632dsu.c((Object) cls2, "");
        C8632dsu.c((Object) abstractC8979gt, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC8890fJ, "");
        SavedStateRegistry a2 = abstractC8979gt.a();
        if (!a2.isRestored()) {
            throw new IllegalStateException("You can only access a view model after super.onCreate of your activity/fragment has been called.".toString());
        }
        Bundle consumeRestoredStateForKey = a2.consumeRestoredStateForKey(str);
        final C8975gp<VM, S> a3 = consumeRestoredStateForKey != null ? a(consumeRestoredStateForKey, abstractC8979gt) : null;
        AbstractC8979gt abstractC8979gt2 = (a3 == null || (a = a3.a()) == null) ? abstractC8979gt : a;
        ViewModel viewModel = new ViewModelProvider(abstractC8979gt.d(), new C8883fC(cls, cls2, abstractC8979gt2, str, a3, z, interfaceC8890fJ)).get(str, C8963gd.class);
        C8632dsu.d(viewModel);
        final C8963gd c8963gd = (C8963gd) viewModel;
        try {
            final AbstractC8979gt abstractC8979gt3 = abstractC8979gt2;
            abstractC8979gt.a().registerSavedStateProvider(str, new SavedStateRegistry.SavedStateProvider() { // from class: o.fX
                @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                public final Bundle saveState() {
                    Bundle e;
                    e = C8903fW.e(C8963gd.this, abstractC8979gt3, a3, cls, cls2);
                    return e;
                }
            });
        } catch (IllegalArgumentException unused) {
        }
        return (VM) c8963gd.e();
    }

    public static final Bundle e(C8963gd c8963gd, AbstractC8979gt abstractC8979gt, C8975gp c8975gp, Class cls, Class cls2) {
        Class b;
        Class d;
        C8632dsu.c((Object) c8963gd, "");
        C8632dsu.c((Object) abstractC8979gt, "");
        C8632dsu.c((Object) cls, "");
        C8632dsu.c((Object) cls2, "");
        C8903fW c8903fW = c;
        AbstractC8899fS e = c8963gd.e();
        Object b2 = abstractC8979gt.b();
        if (c8975gp != null && (d = c8975gp.d()) != null) {
            cls = d;
        }
        if (c8975gp != null && (b = c8975gp.b()) != null) {
            cls2 = b;
        }
        return c8903fW.b(e, b2, cls, cls2);
    }

    private final <VM extends AbstractC8899fS<S>, S extends InterfaceC8888fH> Bundle b(VM vm, final Object obj, final Class<? extends VM> cls, final Class<? extends S> cls2) {
        return (Bundle) C8980gu.c(vm, new drM<S, Bundle>() { // from class: com.airbnb.mvrx.MavericksViewModelProvider$getSavedStateBundle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect types in method signature: (TS;)Landroid/os/Bundle; */
            @Override // o.drM
            /* renamed from: e */
            public final Bundle invoke(InterfaceC8888fH interfaceC8888fH) {
                C8632dsu.c((Object) interfaceC8888fH, "");
                Bundle bundle = new Bundle();
                Serializable serializable = cls;
                Class<? extends S> cls3 = cls2;
                Object obj2 = obj;
                bundle.putBundle("mvrx:saved_instance_state", C8970gk.c(interfaceC8888fH, false, 2, null));
                bundle.putSerializable("mvrx:saved_viewmodel_class", serializable);
                bundle.putSerializable("mvrx:saved_state_class", cls3);
                if (obj2 != null) {
                    if (obj2 instanceof Parcelable) {
                        bundle.putParcelable("mvrx:saved_args", (Parcelable) obj2);
                    } else if (!(obj2 instanceof Serializable)) {
                        throw new IllegalStateException("Args must be parcelable or serializable".toString());
                    } else {
                        bundle.putSerializable("mvrx:saved_args", (Serializable) obj2);
                    }
                }
                return bundle;
            }
        });
    }

    private final <VM extends AbstractC8899fS<S>, S extends InterfaceC8888fH> C8975gp<VM, S> a(Bundle bundle, AbstractC8979gt abstractC8979gt) {
        AbstractC8979gt b;
        Object obj = bundle.get("mvrx:saved_args");
        final Bundle bundle2 = bundle.getBundle("mvrx:saved_instance_state");
        Serializable serializable = bundle.getSerializable("mvrx:saved_viewmodel_class");
        Class cls = serializable instanceof Class ? (Class) serializable : null;
        Serializable serializable2 = bundle.getSerializable("mvrx:saved_state_class");
        Class cls2 = serializable2 instanceof Class ? (Class) serializable2 : null;
        if (bundle2 != null) {
            if (cls != null) {
                if (cls2 == null) {
                    throw new IllegalArgumentException("State class was not properly saved prior to restoring!".toString());
                }
                if (abstractC8979gt instanceof C8916fj) {
                    b = C8916fj.e((C8916fj) abstractC8979gt, null, obj, null, null, 13, null);
                } else if (!(abstractC8979gt instanceof C8925fs)) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    b = C8925fs.b((C8925fs) abstractC8979gt, null, obj, null, null, null, 29, null);
                }
                return new C8975gp<>(b, cls, cls2, new drM<S, S>() { // from class: com.airbnb.mvrx.MavericksViewModelProvider$toStateRestorer$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Incorrect return type in method signature: (TS;)TS; */
                    @Override // o.drM
                    /* renamed from: b */
                    public final InterfaceC8888fH invoke(InterfaceC8888fH interfaceC8888fH) {
                        C8632dsu.c((Object) interfaceC8888fH, "");
                        return C8970gk.a(bundle2, interfaceC8888fH, false, 4, null);
                    }
                });
            }
            throw new IllegalArgumentException("ViewModel class was not properly saved prior to restoring!".toString());
        }
        throw new IllegalArgumentException("State was not saved prior to restoring!".toString());
    }
}
