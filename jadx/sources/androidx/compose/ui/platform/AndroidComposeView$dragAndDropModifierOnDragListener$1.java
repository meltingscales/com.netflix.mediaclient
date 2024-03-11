package androidx.compose.ui.platform;

import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class AndroidComposeView$dragAndDropModifierOnDragListener$1 extends FunctionReferenceImpl implements InterfaceC8612dsa<DragAndDropTransferData, Size, drM<? super DrawScope, ? extends dpR>, Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidComposeView$dragAndDropModifierOnDragListener$1(Object obj) {
        super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    @Override // o.InterfaceC8612dsa
    public /* synthetic */ Boolean invoke(DragAndDropTransferData dragAndDropTransferData, Size size, drM<? super DrawScope, ? extends dpR> drm) {
        return m1972invoke12SF9DM(dragAndDropTransferData, size.m1180unboximpl(), drm);
    }

    /* renamed from: invoke-12SF9DM  reason: not valid java name */
    public final Boolean m1972invoke12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j, drM<? super DrawScope, dpR> drm) {
        boolean m1969startDrag12SF9DM;
        m1969startDrag12SF9DM = ((AndroidComposeView) this.receiver).m1969startDrag12SF9DM(dragAndDropTransferData, j, drm);
        return Boolean.valueOf(m1969startDrag12SF9DM);
    }
}
