package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SelectionGesturesKt$selectionGestureInput$1 extends SuspendLambda implements drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
    final /* synthetic */ TextDragObserver $textDragObserver;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$selectionGestureInput$1(MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, InterfaceC8585dra<? super SelectionGesturesKt$selectionGestureInput$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$mouseSelectionObserver = mouseSelectionObserver;
        this.$textDragObserver = textDragObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        SelectionGesturesKt$selectionGestureInput$1 selectionGesturesKt$selectionGestureInput$1 = new SelectionGesturesKt$selectionGestureInput$1(this.$mouseSelectionObserver, this.$textDragObserver, interfaceC8585dra);
        selectionGesturesKt$selectionGestureInput$1.L$0 = obj;
        return selectionGesturesKt$selectionGestureInput$1;
    }

    @Override // o.drX
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SelectionGesturesKt$selectionGestureInput$1) create(pointerInputScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mouseSelectionObserver, new ClicksCounter(pointerInputScope.getViewConfiguration()), this.$textDragObserver, null);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements drX<AwaitPointerEventScope, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ ClicksCounter $clicksCounter;
        final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
        final /* synthetic */ TextDragObserver $textDragObserver;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MouseSelectionObserver mouseSelectionObserver, ClicksCounter clicksCounter, TextDragObserver textDragObserver, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.$mouseSelectionObserver = mouseSelectionObserver;
            this.$clicksCounter = clicksCounter;
            this.$textDragObserver = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mouseSelectionObserver, this.$clicksCounter, this.$textDragObserver, interfaceC8585dra);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // o.drX
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            AwaitPointerEventScope awaitPointerEventScope;
            Object obj2;
            Object mouseSelection;
            e = C8586drb.e();
            int i = this.label;
            if (i == 0) {
                C8556dpz.d(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                obj = SelectionGesturesKt.awaitDown(awaitPointerEventScope, this);
                if (obj == e) {
                    return e;
                }
            } else if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C8556dpz.d(obj);
                return dpR.c;
            } else {
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                C8556dpz.d(obj);
            }
            PointerEvent pointerEvent = (PointerEvent) obj;
            if (SelectionGesturesKt.isPrecisePointer(pointerEvent) && PointerEvent_androidKt.m1715isPrimaryPressedaHzCxE(pointerEvent.m1697getButtonsry648PA())) {
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (!changes.get(i2).isConsumed()) {
                    }
                }
                MouseSelectionObserver mouseSelectionObserver = this.$mouseSelectionObserver;
                ClicksCounter clicksCounter = this.$clicksCounter;
                this.L$0 = null;
                this.label = 2;
                mouseSelection = SelectionGesturesKt.mouseSelection(awaitPointerEventScope, mouseSelectionObserver, clicksCounter, pointerEvent, this);
                if (mouseSelection == e) {
                    return e;
                }
                return dpR.c;
            }
            if (!SelectionGesturesKt.isPrecisePointer(pointerEvent)) {
                TextDragObserver textDragObserver = this.$textDragObserver;
                this.L$0 = null;
                this.label = 3;
                obj2 = SelectionGesturesKt.touchSelection(awaitPointerEventScope, textDragObserver, pointerEvent, this);
                if (obj2 == e) {
                    return e;
                }
            }
            return dpR.c;
        }
    }
}
