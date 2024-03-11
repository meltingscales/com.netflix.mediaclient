package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dzf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C8806dzf {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.dzf$e */
    /* loaded from: classes5.dex */
    public static final class e<T> implements dyS<T> {
        final /* synthetic */ drX c;
        final /* synthetic */ dyS e;

        /* renamed from: o.dzf$e$2  reason: invalid class name */
        /* loaded from: classes5.dex */
        public static final class AnonymousClass2<T> implements dyQ {
            final /* synthetic */ drX d;
            final /* synthetic */ dyQ e;

            public AnonymousClass2(dyQ dyq, drX drx) {
                this.e = dyq;
                this.d = drx;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r6, o.InterfaceC8585dra<? super o.dpR> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.d = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.a
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    o.C8556dpz.d(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.b
                    o.dyQ r6 = (o.dyQ) r6
                    java.lang.Object r2 = r0.e
                    o.C8556dpz.d(r7)
                    goto L5c
                L3e:
                    o.C8556dpz.d(r7)
                    o.dyQ r7 = r5.e
                    o.drX r2 = r5.d
                    r0.e = r6
                    r0.b = r7
                    r0.d = r4
                    r4 = 6
                    o.C8635dsx.b(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    o.C8635dsx.b(r4)
                    if (r2 != r1) goto L5a
                    return r1
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.e = r7
                    r0.b = r7
                    r0.d = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                    return r1
                L6a:
                    o.dpR r6 = o.dpR.c
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C8806dzf.e.AnonymousClass2.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }

        public e(dyS dys, drX drx) {
            this.e = dys;
            this.c = drx;
        }

        @Override // o.dyS
        public Object collect(dyQ dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.e.collect(new AnonymousClass2(dyq, this.c), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }
    }

    public static final <T> dyS<T> b(dyS<? extends T> dys, drX<? super T, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return new e(dys, drx);
    }
}
