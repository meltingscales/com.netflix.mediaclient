package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C8627dsp;
import o.C8632dsu;
import o.dpD;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;
import o.dsT;

/* loaded from: classes.dex */
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    private MultiParagraphLayoutCache _layoutCache;
    private Map<AlignmentLine, Integer> baselineCache;
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private drM<? super List<Rect>, dpR> onPlaceholderLayout;
    private drM<? super TextLayoutResult, dpR> onTextLayout;
    private int overflow;
    private ColorProducer overrideColor;
    private List<AnnotatedString.Range<Placeholder>> placeholders;
    private SelectionController selectionController;
    private drM<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;
    private boolean softWrap;
    private TextStyle style;
    private AnnotatedString text;
    private final MutableState textSubstitution$delegate;

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, drM drm, int i, boolean z, int i2, int i3, List list, drM drm2, SelectionController selectionController, ColorProducer colorProducer, C8627dsp c8627dsp) {
        this(annotatedString, textStyle, resolver, drm, i, z, i2, i3, list, drm2, selectionController, colorProducer);
    }

    private TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, drM<? super TextLayoutResult, dpR> drm, int i, boolean z, int i2, int i3, List<AnnotatedString.Range<Placeholder>> list, drM<? super List<Rect>, dpR> drm2, SelectionController selectionController, ColorProducer colorProducer) {
        MutableState mutableStateOf$default;
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.onTextLayout = drm;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.placeholders = list;
        this.onPlaceholderLayout = drm2;
        this.selectionController = selectionController;
        this.overrideColor = colorProducer;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.textSubstitution$delegate = mutableStateOf$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MultiParagraphLayoutCache getLayoutCache() {
        if (this._layoutCache == null) {
            this._layoutCache = new MultiParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
        }
        MultiParagraphLayoutCache multiParagraphLayoutCache = this._layoutCache;
        C8632dsu.d(multiParagraphLayoutCache);
        return multiParagraphLayoutCache;
    }

    private final MultiParagraphLayoutCache getLayoutCache(Density density) {
        MultiParagraphLayoutCache layoutCache;
        TextSubstitutionValue textSubstitution = getTextSubstitution();
        if (textSubstitution != null && textSubstitution.isShowingSubstitution() && (layoutCache = textSubstitution.getLayoutCache()) != null) {
            layoutCache.setDensity$foundation_release(density);
            return layoutCache;
        }
        MultiParagraphLayoutCache layoutCache2 = getLayoutCache();
        layoutCache2.setDensity$foundation_release(density);
        return layoutCache2;
    }

    public final boolean updateDraw(ColorProducer colorProducer, TextStyle textStyle) {
        boolean c = C8632dsu.c(colorProducer, this.overrideColor);
        this.overrideColor = colorProducer;
        return (c ^ true) || !textStyle.hasSameDrawAffectingAttributes(this.style);
    }

    public final boolean updateText(AnnotatedString annotatedString) {
        if (C8632dsu.c(this.text, annotatedString)) {
            return false;
        }
        this.text = annotatedString;
        clearSubstitution();
        return true;
    }

    /* renamed from: updateLayoutRelatedArgs-MPT68mk  reason: not valid java name */
    public final boolean m517updateLayoutRelatedArgsMPT68mk(TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, int i2, boolean z, FontFamily.Resolver resolver, int i3) {
        boolean z2 = !this.style.hasSameLayoutAffectingAttributes(textStyle);
        this.style = textStyle;
        if (!C8632dsu.c(this.placeholders, list)) {
            this.placeholders = list;
            z2 = true;
        }
        if (this.minLines != i) {
            this.minLines = i;
            z2 = true;
        }
        if (this.maxLines != i2) {
            this.maxLines = i2;
            z2 = true;
        }
        if (this.softWrap != z) {
            this.softWrap = z;
            z2 = true;
        }
        if (!C8632dsu.c(this.fontFamilyResolver, resolver)) {
            this.fontFamilyResolver = resolver;
            z2 = true;
        }
        if (TextOverflow.m2453equalsimpl0(this.overflow, i3)) {
            return z2;
        }
        this.overflow = i3;
        return true;
    }

    public final boolean updateCallbacks(drM<? super TextLayoutResult, dpR> drm, drM<? super List<Rect>, dpR> drm2, SelectionController selectionController) {
        boolean z;
        if (C8632dsu.c(this.onTextLayout, drm)) {
            z = false;
        } else {
            this.onTextLayout = drm;
            z = true;
        }
        if (!C8632dsu.c(this.onPlaceholderLayout, drm2)) {
            this.onPlaceholderLayout = drm2;
            z = true;
        }
        if (C8632dsu.c(this.selectionController, selectionController)) {
            return z;
        }
        this.selectionController = selectionController;
        return true;
    }

    public final void doInvalidations(boolean z, boolean z2, boolean z3, boolean z4) {
        if (isAttached()) {
            if (z2 || (z && this.semanticsTextLayoutResult != null)) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            if (z2 || z3 || z4) {
                getLayoutCache().m505updateZNqEYIc(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
                LayoutModifierNodeKt.invalidateMeasurement(this);
                DrawModifierNodeKt.invalidateDraw(this);
            }
            if (z) {
                DrawModifierNodeKt.invalidateDraw(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class TextSubstitutionValue {
        private boolean isShowingSubstitution;
        private MultiParagraphLayoutCache layoutCache;
        private final AnnotatedString original;
        private AnnotatedString substitution;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TextSubstitutionValue) {
                TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) obj;
                return C8632dsu.c(this.original, textSubstitutionValue.original) && C8632dsu.c(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && C8632dsu.c(this.layoutCache, textSubstitutionValue.layoutCache);
            }
            return false;
        }

        public final MultiParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        public final AnnotatedString getSubstitution() {
            return this.substitution;
        }

        public int hashCode() {
            int hashCode = this.original.hashCode();
            int hashCode2 = this.substitution.hashCode();
            int hashCode3 = Boolean.hashCode(this.isShowingSubstitution);
            MultiParagraphLayoutCache multiParagraphLayoutCache = this.layoutCache;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (multiParagraphLayoutCache == null ? 0 : multiParagraphLayoutCache.hashCode());
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setLayoutCache(MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.layoutCache = multiParagraphLayoutCache;
        }

        public final void setShowingSubstitution(boolean z) {
            this.isShowingSubstitution = z;
        }

        public final void setSubstitution(AnnotatedString annotatedString) {
            this.substitution = annotatedString;
        }

        public String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.original) + ", substitution=" + ((Object) this.substitution) + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }

        public TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z, MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.original = annotatedString;
            this.substitution = annotatedString2;
            this.isShowingSubstitution = z;
            this.layoutCache = multiParagraphLayoutCache;
        }

        public /* synthetic */ TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z, MultiParagraphLayoutCache multiParagraphLayoutCache, int i, C8627dsp c8627dsp) {
            this(annotatedString, annotatedString2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : multiParagraphLayoutCache);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setSubstitution(AnnotatedString annotatedString) {
        dpR dpr;
        TextSubstitutionValue textSubstitution = getTextSubstitution();
        if (textSubstitution != null) {
            if (C8632dsu.c(annotatedString, textSubstitution.getSubstitution())) {
                return false;
            }
            textSubstitution.setSubstitution(annotatedString);
            MultiParagraphLayoutCache layoutCache = textSubstitution.getLayoutCache();
            if (layoutCache != null) {
                layoutCache.m505updateZNqEYIc(annotatedString, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
                dpr = dpR.c;
            } else {
                dpr = null;
            }
            return dpr != null;
        }
        TextSubstitutionValue textSubstitutionValue = new TextSubstitutionValue(this.text, annotatedString, false, null, 12, null);
        MultiParagraphLayoutCache multiParagraphLayoutCache = new MultiParagraphLayoutCache(annotatedString, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
        multiParagraphLayoutCache.setDensity$foundation_release(getLayoutCache().getDensity$foundation_release());
        textSubstitutionValue.setLayoutCache(multiParagraphLayoutCache);
        setTextSubstitution(textSubstitutionValue);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearSubstitution() {
        setTextSubstitution(null);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        drM drm = this.semanticsTextLayoutResult;
        if (drm == null) {
            drm = new drM<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x00bb  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
                @Override // o.drM
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Boolean invoke(java.util.List<androidx.compose.ui.text.TextLayoutResult> r38) {
                    /*
                        r37 = this;
                        r0 = r37
                        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                        androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.access$getLayoutCache(r1)
                        androidx.compose.ui.text.TextLayoutResult r2 = r1.getLayoutOrNull()
                        if (r2 == 0) goto Lb8
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        androidx.compose.ui.text.AnnotatedString r4 = r1.getText()
                        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                        androidx.compose.ui.text.TextStyle r5 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.access$getStyle$p(r1)
                        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                        androidx.compose.ui.graphics.ColorProducer r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.access$getOverrideColor$p(r1)
                        if (r1 == 0) goto L29
                        long r6 = r1.mo699invoke0d7_KjU()
                        goto L2f
                    L29:
                        androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.ui.graphics.Color.Companion
                        long r6 = r1.m1309getUnspecified0d7_KjU()
                    L2f:
                        r8 = 0
                        r10 = 0
                        r11 = 0
                        r12 = 0
                        r13 = 0
                        r14 = 0
                        r15 = 0
                        r17 = 0
                        r18 = 0
                        r19 = 0
                        r20 = 0
                        r22 = 0
                        r23 = 0
                        r24 = 0
                        r25 = 0
                        r26 = 0
                        r27 = 0
                        r29 = 0
                        r30 = 0
                        r31 = 0
                        r32 = 0
                        r33 = 0
                        r34 = 0
                        r35 = 16777214(0xfffffe, float:2.3509884E-38)
                        r36 = 0
                        androidx.compose.ui.text.TextStyle r5 = androidx.compose.ui.text.TextStyle.m2165mergedA7vx0o$default(r5, r6, r8, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36)
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        java.util.List r6 = r1.getPlaceholders()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        int r7 = r1.getMaxLines()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        boolean r8 = r1.getSoftWrap()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        int r9 = r1.m2139getOverflowgIe3tQ8()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        androidx.compose.ui.unit.Density r10 = r1.getDensity()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        androidx.compose.ui.unit.LayoutDirection r11 = r1.getLayoutDirection()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        androidx.compose.ui.text.font.FontFamily$Resolver r12 = r1.getFontFamilyResolver()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        long r13 = r1.m2138getConstraintsmsEJaDk()
                        androidx.compose.ui.text.TextLayoutInput r1 = new androidx.compose.ui.text.TextLayoutInput
                        r15 = 0
                        r3 = r1
                        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15)
                        r4 = 0
                        r6 = 2
                        r7 = 0
                        androidx.compose.ui.text.TextLayoutResult r1 = androidx.compose.ui.text.TextLayoutResult.m2140copyO0kMr_c$default(r2, r3, r4, r6, r7)
                        if (r1 == 0) goto Lb8
                        r2 = r38
                        r2.add(r1)
                        goto Lb9
                    Lb8:
                        r1 = 0
                    Lb9:
                        if (r1 == 0) goto Lbd
                        r1 = 1
                        goto Lbe
                    Lbd:
                        r1 = 0
                    Lbe:
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$1.invoke(java.util.List):java.lang.Boolean");
                }
            };
            this.semanticsTextLayoutResult = drm;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, this.text);
        TextSubstitutionValue textSubstitution = getTextSubstitution();
        if (textSubstitution != null) {
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, textSubstitution.getSubstitution());
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, textSubstitution.isShowingSubstitution());
        }
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new drM<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public final Boolean invoke(AnnotatedString annotatedString) {
                TextAnnotatedStringNode.this.setSubstitution(annotatedString);
                SemanticsModifierNodeKt.invalidateSemantics(TextAnnotatedStringNode.this);
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new drM<Boolean, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }

            public final Boolean invoke(boolean z) {
                TextAnnotatedStringNode.TextSubstitutionValue textSubstitution2;
                TextAnnotatedStringNode.TextSubstitutionValue textSubstitution3;
                textSubstitution2 = TextAnnotatedStringNode.this.getTextSubstitution();
                if (textSubstitution2 == null) {
                    return Boolean.FALSE;
                }
                textSubstitution3 = TextAnnotatedStringNode.this.getTextSubstitution();
                if (textSubstitution3 != null) {
                    textSubstitution3.setShowingSubstitution(z);
                }
                SemanticsModifierNodeKt.invalidateSemantics(TextAnnotatedStringNode.this);
                LayoutModifierNodeKt.invalidateMeasurement(TextAnnotatedStringNode.this);
                DrawModifierNodeKt.invalidateDraw(TextAnnotatedStringNode.this);
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new drO<Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Boolean invoke() {
                TextAnnotatedStringNode.this.clearSubstitution();
                SemanticsModifierNodeKt.invalidateSemantics(TextAnnotatedStringNode.this);
                LayoutModifierNodeKt.invalidateMeasurement(TextAnnotatedStringNode.this);
                DrawModifierNodeKt.invalidateDraw(TextAnnotatedStringNode.this);
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, drm, 1, null);
    }

    /* renamed from: measureNonExtension-3p2s80s  reason: not valid java name */
    public final MeasureResult m516measureNonExtension3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        return mo37measure3p2s80s(measureScope, measurable, j);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int e;
        int e2;
        Map<AlignmentLine, Integer> c;
        MultiParagraphLayoutCache layoutCache = getLayoutCache(measureScope);
        boolean m504layoutWithConstraintsK40F9xA = layoutCache.m504layoutWithConstraintsK40F9xA(j, measureScope.getLayoutDirection());
        TextLayoutResult textLayoutResult = layoutCache.getTextLayoutResult();
        textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts();
        if (m504layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            drM<? super TextLayoutResult, dpR> drm = this.onTextLayout;
            if (drm != null) {
                drm.invoke(textLayoutResult);
            }
            SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.updateTextLayout(textLayoutResult);
            }
            HorizontalAlignmentLine firstBaseline = AlignmentLineKt.getFirstBaseline();
            e = dsT.e(textLayoutResult.getFirstBaseline());
            Pair a = dpD.a(firstBaseline, Integer.valueOf(e));
            HorizontalAlignmentLine lastBaseline = AlignmentLineKt.getLastBaseline();
            e2 = dsT.e(textLayoutResult.getLastBaseline());
            c = dqE.c(a, dpD.a(lastBaseline, Integer.valueOf(e2)));
            this.baselineCache = c;
        }
        drM<? super List<Rect>, dpR> drm2 = this.onPlaceholderLayout;
        if (drm2 != null) {
            drm2.invoke(textLayoutResult.getPlaceholderRects());
        }
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(LayoutUtilsKt.fixedCoerceHeightAndWidthForBits(Constraints.Companion, IntSize.m2547getWidthimpl(textLayoutResult.m2143getSizeYbymL2g()), IntSize.m2546getHeightimpl(textLayoutResult.m2143getSizeYbymL2g())));
        int m2547getWidthimpl = IntSize.m2547getWidthimpl(textLayoutResult.m2143getSizeYbymL2g());
        int m2546getHeightimpl = IntSize.m2546getHeightimpl(textLayoutResult.m2143getSizeYbymL2g());
        Map<AlignmentLine, Integer> map = this.baselineCache;
        C8632dsu.d(map);
        return measureScope.layout(m2547getWidthimpl, m2546getHeightimpl, map, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$measure$1
            /* JADX INFO: Access modifiers changed from: package-private */
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
                Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        });
    }

    public final int minIntrinsicWidthNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicHeightNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicWidthNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicHeightNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    public final void drawNonExtension(ContentDrawScope contentDrawScope) {
        draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        if (isAttached()) {
            SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.draw(contentDrawScope);
            }
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            TextLayoutResult textLayoutResult = getLayoutCache(contentDrawScope).getTextLayoutResult();
            MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
            boolean z = textLayoutResult.getHasVisualOverflow() && !TextOverflow.m2453equalsimpl0(this.overflow, TextOverflow.Companion.m2459getVisiblegIe3tQ8());
            if (z) {
                Rect m1162Recttz77jQw = RectKt.m1162Recttz77jQw(Offset.Companion.m1149getZeroF1C5BW0(), SizeKt.Size(IntSize.m2547getWidthimpl(textLayoutResult.m2143getSizeYbymL2g()), IntSize.m2546getHeightimpl(textLayoutResult.m2143getSizeYbymL2g())));
                canvas.save();
                Canvas.m1274clipRectmtrdDE$default(canvas, m1162Recttz77jQw, 0, 2, null);
            }
            try {
                TextDecoration textDecoration = this.style.getTextDecoration();
                if (textDecoration == null) {
                    textDecoration = TextDecoration.Companion.getNone();
                }
                TextDecoration textDecoration2 = textDecoration;
                Shadow shadow = this.style.getShadow();
                if (shadow == null) {
                    shadow = Shadow.Companion.getNone();
                }
                Shadow shadow2 = shadow;
                DrawStyle drawStyle = this.style.getDrawStyle();
                if (drawStyle == null) {
                    drawStyle = Fill.INSTANCE;
                }
                DrawStyle drawStyle2 = drawStyle;
                Brush brush = this.style.getBrush();
                if (brush != null) {
                    multiParagraph.m2083painthn5TExg(canvas, brush, (r17 & 4) != 0 ? Float.NaN : this.style.getAlpha(), (r17 & 8) != 0 ? null : shadow2, (r17 & 16) != 0 ? null : textDecoration2, (r17 & 32) != 0 ? null : drawStyle2, (r17 & 64) != 0 ? DrawScope.Companion.m1563getDefaultBlendMode0nO6VwU() : 0);
                } else {
                    ColorProducer colorProducer = this.overrideColor;
                    long mo699invoke0d7_KjU = colorProducer != null ? colorProducer.mo699invoke0d7_KjU() : Color.Companion.m1309getUnspecified0d7_KjU();
                    Color.Companion companion = Color.Companion;
                    if (mo699invoke0d7_KjU == companion.m1309getUnspecified0d7_KjU()) {
                        if (this.style.m2169getColor0d7_KjU() != companion.m1309getUnspecified0d7_KjU()) {
                            mo699invoke0d7_KjU = this.style.m2169getColor0d7_KjU();
                        } else {
                            mo699invoke0d7_KjU = companion.m1303getBlack0d7_KjU();
                        }
                    }
                    multiParagraph.m2082paintLG529CI(canvas, (r14 & 2) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : mo699invoke0d7_KjU, (r14 & 4) != 0 ? null : shadow2, (r14 & 8) != 0 ? null : textDecoration2, (r14 & 16) == 0 ? drawStyle2 : null, (r14 & 32) != 0 ? DrawScope.Companion.m1563getDefaultBlendMode0nO6VwU() : 0);
                }
                List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
                if (list == null || list.isEmpty()) {
                    return;
                }
                contentDrawScope.drawContent();
            } finally {
                if (z) {
                    canvas.restore();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextSubstitutionValue getTextSubstitution() {
        return (TextSubstitutionValue) this.textSubstitution$delegate.getValue();
    }

    private final void setTextSubstitution(TextSubstitutionValue textSubstitutionValue) {
        this.textSubstitution$delegate.setValue(textSubstitutionValue);
    }
}
