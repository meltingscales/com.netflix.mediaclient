package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import java.util.Map;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public interface AlignmentLinesOwner extends Measurable {
    Map<AlignmentLine, Integer> calculateAlignmentLines();

    void forEachChildAlignmentLinesOwner(drM<? super AlignmentLinesOwner, dpR> drm);

    AlignmentLines getAlignmentLines();

    NodeCoordinator getInnerCoordinator();

    AlignmentLinesOwner getParentAlignmentLinesOwner();

    boolean isPlaced();

    void layoutChildren();

    void requestLayout();

    void requestMeasure();
}
