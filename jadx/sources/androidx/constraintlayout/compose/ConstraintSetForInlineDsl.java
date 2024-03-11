package androidx.constraintlayout.compose;

import android.os.Handler;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.layout.Measurable;
import java.util.ArrayList;
import java.util.List;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
final class ConstraintSetForInlineDsl implements ConstraintSet, RememberObserver {
    private Handler handler;
    private boolean knownDirty;
    private final SnapshotStateObserver observer;
    private final drM<dpR, dpR> onCommitAffectingConstrainLambdas;
    private final List<ConstraintLayoutParentData> previousDatas;
    private final ConstraintLayoutScope scope;

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    public final void setKnownDirty(boolean z) {
        this.knownDirty = z;
    }

    public ConstraintSetForInlineDsl(ConstraintLayoutScope constraintLayoutScope) {
        C8632dsu.c((Object) constraintLayoutScope, "");
        this.scope = constraintLayoutScope;
        this.observer = new SnapshotStateObserver(new ConstraintSetForInlineDsl$observer$1(this));
        this.knownDirty = true;
        this.onCommitAffectingConstrainLambdas = new drM<dpR, dpR>() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$onCommitAffectingConstrainLambdas$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(dpR dpr) {
                invoke2(dpr);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(dpR dpr) {
                C8632dsu.c((Object) dpr, "");
                ConstraintSetForInlineDsl.this.setKnownDirty(true);
            }
        };
        this.previousDatas = new ArrayList();
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(final State state, final List<? extends Measurable> list) {
        C8632dsu.c((Object) state, "");
        C8632dsu.c((Object) list, "");
        this.scope.applyTo(state);
        this.previousDatas.clear();
        this.observer.observeReads(dpR.c, this.onCommitAffectingConstrainLambdas, new drO<dpR>() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$applyTo$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                List list2;
                List<Measurable> list3 = list;
                State state2 = state;
                ConstraintSetForInlineDsl constraintSetForInlineDsl = this;
                int size = list3.size() - 1;
                if (size < 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    Object parentData = list3.get(i).getParentData();
                    ConstraintLayoutParentData constraintLayoutParentData = parentData instanceof ConstraintLayoutParentData ? (ConstraintLayoutParentData) parentData : null;
                    if (constraintLayoutParentData != null) {
                        ConstrainScope constrainScope = new ConstrainScope(constraintLayoutParentData.getRef().getId());
                        constraintLayoutParentData.getConstrain().invoke(constrainScope);
                        constrainScope.applyTo$compose_release(state2);
                    }
                    list2 = constraintSetForInlineDsl.previousDatas;
                    list2.add(constraintLayoutParentData);
                    if (i2 > size) {
                        return;
                    }
                    i = i2;
                }
            }
        });
        this.knownDirty = false;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public boolean isDirty(List<? extends Measurable> list) {
        C8632dsu.c((Object) list, "");
        if (this.knownDirty || list.size() != this.previousDatas.size()) {
            return true;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Object parentData = list.get(i).getParentData();
                if (!C8632dsu.c(parentData instanceof ConstraintLayoutParentData ? (ConstraintLayoutParentData) parentData : null, this.previousDatas.get(i))) {
                    return true;
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.observer.start();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.observer.stop();
        this.observer.clear();
    }
}
