package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.netflix.android.org.json.zip.JSONzip;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class SurfaceKt {
    private static final ProvidableCompositionLocal<Dp> LocalAbsoluteTonalElevation = CompositionLocalKt.compositionLocalOf$default(null, new drO<Dp>() { // from class: androidx.compose.material3.SurfaceKt$LocalAbsoluteTonalElevation$1
        @Override // o.drO
        public /* synthetic */ Dp invoke() {
            return Dp.m2490boximpl(m837invokeD9Ej5fM());
        }

        /* renamed from: invoke-D9Ej5fM  reason: not valid java name */
        public final float m837invokeD9Ej5fM() {
            return Dp.m2492constructorimpl(0);
        }
    }, 1, null);

    /* renamed from: Surface-T9BRK9s  reason: not valid java name */
    public static final void m831SurfaceT9BRK9s(Modifier modifier, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-513881741);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.Companion : modifier;
        Shape rectangleShape = (i2 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long m764getSurface0d7_KjU = (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m764getSurface0d7_KjU() : j;
        long m778contentColorForek8zF_U = (i2 & 8) != 0 ? ColorSchemeKt.m778contentColorForek8zF_U(m764getSurface0d7_KjU, composer, (i >> 6) & 14) : j2;
        float m2492constructorimpl = (i2 & 16) != 0 ? Dp.m2492constructorimpl(0) : f;
        float m2492constructorimpl2 = (i2 & 32) != 0 ? Dp.m2492constructorimpl(0) : f2;
        BorderStroke borderStroke2 = (i2 & 64) != 0 ? null : borderStroke;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-513881741, i, -1, "androidx.compose.material3.Surface (Surface.kt:109)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float m2492constructorimpl3 = Dp.m2492constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m2498unboximpl() + m2492constructorimpl);
        final Modifier modifier3 = modifier2;
        final Shape shape2 = rectangleShape;
        final long j3 = m764getSurface0d7_KjU;
        final BorderStroke borderStroke3 = borderStroke2;
        final float f3 = m2492constructorimpl2;
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1284boximpl(m778contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m2490boximpl(m2492constructorimpl3))}, ComposableLambdaKt.composableLambda(composer, -70914509, true, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return dpR.c;
            }

            public final void invoke(Composer composer2, int i3) {
                long m836surfaceColorAtElevationCLU3JFs;
                Modifier m835surfaceXOJAsU;
                if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-70914509, i3, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:115)");
                    }
                    Modifier modifier4 = Modifier.this;
                    Shape shape3 = shape2;
                    m836surfaceColorAtElevationCLU3JFs = SurfaceKt.m836surfaceColorAtElevationCLU3JFs(j3, m2492constructorimpl3, composer2, 0);
                    m835surfaceXOJAsU = SurfaceKt.m835surfaceXOJAsU(modifier4, shape3, m836surfaceColorAtElevationCLU3JFs, borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(f3));
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(m835surfaceXOJAsU, false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1.2
                        @Override // o.drM
                        public /* bridge */ /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return dpR.c;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                        }
                    }), dpR.c, new AnonymousClass3(null));
                    drX<Composer, Integer, dpR> drx2 = drx;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    drO<ComposeUiNode> constructor = companion.getConstructor();
                    InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(pointerInput);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m1009constructorimpl = Updater.m1009constructorimpl(composer2);
                    Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    drx2.invoke(composer2, 0);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.compose.material3.SurfaceKt$Surface$1$3  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass3 extends SuspendLambda implements drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> {
                int label;

                AnonymousClass3(InterfaceC8585dra<? super AnonymousClass3> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass3(interfaceC8585dra);
                }

                @Override // o.drX
                public final Object invoke(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass3) create(pointerInputScope, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C8586drb.e();
                    if (this.label == 0) {
                        C8556dpz.d(obj);
                        return dpR.c;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }), composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* renamed from: Surface-o_FOJdg  reason: not valid java name */
    public static final void m832Surfaceo_FOJdg(final drO<dpR> dro, Modifier modifier, boolean z, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, int i, int i2, int i3) {
        final MutableInteractionSource mutableInteractionSource2;
        composer.startReplaceableGroup(-789752804);
        final Modifier.Companion companion = (i3 & 2) != 0 ? Modifier.Companion : modifier;
        final boolean z2 = (i3 & 4) != 0 ? true : z;
        final Shape rectangleShape = (i3 & 8) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long m764getSurface0d7_KjU = (i3 & 16) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m764getSurface0d7_KjU() : j;
        long m778contentColorForek8zF_U = (i3 & 32) != 0 ? ColorSchemeKt.m778contentColorForek8zF_U(m764getSurface0d7_KjU, composer, (i >> 12) & 14) : j2;
        float m2492constructorimpl = (i3 & 64) != 0 ? Dp.m2492constructorimpl(0) : f;
        float m2492constructorimpl2 = (i3 & 128) != 0 ? Dp.m2492constructorimpl(0) : f2;
        final BorderStroke borderStroke2 = (i3 & JSONzip.end) != 0 ? null : borderStroke;
        if ((i3 & 512) != 0) {
            composer.startReplaceableGroup(-746940902);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-789752804, i, i2, "androidx.compose.material3.Surface (Surface.kt:215)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float m2492constructorimpl3 = Dp.m2492constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m2498unboximpl() + m2492constructorimpl);
        final float f3 = m2492constructorimpl2;
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1284boximpl(m778contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m2490boximpl(m2492constructorimpl3))}, ComposableLambdaKt.composableLambda(composer, 1279702876, true, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material3.SurfaceKt$Surface$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return dpR.c;
            }

            public final void invoke(Composer composer2, int i4) {
                long m836surfaceColorAtElevationCLU3JFs;
                Modifier m835surfaceXOJAsU;
                if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1279702876, i4, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:221)");
                    }
                    Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.this);
                    Shape shape2 = rectangleShape;
                    m836surfaceColorAtElevationCLU3JFs = SurfaceKt.m836surfaceColorAtElevationCLU3JFs(m764getSurface0d7_KjU, m2492constructorimpl3, composer2, 0);
                    m835surfaceXOJAsU = SurfaceKt.m835surfaceXOJAsU(minimumInteractiveComponentSize, shape2, m836surfaceColorAtElevationCLU3JFs, borderStroke2, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(f3));
                    Modifier m128clickableO2vRcR0$default = ClickableKt.m128clickableO2vRcR0$default(m835surfaceXOJAsU, mutableInteractionSource2, RippleKt.m710rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z2, null, null, dro, 24, null);
                    drX<Composer, Integer, dpR> drx2 = drx;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    drO<ComposeUiNode> constructor = companion2.getConstructor();
                    InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m128clickableO2vRcR0$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m1009constructorimpl = Updater.m1009constructorimpl(composer2);
                    Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    drx2.invoke(composer2, 0);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surface-XO-JAsU  reason: not valid java name */
    public static final Modifier m835surfaceXOJAsU(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        Shape shape2;
        Modifier modifier2;
        Modifier m1346graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m1346graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape, false, null, 0L, 0L, 0, 124895, null);
        if (borderStroke != null) {
            shape2 = shape;
            modifier2 = BorderKt.border(Modifier.Companion, borderStroke, shape2);
        } else {
            shape2 = shape;
            modifier2 = Modifier.Companion;
        }
        return ClipKt.clip(BackgroundKt.m109backgroundbw27NRU(m1346graphicsLayerAp8cVGQ$default.then(modifier2), j, shape2), shape2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surfaceColorAtElevation-CLU3JFs  reason: not valid java name */
    public static final long m836surfaceColorAtElevationCLU3JFs(long j, float f, Composer composer, int i) {
        composer.startReplaceableGroup(-2079918090);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079918090, i, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:483)");
        }
        int i2 = i << 3;
        long m776applyTonalElevationRFCenO8 = ColorSchemeKt.m776applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j, f, composer, (i2 & 112) | (i2 & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m776applyTonalElevationRFCenO8;
    }
}
