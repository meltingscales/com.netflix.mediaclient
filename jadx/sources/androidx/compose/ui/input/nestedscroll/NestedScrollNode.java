package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import o.C8632dsu;
import o.dpD;
import o.drO;
import o.dwU;

/* loaded from: classes.dex */
public final class NestedScrollNode extends Modifier.Node implements ModifierLocalModifierNode, NestedScrollConnection {
    private NestedScrollConnection connection;
    private final ModifierLocalMap providedValues;
    private NestedScrollDispatcher resolvedDispatcher;

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    public NestedScrollNode(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        this.resolvedDispatcher = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(dpD.a(NestedScrollNodeKt.getModifierLocalNestedScroll(), this));
    }

    private final NestedScrollNode getParentModifierLocal() {
        if (isAttached()) {
            return (NestedScrollNode) getCurrent(NestedScrollNodeKt.getModifierLocalNestedScroll());
        }
        return null;
    }

    private final NestedScrollConnection getParentConnection() {
        if (isAttached()) {
            return (NestedScrollConnection) getCurrent(NestedScrollNodeKt.getModifierLocalNestedScroll());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dwU getNestedCoroutineScope() {
        dwU scope$ui_release;
        NestedScrollNode parentModifierLocal = getParentModifierLocal();
        if ((parentModifierLocal == null || (scope$ui_release = parentModifierLocal.getNestedCoroutineScope()) == null) && (scope$ui_release = this.resolvedDispatcher.getScope$ui_release()) == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return scope$ui_release;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo201onPreScrollOzD1aCk(long j, int i) {
        NestedScrollConnection parentConnection = getParentConnection();
        long mo201onPreScrollOzD1aCk = parentConnection != null ? parentConnection.mo201onPreScrollOzD1aCk(j, i) : Offset.Companion.m1149getZeroF1C5BW0();
        return Offset.m1142plusMKHz9U(mo201onPreScrollOzD1aCk, this.connection.mo201onPreScrollOzD1aCk(Offset.m1141minusMKHz9U(j, mo201onPreScrollOzD1aCk), i));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo200onPostScrollDzOQY0M(long j, long j2, int i) {
        long m1149getZeroF1C5BW0;
        long mo200onPostScrollDzOQY0M = this.connection.mo200onPostScrollDzOQY0M(j, j2, i);
        NestedScrollConnection parentConnection = getParentConnection();
        if (parentConnection != null) {
            m1149getZeroF1C5BW0 = parentConnection.mo200onPostScrollDzOQY0M(Offset.m1142plusMKHz9U(j, mo200onPostScrollDzOQY0M), Offset.m1141minusMKHz9U(j2, mo200onPostScrollDzOQY0M), i);
        } else {
            m1149getZeroF1C5BW0 = Offset.Companion.m1149getZeroF1C5BW0();
        }
        return Offset.m1142plusMKHz9U(mo200onPostScrollDzOQY0M, m1149getZeroF1C5BW0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo824onPreFlingQWom1Mo(long r7, o.InterfaceC8585dra<? super androidx.compose.ui.unit.Velocity> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r7 = r0.J$0
            o.C8556dpz.d(r9)
            goto L7a
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            long r7 = r0.J$0
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r2 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r2
            o.C8556dpz.d(r9)
            goto L57
        L40:
            o.C8556dpz.d(r9)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r9 = r6.getParentConnection()
            if (r9 == 0) goto L5e
            r0.L$0 = r6
            r0.J$0 = r7
            r0.label = r4
            java.lang.Object r9 = r9.mo824onPreFlingQWom1Mo(r7, r0)
            if (r9 != r1) goto L56
            return r1
        L56:
            r2 = r6
        L57:
            androidx.compose.ui.unit.Velocity r9 = (androidx.compose.ui.unit.Velocity) r9
            long r4 = r9.m2593unboximpl()
            goto L65
        L5e:
            androidx.compose.ui.unit.Velocity$Companion r9 = androidx.compose.ui.unit.Velocity.Companion
            long r4 = r9.m2594getZero9UxMQ8M()
            r2 = r6
        L65:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r9 = r2.connection
            long r7 = androidx.compose.ui.unit.Velocity.m2589minusAH228Gc(r7, r4)
            r2 = 0
            r0.L$0 = r2
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r9 = r9.mo824onPreFlingQWom1Mo(r7, r0)
            if (r9 != r1) goto L79
            return r1
        L79:
            r7 = r4
        L7a:
            androidx.compose.ui.unit.Velocity r9 = (androidx.compose.ui.unit.Velocity) r9
            long r0 = r9.m2593unboximpl()
            long r7 = androidx.compose.ui.unit.Velocity.m2590plusAH228Gc(r7, r0)
            androidx.compose.ui.unit.Velocity r7 = androidx.compose.ui.unit.Velocity.m2580boximpl(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.mo824onPreFlingQWom1Mo(long, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo199onPostFlingRZ2iAVY(long r18, long r20, o.InterfaceC8585dra<? super androidx.compose.ui.unit.Velocity> r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            if (r2 == 0) goto L17
            r2 = r1
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r2 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 + r4
            r2.label = r3
            goto L1c
        L17:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r2 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r9 = o.C8588drd.c()
            int r3 = r2.label
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L48
            if (r3 == r4) goto L3a
            if (r3 != r10) goto L32
            long r2 = r2.J$0
            o.C8556dpz.d(r1)
            goto L8d
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            long r3 = r2.J$1
            long r5 = r2.J$0
            java.lang.Object r7 = r2.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r7 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r7
            o.C8556dpz.d(r1)
            r13 = r3
            r11 = r5
            goto L66
        L48:
            o.C8556dpz.d(r1)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r3 = r0.connection
            r2.L$0 = r0
            r11 = r18
            r2.J$0 = r11
            r13 = r20
            r2.J$1 = r13
            r2.label = r4
            r4 = r18
            r6 = r20
            r8 = r2
            java.lang.Object r1 = r3.mo199onPostFlingRZ2iAVY(r4, r6, r8)
            if (r1 != r9) goto L65
            return r9
        L65:
            r7 = r0
        L66:
            androidx.compose.ui.unit.Velocity r1 = (androidx.compose.ui.unit.Velocity) r1
            long r4 = r1.m2593unboximpl()
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r3 = r7.getParentConnection()
            if (r3 == 0) goto L97
            long r6 = androidx.compose.ui.unit.Velocity.m2590plusAH228Gc(r11, r4)
            long r11 = androidx.compose.ui.unit.Velocity.m2589minusAH228Gc(r13, r4)
            r1 = 0
            r2.L$0 = r1
            r2.J$0 = r4
            r2.label = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.mo199onPostFlingRZ2iAVY(r4, r6, r8)
            if (r1 != r9) goto L8c
            return r9
        L8c:
            r2 = r13
        L8d:
            androidx.compose.ui.unit.Velocity r1 = (androidx.compose.ui.unit.Velocity) r1
            long r4 = r1.m2593unboximpl()
            r15 = r2
            r1 = r4
            r4 = r15
            goto La0
        L97:
            r13 = r4
            androidx.compose.ui.unit.Velocity$Companion r1 = androidx.compose.ui.unit.Velocity.Companion
            long r4 = r1.m2594getZero9UxMQ8M()
            r1 = r4
            r4 = r13
        La0:
            long r1 = androidx.compose.ui.unit.Velocity.m2590plusAH228Gc(r4, r1)
            androidx.compose.ui.unit.Velocity r1 = androidx.compose.ui.unit.Velocity.m2580boximpl(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.mo199onPostFlingRZ2iAVY(long, long, o.dra):java.lang.Object");
    }

    private final void updateDispatcher(NestedScrollDispatcher nestedScrollDispatcher) {
        resetDispatcherFields();
        if (nestedScrollDispatcher == null) {
            this.resolvedDispatcher = new NestedScrollDispatcher();
        } else if (!C8632dsu.c(nestedScrollDispatcher, this.resolvedDispatcher)) {
            this.resolvedDispatcher = nestedScrollDispatcher;
        }
        if (isAttached()) {
            updateDispatcherFields();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDispatcherFields();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        resetDispatcherFields();
    }

    private final void updateDispatcherFields() {
        this.resolvedDispatcher.setModifierLocalNode$ui_release(this);
        this.resolvedDispatcher.setCalculateNestedScrollScope$ui_release(new drO<dwU>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNode$updateDispatcherFields$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public final dwU invoke() {
                dwU nestedCoroutineScope;
                nestedCoroutineScope = NestedScrollNode.this.getNestedCoroutineScope();
                return nestedCoroutineScope;
            }
        });
        this.resolvedDispatcher.setScope$ui_release(getCoroutineScope());
    }

    private final void resetDispatcherFields() {
        if (this.resolvedDispatcher.getModifierLocalNode$ui_release() == this) {
            this.resolvedDispatcher.setModifierLocalNode$ui_release(null);
        }
    }

    public final void updateNode$ui_release(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        updateDispatcher(nestedScrollDispatcher);
    }
}
