package o;

import com.airbnb.mvrx.MavericksBlockExecutions;
import com.airbnb.mvrx.MavericksRepository$1;
import com.airbnb.mvrx.MavericksRepository$awaitState$2;
import com.airbnb.mvrx.MavericksRepository$execute$10;
import com.airbnb.mvrx.MavericksRepository$execute$3;
import com.airbnb.mvrx.MavericksRepository$execute$5;
import com.airbnb.mvrx.MavericksRepository$execute$7;
import com.airbnb.mvrx.MavericksRepository$execute$9;
import com.airbnb.mvrx.MavericksRepository$resolveSubscription$1;
import java.lang.reflect.Field;
import java.util.Iterator;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import o.AbstractC8886fF;
import o.AbstractC8918fl;
import o.C8563dqf;
import o.C8632dsu;
import o.C8670due;
import o.C8932fz;
import o.C8961gb;
import o.InterfaceC8888fH;
import o.dpR;
import o.drM;
import o.drX;
import o.dtE;
import o.dtQ;

/* renamed from: o.fF  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8886fF<S extends InterfaceC8888fH> {
    private final InterfaceC8896fP<S> a;
    private final InterfaceC8554dpx b;
    private final C8961gb<S> c;
    private final C8892fL<S> d;
    private final dwU e;

    public AbstractC8886fF(C8892fL<S> c8892fL) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) c8892fL, "");
        this.d = c8892fL;
        dwU e = c8892fL.e();
        this.e = e;
        this.a = c8892fL.a();
        b = dpB.b(new drO<String>(this) { // from class: com.airbnb.mvrx.MavericksRepository$tag$2
            final /* synthetic */ AbstractC8886fF<S> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.e = this;
            }

            @Override // o.drO
            /* renamed from: a */
            public final String invoke() {
                return this.e.getClass().getSimpleName();
            }
        });
        this.b = b;
        this.c = c8892fL.b() ? new C8961gb<>(c8892fL.a().b()) : null;
        if (c8892fL.b()) {
            C8737dwr.c(e, C8752dxf.b(), null, new MavericksRepository$1(this, null), 2, null);
        }
    }

    public final S a() {
        return this.a.b();
    }

    public final dyS<S> e() {
        return this.a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        C8884fD.b(dsA.a(a().getClass()), false, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(final drM<? super S, ? extends S> drm) {
        C8632dsu.c((Object) drm, "");
        if (this.d.b()) {
            this.a.c(new drM<S, S>() { // from class: com.airbnb.mvrx.MavericksRepository$setState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Incorrect return type in method signature: (TS;)TS; */
                @Override // o.drM
                /* renamed from: d */
                public final InterfaceC8888fH invoke(InterfaceC8888fH interfaceC8888fH) {
                    C8961gb c8961gb;
                    dtQ s;
                    dtQ o2;
                    Object obj;
                    C8632dsu.c((Object) interfaceC8888fH, "");
                    InterfaceC8888fH interfaceC8888fH2 = (InterfaceC8888fH) drm.invoke(interfaceC8888fH);
                    InterfaceC8888fH interfaceC8888fH3 = (InterfaceC8888fH) drm.invoke(interfaceC8888fH);
                    if (C8632dsu.c(interfaceC8888fH2, interfaceC8888fH3)) {
                        c8961gb = ((AbstractC8886fF) this).c;
                        if (c8961gb != null) {
                            c8961gb.a(interfaceC8888fH2);
                        }
                        return interfaceC8888fH2;
                    }
                    Field[] declaredFields = interfaceC8888fH2.getClass().getDeclaredFields();
                    C8632dsu.a(declaredFields, "");
                    s = C8563dqf.s(declaredFields);
                    o2 = C8670due.o(s, new drM<Field, dpR>() { // from class: com.airbnb.mvrx.MavericksRepository$setState$1$changedProp$1
                        public final void c(Field field) {
                            field.setAccessible(true);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(Field field) {
                            c(field);
                            return dpR.c;
                        }
                    });
                    Iterator it = o2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        Field field = (Field) obj;
                        if (!C8632dsu.c(field.get(interfaceC8888fH2), field.get(interfaceC8888fH3))) {
                            break;
                        }
                    }
                    Field field2 = (Field) obj;
                    if (field2 == null) {
                        throw new IllegalArgumentException("Impure reducer set on " + this.getClass().getSimpleName() + "! Differing states were provided by the same reducer.Ensure that your state properties properly implement hashCode. First state: " + interfaceC8888fH2 + " -> Second state: " + interfaceC8888fH3);
                    }
                    throw new IllegalArgumentException("Impure reducer set on " + this.getClass().getSimpleName() + "! " + field2.getName() + " changed from " + field2.get(interfaceC8888fH2) + " to " + field2.get(interfaceC8888fH3) + ". Ensure that your state properties properly implement hashCode.");
                }
            });
        } else {
            this.a.c(drm);
        }
    }

    public final Object a(InterfaceC8585dra<? super S> interfaceC8585dra) {
        dwF d = dwH.d(null, 1, null);
        e(new MavericksRepository$awaitState$2(d));
        return d.b(interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(drM<? super S, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        this.a.e(drm);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, o.fF, o.fF<S extends o.fH>] */
    /* JADX WARN: Type inference failed for: r12v1, types: [kotlin.coroutines.EmptyCoroutineContext] */
    public <T> dxD d(drM<? super InterfaceC8585dra<? super T>, ? extends Object> drm, dwQ dwq, final dtE<S, ? extends AbstractC8918fl<? extends T>> dte, final drX<? super S, ? super AbstractC8918fl<? extends T>, ? extends S> drx) {
        dxD c;
        dxD c2;
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) drx, "");
        MavericksBlockExecutions invoke = this.d.d().invoke(this);
        if (invoke != MavericksBlockExecutions.No) {
            if (invoke == MavericksBlockExecutions.WithLoading) {
                d(new drM<S, S>() { // from class: com.airbnb.mvrx.MavericksRepository$execute$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX WARN: Incorrect return type in method signature: (TS;)TS; */
                    @Override // o.drM
                    /* renamed from: c */
                    public final InterfaceC8888fH invoke(InterfaceC8888fH interfaceC8888fH) {
                        C8632dsu.c((Object) interfaceC8888fH, "");
                        return (InterfaceC8888fH) drx.invoke(interfaceC8888fH, new C8932fz(null, 1, null));
                    }
                });
            }
            c2 = C8737dwr.c(this.e, null, null, new MavericksRepository$execute$3(null), 3, null);
            return c2;
        }
        d(new drM<S, S>() { // from class: com.airbnb.mvrx.MavericksRepository$execute$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (TS;)TS; */
            @Override // o.drM
            /* renamed from: b */
            public final InterfaceC8888fH invoke(InterfaceC8888fH interfaceC8888fH) {
                AbstractC8918fl abstractC8918fl;
                C8632dsu.c((Object) interfaceC8888fH, "");
                drX<S, AbstractC8918fl<? extends T>, S> drx2 = drx;
                dtE<S, AbstractC8918fl<T>> dte2 = dte;
                return (InterfaceC8888fH) drx2.invoke(interfaceC8888fH, new C8932fz((dte2 == 0 || (abstractC8918fl = (AbstractC8918fl) dte2.get(interfaceC8888fH)) == null) ? null : abstractC8918fl.c()));
            }
        });
        dwU dwu = this.e;
        dwQ dwq2 = dwq;
        if (dwq == null) {
            dwq2 = EmptyCoroutineContext.e;
        }
        c = C8737dwr.c(dwu, dwq2, null, new MavericksRepository$execute$5(drm, this, drx, dte, null), 2, null);
        return c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> dxD e(dyS<? extends T> dys, dwQ dwq, final dtE<S, ? extends AbstractC8918fl<? extends T>> dte, final drX<? super S, ? super AbstractC8918fl<? extends T>, ? extends S> drx) {
        dxD c;
        C8632dsu.c((Object) dys, "");
        C8632dsu.c((Object) drx, "");
        MavericksBlockExecutions invoke = this.d.d().invoke(this);
        if (invoke != MavericksBlockExecutions.No) {
            if (invoke == MavericksBlockExecutions.WithLoading) {
                d((drM) new drM<S, S>() { // from class: com.airbnb.mvrx.MavericksRepository$execute$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX WARN: Incorrect return type in method signature: (TS;)TS; */
                    @Override // o.drM
                    /* renamed from: c */
                    public final InterfaceC8888fH invoke(InterfaceC8888fH interfaceC8888fH) {
                        AbstractC8918fl abstractC8918fl;
                        C8632dsu.c((Object) interfaceC8888fH, "");
                        drX<S, AbstractC8918fl<? extends T>, S> drx2 = drx;
                        dtE<S, AbstractC8918fl<T>> dte2 = dte;
                        return (InterfaceC8888fH) drx2.invoke(interfaceC8888fH, new C8932fz((dte2 == 0 || (abstractC8918fl = (AbstractC8918fl) dte2.get(interfaceC8888fH)) == null) ? null : abstractC8918fl.c()));
                    }
                });
            }
            c = C8737dwr.c(this.e, null, null, new MavericksRepository$execute$7(null), 3, null);
            return c;
        }
        d((drM) new drM<S, S>() { // from class: com.airbnb.mvrx.MavericksRepository$execute$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (TS;)TS; */
            @Override // o.drM
            /* renamed from: e */
            public final InterfaceC8888fH invoke(InterfaceC8888fH interfaceC8888fH) {
                AbstractC8918fl abstractC8918fl;
                C8632dsu.c((Object) interfaceC8888fH, "");
                drX<S, AbstractC8918fl<? extends T>, S> drx2 = drx;
                dtE<S, AbstractC8918fl<T>> dte2 = dte;
                return (InterfaceC8888fH) drx2.invoke(interfaceC8888fH, new C8932fz((dte2 == 0 || (abstractC8918fl = (AbstractC8918fl) dte2.get(interfaceC8888fH)) == null) ? null : abstractC8918fl.c()));
            }
        });
        dyS a = dyR.a(dyR.e(dys, new MavericksRepository$execute$9(this, drx, dte, null)), (drX) new MavericksRepository$execute$10(this, drx, null));
        dwU dwu = this.e;
        dqZ dqz = dwq;
        if (dwq == null) {
            dqz = EmptyCoroutineContext.e;
        }
        return dyR.e(a, dwY.e(dwu, dqz));
    }

    public final <T> dxD d(dyS<? extends T> dys, drX<? super T, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        dxD c;
        C8632dsu.c((Object) dys, "");
        C8632dsu.c((Object) drx, "");
        c = C8737dwr.c(dwY.e(this.e, this.d.c()), null, CoroutineStart.UNDISPATCHED, new MavericksRepository$resolveSubscription$1(dys, drx, null), 1, null);
        return c;
    }

    public String toString() {
        return getClass().getSimpleName() + ' ' + a();
    }
}
