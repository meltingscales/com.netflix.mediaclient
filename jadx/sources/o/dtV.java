package o;

import java.util.Iterator;

/* loaded from: classes.dex */
class dtV {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class c<T> implements dtQ<T> {
        final /* synthetic */ drX d;

        public c(drX drx) {
            this.d = drx;
        }

        @Override // o.dtQ
        public Iterator<T> iterator() {
            Iterator<T> c;
            c = dtV.c(this.d);
            return c;
        }
    }

    public static <T> dtQ<T> e(drX<? super dtW<? super T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        C8632dsu.c((Object) drx, "");
        return new c(drx);
    }

    public static <T> Iterator<T> c(drX<? super dtW<? super T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        InterfaceC8585dra<? super dpR> c2;
        C8632dsu.c((Object) drx, "");
        dtU dtu = new dtU();
        c2 = C8590drf.c(drx, dtu, dtu);
        dtu.d(c2);
        return dtu;
    }
}
