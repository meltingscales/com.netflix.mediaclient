package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import com.netflix.android.org.json.zip.JSONzip;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt {
    public static final void SelectionHandle(final OffsetProvider offsetProvider, final boolean z, final ResolvedTextDirection resolvedTextDirection, final boolean z2, final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-626955031);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(offsetProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(resolvedTextDirection) ? JSONzip.end : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((46811 & i3) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-626955031, i3, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:66)");
            }
            final boolean isLeft = isLeft(z, resolvedTextDirection, z2);
            HandleReferencePoint handleReferencePoint = isLeft ? HandleReferencePoint.TopRight : HandleReferencePoint.TopLeft;
            final ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            HandlePopup(offsetProvider, handleReferencePoint, ComposableLambdaKt.composableLambda(startRestartGroup, 1868300064, true, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1868300064, i4, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:74)");
                        }
                        ProvidedValue<ViewConfiguration> provides = CompositionLocalsKt.getLocalViewConfiguration().provides(ViewConfiguration.this);
                        final Modifier modifier2 = modifier;
                        final boolean z3 = isLeft;
                        final OffsetProvider offsetProvider2 = offsetProvider;
                        final boolean z4 = z;
                        CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.composableLambda(composer2, -1338858912, true, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // o.drX
                            public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return dpR.c;
                            }

                            public final void invoke(Composer composer3, int i5) {
                                if ((i5 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1338858912, i5, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:75)");
                                    }
                                    Modifier modifier3 = Modifier.this;
                                    final OffsetProvider offsetProvider3 = offsetProvider2;
                                    final boolean z5 = z4;
                                    final boolean z6 = z3;
                                    Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier3, false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.SelectionHandle.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // o.drM
                                        public /* bridge */ /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return dpR.c;
                                        }

                                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            long mo403provideF1C5BW0 = OffsetProvider.this.mo403provideF1C5BW0();
                                            semanticsPropertyReceiver.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(z5 ? Handle.SelectionStart : Handle.SelectionEnd, mo403provideF1C5BW0, z6 ? SelectionHandleAnchor.Left : SelectionHandleAnchor.Right, OffsetKt.m1151isSpecifiedk4lQ0M(mo403provideF1C5BW0), null));
                                        }
                                    }, 1, null);
                                    final OffsetProvider offsetProvider4 = offsetProvider2;
                                    AndroidSelectionHandles_androidKt.SelectionHandleIcon(semantics$default, new drO<Boolean>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.SelectionHandle.1.1.2
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // o.drO
                                        public final Boolean invoke() {
                                            return Boolean.valueOf(OffsetKt.m1151isSpecifiedk4lQ0M(OffsetProvider.this.mo403provideF1C5BW0()));
                                        }
                                    }, z3, composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, (i3 & 14) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i4) {
                    AndroidSelectionHandles_androidKt.SelectionHandle(OffsetProvider.this, z, resolvedTextDirection, z2, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void SelectionHandleIcon(final Modifier modifier, final drO<Boolean> dro, final boolean z, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(2111672474);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(dro) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? JSONzip.end : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2111672474, i2, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:98)");
            }
            SpacerKt.Spacer(drawSelectionHandle(SizeKt.m297sizeVpY3zN4(modifier, SelectionHandlesKt.getHandleWidth(), SelectionHandlesKt.getHandleHeight()), dro, z), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandleIcon$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i3) {
                    AndroidSelectionHandles_androidKt.SelectionHandleIcon(Modifier.this, dro, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Modifier drawSelectionHandle(Modifier modifier, final drO<Boolean> dro, final boolean z) {
        return ComposedModifierKt.composed$default(modifier, null, new InterfaceC8612dsa<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceableGroup(-196777734);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-196777734, i, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:110)");
                }
                final long m550getHandleColor0d7_KjU = ((TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m550getHandleColor0d7_KjU();
                composer.startReplaceableGroup(-433018279);
                boolean changed = composer.changed(m550getHandleColor0d7_KjU);
                boolean changedInstance = composer.changedInstance(dro);
                boolean changed2 = composer.changed(z);
                final drO<Boolean> dro2 = dro;
                final boolean z2 = z;
                Object rememberedValue = composer.rememberedValue();
                if ((changed | changedInstance | changed2) || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new drM<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                            final ImageBitmap createHandleImage = AndroidSelectionHandles_androidKt.createHandleImage(cacheDrawScope, Size.m1176getWidthimpl(cacheDrawScope.m1067getSizeNHjbRc()) / 2.0f);
                            final ColorFilter m1312tintxETnrds$default = ColorFilter.Companion.m1312tintxETnrds$default(ColorFilter.Companion, m550getHandleColor0d7_KjU, 0, 2, null);
                            final drO<Boolean> dro3 = dro2;
                            final boolean z3 = z2;
                            return cacheDrawScope.onDrawWithContent(new drM<ContentDrawScope, dpR>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                public /* bridge */ /* synthetic */ dpR invoke(ContentDrawScope contentDrawScope) {
                                    invoke2(contentDrawScope);
                                    return dpR.c;
                                }

                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2(ContentDrawScope contentDrawScope) {
                                    contentDrawScope.drawContent();
                                    if (dro3.invoke().booleanValue()) {
                                        if (!z3) {
                                            DrawScope.m1549drawImagegbVJVH8$default(contentDrawScope, createHandleImage, 0L, 0.0f, null, m1312tintxETnrds$default, 0, 46, null);
                                            return;
                                        }
                                        ImageBitmap imageBitmap = createHandleImage;
                                        ColorFilter colorFilter = m1312tintxETnrds$default;
                                        long mo1561getCenterF1C5BW0 = contentDrawScope.mo1561getCenterF1C5BW0();
                                        DrawContext drawContext = contentDrawScope.getDrawContext();
                                        long mo1538getSizeNHjbRc = drawContext.mo1538getSizeNHjbRc();
                                        drawContext.getCanvas().save();
                                        drawContext.getTransform().mo1544scale0AR0LA0(-1.0f, 1.0f, mo1561getCenterF1C5BW0);
                                        DrawScope.m1549drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                                        drawContext.getCanvas().restore();
                                        drawContext.mo1539setSizeuvyYCjk(mo1538getSizeNHjbRc);
                                    }
                                }
                            });
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier drawWithCache = DrawModifierKt.drawWithCache(modifier2, (drM) rememberedValue);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return drawWithCache;
            }
        }, 1, null);
    }

    public static final ImageBitmap createHandleImage(CacheDrawScope cacheDrawScope, float f) {
        int ceil = ((int) Math.ceil(f)) * 2;
        HandleImageCache handleImageCache = HandleImageCache.INSTANCE;
        ImageBitmap imageBitmap = handleImageCache.getImageBitmap();
        Canvas canvas = handleImageCache.getCanvas();
        CanvasDrawScope canvasDrawScope = handleImageCache.getCanvasDrawScope();
        if (imageBitmap == null || canvas == null || ceil > imageBitmap.getWidth() || ceil > imageBitmap.getHeight()) {
            imageBitmap = ImageBitmapKt.m1367ImageBitmapx__hDU$default(ceil, ceil, ImageBitmapConfig.Companion.m1361getAlpha8_sVssgQ(), false, null, 24, null);
            handleImageCache.setImageBitmap(imageBitmap);
            canvas = CanvasKt.Canvas(imageBitmap);
            handleImageCache.setCanvas(canvas);
        }
        ImageBitmap imageBitmap2 = imageBitmap;
        Canvas canvas2 = canvas;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            handleImageCache.setCanvasDrawScope(canvasDrawScope);
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        long Size = androidx.compose.ui.geometry.SizeKt.Size(imageBitmap2.getWidth(), imageBitmap2.getHeight());
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m1535component4NHjbRc = drawParams.m1535component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas2);
        drawParams2.m1537setSizeuvyYCjk(Size);
        canvas2.save();
        DrawScope.m1557drawRectnJ9OG0$default(canvasDrawScope2, Color.Companion.m1303getBlack0d7_KjU(), 0L, canvasDrawScope2.mo1562getSizeNHjbRc(), 0.0f, null, null, BlendMode.Companion.m1233getClear0nO6VwU(), 58, null);
        DrawScope.m1557drawRectnJ9OG0$default(canvasDrawScope2, ColorKt.Color(4278190080L), Offset.Companion.m1149getZeroF1C5BW0(), androidx.compose.ui.geometry.SizeKt.Size(f, f), 0.0f, null, null, 0, 120, null);
        DrawScope.m1547drawCircleVaOC9Bg$default(canvasDrawScope2, ColorKt.Color(4278190080L), f, OffsetKt.Offset(f, f), 0.0f, null, null, 0, 120, null);
        canvas2.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m1537setSizeuvyYCjk(m1535component4NHjbRc);
        return imageBitmap2;
    }

    public static final void HandlePopup(final OffsetProvider offsetProvider, final HandleReferencePoint handleReferencePoint, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(345017889);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(offsetProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(handleReferencePoint) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(drx) ? JSONzip.end : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(345017889, i2, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:223)");
            }
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed(handleReferencePoint);
            boolean changed2 = startRestartGroup.changed(offsetProvider);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | changed2) || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new HandlePositionProvider(handleReferencePoint, offsetProvider);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            AndroidPopup_androidKt.Popup((HandlePositionProvider) rememberedValue, null, new PopupProperties(false, false, false, null, true, false, 15, null), drx, startRestartGroup, ((i2 << 3) & 7168) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$HandlePopup$1
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
                    AndroidSelectionHandles_androidKt.HandlePopup(OffsetProvider.this, handleReferencePoint, drx, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean isLeft(boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        if (z) {
            return isHandleLtrDirection(resolvedTextDirection, z2);
        }
        return !isHandleLtrDirection(resolvedTextDirection, z2);
    }

    public static final boolean isHandleLtrDirection(ResolvedTextDirection resolvedTextDirection, boolean z) {
        return (resolvedTextDirection == ResolvedTextDirection.Ltr && !z) || (resolvedTextDirection == ResolvedTextDirection.Rtl && z);
    }
}
