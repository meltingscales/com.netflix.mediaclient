package o;

import java.util.ArrayList;
import java.util.List;
import o.AbstractC3495b;
import o.C8632dsu;
import o.InterfaceC9145k;
import o.InterfaceC9357o;

/* renamed from: o.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3495b<RowType> {
    private final drM<InterfaceC9145k, RowType> b;

    public final drM<InterfaceC9145k, RowType> a() {
        return this.b;
    }

    public abstract <R> InterfaceC9357o<R> e(drM<? super InterfaceC9145k, ? extends InterfaceC9357o<R>> drm);

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3495b(drM<? super InterfaceC9145k, ? extends RowType> drm) {
        C8632dsu.c((Object) drm, "");
        this.b = drm;
    }

    public final List<RowType> c() {
        return (List) e(new drM<InterfaceC9145k, InterfaceC9357o<List<RowType>>>(this) { // from class: app.cash.sqldelight.ExecutableQuery$executeAsList$1
            final /* synthetic */ AbstractC3495b<RowType> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.c = this;
            }

            @Override // o.drM
            /* renamed from: c */
            public final InterfaceC9357o<List<RowType>> invoke(InterfaceC9145k interfaceC9145k) {
                C8632dsu.c((Object) interfaceC9145k, "");
                ArrayList arrayList = new ArrayList();
                while (interfaceC9145k.c().d().booleanValue()) {
                    arrayList.add(this.c.a().invoke(interfaceC9145k));
                }
                return InterfaceC9357o.d.d(InterfaceC9357o.d.a(arrayList));
            }
        }).d();
    }

    public final RowType d() {
        RowType b = b();
        if (b != null) {
            return b;
        }
        throw new NullPointerException("ResultSet returned null for " + this);
    }

    public final RowType b() {
        return (RowType) e(new drM<InterfaceC9145k, InterfaceC9357o<RowType>>(this) { // from class: app.cash.sqldelight.ExecutableQuery$executeAsOneOrNull$1
            final /* synthetic */ AbstractC3495b<RowType> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.c = this;
            }

            @Override // o.drM
            /* renamed from: b */
            public final InterfaceC9357o<RowType> invoke(InterfaceC9145k interfaceC9145k) {
                C8632dsu.c((Object) interfaceC9145k, "");
                if (interfaceC9145k.c().d().booleanValue()) {
                    RowType invoke = this.c.a().invoke(interfaceC9145k);
                    boolean booleanValue = interfaceC9145k.c().d().booleanValue();
                    AbstractC3495b<RowType> abstractC3495b = this.c;
                    if (!(!booleanValue)) {
                        throw new IllegalStateException(("ResultSet returned more than 1 row for " + abstractC3495b).toString());
                    }
                    return InterfaceC9357o.d.d(InterfaceC9357o.d.a(invoke));
                }
                return InterfaceC9357o.d.d(InterfaceC9357o.d.a(null));
            }
        }).d();
    }
}
