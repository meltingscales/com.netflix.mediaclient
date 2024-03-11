package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.BasicText_androidKt;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import o.C8627dsp;
import o.C8657dts;
import o.drO;

/* loaded from: classes.dex */
public final class SelectionController implements RememberObserver {
    private final long backgroundSelectionColor;
    private final Modifier modifier;
    private StaticTextSelectionParams params;
    private Selectable selectable;
    private final long selectableId;
    private final SelectionRegistrar selectionRegistrar;

    public /* synthetic */ SelectionController(long j, SelectionRegistrar selectionRegistrar, long j2, StaticTextSelectionParams staticTextSelectionParams, C8627dsp c8627dsp) {
        this(j, selectionRegistrar, j2, staticTextSelectionParams);
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    private SelectionController(long j, SelectionRegistrar selectionRegistrar, long j2, StaticTextSelectionParams staticTextSelectionParams) {
        Modifier makeSelectionModifier;
        this.selectableId = j;
        this.selectionRegistrar = selectionRegistrar;
        this.backgroundSelectionColor = j2;
        this.params = staticTextSelectionParams;
        makeSelectionModifier = SelectionControllerKt.makeSelectionModifier(selectionRegistrar, j, new drO<LayoutCoordinates>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$modifier$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final LayoutCoordinates invoke() {
                StaticTextSelectionParams staticTextSelectionParams2;
                staticTextSelectionParams2 = SelectionController.this.params;
                return staticTextSelectionParams2.getLayoutCoordinates();
            }
        });
        this.modifier = BasicText_androidKt.textPointerHoverIcon(makeSelectionModifier, selectionRegistrar);
    }

    public /* synthetic */ SelectionController(long j, SelectionRegistrar selectionRegistrar, long j2, StaticTextSelectionParams staticTextSelectionParams, int i, C8627dsp c8627dsp) {
        this(j, selectionRegistrar, j2, (i & 8) != 0 ? StaticTextSelectionParams.Companion.getEmpty() : staticTextSelectionParams, null);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.selectable = this.selectionRegistrar.subscribe(new MultiWidgetSelectionDelegate(this.selectableId, new drO<LayoutCoordinates>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$onRemembered$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final LayoutCoordinates invoke() {
                StaticTextSelectionParams staticTextSelectionParams;
                staticTextSelectionParams = SelectionController.this.params;
                return staticTextSelectionParams.getLayoutCoordinates();
            }
        }, new drO<TextLayoutResult>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$onRemembered$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final TextLayoutResult invoke() {
                StaticTextSelectionParams staticTextSelectionParams;
                staticTextSelectionParams = SelectionController.this.params;
                return staticTextSelectionParams.getTextLayoutResult();
            }
        }));
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    public final void updateTextLayout(TextLayoutResult textLayoutResult) {
        this.params = StaticTextSelectionParams.copy$default(this.params, null, textLayoutResult, 1, null);
    }

    public final void updateGlobalPosition(LayoutCoordinates layoutCoordinates) {
        this.params = StaticTextSelectionParams.copy$default(this.params, layoutCoordinates, null, 2, null);
        this.selectionRegistrar.notifyPositionChange(this.selectableId);
    }

    public final void draw(DrawScope drawScope) {
        int offset;
        int offset2;
        int i;
        int i2;
        Selection selection = this.selectionRegistrar.getSubselections().get(Long.valueOf(this.selectableId));
        if (selection == null) {
            return;
        }
        if (!selection.getHandlesCrossed()) {
            offset = selection.getStart().getOffset();
        } else {
            offset = selection.getEnd().getOffset();
        }
        if (!selection.getHandlesCrossed()) {
            offset2 = selection.getEnd().getOffset();
        } else {
            offset2 = selection.getStart().getOffset();
        }
        if (offset == offset2) {
            return;
        }
        Selectable selectable = this.selectable;
        int lastVisibleOffset = selectable != null ? selectable.getLastVisibleOffset() : 0;
        i = C8657dts.i(offset, lastVisibleOffset);
        i2 = C8657dts.i(offset2, lastVisibleOffset);
        Path pathForRange = this.params.getPathForRange(i, i2);
        if (pathForRange == null) {
            return;
        }
        if (!this.params.getShouldClip()) {
            DrawScope.m1554drawPathLG529CI$default(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
            return;
        }
        float m1176getWidthimpl = Size.m1176getWidthimpl(drawScope.mo1562getSizeNHjbRc());
        float m1174getHeightimpl = Size.m1174getHeightimpl(drawScope.mo1562getSizeNHjbRc());
        int m1283getIntersectrtfAjoo = ClipOp.Companion.m1283getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo1538getSizeNHjbRc = drawContext.mo1538getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo1541clipRectN_I0leg(0.0f, 0.0f, m1176getWidthimpl, m1174getHeightimpl, m1283getIntersectrtfAjoo);
        DrawScope.m1554drawPathLG529CI$default(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
        drawContext.getCanvas().restore();
        drawContext.mo1539setSizeuvyYCjk(mo1538getSizeNHjbRc);
    }
}
