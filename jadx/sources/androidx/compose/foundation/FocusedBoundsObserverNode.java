package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import o.dpD;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class FocusedBoundsObserverNode extends Modifier.Node implements ModifierLocalModifierNode {
    private final drM<LayoutCoordinates, dpR> focusBoundsObserver;
    private drM<? super LayoutCoordinates, dpR> onPositioned;
    private final ModifierLocalMap providedValues;

    public final drM<LayoutCoordinates, dpR> getOnPositioned() {
        return this.onPositioned;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    public FocusedBoundsObserverNode(drM<? super LayoutCoordinates, dpR> drm) {
        this.onPositioned = drm;
        drM<LayoutCoordinates, dpR> drm2 = new drM<LayoutCoordinates, dpR>() { // from class: androidx.compose.foundation.FocusedBoundsObserverNode$focusBoundsObserver$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                drM parent;
                if (FocusedBoundsObserverNode.this.isAttached()) {
                    FocusedBoundsObserverNode.this.getOnPositioned().invoke(layoutCoordinates);
                    parent = FocusedBoundsObserverNode.this.getParent();
                    if (parent != null) {
                        parent.invoke(layoutCoordinates);
                    }
                }
            }
        };
        this.focusBoundsObserver = drm2;
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(dpD.a(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver(), drm2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final drM<LayoutCoordinates, dpR> getParent() {
        if (isAttached()) {
            return (drM) getCurrent(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver());
        }
        return null;
    }
}
