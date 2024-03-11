package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class RunGroup {
    public static int index;
    int direction;
    WidgetRun firstRun;
    int groupIndex;
    WidgetRun lastRun;
    public int position = 0;
    public boolean dual = false;
    ArrayList<WidgetRun> runs = new ArrayList<>();

    public RunGroup(WidgetRun widgetRun, int i) {
        this.firstRun = null;
        this.lastRun = null;
        int i2 = index;
        this.groupIndex = i2;
        index = i2 + 1;
        this.firstRun = widgetRun;
        this.lastRun = widgetRun;
        this.direction = i;
    }

    public void add(WidgetRun widgetRun) {
        this.runs.add(widgetRun);
        this.lastRun = widgetRun;
    }

    private long traverseStart(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun instanceof HelperReferences) {
            return j;
        }
        int size = dependencyNode.dependencies.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            Dependency dependency = dependencyNode.dependencies.get(i);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.run != widgetRun) {
                    j2 = Math.max(j2, traverseStart(dependencyNode2, dependencyNode2.margin + j));
                }
            }
        }
        if (dependencyNode == widgetRun.start) {
            long wrapDimension = j + widgetRun.getWrapDimension();
            return Math.max(Math.max(j2, traverseStart(widgetRun.end, wrapDimension)), wrapDimension - widgetRun.end.margin);
        }
        return j2;
    }

    private long traverseEnd(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun instanceof HelperReferences) {
            return j;
        }
        int size = dependencyNode.dependencies.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            Dependency dependency = dependencyNode.dependencies.get(i);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.run != widgetRun) {
                    j2 = Math.min(j2, traverseEnd(dependencyNode2, dependencyNode2.margin + j));
                }
            }
        }
        if (dependencyNode == widgetRun.end) {
            long wrapDimension = j - widgetRun.getWrapDimension();
            return Math.min(Math.min(j2, traverseEnd(widgetRun.start, wrapDimension)), wrapDimension - widgetRun.start.margin);
        }
        return j2;
    }

    public long computeWrapSize(ConstraintWidgetContainer constraintWidgetContainer, int i) {
        WidgetRun widgetRun;
        long wrapDimension;
        int i2;
        DependencyNode dependencyNode;
        DependencyNode dependencyNode2;
        float biasPercent;
        WidgetRun widgetRun2;
        WidgetRun widgetRun3 = this.firstRun;
        if (widgetRun3 instanceof ChainRun) {
            if (((ChainRun) widgetRun3).orientation != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(widgetRun3 instanceof HorizontalWidgetRun)) {
                return 0L;
            }
        } else if (!(widgetRun3 instanceof VerticalWidgetRun)) {
            return 0L;
        }
        DependencyNode dependencyNode3 = (i == 0 ? constraintWidgetContainer.horizontalRun : constraintWidgetContainer.verticalRun).start;
        DependencyNode dependencyNode4 = (i == 0 ? constraintWidgetContainer.horizontalRun : constraintWidgetContainer.verticalRun).end;
        boolean contains = widgetRun3.start.targets.contains(dependencyNode3);
        boolean contains2 = this.firstRun.end.targets.contains(dependencyNode4);
        long wrapDimension2 = this.firstRun.getWrapDimension();
        if (contains && contains2) {
            long traverseStart = traverseStart(this.firstRun.start, 0L);
            long traverseEnd = traverseEnd(this.firstRun.end, 0L);
            long j = traverseStart - wrapDimension2;
            WidgetRun widgetRun4 = this.firstRun;
            int i3 = widgetRun4.end.margin;
            if (j >= (-i3)) {
                j += i3;
            }
            long j2 = widgetRun4.start.margin;
            long j3 = ((-traverseEnd) - wrapDimension2) - j2;
            if (j3 >= j2) {
                j3 -= j2;
            }
            float f = (float) (widgetRun4.widget.getBiasPercent(i) > 0.0f ? (((float) j3) / biasPercent) + (((float) j) / (1.0f - biasPercent)) : 0L);
            wrapDimension = widgetRun2.start.margin + (f * biasPercent) + 0.5f + wrapDimension2 + (f * (1.0f - biasPercent)) + 0.5f;
            i2 = this.firstRun.end.margin;
        } else if (contains) {
            return Math.max(traverseStart(this.firstRun.start, dependencyNode2.margin), this.firstRun.start.margin + wrapDimension2);
        } else if (contains2) {
            return Math.max(-traverseEnd(this.firstRun.end, dependencyNode.margin), (-this.firstRun.end.margin) + wrapDimension2);
        } else {
            wrapDimension = widgetRun.start.margin + this.firstRun.getWrapDimension();
            i2 = this.firstRun.end.margin;
        }
        return wrapDimension - i2;
    }
}
