package o;

import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.at  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3126at extends AbstractC3336ax<C2077aZ> {
    public final List<AbstractC3073as<?>> b;
    private Boolean c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.at$c */
    /* loaded from: classes2.dex */
    public interface c {
        void d(AbstractC3073as abstractC3073as, C1511aE c1511aE, int i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean e(AbstractC3073as<?> abstractC3073as, int i) {
        return true;
    }

    @Override // o.AbstractC3336ax
    public /* bridge */ /* synthetic */ void a(C2077aZ c2077aZ, AbstractC3073as abstractC3073as) {
        a2(c2077aZ, (AbstractC3073as<?>) abstractC3073as);
    }

    @Override // o.AbstractC3336ax
    public /* synthetic */ void b(C2077aZ c2077aZ, List list) {
        d(c2077aZ, (List<Object>) list);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public /* synthetic */ void c(Object obj, AbstractC3073as abstractC3073as) {
        a2((C2077aZ) obj, (AbstractC3073as<?>) abstractC3073as);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public /* bridge */ /* synthetic */ void d(Object obj, List list) {
        d((C2077aZ) obj, (List<Object>) list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C3126at() {
        this.d = false;
        this.c = null;
        this.b = new ArrayList();
        this.d = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C3126at(int i) {
        this();
        a(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(AbstractC3073as<?> abstractC3073as) {
        this.d |= abstractC3073as.f();
        this.b.add(abstractC3073as);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d  reason: avoid collision after fix types in other method */
    public void e(C2077aZ c2077aZ) {
        b(c2077aZ, new c() { // from class: o.at.1
            @Override // o.C3126at.c
            public void d(AbstractC3073as abstractC3073as, C1511aE c1511aE, int i) {
                C3126at.c(abstractC3073as, c1511aE);
                c1511aE.b(abstractC3073as, null, Collections.emptyList(), i);
            }
        });
    }

    public void d(C2077aZ c2077aZ, List<Object> list) {
        b(c2077aZ, new c() { // from class: o.at.3
            @Override // o.C3126at.c
            public void d(AbstractC3073as abstractC3073as, C1511aE c1511aE, int i) {
                C3126at.c(abstractC3073as, c1511aE);
                c1511aE.b(abstractC3073as, null, Collections.emptyList(), i);
            }
        });
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(C2077aZ c2077aZ, AbstractC3073as<?> abstractC3073as) {
        if (!(abstractC3073as instanceof C3126at)) {
            e(c2077aZ);
            return;
        }
        final C3126at c3126at = (C3126at) abstractC3073as;
        b(c2077aZ, new c() { // from class: o.at.5
            @Override // o.C3126at.c
            public void d(AbstractC3073as abstractC3073as2, C1511aE c1511aE, int i) {
                C3126at.c(abstractC3073as2, c1511aE);
                if (i < c3126at.b.size()) {
                    AbstractC3073as<?> abstractC3073as3 = c3126at.b.get(i);
                    if (abstractC3073as3.b() == abstractC3073as2.b()) {
                        c1511aE.b(abstractC3073as2, abstractC3073as3, Collections.emptyList(), i);
                        return;
                    }
                }
                c1511aE.b(abstractC3073as2, null, Collections.emptyList(), i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(AbstractC3073as abstractC3073as, C1511aE c1511aE) {
        if (abstractC3073as.j()) {
            c1511aE.itemView.setVisibility(0);
        } else {
            c1511aE.itemView.setVisibility(8);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(C2077aZ c2077aZ) {
        c2077aZ.a();
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void a(C2077aZ c2077aZ) {
        b(c2077aZ, new c() { // from class: o.at.2
            @Override // o.C3126at.c
            public void d(AbstractC3073as abstractC3073as, C1511aE c1511aE, int i) {
                abstractC3073as.a((AbstractC3073as) c1511aE.c());
            }
        });
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e  reason: avoid collision after fix types in other method */
    public void d(C2077aZ c2077aZ) {
        b(c2077aZ, new c() { // from class: o.at.4
            @Override // o.C3126at.c
            public void d(AbstractC3073as abstractC3073as, C1511aE c1511aE, int i) {
                abstractC3073as.d((AbstractC3073as) c1511aE.c());
            }
        });
    }

    private void b(C2077aZ c2077aZ, c cVar) {
        c2077aZ.d(this);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            cVar.d(this.b.get(i), c2077aZ.d().get(i), i);
        }
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return this.b.get(0).e(i, i2, i3);
    }

    @Override // o.AbstractC3073as
    protected final int a() {
        throw new UnsupportedOperationException("You should set a layout with layout(...) instead of using this.");
    }

    @Override // o.AbstractC3073as
    public boolean f() {
        Boolean bool = this.c;
        return bool != null ? bool.booleanValue() : this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public final C2077aZ b(ViewParent viewParent) {
        return new C2077aZ(viewParent);
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3126at) && super.equals(obj)) {
            return this.b.equals(((C3126at) obj).b);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        return (super.hashCode() * 31) + this.b.hashCode();
    }
}
