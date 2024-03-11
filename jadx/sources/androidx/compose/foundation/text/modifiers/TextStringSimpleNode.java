package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
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
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnit;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;
import o.dsT;
import org.linphone.core.Privacy;

/* loaded from: classes.dex */
public final class TextStringSimpleNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    private ParagraphLayoutCache _layoutCache;
    private Map<AlignmentLine, Integer> baselineCache;
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private int overflow;
    private ColorProducer overrideColor;
    private drM<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;
    private boolean softWrap;
    private TextStyle style;
    private String text;
    private final MutableState textSubstitution$delegate;

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, ColorProducer colorProducer, C8627dsp c8627dsp) {
        this(str, textStyle, resolver, i, z, i2, i3, colorProducer);
    }

    private TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, ColorProducer colorProducer) {
        MutableState mutableStateOf$default;
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.overrideColor = colorProducer;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.textSubstitution$delegate = mutableStateOf$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphLayoutCache getLayoutCache() {
        if (this._layoutCache == null) {
            this._layoutCache = new ParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        }
        ParagraphLayoutCache paragraphLayoutCache = this._layoutCache;
        C8632dsu.d(paragraphLayoutCache);
        return paragraphLayoutCache;
    }

    private final ParagraphLayoutCache getLayoutCache(Density density) {
        ParagraphLayoutCache layoutCache;
        TextSubstitutionValue textSubstitution = getTextSubstitution();
        if (textSubstitution != null && textSubstitution.isShowingSubstitution() && (layoutCache = textSubstitution.getLayoutCache()) != null) {
            layoutCache.setDensity$foundation_release(density);
            return layoutCache;
        }
        ParagraphLayoutCache layoutCache2 = getLayoutCache();
        layoutCache2.setDensity$foundation_release(density);
        return layoutCache2;
    }

    public final boolean updateDraw(ColorProducer colorProducer, TextStyle textStyle) {
        boolean c = C8632dsu.c(colorProducer, this.overrideColor);
        this.overrideColor = colorProducer;
        return (c ^ true) || !textStyle.hasSameDrawAffectingAttributes(this.style);
    }

    public final boolean updateText(String str) {
        if (C8632dsu.c((Object) this.text, (Object) str)) {
            return false;
        }
        this.text = str;
        clearSubstitution();
        return true;
    }

    /* renamed from: updateLayoutRelatedArgs-HuAbxIM  reason: not valid java name */
    public final boolean m518updateLayoutRelatedArgsHuAbxIM(TextStyle textStyle, int i, int i2, boolean z, FontFamily.Resolver resolver, int i3) {
        boolean z2 = !this.style.hasSameLayoutAffectingAttributes(textStyle);
        this.style = textStyle;
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

    public final void doInvalidations(boolean z, boolean z2, boolean z3) {
        if (isAttached()) {
            if (z2 || (z && this.semanticsTextLayoutResult != null)) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            if (z2 || z3) {
                getLayoutCache().m510updateL6sJoHM(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
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
        private ParagraphLayoutCache layoutCache;
        private final String original;
        private String substitution;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TextSubstitutionValue) {
                TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) obj;
                return C8632dsu.c((Object) this.original, (Object) textSubstitutionValue.original) && C8632dsu.c((Object) this.substitution, (Object) textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && C8632dsu.c(this.layoutCache, textSubstitutionValue.layoutCache);
            }
            return false;
        }

        public final ParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        public final String getSubstitution() {
            return this.substitution;
        }

        public int hashCode() {
            int hashCode = this.original.hashCode();
            int hashCode2 = this.substitution.hashCode();
            int hashCode3 = Boolean.hashCode(this.isShowingSubstitution);
            ParagraphLayoutCache paragraphLayoutCache = this.layoutCache;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (paragraphLayoutCache == null ? 0 : paragraphLayoutCache.hashCode());
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setLayoutCache(ParagraphLayoutCache paragraphLayoutCache) {
            this.layoutCache = paragraphLayoutCache;
        }

        public final void setShowingSubstitution(boolean z) {
            this.isShowingSubstitution = z;
        }

        public final void setSubstitution(String str) {
            this.substitution = str;
        }

        public String toString() {
            return "TextSubstitutionValue(original=" + this.original + ", substitution=" + this.substitution + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }

        public TextSubstitutionValue(String str, String str2, boolean z, ParagraphLayoutCache paragraphLayoutCache) {
            this.original = str;
            this.substitution = str2;
            this.isShowingSubstitution = z;
            this.layoutCache = paragraphLayoutCache;
        }

        public /* synthetic */ TextSubstitutionValue(String str, String str2, boolean z, ParagraphLayoutCache paragraphLayoutCache, int i, C8627dsp c8627dsp) {
            this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : paragraphLayoutCache);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setSubstitution(String str) {
        dpR dpr;
        TextSubstitutionValue textSubstitution = getTextSubstitution();
        if (textSubstitution != null) {
            if (C8632dsu.c((Object) str, (Object) textSubstitution.getSubstitution())) {
                return false;
            }
            textSubstitution.setSubstitution(str);
            ParagraphLayoutCache layoutCache = textSubstitution.getLayoutCache();
            if (layoutCache != null) {
                layoutCache.m510updateL6sJoHM(str, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
                dpr = dpR.c;
            } else {
                dpr = null;
            }
            return dpr != null;
        }
        TextSubstitutionValue textSubstitutionValue = new TextSubstitutionValue(this.text, str, false, null, 12, null);
        ParagraphLayoutCache paragraphLayoutCache = new ParagraphLayoutCache(str, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        paragraphLayoutCache.setDensity$foundation_release(getLayoutCache().getDensity$foundation_release());
        textSubstitutionValue.setLayoutCache(paragraphLayoutCache);
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
            drm = new drM<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public final Boolean invoke(List<TextLayoutResult> list) {
                    ParagraphLayoutCache layoutCache;
                    TextStyle textStyle;
                    ColorProducer colorProducer;
                    TextStyle m2179mergedA7vx0o;
                    layoutCache = TextStringSimpleNode.this.getLayoutCache();
                    textStyle = TextStringSimpleNode.this.style;
                    colorProducer = TextStringSimpleNode.this.overrideColor;
                    m2179mergedA7vx0o = textStyle.m2179mergedA7vx0o((r58 & 1) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : colorProducer != null ? colorProducer.mo699invoke0d7_KjU() : Color.Companion.m1309getUnspecified0d7_KjU(), (r58 & 2) != 0 ? TextUnit.Companion.m2564getUnspecifiedXSAIIZE() : 0L, (r58 & 4) != 0 ? null : null, (r58 & 8) != 0 ? null : null, (r58 & 16) != 0 ? null : null, (r58 & 32) != 0 ? null : null, (r58 & 64) != 0 ? null : null, (r58 & 128) != 0 ? TextUnit.Companion.m2564getUnspecifiedXSAIIZE() : 0L, (r58 & JSONzip.end) != 0 ? null : null, (r58 & 512) != 0 ? null : null, (r58 & 1024) != 0 ? null : null, (r58 & 2048) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : 0L, (r58 & 4096) != 0 ? null : null, (r58 & 8192) != 0 ? null : null, (r58 & 16384) != 0 ? null : null, (r58 & Privacy.DEFAULT) != 0 ? TextAlign.Companion.m2423getUnspecifiede0LSkKk() : 0, (r58 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? TextDirection.Companion.m2436getUnspecifieds_7Xco() : 0, (r58 & 131072) != 0 ? TextUnit.Companion.m2564getUnspecifiedXSAIIZE() : 0L, (r58 & 262144) != 0 ? null : null, (r58 & 524288) != 0 ? null : null, (r58 & 1048576) != 0 ? LineBreak.Companion.m2362getUnspecifiedrAG3T2k() : 0, (r58 & 2097152) != 0 ? Hyphens.Companion.m2350getUnspecifiedvmbZdU8() : 0, (r58 & 4194304) != 0 ? null : null, (r58 & 8388608) != 0 ? null : null);
                    TextLayoutResult slowCreateTextLayoutResultOrNull = layoutCache.slowCreateTextLayoutResultOrNull(m2179mergedA7vx0o);
                    if (slowCreateTextLayoutResultOrNull != null) {
                        list.add(slowCreateTextLayoutResultOrNull);
                    } else {
                        slowCreateTextLayoutResultOrNull = null;
                    }
                    return Boolean.valueOf(slowCreateTextLayoutResultOrNull != null);
                }
            };
            this.semanticsTextLayoutResult = drm;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(this.text, null, null, 6, null));
        TextSubstitutionValue textSubstitution = getTextSubstitution();
        if (textSubstitution != null) {
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, textSubstitution.isShowingSubstitution());
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, new AnnotatedString(textSubstitution.getSubstitution(), null, null, 6, null));
        }
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new drM<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public final Boolean invoke(AnnotatedString annotatedString) {
                TextStringSimpleNode.this.setSubstitution(annotatedString.getText());
                SemanticsModifierNodeKt.invalidateSemantics(TextStringSimpleNode.this);
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new drM<Boolean, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }

            public final Boolean invoke(boolean z) {
                TextStringSimpleNode.TextSubstitutionValue textSubstitution2;
                TextStringSimpleNode.TextSubstitutionValue textSubstitution3;
                textSubstitution2 = TextStringSimpleNode.this.getTextSubstitution();
                if (textSubstitution2 == null) {
                    return Boolean.FALSE;
                }
                textSubstitution3 = TextStringSimpleNode.this.getTextSubstitution();
                if (textSubstitution3 != null) {
                    textSubstitution3.setShowingSubstitution(z);
                }
                SemanticsModifierNodeKt.invalidateSemantics(TextStringSimpleNode.this);
                LayoutModifierNodeKt.invalidateMeasurement(TextStringSimpleNode.this);
                DrawModifierNodeKt.invalidateDraw(TextStringSimpleNode.this);
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new drO<Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Boolean invoke() {
                TextStringSimpleNode.this.clearSubstitution();
                SemanticsModifierNodeKt.invalidateSemantics(TextStringSimpleNode.this);
                LayoutModifierNodeKt.invalidateMeasurement(TextStringSimpleNode.this);
                DrawModifierNodeKt.invalidateDraw(TextStringSimpleNode.this);
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, drm, 1, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int e;
        int e2;
        ParagraphLayoutCache layoutCache = getLayoutCache(measureScope);
        boolean m509layoutWithConstraintsK40F9xA = layoutCache.m509layoutWithConstraintsK40F9xA(j, measureScope.getLayoutDirection());
        layoutCache.getObserveFontChanges$foundation_release();
        Paragraph paragraph$foundation_release = layoutCache.getParagraph$foundation_release();
        C8632dsu.d(paragraph$foundation_release);
        long m508getLayoutSizeYbymL2g$foundation_release = layoutCache.m508getLayoutSizeYbymL2g$foundation_release();
        if (m509layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            Map<AlignmentLine, Integer> map = this.baselineCache;
            if (map == null) {
                map = new LinkedHashMap<>(2);
            }
            HorizontalAlignmentLine firstBaseline = AlignmentLineKt.getFirstBaseline();
            e = dsT.e(paragraph$foundation_release.getFirstBaseline());
            map.put(firstBaseline, Integer.valueOf(e));
            HorizontalAlignmentLine lastBaseline = AlignmentLineKt.getLastBaseline();
            e2 = dsT.e(paragraph$foundation_release.getLastBaseline());
            map.put(lastBaseline, Integer.valueOf(e2));
            this.baselineCache = map;
        }
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(LayoutUtilsKt.fixedCoerceHeightAndWidthForBits(Constraints.Companion, IntSize.m2547getWidthimpl(m508getLayoutSizeYbymL2g$foundation_release), IntSize.m2546getHeightimpl(m508getLayoutSizeYbymL2g$foundation_release)));
        int m2547getWidthimpl = IntSize.m2547getWidthimpl(m508getLayoutSizeYbymL2g$foundation_release);
        int m2546getHeightimpl = IntSize.m2546getHeightimpl(m508getLayoutSizeYbymL2g$foundation_release);
        Map<AlignmentLine, Integer> map2 = this.baselineCache;
        C8632dsu.d(map2);
        return measureScope.layout(m2547getWidthimpl, m2546getHeightimpl, map2, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$measure$1
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

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        if (isAttached()) {
            Paragraph paragraph$foundation_release = getLayoutCache().getParagraph$foundation_release();
            if (paragraph$foundation_release == null) {
                throw new IllegalArgumentException("no paragraph".toString());
            }
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            boolean didOverflow$foundation_release = getLayoutCache().getDidOverflow$foundation_release();
            if (didOverflow$foundation_release) {
                Rect m1162Recttz77jQw = RectKt.m1162Recttz77jQw(Offset.Companion.m1149getZeroF1C5BW0(), SizeKt.Size(IntSize.m2547getWidthimpl(getLayoutCache().m508getLayoutSizeYbymL2g$foundation_release()), IntSize.m2546getHeightimpl(getLayoutCache().m508getLayoutSizeYbymL2g$foundation_release())));
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
                    Paragraph.m2086painthn5TExg$default(paragraph$foundation_release, canvas, brush, this.style.getAlpha(), shadow2, textDecoration2, drawStyle2, 0, 64, null);
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
                    Paragraph.m2085paintLG529CI$default(paragraph$foundation_release, canvas, mo699invoke0d7_KjU, shadow2, textDecoration2, drawStyle2, 0, 32, null);
                }
            } finally {
                if (didOverflow$foundation_release) {
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
