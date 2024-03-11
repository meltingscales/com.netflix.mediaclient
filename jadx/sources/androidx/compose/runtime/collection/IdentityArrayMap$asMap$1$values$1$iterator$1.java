package androidx.compose.runtime.collection;

import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dtW;

/* JADX INFO: Add missing generic type declarations: [Value] */
/* loaded from: classes.dex */
final class IdentityArrayMap$asMap$1$values$1$iterator$1<Value> extends RestrictedSuspendLambda implements drX<dtW<? super Value>, InterfaceC8585dra<? super dpR>, Object> {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IdentityArrayMap<Key, Value> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityArrayMap$asMap$1$values$1$iterator$1(IdentityArrayMap<Key, Value> identityArrayMap, InterfaceC8585dra<? super IdentityArrayMap$asMap$1$values$1$iterator$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = identityArrayMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        IdentityArrayMap$asMap$1$values$1$iterator$1 identityArrayMap$asMap$1$values$1$iterator$1 = new IdentityArrayMap$asMap$1$values$1$iterator$1(this.this$0, interfaceC8585dra);
        identityArrayMap$asMap$1$values$1$iterator$1.L$0 = obj;
        return identityArrayMap$asMap$1$values$1$iterator$1;
    }

    @Override // o.drX
    public /* bridge */ /* synthetic */ Object invoke(Object obj, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return invoke((dtW) ((dtW) obj), interfaceC8585dra);
    }

    public final Object invoke(dtW<? super Value> dtw, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((IdentityArrayMap$asMap$1$values$1$iterator$1) create(dtw, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0044 -> B:13:0x0047). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            int r1 = r5.I$1
            int r3 = r5.I$0
            java.lang.Object r4 = r5.L$0
            o.dtW r4 = (o.dtW) r4
            o.C8556dpz.d(r6)
            goto L47
        L17:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1f:
            o.C8556dpz.d(r6)
            java.lang.Object r6 = r5.L$0
            o.dtW r6 = (o.dtW) r6
            androidx.compose.runtime.collection.IdentityArrayMap<Key, Value> r1 = r5.this$0
            int r1 = r1.getSize()
            r3 = 0
            r4 = r6
        L2e:
            if (r3 >= r1) goto L49
            androidx.compose.runtime.collection.IdentityArrayMap<Key, Value> r6 = r5.this$0
            java.lang.Object[] r6 = r6.getValues()
            r6 = r6[r3]
            r5.L$0 = r4
            r5.I$0 = r3
            r5.I$1 = r1
            r5.label = r2
            java.lang.Object r6 = r4.d(r6, r5)
            if (r6 != r0) goto L47
            return r0
        L47:
            int r3 = r3 + r2
            goto L2e
        L49:
            o.dpR r6 = o.dpR.c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$values$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
