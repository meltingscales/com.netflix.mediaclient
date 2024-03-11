package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.airbnb.mvrx.ViewModelDoesNotExistException;
import o.AbstractC8899fS;
import o.InterfaceC8888fH;

/* renamed from: o.fC  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8883fC<VM extends AbstractC8899fS<S>, S extends InterfaceC8888fH> implements ViewModelProvider.Factory {
    private final Class<? extends S> a;
    private final boolean b;
    private final C8975gp<VM, S> c;
    private final InterfaceC8890fJ<VM, S> d;
    private final String e;
    private final Class<? extends VM> h;
    private final AbstractC8979gt i;

    public C8883fC(Class<? extends VM> cls, Class<? extends S> cls2, AbstractC8979gt abstractC8979gt, String str, C8975gp<VM, S> c8975gp, boolean z, InterfaceC8890fJ<VM, S> interfaceC8890fJ) {
        C8632dsu.c((Object) cls, "");
        C8632dsu.c((Object) cls2, "");
        C8632dsu.c((Object) abstractC8979gt, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC8890fJ, "");
        this.h = cls;
        this.a = cls2;
        this.i = abstractC8979gt;
        this.e = str;
        this.c = c8975gp;
        this.b = z;
        this.d = interfaceC8890fJ;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls) {
        C8963gd b;
        C8632dsu.c((Object) cls, "");
        C8975gp<VM, S> c8975gp = this.c;
        if (c8975gp != null || !this.b) {
            b = C8885fE.b(this.h, this.a, this.i, c8975gp, this.d);
            C8632dsu.d(b);
            return b;
        }
        throw new ViewModelDoesNotExistException(this.h, this.i, this.e);
    }
}
