package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import o.C8569dql;
import o.InterfaceC8554dpx;
import o.dpB;
import o.drO;

/* loaded from: classes.dex */
public final class MultiParagraphIntrinsics implements ParagraphIntrinsics {
    private final AnnotatedString annotatedString;
    private final List<ParagraphIntrinsicInfo> infoList;
    private final InterfaceC8554dpx maxIntrinsicWidth$delegate;
    private final InterfaceC8554dpx minIntrinsicWidth$delegate;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final List<ParagraphIntrinsicInfo> getInfoList$ui_text_release() {
        return this.infoList;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public MultiParagraphIntrinsics(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, Density density, FontFamily.Resolver resolver) {
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        AnnotatedString substringWithoutParagraphStyles;
        List localPlaceholders;
        this.annotatedString = annotatedString;
        this.placeholders = list;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.e;
        b = dpB.b(lazyThreadSafetyMode, new drO<Float>() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$minIntrinsicWidth$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Float invoke() {
                int t;
                ParagraphIntrinsicInfo paragraphIntrinsicInfo;
                ParagraphIntrinsics intrinsics;
                List<ParagraphIntrinsicInfo> infoList$ui_text_release = MultiParagraphIntrinsics.this.getInfoList$ui_text_release();
                if (infoList$ui_text_release.isEmpty()) {
                    paragraphIntrinsicInfo = null;
                } else {
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = infoList$ui_text_release.get(0);
                    float minIntrinsicWidth = paragraphIntrinsicInfo2.getIntrinsics().getMinIntrinsicWidth();
                    t = C8569dql.t(infoList$ui_text_release);
                    int i = 1;
                    if (1 <= t) {
                        while (true) {
                            ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = infoList$ui_text_release.get(i);
                            float minIntrinsicWidth2 = paragraphIntrinsicInfo3.getIntrinsics().getMinIntrinsicWidth();
                            if (Float.compare(minIntrinsicWidth, minIntrinsicWidth2) < 0) {
                                paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                                minIntrinsicWidth = minIntrinsicWidth2;
                            }
                            if (i == t) {
                                break;
                            }
                            i++;
                        }
                    }
                    paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
                }
                ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
                return Float.valueOf((paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) ? 0.0f : intrinsics.getMinIntrinsicWidth());
            }
        });
        this.minIntrinsicWidth$delegate = b;
        b2 = dpB.b(lazyThreadSafetyMode, new drO<Float>() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$maxIntrinsicWidth$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Float invoke() {
                int t;
                ParagraphIntrinsicInfo paragraphIntrinsicInfo;
                ParagraphIntrinsics intrinsics;
                List<ParagraphIntrinsicInfo> infoList$ui_text_release = MultiParagraphIntrinsics.this.getInfoList$ui_text_release();
                if (infoList$ui_text_release.isEmpty()) {
                    paragraphIntrinsicInfo = null;
                } else {
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = infoList$ui_text_release.get(0);
                    float maxIntrinsicWidth = paragraphIntrinsicInfo2.getIntrinsics().getMaxIntrinsicWidth();
                    t = C8569dql.t(infoList$ui_text_release);
                    int i = 1;
                    if (1 <= t) {
                        while (true) {
                            ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = infoList$ui_text_release.get(i);
                            float maxIntrinsicWidth2 = paragraphIntrinsicInfo3.getIntrinsics().getMaxIntrinsicWidth();
                            if (Float.compare(maxIntrinsicWidth, maxIntrinsicWidth2) < 0) {
                                paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                                maxIntrinsicWidth = maxIntrinsicWidth2;
                            }
                            if (i == t) {
                                break;
                            }
                            i++;
                        }
                    }
                    paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
                }
                ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
                return Float.valueOf((paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) ? 0.0f : intrinsics.getMaxIntrinsicWidth());
            }
        });
        this.maxIntrinsicWidth$delegate = b2;
        ParagraphStyle paragraphStyle = textStyle.toParagraphStyle();
        List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles = AnnotatedStringKt.normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(normalizedParagraphStyles.size());
        int size = normalizedParagraphStyles.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<ParagraphStyle> range = normalizedParagraphStyles.get(i);
            substringWithoutParagraphStyles = AnnotatedStringKt.substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd());
            ParagraphStyle resolveTextDirection = resolveTextDirection(range.getItem(), paragraphStyle);
            String text = substringWithoutParagraphStyles.getText();
            TextStyle merge = textStyle.merge(resolveTextDirection);
            List<AnnotatedString.Range<SpanStyle>> spanStyles = substringWithoutParagraphStyles.getSpanStyles();
            localPlaceholders = MultiParagraphIntrinsicsKt.getLocalPlaceholders(getPlaceholders(), range.getStart(), range.getEnd());
            arrayList.add(new ParagraphIntrinsicInfo(ParagraphIntrinsicsKt.ParagraphIntrinsics(text, merge, spanStyles, localPlaceholders, density, resolver), range.getStart(), range.getEnd()));
        }
        this.infoList = arrayList;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return ((Number) this.minIntrinsicWidth$delegate.getValue()).floatValue();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return ((Number) this.maxIntrinsicWidth$delegate.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphStyle resolveTextDirection(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2) {
        ParagraphStyle m2093copyykzQM6k;
        if (TextDirection.m2427equalsimpl0(paragraphStyle.m2098getTextDirections_7Xco(), TextDirection.Companion.m2436getUnspecifieds_7Xco())) {
            m2093copyykzQM6k = paragraphStyle.m2093copyykzQM6k((r22 & 1) != 0 ? paragraphStyle.textAlign : 0, (r22 & 2) != 0 ? paragraphStyle.textDirection : paragraphStyle2.m2098getTextDirections_7Xco(), (r22 & 4) != 0 ? paragraphStyle.lineHeight : 0L, (r22 & 8) != 0 ? paragraphStyle.textIndent : null, (r22 & 16) != 0 ? paragraphStyle.platformStyle : null, (r22 & 32) != 0 ? paragraphStyle.lineHeightStyle : null, (r22 & 64) != 0 ? paragraphStyle.lineBreak : 0, (r22 & 128) != 0 ? paragraphStyle.hyphens : 0, (r22 & JSONzip.end) != 0 ? paragraphStyle.textMotion : null);
            return m2093copyykzQM6k;
        }
        return paragraphStyle;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        List<ParagraphIntrinsicInfo> list = this.infoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getIntrinsics().getHasStaleResolvedFonts()) {
                return true;
            }
        }
        return false;
    }
}
