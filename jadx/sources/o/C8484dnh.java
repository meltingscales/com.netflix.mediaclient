package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import o.InterfaceC8488dnl;

/* renamed from: o.dnh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8484dnh extends ViewModel implements InterfaceC8488dnl {
    private final C8493dnq c = new C8493dnq(null);

    @Override // o.InterfaceC8488dnl
    public Object b(String str) {
        C8632dsu.c((Object) str, "");
        return this.c.b(str);
    }

    @Override // o.InterfaceC8488dnl
    public InterfaceC8488dnl.b e(String str, InterfaceC8494dnr interfaceC8494dnr) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC8494dnr, "");
        return this.c.e(str, interfaceC8494dnr);
    }

    @Override // o.InterfaceC8488dnl
    public void a() {
        this.c.a();
    }

    @Override // o.InterfaceC8488dnl
    public void a(String str) {
        C8632dsu.c((Object) str, "");
        this.c.a(str);
    }

    public void d() {
        this.c.d();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.c.c().clear();
        this.c.e().clear();
    }

    /* renamed from: o.dnh$b */
    /* loaded from: classes5.dex */
    public static final class b implements ViewModelProvider.Factory {
        public static final b b = new b();

        private b() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            C8632dsu.c((Object) cls, "");
            return new C8484dnh();
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
            C8632dsu.c((Object) cls, "");
            C8632dsu.c((Object) creationExtras, "");
            return (T) create(cls);
        }
    }
}
