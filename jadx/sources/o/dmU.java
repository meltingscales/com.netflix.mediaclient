package o;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* loaded from: classes5.dex */
public final class dmU implements dmW {
    private final MutableState b;
    private final dBK d = dBL.d(false, 1, null);

    public dmU() {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.b = mutableStateOf$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a A[Catch: all -> 0x00ab, TRY_LEAVE, TryCatch #1 {all -> 0x00ab, blocks: (B:24:0x006f, B:26:0x009a), top: B:41:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    @Override // o.dmW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> java.lang.Object e(o.dmY<T> r9, o.InterfaceC8585dra<? super T> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.slack.circuit.overlay.OverlayHostImpl$show$1
            if (r0 == 0) goto L13
            r0 = r10
            com.slack.circuit.overlay.OverlayHostImpl$show$1 r0 = (com.slack.circuit.overlay.OverlayHostImpl$show$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.e = r1
            goto L18
        L13:
            com.slack.circuit.overlay.OverlayHostImpl$show$1 r0 = new com.slack.circuit.overlay.OverlayHostImpl$show$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.h
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5a
            if (r2 == r4) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r9 = r0.c
            com.slack.circuit.overlay.OverlayHostImpl$show$1 r9 = (com.slack.circuit.overlay.OverlayHostImpl$show$1) r9
            java.lang.Object r9 = r0.d
            o.dBK r9 = (o.dBK) r9
            java.lang.Object r1 = r0.a
            o.dmY r1 = (o.dmY) r1
            java.lang.Object r0 = r0.b
            o.dmU r0 = (o.dmU) r0
            o.C8556dpz.d(r10)     // Catch: java.lang.Throwable -> L3d
            goto La4
        L3d:
            r10 = move-exception
            goto Lb0
        L40:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L48:
            java.lang.Object r9 = r0.d
            o.dBK r9 = (o.dBK) r9
            java.lang.Object r2 = r0.a
            o.dmY r2 = (o.dmY) r2
            java.lang.Object r6 = r0.b
            o.dmU r6 = (o.dmU) r6
            o.C8556dpz.d(r10)
            r10 = r9
            r9 = r2
            goto L6f
        L5a:
            o.C8556dpz.d(r10)
            o.dBK r10 = r8.d
            r0.b = r8
            r0.a = r9
            r0.d = r10
            r0.e = r4
            java.lang.Object r2 = r10.a(r5, r0)
            if (r2 != r1) goto L6e
            return r1
        L6e:
            r6 = r8
        L6f:
            r0.b = r6     // Catch: java.lang.Throwable -> Lab
            r0.a = r9     // Catch: java.lang.Throwable -> Lab
            r0.d = r10     // Catch: java.lang.Throwable -> Lab
            r0.c = r0     // Catch: java.lang.Throwable -> Lab
            r0.e = r3     // Catch: java.lang.Throwable -> Lab
            o.dwv r2 = new o.dwv     // Catch: java.lang.Throwable -> Lab
            o.dra r3 = o.C8588drd.c(r0)     // Catch: java.lang.Throwable -> Lab
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lab
            r2.h()     // Catch: java.lang.Throwable -> Lab
            o.dmX r3 = new o.dmX     // Catch: java.lang.Throwable -> Lab
            o.C8632dsu.d(r9)     // Catch: java.lang.Throwable -> Lab
            r3.<init>(r9, r2)     // Catch: java.lang.Throwable -> Lab
            c(r6, r3)     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r9 = r2.b()     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r2 = o.C8588drd.c()     // Catch: java.lang.Throwable -> Lab
            if (r9 != r2) goto L9d
            o.C8592drh.c(r0)     // Catch: java.lang.Throwable -> Lab
        L9d:
            if (r9 != r1) goto La0
            return r1
        La0:
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
        La4:
            r0.a(r5)     // Catch: java.lang.Throwable -> Lb4
            r9.d(r5)
            return r10
        Lab:
            r9 = move-exception
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
        Lb0:
            r0.a(r5)     // Catch: java.lang.Throwable -> Lb4
            throw r10     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r10 = move-exception
            r9.d(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dmU.e(o.dmY, o.dra):java.lang.Object");
    }

    @Override // o.dmW
    public dmV<Object> d() {
        return (dmV) this.b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(dmV<Object> dmv) {
        this.b.setValue(dmv);
    }
}
