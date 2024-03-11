package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.C8797dyx;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dyQ;
import o.dzT;

/* loaded from: classes5.dex */
final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements drX<C8797dyx<? extends Object>, InterfaceC8585dra<? super dpR>, Object> {
    /* synthetic */ Object a;
    final /* synthetic */ dyQ<T> b;
    final /* synthetic */ Ref.ObjectRef<Object> c;
    Object d;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1$3$2(Ref.ObjectRef<Object> objectRef, dyQ<? super T> dyq, InterfaceC8585dra<? super FlowKt__DelayKt$debounceInternal$1$3$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = objectRef;
        this.b = dyq;
    }

    public final Object a(Object obj, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(C8797dyx.a(obj), interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.c, this.b, interfaceC8585dra);
        flowKt__DelayKt$debounceInternal$1$3$2.a = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // o.drX
    public /* synthetic */ Object invoke(C8797dyx<? extends Object> c8797dyx, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return a(c8797dyx.e(), interfaceC8585dra);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, o.dAH] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Ref.ObjectRef<Object> objectRef;
        Ref.ObjectRef<Object> objectRef2;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            ?? e2 = ((C8797dyx) this.a).e();
            objectRef = this.c;
            boolean z = e2 instanceof C8797dyx.a;
            if (!z) {
                objectRef.d = e2;
            }
            dyQ<T> dyq = this.b;
            if (z) {
                Throwable d = C8797dyx.d(e2);
                if (d != null) {
                    throw d;
                }
                Object obj2 = objectRef.d;
                if (obj2 != null) {
                    if (obj2 == dzT.b) {
                        obj2 = null;
                    }
                    this.a = e2;
                    this.d = objectRef;
                    this.e = 1;
                    if (dyq.emit(obj2, this) == e) {
                        return e;
                    }
                    objectRef2 = objectRef;
                }
                objectRef.d = dzT.a;
            }
            return dpR.c;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            objectRef2 = (Ref.ObjectRef) this.d;
            C8556dpz.d(obj);
        }
        objectRef = objectRef2;
        objectRef.d = dzT.a;
        return dpR.c;
    }
}
