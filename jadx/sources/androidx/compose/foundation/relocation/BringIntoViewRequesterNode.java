package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSizeKt;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public final class BringIntoViewRequesterNode extends BringIntoViewChildNode {
    private BringIntoViewRequester requester;

    public BringIntoViewRequesterNode(BringIntoViewRequester bringIntoViewRequester) {
        this.requester = bringIntoViewRequester;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateRequester(this.requester);
    }

    public final void updateRequester(BringIntoViewRequester bringIntoViewRequester) {
        disposeRequester();
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            ((BringIntoViewRequesterImpl) bringIntoViewRequester).getModifiers().add(this);
        }
        this.requester = bringIntoViewRequester;
    }

    private final void disposeRequester() {
        BringIntoViewRequester bringIntoViewRequester = this.requester;
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            C8632dsu.d(bringIntoViewRequester);
            ((BringIntoViewRequesterImpl) bringIntoViewRequester).getModifiers().remove(this);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeRequester();
    }

    public final Object bringIntoView(final Rect rect, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        BringIntoViewParent parent = getParent();
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return dpR.c;
        }
        Object bringChildIntoView = parent.bringChildIntoView(layoutCoordinates, new drO<Rect>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterNode$bringIntoView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Rect invoke() {
                Rect rect2 = Rect.this;
                if (rect2 == null) {
                    LayoutCoordinates layoutCoordinates2 = this.getLayoutCoordinates();
                    if (layoutCoordinates2 != null) {
                        return SizeKt.m1184toRectuvyYCjk(IntSizeKt.m2553toSizeozmzZPI(layoutCoordinates2.mo1809getSizeYbymL2g()));
                    }
                    return null;
                }
                return rect2;
            }
        }, interfaceC8585dra);
        e = C8586drb.e();
        return bringChildIntoView == e ? bringChildIntoView : dpR.c;
    }
}
