package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dtW;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
public final class SlidingWindowKt$windowedIterator$1<T> extends RestrictedSuspendLambda implements drX<dtW<? super List<? extends T>>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ Iterator<T> e;
    private /* synthetic */ Object f;
    int g;
    int h;
    Object i;
    Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SlidingWindowKt$windowedIterator$1(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, InterfaceC8585dra<? super SlidingWindowKt$windowedIterator$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = i;
        this.c = i2;
        this.e = it;
        this.b = z;
        this.a = z2;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dtW<? super List<? extends T>> dtw, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SlidingWindowKt$windowedIterator$1) create(dtw, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.d, this.c, this.e, this.b, this.a, interfaceC8585dra);
        slidingWindowKt$windowedIterator$1.f = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a2 -> B:16:0x0055). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0118 -> B:59:0x011b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0146 -> B:72:0x0149). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt$windowedIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
