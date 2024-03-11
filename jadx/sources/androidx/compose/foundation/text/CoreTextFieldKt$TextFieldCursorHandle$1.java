package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import o.C8556dpz;
import o.C8586drb;
import o.C8737dwr;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;
import o.dwY;

/* loaded from: classes.dex */
final class CoreTextFieldKt$TextFieldCursorHandle$1 extends SuspendLambda implements drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ TextDragObserver $observer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$TextFieldCursorHandle$1(TextDragObserver textDragObserver, TextFieldSelectionManager textFieldSelectionManager, InterfaceC8585dra<? super CoreTextFieldKt$TextFieldCursorHandle$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$observer = textDragObserver;
        this.$manager = textFieldSelectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        CoreTextFieldKt$TextFieldCursorHandle$1 coreTextFieldKt$TextFieldCursorHandle$1 = new CoreTextFieldKt$TextFieldCursorHandle$1(this.$observer, this.$manager, interfaceC8585dra);
        coreTextFieldKt$TextFieldCursorHandle$1.L$0 = obj;
        return coreTextFieldKt$TextFieldCursorHandle$1;
    }

    @Override // o.drX
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CoreTextFieldKt$TextFieldCursorHandle$1) create(pointerInputScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ PointerInputScope $$this$pointerInput;
        final /* synthetic */ TextFieldSelectionManager $manager;
        final /* synthetic */ TextDragObserver $observer;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, TextFieldSelectionManager textFieldSelectionManager, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.$$this$pointerInput = pointerInputScope;
            this.$observer = textDragObserver;
            this.$manager = textFieldSelectionManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$observer, this.$manager, interfaceC8585dra);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // o.drX
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C8586drb.e();
            if (this.label == 0) {
                C8556dpz.d(obj);
                dwU dwu = (dwU) this.L$0;
                CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                C8737dwr.c(dwu, null, coroutineStart, new C00131(this.$$this$pointerInput, this.$observer, null), 1, null);
                C8737dwr.c(dwu, null, coroutineStart, new AnonymousClass2(this.$$this$pointerInput, this.$manager, null), 1, null);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00131 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ TextDragObserver $observer;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00131(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, InterfaceC8585dra<? super C00131> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.$$this$pointerInput = pointerInputScope;
                this.$observer = textDragObserver;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                return new C00131(this.$$this$pointerInput, this.$observer, interfaceC8585dra);
            }

            @Override // o.drX
            public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return ((C00131) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object e;
                e = C8586drb.e();
                int i = this.label;
                if (i == 0) {
                    C8556dpz.d(obj);
                    PointerInputScope pointerInputScope = this.$$this$pointerInput;
                    TextDragObserver textDragObserver = this.$observer;
                    this.label = 1;
                    if (LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, textDragObserver, this) == e) {
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

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ TextFieldSelectionManager $manager;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PointerInputScope pointerInputScope, TextFieldSelectionManager textFieldSelectionManager, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.$$this$pointerInput = pointerInputScope;
                this.$manager = textFieldSelectionManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                return new AnonymousClass2(this.$$this$pointerInput, this.$manager, interfaceC8585dra);
            }

            @Override // o.drX
            public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return ((AnonymousClass2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object e;
                e = C8586drb.e();
                int i = this.label;
                if (i == 0) {
                    C8556dpz.d(obj);
                    PointerInputScope pointerInputScope = this.$$this$pointerInput;
                    final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                    drM<Offset, dpR> drm = new drM<Offset, dpR>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle.1.1.2.1
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(Offset offset) {
                            m411invokek4lQ0M(offset.m1146unboximpl());
                            return dpR.c;
                        }

                        /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                        public final void m411invokek4lQ0M(long j) {
                            TextFieldSelectionManager.this.showSelectionToolbar$foundation_release();
                        }
                    };
                    this.label = 1;
                    if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, drm, this, 7, null) == e) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$observer, this.$manager, null);
            this.label = 1;
            if (dwY.b(anonymousClass1, this) == e) {
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
