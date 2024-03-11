package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import o.drO;

/* loaded from: classes.dex */
public final class SelectionControllerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier makeSelectionModifier(final SelectionRegistrar selectionRegistrar, final long j, final drO<? extends LayoutCoordinates> dro) {
        TextDragObserver textDragObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1
            private long dragTotalDistance;
            private long lastPosition;

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo451onDownk4lQ0M(long j2) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Multi-variable type inference failed */
            {
                Offset.Companion companion = Offset.Companion;
                this.lastPosition = companion.m1149getZeroF1C5BW0();
                this.dragTotalDistance = companion.m1149getZeroF1C5BW0();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo453onStartk4lQ0M(long j2) {
                LayoutCoordinates invoke = dro.invoke();
                if (invoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    if (!invoke.isAttached()) {
                        return;
                    }
                    selectionRegistrar2.m533notifySelectionUpdateStartubNVwUQ(invoke, j2, SelectionAdjustment.Companion.getWord(), true);
                    this.lastPosition = j2;
                }
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    this.dragTotalDistance = Offset.Companion.m1149getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo452onDragk4lQ0M(long j2) {
                LayoutCoordinates invoke = dro.invoke();
                if (invoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j3 = j;
                    if (invoke.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3)) {
                        long m1142plusMKHz9U = Offset.m1142plusMKHz9U(this.dragTotalDistance, j2);
                        this.dragTotalDistance = m1142plusMKHz9U;
                        long m1142plusMKHz9U2 = Offset.m1142plusMKHz9U(this.lastPosition, m1142plusMKHz9U);
                        if (selectionRegistrar2.m532notifySelectionUpdatenjBpvok(invoke, m1142plusMKHz9U2, this.lastPosition, false, SelectionAdjustment.Companion.getCharacterWithWordAccelerate(), true)) {
                            this.lastPosition = m1142plusMKHz9U2;
                            this.dragTotalDistance = Offset.Companion.m1149getZeroF1C5BW0();
                        }
                    }
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }
        };
        return SelectionGesturesKt.selectionGestureInput(Modifier.Companion, new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1
            private long lastPosition = Offset.Companion.m1149getZeroF1C5BW0();

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M  reason: not valid java name */
            public boolean mo513onExtendk4lQ0M(long j2) {
                LayoutCoordinates invoke = dro.invoke();
                if (invoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j3 = j;
                    if (invoke.isAttached()) {
                        if (selectionRegistrar2.m532notifySelectionUpdatenjBpvok(invoke, j2, this.lastPosition, false, SelectionAdjustment.Companion.getNone(), false)) {
                            this.lastPosition = j2;
                        }
                        return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3);
                    }
                    return false;
                }
                return false;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M  reason: not valid java name */
            public boolean mo514onExtendDragk4lQ0M(long j2) {
                LayoutCoordinates invoke = dro.invoke();
                if (invoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j3 = j;
                    if (invoke.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3)) {
                        if (selectionRegistrar2.m532notifySelectionUpdatenjBpvok(invoke, j2, this.lastPosition, false, SelectionAdjustment.Companion.getNone(), false)) {
                            this.lastPosition = j2;
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k  reason: not valid java name */
            public boolean mo515onStart3MmeM6k(long j2, SelectionAdjustment selectionAdjustment) {
                LayoutCoordinates invoke = dro.invoke();
                if (invoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j3 = j;
                    if (invoke.isAttached()) {
                        selectionRegistrar2.m533notifySelectionUpdateStartubNVwUQ(invoke, j2, selectionAdjustment, false);
                        this.lastPosition = j2;
                        return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3);
                    }
                    return false;
                }
                return false;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k  reason: not valid java name */
            public boolean mo512onDrag3MmeM6k(long j2, SelectionAdjustment selectionAdjustment) {
                LayoutCoordinates invoke = dro.invoke();
                if (invoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j3 = j;
                    if (invoke.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3)) {
                        if (selectionRegistrar2.m532notifySelectionUpdatenjBpvok(invoke, j2, this.lastPosition, false, selectionAdjustment, false)) {
                            this.lastPosition = j2;
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
                selectionRegistrar.notifySelectionUpdateEnd();
            }
        }, textDragObserver);
    }
}
