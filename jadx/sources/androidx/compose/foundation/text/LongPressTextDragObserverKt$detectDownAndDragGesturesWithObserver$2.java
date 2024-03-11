package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import o.C8556dpz;
import o.C8586drb;
import o.C8737dwr;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dxD;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dxD>, Object> {
    final /* synthetic */ TextDragObserver $observer;
    final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, InterfaceC8585dra<? super LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$this_detectDownAndDragGesturesWithObserver = pointerInputScope;
        this.$observer = textDragObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, interfaceC8585dra);
        longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2.L$0 = obj;
        return longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2;
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dxD> interfaceC8585dra) {
        return ((LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ TextDragObserver $observer;
        final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.$this_detectDownAndDragGesturesWithObserver = pointerInputScope;
            this.$observer = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, interfaceC8585dra);
        }

        @Override // o.drX
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            Object detectPreDragGesturesWithObserver;
            e = C8586drb.e();
            int i = this.label;
            if (i == 0) {
                C8556dpz.d(obj);
                PointerInputScope pointerInputScope = this.$this_detectDownAndDragGesturesWithObserver;
                TextDragObserver textDragObserver = this.$observer;
                this.label = 1;
                detectPreDragGesturesWithObserver = LongPressTextDragObserverKt.detectPreDragGesturesWithObserver(pointerInputScope, textDragObserver, this);
                if (detectPreDragGesturesWithObserver == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            return dpR.c;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dxD c;
        C8586drb.e();
        if (this.label == 0) {
            C8556dpz.d(obj);
            dwU dwu = (dwU) this.L$0;
            CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
            C8737dwr.c(dwu, null, coroutineStart, new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1, null);
            c = C8737dwr.c(dwu, null, coroutineStart, new AnonymousClass2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1, null);
            return c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ TextDragObserver $observer;
        final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.$this_detectDownAndDragGesturesWithObserver = pointerInputScope;
            this.$observer = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, interfaceC8585dra);
        }

        @Override // o.drX
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            Object detectDragGesturesWithObserver;
            e = C8586drb.e();
            int i = this.label;
            if (i == 0) {
                C8556dpz.d(obj);
                PointerInputScope pointerInputScope = this.$this_detectDownAndDragGesturesWithObserver;
                TextDragObserver textDragObserver = this.$observer;
                this.label = 1;
                detectDragGesturesWithObserver = LongPressTextDragObserverKt.detectDragGesturesWithObserver(pointerInputScope, textDragObserver, this);
                if (detectDragGesturesWithObserver == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            return dpR.c;
        }
    }
}
