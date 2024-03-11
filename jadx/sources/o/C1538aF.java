package o;

import android.content.Context;
import android.view.View;
import java.util.List;
import o.C1538aF;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.aF  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1538aF implements InterfaceC2023aX {
    public static final a a = new a(null);
    private static drX<? super C1538aF, ? super RuntimeException, dpR> e = new drX<C1538aF, RuntimeException, dpR>() { // from class: com.airbnb.epoxy.EpoxyViewBinder$Companion$globalExceptionHandler$1
        public final void c(C1538aF c1538aF, RuntimeException runtimeException) {
            C8632dsu.c((Object) c1538aF, "");
            C8632dsu.c((Object) runtimeException, "");
        }

        @Override // o.drX
        public /* synthetic */ dpR invoke(C1538aF c1538aF, RuntimeException runtimeException) {
            c(c1538aF, runtimeException);
            return dpR.c;
        }
    };
    private AbstractC3073as<?> d;

    @Override // o.InterfaceC2023aX
    public void add(AbstractC3073as<?> abstractC3073as) {
        C8632dsu.c((Object) abstractC3073as, "");
        if (this.d != null) {
            throw new IllegalArgumentException("A model was already added to the ModelCollector. Only one should be added.".toString());
        }
        this.d = abstractC3073as;
    }

    public final View c(View view, drX<? super InterfaceC2023aX, ? super Context, dpR> drx) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) drx, "");
        Context context = view.getContext();
        C8632dsu.a(context, "");
        drx.invoke(this, context);
        AbstractC3073as<?> abstractC3073as = this.d;
        this.d = null;
        return a(view, abstractC3073as);
    }

    public final void c(View view) {
        C8632dsu.c((Object) view, "");
        C1511aE e2 = C4757bl.e(view);
        if (e2 == null) {
            return;
        }
        e2.e();
        C4757bl.c(view, null);
    }

    private final void c(C1511aE c1511aE, AbstractC3073as<?> abstractC3073as, AbstractC3073as<?> abstractC3073as2) {
        List<Object> i;
        if (C8632dsu.c(abstractC3073as2, abstractC3073as)) {
            return;
        }
        i = C8569dql.i();
        c1511aE.b(abstractC3073as, abstractC3073as2, i, 0);
        View view = c1511aE.itemView;
        C8632dsu.a(view, "");
        C4757bl.c(view, c1511aE);
    }

    private final boolean c(AbstractC3073as<?> abstractC3073as, AbstractC3073as<?> abstractC3073as2) {
        return C4871bo.c(abstractC3073as) == C4871bo.c(abstractC3073as2);
    }

    public final void e(RuntimeException runtimeException) {
        C8632dsu.c((Object) runtimeException, "");
        e.invoke(this, runtimeException);
    }

    /* renamed from: o.aF$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View a(android.view.View r8, o.AbstractC3073as<?> r9) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r8, r0)
            if (r9 != 0) goto Ld
            r9 = 8
            r8.setVisibility(r9)
            return r8
        Ld:
            o.aE r1 = o.C4757bl.e(r8)
            r2 = 0
            if (r1 == 0) goto L24
            o.as r3 = r1.a()
            o.C8632dsu.a(r3, r0)
            boolean r3 = r7.c(r9, r3)
            if (r3 != 0) goto L22
            goto L24
        L22:
            r5 = r1
            goto L4b
        L24:
            android.view.ViewParent r3 = r8.getParent()
            o.C8632dsu.d(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r4 = r9.d(r3)
            int r5 = r8.getId()
            r4.setId(r5)
            int r5 = r3.indexOfChild(r8)
            r3.removeViewInLayout(r8)
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            r3.addView(r4, r5, r6)
            o.aE r5 = new o.aE
            r5.<init>(r3, r4, r2)
        L4b:
            android.view.View r3 = r5.itemView
            o.C8632dsu.a(r3, r0)
            r3.setVisibility(r2)
            int r8 = r8.getId()
            r3.setId(r8)
            o.C8632dsu.a(r3, r0)
            if (r1 == 0) goto L64
            o.as r8 = r1.a()
            goto L65
        L64:
            r8 = 0
        L65:
            r7.c(r5, r9, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1538aF.a(android.view.View, o.as):android.view.View");
    }
}
