package o;

import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* renamed from: o.dzh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C8808dzh {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object e(o.dyS<? extends T> r4, o.InterfaceC8585dra<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.d
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.c
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            o.C8556dpz.d(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            o.C8556dpz.d(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            o.dAH r2 = o.dzT.b
            r5.d = r2
            o.dzh$e r2 = new o.dzh$e
            r2.<init>(r5)
            r0.c = r5
            r0.e = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            T r4 = r4.d
            o.dAH r5 = o.dzT.b
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Flow is empty"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8808dzh.e(o.dyS, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dzh$e */
    /* loaded from: classes5.dex */
    public static final class e<T> implements dyQ {
        final /* synthetic */ Ref.ObjectRef<Object> c;

        e(Ref.ObjectRef<Object> objectRef) {
            this.c = objectRef;
        }

        @Override // o.dyQ
        public final Object emit(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            Ref.ObjectRef<Object> objectRef = this.c;
            if (objectRef.d != dzT.b) {
                throw new IllegalArgumentException("Flow has more than one element".toString());
            }
            objectRef.d = t;
            return dpR.c;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object a(o.dyS<? extends T> r4, o.InterfaceC8585dra<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.a
            o.dzh$c r4 = (o.C8808dzh.c) r4
            java.lang.Object r0 = r0.e
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            o.C8556dpz.d(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            o.C8556dpz.d(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            o.dAH r2 = o.dzT.b
            r5.d = r2
            o.dzh$c r2 = new o.dzh$c
            r2.<init>(r5)
            r0.e = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.a = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.c = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            o.dzP.a(r5, r4)
        L62:
            T r4 = r0.d
            o.dAH r5 = o.dzT.b
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8808dzh.a(o.dyS, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object b(o.dyS<? extends T> r5, o.drX<? super T, ? super o.InterfaceC8585dra<? super java.lang.Boolean>, ? extends java.lang.Object> r6, o.InterfaceC8585dra<? super T> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r5 = r0.c
            o.dzh$a r5 = (o.C8808dzh.a) r5
            java.lang.Object r6 = r0.b
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref.ObjectRef) r6
            java.lang.Object r0 = r0.d
            o.drX r0 = (o.drX) r0
            o.C8556dpz.d(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L35
            goto L6b
        L35:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r0
            r0 = r4
            goto L66
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L43:
            o.C8556dpz.d(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            o.dAH r2 = o.dzT.b
            r7.d = r2
            o.dzh$a r2 = new o.dzh$a
            r2.<init>(r6, r7)
            r0.d = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            r0.b = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            r0.c = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            r0.e = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            if (r5 != r1) goto L69
            return r1
        L63:
            r5 = move-exception
            r0 = r5
            r5 = r2
        L66:
            o.dzP.a(r0, r5)
        L69:
            r0 = r6
            r6 = r7
        L6b:
            T r5 = r6.d
            o.dAH r6 = o.dzT.b
            if (r5 == r6) goto L72
            return r5
        L72:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8808dzh.b(o.dyS, o.drX, o.dra):java.lang.Object");
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.dzh$a */
    /* loaded from: classes5.dex */
    public static final class a<T> implements dyQ<T> {
        final /* synthetic */ drX c;
        final /* synthetic */ Ref.ObjectRef e;

        public a(drX drx, Ref.ObjectRef objectRef) {
            this.c = drx;
            this.e = objectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
        @Override // o.dyQ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(T r5, o.InterfaceC8585dra<? super o.dpR> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.a
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.e
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.c
                java.lang.Object r0 = r0.d
                o.dzh$a r0 = (o.C8808dzh.a) r0
                o.C8556dpz.d(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                o.C8556dpz.d(r6)
                o.drX r6 = r4.c
                r0.d = r4
                r0.c = r5
                r0.e = r3
                r2 = 6
                o.C8635dsx.b(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                o.C8635dsx.b(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                o.dpR r5 = o.dpR.c
                return r5
            L5d:
                kotlin.jvm.internal.Ref$ObjectRef r6 = r0.e
                r6.d = r5
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C8808dzh.a.emit(java.lang.Object, o.dra):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.dzh$c */
    /* loaded from: classes5.dex */
    public static final class c<T> implements dyQ<T> {
        final /* synthetic */ Ref.ObjectRef d;

        public c(Ref.ObjectRef objectRef) {
            this.d = objectRef;
        }

        @Override // o.dyQ
        public Object emit(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            this.d.d = t;
            throw new AbortFlowException(this);
        }
    }
}
