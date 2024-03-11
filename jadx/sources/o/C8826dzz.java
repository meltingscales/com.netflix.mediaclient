package o;

/* renamed from: o.dzz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8826dzz<T> implements InterfaceC8814dzn<T> {
    private final drX<dyQ<? super T>, InterfaceC8585dra<? super dpR>, Object> a;
    private final InterfaceC8814dzn<T> c;

    /* JADX WARN: Multi-variable type inference failed */
    public C8826dzz(InterfaceC8814dzn<? extends T> interfaceC8814dzn, drX<? super dyQ<? super T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        this.c = interfaceC8814dzn;
        this.a = drx;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // o.InterfaceC8814dzn, o.dyS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(o.dyQ<? super T> r6, o.InterfaceC8585dra<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 r0 = (kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 r0 = new kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            o.C8556dpz.d(r7)
            goto L46
        L31:
            o.C8556dpz.d(r7)
            o.dzn<T> r7 = r5.c
            o.dzC r2 = new o.dzC
            o.drX<o.dyQ<? super T>, o.dra<? super o.dpR>, java.lang.Object> r4 = r5.a
            r2.<init>(r6, r4)
            r0.e = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8826dzz.collect(o.dyQ, o.dra):java.lang.Object");
    }
}
