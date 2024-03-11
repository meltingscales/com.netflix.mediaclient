package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8635dsx;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.InterfaceC8619dsh;
import o.dpR;
import o.dyQ;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes5.dex */
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2<R> extends SuspendLambda implements InterfaceC8612dsa<dyQ<? super R>, Object[], InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC8619dsh a;
    private /* synthetic */ Object b;
    int c;
    /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2(InterfaceC8585dra interfaceC8585dra, InterfaceC8619dsh interfaceC8619dsh) {
        super(3, interfaceC8585dra);
        this.a = interfaceC8619dsh;
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: c */
    public final Object invoke(dyQ<? super R> dyq, Object[] objArr, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 = new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2(interfaceC8585dra, this.a);
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.b = dyq;
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.d = objArr;
        return flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dyQ dyq;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            dyq = (dyQ) this.b;
            Object[] objArr = (Object[]) this.d;
            InterfaceC8619dsh interfaceC8619dsh = this.a;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            this.b = dyq;
            this.c = 1;
            C8635dsx.b(6);
            obj = interfaceC8619dsh.invoke(obj2, obj3, obj4, obj5, obj6, this);
            C8635dsx.b(7);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            if (i == 2) {
                C8556dpz.d(obj);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            dyq = (dyQ) this.b;
            C8556dpz.d(obj);
        }
        this.b = null;
        this.c = 2;
        if (dyq.emit(obj, this) == e) {
            return e;
        }
        return dpR.c;
    }
}
