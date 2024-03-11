package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import o.dpR;

/* loaded from: classes.dex */
public final class VectorPainterKt {
    public static final VectorPainter rememberVectorPainter(ImageVector imageVector, Composer composer, int i) {
        composer.startReplaceableGroup(1413834416);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1413834416, i, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:168)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        int genId$ui_release = imageVector.getGenId$ui_release();
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(Integer.valueOf(genId$ui_release));
        boolean changed2 = composer.changed(density);
        Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue == Composer.Companion.getEmpty()) {
            GroupComponent groupComponent = new GroupComponent();
            createGroupComponent(groupComponent, imageVector.getRoot());
            dpR dpr = dpR.c;
            rememberedValue = createVectorPainterFromImageVector(density, imageVector, groupComponent);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        VectorPainter vectorPainter = (VectorPainter) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return vectorPainter;
    }

    /* renamed from: obtainSizePx-VpY3zN4  reason: not valid java name */
    private static final long m1596obtainSizePxVpY3zN4(Density density, float f, float f2) {
        return SizeKt.Size(density.mo193toPx0680j_4(f), density.mo193toPx0680j_4(f2));
    }

    /* renamed from: obtainViewportSize-Pq9zytI  reason: not valid java name */
    private static final long m1597obtainViewportSizePq9zytI(long j, float f, float f2) {
        if (Float.isNaN(f)) {
            f = Size.m1176getWidthimpl(j);
        }
        if (Float.isNaN(f2)) {
            f2 = Size.m1174getHeightimpl(j);
        }
        return SizeKt.Size(f, f2);
    }

    /* renamed from: configureVectorPainter-T4PVSW8  reason: not valid java name */
    public static final VectorPainter m1594configureVectorPainterT4PVSW8(VectorPainter vectorPainter, long j, long j2, String str, ColorFilter colorFilter, boolean z) {
        vectorPainter.m1592setSizeuvyYCjk$ui_release(j);
        vectorPainter.setAutoMirror$ui_release(z);
        vectorPainter.setIntrinsicColorFilter$ui_release(colorFilter);
        vectorPainter.m1593setViewportSizeuvyYCjk$ui_release(j2);
        vectorPainter.setName$ui_release(str);
        return vectorPainter;
    }

    public static final VectorPainter createVectorPainterFromImageVector(Density density, ImageVector imageVector, GroupComponent groupComponent) {
        long m1596obtainSizePxVpY3zN4 = m1596obtainSizePxVpY3zN4(density, imageVector.m1579getDefaultWidthD9Ej5fM(), imageVector.m1578getDefaultHeightD9Ej5fM());
        return m1594configureVectorPainterT4PVSW8(new VectorPainter(groupComponent), m1596obtainSizePxVpY3zN4, m1597obtainViewportSizePq9zytI(m1596obtainSizePxVpY3zN4, imageVector.getViewportWidth(), imageVector.getViewportHeight()), imageVector.getName(), m1595createColorFilterxETnrds(imageVector.m1581getTintColor0d7_KjU(), imageVector.m1580getTintBlendMode0nO6VwU()), imageVector.getAutoMirror());
    }

    public static final GroupComponent createGroupComponent(GroupComponent groupComponent, VectorGroup vectorGroup) {
        int size = vectorGroup.getSize();
        for (int i = 0; i < size; i++) {
            VectorNode vectorNode = vectorGroup.get(i);
            if (vectorNode instanceof VectorPath) {
                PathComponent pathComponent = new PathComponent();
                VectorPath vectorPath = (VectorPath) vectorNode;
                pathComponent.setPathData(vectorPath.getPathData());
                pathComponent.m1584setPathFillTypeoQ8Xj4U(vectorPath.m1598getPathFillTypeRgk1Os());
                pathComponent.setName(vectorPath.getName());
                pathComponent.setFill(vectorPath.getFill());
                pathComponent.setFillAlpha(vectorPath.getFillAlpha());
                pathComponent.setStroke(vectorPath.getStroke());
                pathComponent.setStrokeAlpha(vectorPath.getStrokeAlpha());
                pathComponent.setStrokeLineWidth(vectorPath.getStrokeLineWidth());
                pathComponent.m1585setStrokeLineCapBeK7IIE(vectorPath.m1599getStrokeLineCapKaPHkGw());
                pathComponent.m1586setStrokeLineJoinWw9F2mQ(vectorPath.m1600getStrokeLineJoinLxFBmk8());
                pathComponent.setStrokeLineMiter(vectorPath.getStrokeLineMiter());
                pathComponent.setTrimPathStart(vectorPath.getTrimPathStart());
                pathComponent.setTrimPathEnd(vectorPath.getTrimPathEnd());
                pathComponent.setTrimPathOffset(vectorPath.getTrimPathOffset());
                groupComponent.insertAt(i, pathComponent);
            } else if (vectorNode instanceof VectorGroup) {
                GroupComponent groupComponent2 = new GroupComponent();
                VectorGroup vectorGroup2 = (VectorGroup) vectorNode;
                groupComponent2.setName(vectorGroup2.getName());
                groupComponent2.setRotation(vectorGroup2.getRotation());
                groupComponent2.setScaleX(vectorGroup2.getScaleX());
                groupComponent2.setScaleY(vectorGroup2.getScaleY());
                groupComponent2.setTranslationX(vectorGroup2.getTranslationX());
                groupComponent2.setTranslationY(vectorGroup2.getTranslationY());
                groupComponent2.setPivotX(vectorGroup2.getPivotX());
                groupComponent2.setPivotY(vectorGroup2.getPivotY());
                groupComponent2.setClipPathData(vectorGroup2.getClipPathData());
                createGroupComponent(groupComponent2, vectorGroup2);
                groupComponent.insertAt(i, groupComponent2);
            }
        }
        return groupComponent;
    }

    /* renamed from: createColorFilter-xETnrds  reason: not valid java name */
    private static final ColorFilter m1595createColorFilterxETnrds(long j, int i) {
        if (j != Color.Companion.m1309getUnspecified0d7_KjU()) {
            return ColorFilter.Companion.m1313tintxETnrds(j, i);
        }
        return null;
    }
}
