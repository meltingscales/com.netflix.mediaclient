package o;

import com.airbnb.mvrx.MavericksBlockExecutions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;

/* renamed from: o.fT  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8900fT {
    private final dqZ a;
    private final List<drX<AbstractC8899fS<?>, AbstractC8901fU<?>, dpR>> b;
    private final boolean c;
    private final dqZ d;
    private final dqZ e;

    public final dqZ a() {
        return this.d;
    }

    public C8900fT(boolean z, dqZ dqz, dqZ dqz2, dqZ dqz3) {
        C8632dsu.c((Object) dqz, "");
        C8632dsu.c((Object) dqz2, "");
        C8632dsu.c((Object) dqz3, "");
        this.c = z;
        this.a = dqz;
        this.e = dqz2;
        this.d = dqz3;
        this.b = new ArrayList();
    }

    public /* synthetic */ C8900fT(boolean z, dqZ dqz, dqZ dqz2, dqZ dqz3, int i, C8627dsp c8627dsp) {
        this(z, (i & 2) != 0 ? EmptyCoroutineContext.e : dqz, (i & 4) != 0 ? EmptyCoroutineContext.e : dqz2, (i & 8) != 0 ? EmptyCoroutineContext.e : dqz3);
    }

    public dwU d() {
        return dwY.c(dxZ.d(null, 1, null).plus(C8752dxf.d().c()).plus(this.a));
    }

    public final <S extends InterfaceC8888fH> AbstractC8901fU<S> e(AbstractC8899fS<S> abstractC8899fS, S s) {
        C8632dsu.c((Object) abstractC8899fS, "");
        C8632dsu.c((Object) s, "");
        AbstractC8901fU<S> c = c(abstractC8899fS, s);
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((drX) it.next()).invoke(abstractC8899fS, c);
        }
        return c;
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* renamed from: o.fT$e */
    /* loaded from: classes.dex */
    public static final class e<S> extends AbstractC8901fU<S> {
        e(dwU dwu, boolean z, C8924fr<S> c8924fr, dqZ dqz) {
            super(z, c8924fr, dwu, dqz);
        }

        @Override // o.AbstractC8901fU
        public <S extends InterfaceC8888fH> MavericksBlockExecutions e(AbstractC8899fS<S> abstractC8899fS) {
            C8632dsu.c((Object) abstractC8899fS, "");
            return MavericksBlockExecutions.No;
        }
    }

    public <S extends InterfaceC8888fH> AbstractC8901fU<S> c(AbstractC8899fS<S> abstractC8899fS, S s) {
        C8632dsu.c((Object) abstractC8899fS, "");
        C8632dsu.c((Object) s, "");
        dwU d = d();
        return new e(d, this.c, new C8924fr(s, d, this.e), this.d);
    }
}
