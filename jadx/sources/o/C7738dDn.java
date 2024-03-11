package o;

import o.InterfaceC7736dDl;

/* renamed from: o.dDn  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7738dDn {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.dDn$c */
    /* loaded from: classes5.dex */
    public static final class c<T> implements InterfaceC7736dDl<T> {
        final /* synthetic */ dBT<T> d;

        @Override // o.InterfaceC7736dDl
        public dBT<?>[] a() {
            return new dBT[]{this.d};
        }

        c(dBT<T> dbt) {
            this.d = dbt;
        }

        @Override // o.InterfaceC7736dDl
        public dBT<?>[] b() {
            return InterfaceC7736dDl.e.b(this);
        }

        @Override // o.dBT, o.dBZ, o.dBP
        public InterfaceC7707dCj e() {
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // o.dBZ
        public void e(InterfaceC7721dCx interfaceC7721dCx, T t) {
            C8632dsu.c((Object) interfaceC7721dCx, "");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // o.dBP
        public T b(InterfaceC7720dCw interfaceC7720dCw) {
            C8632dsu.c((Object) interfaceC7720dCw, "");
            throw new IllegalStateException("unsupported".toString());
        }
    }

    public static final <T> InterfaceC7707dCj a(String str, dBT<T> dbt) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dbt, "");
        return new C7741dDq(str, new c(dbt));
    }
}
