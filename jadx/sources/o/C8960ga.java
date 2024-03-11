package o;

import androidx.lifecycle.LifecycleOwner;
import com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal1$2;
import com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal3$2;

/* renamed from: o.ga */
/* loaded from: classes2.dex */
public final class C8960ga {
    public static /* synthetic */ dxD e(AbstractC8899fS abstractC8899fS, LifecycleOwner lifecycleOwner, AbstractC8928fv abstractC8928fv, drX drx, int i, Object obj) {
        if ((i & 2) != 0) {
            abstractC8928fv = C8973gn.b;
        }
        return b(abstractC8899fS, lifecycleOwner, abstractC8928fv, drx);
    }

    public static final <VM extends AbstractC8899fS<S>, S extends InterfaceC8888fH> dxD b(VM vm, LifecycleOwner lifecycleOwner, AbstractC8928fv abstractC8928fv, drX<? super S, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        C8632dsu.c((Object) vm, "");
        C8632dsu.c((Object) abstractC8928fv, "");
        C8632dsu.c((Object) drx, "");
        return vm.c(vm.a(), lifecycleOwner, abstractC8928fv, drx);
    }

    public static /* synthetic */ dxD c(AbstractC8899fS abstractC8899fS, LifecycleOwner lifecycleOwner, dtE dte, AbstractC8928fv abstractC8928fv, drX drx, int i, Object obj) {
        if ((i & 4) != 0) {
            abstractC8928fv = C8973gn.b;
        }
        return a(abstractC8899fS, lifecycleOwner, dte, abstractC8928fv, drx);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <VM extends AbstractC8899fS<S>, S extends InterfaceC8888fH, A> dxD a(VM vm, LifecycleOwner lifecycleOwner, dtE<S, ? extends A> dte, AbstractC8928fv abstractC8928fv, drX<? super A, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        C8632dsu.c((Object) vm, "");
        C8632dsu.c((Object) dte, "");
        C8632dsu.c((Object) abstractC8928fv, "");
        C8632dsu.c((Object) drx, "");
        return vm.c(dyR.e(new d(vm.a(), dte)), lifecycleOwner, abstractC8928fv.b(dte), new MavericksViewModelExtensionsKt$_internal1$2(drx, null));
    }

    public static /* synthetic */ dxD d(AbstractC8899fS abstractC8899fS, LifecycleOwner lifecycleOwner, dtE dte, dtE dte2, dtE dte3, AbstractC8928fv abstractC8928fv, InterfaceC8613dsb interfaceC8613dsb, int i, Object obj) {
        if ((i & 16) != 0) {
            abstractC8928fv = C8973gn.b;
        }
        return a(abstractC8899fS, lifecycleOwner, dte, dte2, dte3, abstractC8928fv, interfaceC8613dsb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <VM extends AbstractC8899fS<S>, S extends InterfaceC8888fH, A, B, C> dxD a(VM vm, LifecycleOwner lifecycleOwner, dtE<S, ? extends A> dte, dtE<S, ? extends B> dte2, dtE<S, ? extends C> dte3, AbstractC8928fv abstractC8928fv, InterfaceC8613dsb<? super A, ? super B, ? super C, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8613dsb) {
        C8632dsu.c((Object) vm, "");
        C8632dsu.c((Object) dte, "");
        C8632dsu.c((Object) dte2, "");
        C8632dsu.c((Object) dte3, "");
        C8632dsu.c((Object) abstractC8928fv, "");
        C8632dsu.c((Object) interfaceC8613dsb, "");
        return vm.c(dyR.e(new c(vm.a(), dte, dte2, dte3)), lifecycleOwner, abstractC8928fv.b(dte, dte2, dte3), new MavericksViewModelExtensionsKt$_internal3$2(interfaceC8613dsb, null));
    }

    /* renamed from: o.ga$c */
    /* loaded from: classes5.dex */
    public static final class c<A, B, C> implements dyS<C8893fM<A, B, C>> {
        final /* synthetic */ dtE b;
        final /* synthetic */ dyS c;
        final /* synthetic */ dtE d;
        final /* synthetic */ dtE e;

        public c(dyS dys, dtE dte, dtE dte2, dtE dte3) {
            this.c = dys;
            this.b = dte;
            this.e = dte2;
            this.d = dte3;
        }

        @Override // o.dyS
        public Object collect(dyQ dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.c.collect(new AnonymousClass1(dyq, this.b, this.e, this.d), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.ga$c$1 */
        /* loaded from: classes5.dex */
        public static final class AnonymousClass1<T> implements dyQ {
            final /* synthetic */ dtE a;
            final /* synthetic */ dtE c;
            final /* synthetic */ dyQ d;
            final /* synthetic */ dtE e;

            public AnonymousClass1(dyQ dyq, dtE dte, dtE dte2, dtE dte3) {
                this.d = dyq;
                this.e = dte;
                this.a = dte2;
                this.c = dte3;
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r8, o.InterfaceC8585dra r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal3$$inlined$map$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal3$$inlined$map$1$2$1 r0 = (com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal3$$inlined$map$1$2$1) r0
                    int r1 = r0.c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.c = r1
                    goto L18
                L13:
                    com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal3$$inlined$map$1$2$1 r0 = new com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal3$$inlined$map$1$2$1
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.a
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r9)
                    goto L58
                L29:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L31:
                    o.C8556dpz.d(r9)
                    o.dyQ r9 = r7.d
                    o.fH r8 = (o.InterfaceC8888fH) r8
                    o.fM r2 = new o.fM
                    o.dtE r4 = r7.e
                    java.lang.Object r4 = r4.get(r8)
                    o.dtE r5 = r7.a
                    java.lang.Object r5 = r5.get(r8)
                    o.dtE r6 = r7.c
                    java.lang.Object r8 = r6.get(r8)
                    r2.<init>(r4, r5, r8)
                    r0.c = r3
                    java.lang.Object r8 = r9.emit(r2, r0)
                    if (r8 != r1) goto L58
                    return r1
                L58:
                    o.dpR r8 = o.dpR.c
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C8960ga.c.AnonymousClass1.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* renamed from: o.ga$d */
    /* loaded from: classes5.dex */
    public static final class d<A> implements dyS<C8897fQ<A>> {
        final /* synthetic */ dyS b;
        final /* synthetic */ dtE d;

        public d(dyS dys, dtE dte) {
            this.b = dys;
            this.d = dte;
        }

        @Override // o.dyS
        public Object collect(dyQ dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.b.collect(new AnonymousClass5(dyq, this.d), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.ga$d$5 */
        /* loaded from: classes5.dex */
        public static final class AnonymousClass5<T> implements dyQ {
            final /* synthetic */ dyQ b;
            final /* synthetic */ dtE d;

            public AnonymousClass5(dyQ dyq, dtE dte) {
                this.b = dyq;
                this.d = dte;
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r6, o.InterfaceC8585dra r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal1$$inlined$map$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal1$$inlined$map$1$2$1 r0 = (com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal1$$inlined$map$1$2$1) r0
                    int r1 = r0.a
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.a = r1
                    goto L18
                L13:
                    com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal1$$inlined$map$1$2$1 r0 = new com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal1$$inlined$map$1$2$1
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.b
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.a
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r7)
                    goto L4c
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    o.C8556dpz.d(r7)
                    o.dyQ r7 = r5.b
                    o.fH r6 = (o.InterfaceC8888fH) r6
                    o.fQ r2 = new o.fQ
                    o.dtE r4 = r5.d
                    java.lang.Object r6 = r4.get(r6)
                    r2.<init>(r6)
                    r0.a = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L4c
                    return r1
                L4c:
                    o.dpR r6 = o.dpR.c
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C8960ga.d.AnonymousClass5.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }
}
