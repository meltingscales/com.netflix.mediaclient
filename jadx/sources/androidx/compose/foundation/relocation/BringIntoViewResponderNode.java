package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpD;
import o.dpR;
import o.drO;
import o.dwY;

/* loaded from: classes.dex */
public final class BringIntoViewResponderNode extends BringIntoViewChildNode implements BringIntoViewParent {
    private final ModifierLocalMap providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(dpD.a(BringIntoViewKt.getModifierLocalBringIntoViewParent(), this));
    private BringIntoViewResponder responder;

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    public final BringIntoViewResponder getResponder() {
        return this.responder;
    }

    public BringIntoViewResponderNode(BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect bringChildIntoView$localRect(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, drO<Rect> dro) {
        Rect invoke;
        Rect localRectOf;
        LayoutCoordinates layoutCoordinates2 = bringIntoViewResponderNode.getLayoutCoordinates();
        if (layoutCoordinates2 == null) {
            return null;
        }
        if (!layoutCoordinates.isAttached()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates == null || (invoke = dro.invoke()) == null) {
            return null;
        }
        localRectOf = BringIntoViewResponderKt.localRectOf(layoutCoordinates2, layoutCoordinates, invoke);
        return localRectOf;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewParent
    public Object bringChildIntoView(final LayoutCoordinates layoutCoordinates, final drO<Rect> dro, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object b = dwY.b(new BringIntoViewResponderNode$bringChildIntoView$2(this, layoutCoordinates, dro, new drO<Rect>() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$parentRect$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Rect invoke() {
                Rect bringChildIntoView$localRect;
                bringChildIntoView$localRect = BringIntoViewResponderNode.bringChildIntoView$localRect(BringIntoViewResponderNode.this, layoutCoordinates, dro);
                if (bringChildIntoView$localRect != null) {
                    return BringIntoViewResponderNode.this.getResponder().calculateRectForParent(bringChildIntoView$localRect);
                }
                return null;
            }
        }, null), interfaceC8585dra);
        e = C8586drb.e();
        return b == e ? b : dpR.c;
    }
}
