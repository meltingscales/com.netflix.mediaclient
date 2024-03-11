package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import o.C8627dsp;
import o.dpR;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SimpleGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode {
    private float alpha;
    private long ambientShadowColor;
    private float cameraDistance;
    private boolean clip;
    private int compositingStrategy;
    private drM<? super GraphicsLayerScope, dpR> layerBlock;
    private RenderEffect renderEffect;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private Shape shape;
    private long spotShadowColor;
    private long transformOrigin;
    private float translationX;
    private float translationY;

    public /* synthetic */ SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, C8627dsp c8627dsp) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, i);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU  reason: not valid java name */
    public final long m1433getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: getCompositingStrategy--NrFUSI  reason: not valid java name */
    public final int m1434getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    public final Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU  reason: not valid java name */
    public final long m1435getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ  reason: not valid java name */
    public final long m1436getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    /* renamed from: setAmbientShadowColor-8_81llA  reason: not valid java name */
    public final void m1437setAmbientShadowColor8_81llA(long j) {
        this.ambientShadowColor = j;
    }

    public final void setCameraDistance(float f) {
        this.cameraDistance = f;
    }

    public final void setClip(boolean z) {
        this.clip = z;
    }

    /* renamed from: setCompositingStrategy-aDBOjCE  reason: not valid java name */
    public final void m1438setCompositingStrategyaDBOjCE(int i) {
        this.compositingStrategy = i;
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public final void setRotationX(float f) {
        this.rotationX = f;
    }

    public final void setRotationY(float f) {
        this.rotationY = f;
    }

    public final void setRotationZ(float f) {
        this.rotationZ = f;
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
    }

    public final void setShadowElevation(float f) {
        this.shadowElevation = f;
    }

    public final void setShape(Shape shape) {
        this.shape = shape;
    }

    /* renamed from: setSpotShadowColor-8_81llA  reason: not valid java name */
    public final void m1439setSpotShadowColor8_81llA(long j) {
        this.spotShadowColor = j;
    }

    /* renamed from: setTransformOrigin-__ExYCQ  reason: not valid java name */
    public final void m1440setTransformOrigin__ExYCQ(long j) {
        this.transformOrigin = j;
    }

    public final void setTranslationX(float f) {
        this.translationX = f;
    }

    public final void setTranslationY(float f) {
        this.translationY = f;
    }

    private SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i) {
        this.scaleX = f;
        this.scaleY = f2;
        this.alpha = f3;
        this.translationX = f4;
        this.translationY = f5;
        this.shadowElevation = f6;
        this.rotationX = f7;
        this.rotationY = f8;
        this.rotationZ = f9;
        this.cameraDistance = f10;
        this.transformOrigin = j;
        this.shape = shape;
        this.clip = z;
        this.renderEffect = renderEffect;
        this.ambientShadowColor = j2;
        this.spotShadowColor = j3;
        this.compositingStrategy = i;
        this.layerBlock = new drM<GraphicsLayerScope, dpR>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setScaleX(SimpleGraphicsLayerModifier.this.getScaleX());
                graphicsLayerScope.setScaleY(SimpleGraphicsLayerModifier.this.getScaleY());
                graphicsLayerScope.setAlpha(SimpleGraphicsLayerModifier.this.getAlpha());
                graphicsLayerScope.setTranslationX(SimpleGraphicsLayerModifier.this.getTranslationX());
                graphicsLayerScope.setTranslationY(SimpleGraphicsLayerModifier.this.getTranslationY());
                graphicsLayerScope.setShadowElevation(SimpleGraphicsLayerModifier.this.getShadowElevation());
                graphicsLayerScope.setRotationX(SimpleGraphicsLayerModifier.this.getRotationX());
                graphicsLayerScope.setRotationY(SimpleGraphicsLayerModifier.this.getRotationY());
                graphicsLayerScope.setRotationZ(SimpleGraphicsLayerModifier.this.getRotationZ());
                graphicsLayerScope.setCameraDistance(SimpleGraphicsLayerModifier.this.getCameraDistance());
                graphicsLayerScope.mo1353setTransformOrigin__ExYCQ(SimpleGraphicsLayerModifier.this.m1436getTransformOriginSzJe1aQ());
                graphicsLayerScope.setShape(SimpleGraphicsLayerModifier.this.getShape());
                graphicsLayerScope.setClip(SimpleGraphicsLayerModifier.this.getClip());
                graphicsLayerScope.setRenderEffect(SimpleGraphicsLayerModifier.this.getRenderEffect());
                graphicsLayerScope.mo1350setAmbientShadowColor8_81llA(SimpleGraphicsLayerModifier.this.m1433getAmbientShadowColor0d7_KjU());
                graphicsLayerScope.mo1352setSpotShadowColor8_81llA(SimpleGraphicsLayerModifier.this.m1435getSpotShadowColor0d7_KjU());
                graphicsLayerScope.mo1351setCompositingStrategyaDBOjCE(SimpleGraphicsLayerModifier.this.m1434getCompositingStrategyNrFUSI());
            }
        };
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo1803measureBRTryo0.getWidth(), mo1803measureBRTryo0.getHeight(), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$measure$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                drM drm;
                Placeable placeable = Placeable.this;
                drm = this.layerBlock;
                Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, 0, 0.0f, drm, 4, null);
            }
        }, 4, null);
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha = " + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) TransformOrigin.m1478toStringimpl(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ", ambientShadowColor=" + ((Object) Color.m1301toStringimpl(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) Color.m1301toStringimpl(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) CompositingStrategy.m1322toStringimpl(this.compositingStrategy)) + ')';
    }

    public final void invalidateLayerBlock() {
        NodeCoordinator wrapped$ui_release = DelegatableNodeKt.m1853requireCoordinator64DMado(this, NodeKind.m1935constructorimpl(2)).getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            wrapped$ui_release.updateLayerBlock(this.layerBlock, true);
        }
    }
}
