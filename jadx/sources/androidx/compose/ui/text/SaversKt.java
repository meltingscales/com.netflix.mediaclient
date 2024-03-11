package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.dpL;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class SaversKt {
    private static final Saver<AnnotatedString, Object> AnnotatedStringSaver = SaverKt.Saver(new drX<SaverScope, AnnotatedString, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$1
        @Override // o.drX
        public final Object invoke(SaverScope saverScope, AnnotatedString annotatedString) {
            Saver saver;
            Saver saver2;
            Saver saver3;
            ArrayList a;
            Object save = SaversKt.save(annotatedString.getText());
            List<AnnotatedString.Range<SpanStyle>> spanStyles = annotatedString.getSpanStyles();
            saver = SaversKt.AnnotationRangeListSaver;
            Object save2 = SaversKt.save(spanStyles, saver, saverScope);
            List<AnnotatedString.Range<ParagraphStyle>> paragraphStyles = annotatedString.getParagraphStyles();
            saver2 = SaversKt.AnnotationRangeListSaver;
            Object save3 = SaversKt.save(paragraphStyles, saver2, saverScope);
            List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
            saver3 = SaversKt.AnnotationRangeListSaver;
            a = C8569dql.a(save, save2, save3, SaversKt.save(annotations$ui_text_release, saver3, saverScope));
            return a;
        }
    }, new drM<Object, AnnotatedString>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drM
        public final AnnotatedString invoke(Object obj) {
            Saver saver;
            Saver saver2;
            Saver saver3;
            C8632dsu.d(obj);
            List list = (List) obj;
            Object obj2 = list.get(1);
            saver = SaversKt.AnnotationRangeListSaver;
            Boolean bool = Boolean.FALSE;
            List list2 = null;
            List list3 = (C8632dsu.c(obj2, bool) || obj2 == null) ? null : (List) saver.restore(obj2);
            Object obj3 = list.get(2);
            saver2 = SaversKt.AnnotationRangeListSaver;
            List list4 = (C8632dsu.c(obj3, bool) || obj3 == null) ? null : (List) saver2.restore(obj3);
            Object obj4 = list.get(0);
            String str = obj4 != null ? (String) obj4 : null;
            C8632dsu.d((Object) str);
            if (list3 == null || list3.isEmpty()) {
                list3 = null;
            }
            if (list4 == null || list4.isEmpty()) {
                list4 = null;
            }
            Object obj5 = list.get(3);
            saver3 = SaversKt.AnnotationRangeListSaver;
            if (!C8632dsu.c(obj5, bool) && obj5 != null) {
                list2 = (List) saver3.restore(obj5);
            }
            return new AnnotatedString(str, list3, list4, list2);
        }
    });
    private static final Saver<List<AnnotatedString.Range<? extends Object>>, Object> AnnotationRangeListSaver = SaverKt.Saver(new drX<SaverScope, List<? extends AnnotatedString.Range<? extends Object>>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$1
        @Override // o.drX
        public final Object invoke(SaverScope saverScope, List<? extends AnnotatedString.Range<? extends Object>> list) {
            Saver saver;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                saver = SaversKt.AnnotationRangeSaver;
                arrayList.add(SaversKt.save(list.get(i), saver, saverScope));
            }
            return arrayList;
        }
    }, new drM<Object, List<? extends AnnotatedString.Range<? extends Object>>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$2
        @Override // o.drM
        public final List<? extends AnnotatedString.Range<? extends Object>> invoke(Object obj) {
            Saver saver;
            C8632dsu.d(obj);
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                saver = SaversKt.AnnotationRangeSaver;
                AnnotatedString.Range range = (C8632dsu.c(obj2, Boolean.FALSE) || obj2 == null) ? null : (AnnotatedString.Range) saver.restore(obj2);
                C8632dsu.d(range);
                arrayList.add(range);
            }
            return arrayList;
        }
    });
    private static final Saver<AnnotatedString.Range<? extends Object>, Object> AnnotationRangeSaver = SaverKt.Saver(new drX<SaverScope, AnnotatedString.Range<? extends Object>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1

        /* loaded from: classes.dex */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                try {
                    iArr[AnnotationType.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnotationType.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AnnotationType.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AnnotationType.String.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // o.drX
        public final Object invoke(SaverScope saverScope, AnnotatedString.Range<? extends Object> range) {
            AnnotationType annotationType;
            Object save;
            ArrayList a;
            Saver saver;
            Saver saver2;
            Object item = range.getItem();
            if (item instanceof ParagraphStyle) {
                annotationType = AnnotationType.Paragraph;
            } else if (item instanceof SpanStyle) {
                annotationType = AnnotationType.Span;
            } else if (item instanceof VerbatimTtsAnnotation) {
                annotationType = AnnotationType.VerbatimTts;
            } else {
                annotationType = item instanceof UrlAnnotation ? AnnotationType.Url : AnnotationType.String;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
            if (i == 1) {
                Object item2 = range.getItem();
                C8632dsu.d(item2);
                save = SaversKt.save((ParagraphStyle) item2, SaversKt.getParagraphStyleSaver(), saverScope);
            } else if (i == 2) {
                Object item3 = range.getItem();
                C8632dsu.d(item3);
                save = SaversKt.save((SpanStyle) item3, SaversKt.getSpanStyleSaver(), saverScope);
            } else if (i == 3) {
                Object item4 = range.getItem();
                C8632dsu.d(item4);
                saver = SaversKt.VerbatimTtsAnnotationSaver;
                save = SaversKt.save((VerbatimTtsAnnotation) item4, saver, saverScope);
            } else if (i == 4) {
                Object item5 = range.getItem();
                C8632dsu.d(item5);
                saver2 = SaversKt.UrlAnnotationSaver;
                save = SaversKt.save((UrlAnnotation) item5, saver2, saverScope);
            } else if (i != 5) {
                throw new NoWhenBranchMatchedException();
            } else {
                save = SaversKt.save(range.getItem());
            }
            a = C8569dql.a(SaversKt.save(annotationType), save, SaversKt.save(Integer.valueOf(range.getStart())), SaversKt.save(Integer.valueOf(range.getEnd())), SaversKt.save(range.getTag()));
            return a;
        }
    }, new drM<Object, AnnotatedString.Range<? extends Object>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2

        /* loaded from: classes.dex */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                try {
                    iArr[AnnotationType.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnotationType.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AnnotationType.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AnnotationType.String.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drM
        public final AnnotatedString.Range<? extends Object> invoke(Object obj) {
            Saver saver;
            Saver saver2;
            C8632dsu.d(obj);
            List list = (List) obj;
            Object obj2 = list.get(0);
            AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
            C8632dsu.d(annotationType);
            Object obj3 = list.get(2);
            Integer num = obj3 != null ? (Integer) obj3 : null;
            C8632dsu.d(num);
            int intValue = num.intValue();
            Object obj4 = list.get(3);
            Integer num2 = obj4 != null ? (Integer) obj4 : null;
            C8632dsu.d(num2);
            int intValue2 = num2.intValue();
            Object obj5 = list.get(4);
            String str = obj5 != null ? (String) obj5 : null;
            C8632dsu.d((Object) str);
            int i = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
            if (i == 1) {
                Object obj6 = list.get(1);
                Saver<ParagraphStyle, Object> paragraphStyleSaver = SaversKt.getParagraphStyleSaver();
                if (!C8632dsu.c(obj6, Boolean.FALSE) && obj6 != null) {
                    r1 = paragraphStyleSaver.restore(obj6);
                }
                C8632dsu.d(r1);
                return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
            } else if (i == 2) {
                Object obj7 = list.get(1);
                Saver<SpanStyle, Object> spanStyleSaver = SaversKt.getSpanStyleSaver();
                if (!C8632dsu.c(obj7, Boolean.FALSE) && obj7 != null) {
                    r1 = spanStyleSaver.restore(obj7);
                }
                C8632dsu.d(r1);
                return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
            } else if (i == 3) {
                Object obj8 = list.get(1);
                saver = SaversKt.VerbatimTtsAnnotationSaver;
                if (!C8632dsu.c(obj8, Boolean.FALSE) && obj8 != null) {
                    r1 = (VerbatimTtsAnnotation) saver.restore(obj8);
                }
                C8632dsu.d(r1);
                return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
            } else if (i != 4) {
                if (i == 5) {
                    Object obj9 = list.get(1);
                    r1 = obj9 != null ? (String) obj9 : null;
                    C8632dsu.d(r1);
                    return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
                }
                throw new NoWhenBranchMatchedException();
            } else {
                Object obj10 = list.get(1);
                saver2 = SaversKt.UrlAnnotationSaver;
                if (!C8632dsu.c(obj10, Boolean.FALSE) && obj10 != null) {
                    r1 = (UrlAnnotation) saver2.restore(obj10);
                }
                C8632dsu.d(r1);
                return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
            }
        }
    });
    private static final Saver<VerbatimTtsAnnotation, Object> VerbatimTtsAnnotationSaver = SaverKt.Saver(new drX<SaverScope, VerbatimTtsAnnotation, Object>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$1
        @Override // o.drX
        public final Object invoke(SaverScope saverScope, VerbatimTtsAnnotation verbatimTtsAnnotation) {
            return SaversKt.save(verbatimTtsAnnotation.getVerbatim());
        }
    }, new drM<Object, VerbatimTtsAnnotation>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drM
        public final VerbatimTtsAnnotation invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            C8632dsu.d((Object) str);
            return new VerbatimTtsAnnotation(str);
        }
    });
    private static final Saver<UrlAnnotation, Object> UrlAnnotationSaver = SaverKt.Saver(new drX<SaverScope, UrlAnnotation, Object>() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$1
        @Override // o.drX
        public final Object invoke(SaverScope saverScope, UrlAnnotation urlAnnotation) {
            return SaversKt.save(urlAnnotation.getUrl());
        }
    }, new drM<Object, UrlAnnotation>() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drM
        public final UrlAnnotation invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            C8632dsu.d((Object) str);
            return new UrlAnnotation(str);
        }
    });
    private static final Saver<ParagraphStyle, Object> ParagraphStyleSaver = SaverKt.Saver(new drX<SaverScope, ParagraphStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$1
        @Override // o.drX
        public final Object invoke(SaverScope saverScope, ParagraphStyle paragraphStyle) {
            ArrayList a;
            a = C8569dql.a(SaversKt.save(TextAlign.m2410boximpl(paragraphStyle.m2097getTextAligne0LSkKk())), SaversKt.save(TextDirection.m2424boximpl(paragraphStyle.m2098getTextDirections_7Xco())), SaversKt.save(TextUnit.m2554boximpl(paragraphStyle.m2096getLineHeightXSAIIZE()), SaversKt.getSaver(TextUnit.Companion), saverScope), SaversKt.save(paragraphStyle.getTextIndent(), SaversKt.getSaver(TextIndent.Companion), saverScope));
            return a;
        }
    }, new drM<Object, ParagraphStyle>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drM
        public final ParagraphStyle invoke(Object obj) {
            C8632dsu.d(obj);
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextIndent textIndent = null;
            TextAlign textAlign = obj2 != null ? (TextAlign) obj2 : null;
            C8632dsu.d(textAlign);
            int m2416unboximpl = textAlign.m2416unboximpl();
            Object obj3 = list.get(1);
            TextDirection textDirection = obj3 != null ? (TextDirection) obj3 : null;
            C8632dsu.d(textDirection);
            int m2430unboximpl = textDirection.m2430unboximpl();
            Object obj4 = list.get(2);
            Saver<TextUnit, Object> saver = SaversKt.getSaver(TextUnit.Companion);
            Boolean bool = Boolean.FALSE;
            TextUnit restore = (C8632dsu.c(obj4, bool) || obj4 == null) ? null : saver.restore(obj4);
            C8632dsu.d(restore);
            long m2563unboximpl = restore.m2563unboximpl();
            Object obj5 = list.get(3);
            Saver<TextIndent, Object> saver2 = SaversKt.getSaver(TextIndent.Companion);
            if (!C8632dsu.c(obj5, bool) && obj5 != null) {
                textIndent = saver2.restore(obj5);
            }
            return new ParagraphStyle(m2416unboximpl, m2430unboximpl, m2563unboximpl, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 496, (C8627dsp) null);
        }
    });
    private static final Saver<SpanStyle, Object> SpanStyleSaver = SaverKt.Saver(new drX<SaverScope, SpanStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$1
        @Override // o.drX
        public final Object invoke(SaverScope saverScope, SpanStyle spanStyle) {
            ArrayList a;
            Color m1284boximpl = Color.m1284boximpl(spanStyle.m2131getColor0d7_KjU());
            Color.Companion companion = Color.Companion;
            Object save = SaversKt.save(m1284boximpl, SaversKt.getSaver(companion), saverScope);
            TextUnit m2554boximpl = TextUnit.m2554boximpl(spanStyle.m2132getFontSizeXSAIIZE());
            TextUnit.Companion companion2 = TextUnit.Companion;
            a = C8569dql.a(save, SaversKt.save(m2554boximpl, SaversKt.getSaver(companion2), saverScope), SaversKt.save(spanStyle.getFontWeight(), SaversKt.getSaver(FontWeight.Companion), saverScope), SaversKt.save(spanStyle.m2133getFontStyle4Lr2A7w()), SaversKt.save(spanStyle.m2134getFontSynthesisZQGJjVo()), SaversKt.save(-1), SaversKt.save(spanStyle.getFontFeatureSettings()), SaversKt.save(TextUnit.m2554boximpl(spanStyle.m2135getLetterSpacingXSAIIZE()), SaversKt.getSaver(companion2), saverScope), SaversKt.save(spanStyle.m2130getBaselineShift5SSeXJ0(), SaversKt.getSaver(BaselineShift.Companion), saverScope), SaversKt.save(spanStyle.getTextGeometricTransform(), SaversKt.getSaver(TextGeometricTransform.Companion), saverScope), SaversKt.save(spanStyle.getLocaleList(), SaversKt.getSaver(LocaleList.Companion), saverScope), SaversKt.save(Color.m1284boximpl(spanStyle.m2129getBackground0d7_KjU()), SaversKt.getSaver(companion), saverScope), SaversKt.save(spanStyle.getTextDecoration(), SaversKt.getSaver(TextDecoration.Companion), saverScope), SaversKt.save(spanStyle.getShadow(), SaversKt.getSaver(Shadow.Companion), saverScope));
            return a;
        }
    }, new drM<Object, SpanStyle>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drM
        public final SpanStyle invoke(Object obj) {
            C8632dsu.d(obj);
            List list = (List) obj;
            Object obj2 = list.get(0);
            Color.Companion companion = Color.Companion;
            Saver<Color, Object> saver = SaversKt.getSaver(companion);
            Boolean bool = Boolean.FALSE;
            Shadow shadow = null;
            Color restore = (C8632dsu.c(obj2, bool) || obj2 == null) ? null : saver.restore(obj2);
            C8632dsu.d(restore);
            long m1302unboximpl = restore.m1302unboximpl();
            Object obj3 = list.get(1);
            TextUnit.Companion companion2 = TextUnit.Companion;
            TextUnit restore2 = (C8632dsu.c(obj3, bool) || obj3 == null) ? null : SaversKt.getSaver(companion2).restore(obj3);
            C8632dsu.d(restore2);
            long m2563unboximpl = restore2.m2563unboximpl();
            Object obj4 = list.get(2);
            FontWeight restore3 = (C8632dsu.c(obj4, bool) || obj4 == null) ? null : SaversKt.getSaver(FontWeight.Companion).restore(obj4);
            Object obj5 = list.get(3);
            FontStyle fontStyle = obj5 != null ? (FontStyle) obj5 : null;
            Object obj6 = list.get(4);
            FontSynthesis fontSynthesis = obj6 != null ? (FontSynthesis) obj6 : null;
            Object obj7 = list.get(6);
            String str = obj7 != null ? (String) obj7 : null;
            Object obj8 = list.get(7);
            TextUnit restore4 = (C8632dsu.c(obj8, bool) || obj8 == null) ? null : SaversKt.getSaver(companion2).restore(obj8);
            C8632dsu.d(restore4);
            long m2563unboximpl2 = restore4.m2563unboximpl();
            Object obj9 = list.get(8);
            BaselineShift restore5 = (C8632dsu.c(obj9, bool) || obj9 == null) ? null : SaversKt.getSaver(BaselineShift.Companion).restore(obj9);
            Object obj10 = list.get(9);
            TextGeometricTransform restore6 = (C8632dsu.c(obj10, bool) || obj10 == null) ? null : SaversKt.getSaver(TextGeometricTransform.Companion).restore(obj10);
            Object obj11 = list.get(10);
            LocaleList restore7 = (C8632dsu.c(obj11, bool) || obj11 == null) ? null : SaversKt.getSaver(LocaleList.Companion).restore(obj11);
            Object obj12 = list.get(11);
            Color restore8 = (C8632dsu.c(obj12, bool) || obj12 == null) ? null : SaversKt.getSaver(companion).restore(obj12);
            C8632dsu.d(restore8);
            long m1302unboximpl2 = restore8.m1302unboximpl();
            Object obj13 = list.get(12);
            TextDecoration restore9 = (C8632dsu.c(obj13, bool) || obj13 == null) ? null : SaversKt.getSaver(TextDecoration.Companion).restore(obj13);
            Object obj14 = list.get(13);
            Saver<Shadow, Object> saver2 = SaversKt.getSaver(Shadow.Companion);
            if (!C8632dsu.c(obj14, bool) && obj14 != null) {
                shadow = saver2.restore(obj14);
            }
            return new SpanStyle(m1302unboximpl, m2563unboximpl, restore3, fontStyle, fontSynthesis, null, str, m2563unboximpl2, restore5, restore6, restore7, m1302unboximpl2, restore9, shadow, null, null, 49184, null);
        }
    });
    private static final Saver<TextDecoration, Object> TextDecorationSaver = SaverKt.Saver(new drX<SaverScope, TextDecoration, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$1
        @Override // o.drX
        public final Object invoke(SaverScope saverScope, TextDecoration textDecoration) {
            return Integer.valueOf(textDecoration.getMask());
        }
    }, new drM<Object, TextDecoration>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drM
        public final TextDecoration invoke(Object obj) {
            C8632dsu.d(obj);
            return new TextDecoration(((Integer) obj).intValue());
        }
    });
    private static final Saver<TextGeometricTransform, Object> TextGeometricTransformSaver = SaverKt.Saver(new drX<SaverScope, TextGeometricTransform, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$1
        @Override // o.drX
        public final Object invoke(SaverScope saverScope, TextGeometricTransform textGeometricTransform) {
            ArrayList a;
            a = C8569dql.a(Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX()));
            return a;
        }
    }, new drM<Object, TextGeometricTransform>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drM
        public final TextGeometricTransform invoke(Object obj) {
            C8632dsu.d(obj);
            List list = (List) obj;
            return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    });
    private static final Saver<TextIndent, Object> TextIndentSaver = SaverKt.Saver(new drX<SaverScope, TextIndent, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$1
        @Override // o.drX
        public final Object invoke(SaverScope saverScope, TextIndent textIndent) {
            ArrayList a;
            TextUnit m2554boximpl = TextUnit.m2554boximpl(textIndent.m2439getFirstLineXSAIIZE());
            TextUnit.Companion companion = TextUnit.Companion;
            a = C8569dql.a(SaversKt.save(m2554boximpl, SaversKt.getSaver(companion), saverScope), SaversKt.save(TextUnit.m2554boximpl(textIndent.m2440getRestLineXSAIIZE()), SaversKt.getSaver(companion), saverScope));
            return a;
        }
    }, new drM<Object, TextIndent>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drM
        public final TextIndent invoke(Object obj) {
            C8632dsu.d(obj);
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextUnit.Companion companion = TextUnit.Companion;
            Saver<TextUnit, Object> saver = SaversKt.getSaver(companion);
            Boolean bool = Boolean.FALSE;
            TextUnit textUnit = null;
            TextUnit restore = (C8632dsu.c(obj2, bool) || obj2 == null) ? null : saver.restore(obj2);
            C8632dsu.d(restore);
            long m2563unboximpl = restore.m2563unboximpl();
            Object obj3 = list.get(1);
            Saver<TextUnit, Object> saver2 = SaversKt.getSaver(companion);
            if (!C8632dsu.c(obj3, bool) && obj3 != null) {
                textUnit = saver2.restore(obj3);
            }
            C8632dsu.d(textUnit);
            return new TextIndent(m2563unboximpl, textUnit.m2563unboximpl(), null);
        }
    });
    private static final Saver<FontWeight, Object> FontWeightSaver = SaverKt.Saver(new drX<SaverScope, FontWeight, Object>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$1
        @Override // o.drX
        public final Object invoke(SaverScope saverScope, FontWeight fontWeight) {
            return Integer.valueOf(fontWeight.getWeight());
        }
    }, new drM<Object, FontWeight>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drM
        public final FontWeight invoke(Object obj) {
            C8632dsu.d(obj);
            return new FontWeight(((Integer) obj).intValue());
        }
    });
    private static final Saver<BaselineShift, Object> BaselineShiftSaver = SaverKt.Saver(new drX<SaverScope, BaselineShift, Object>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$1
        @Override // o.drX
        public /* synthetic */ Object invoke(SaverScope saverScope, BaselineShift baselineShift) {
            return m2117invoke8a2Sb4w(saverScope, baselineShift.m2337unboximpl());
        }

        /* renamed from: invoke-8a2Sb4w  reason: not valid java name */
        public final Object m2117invoke8a2Sb4w(SaverScope saverScope, float f) {
            return Float.valueOf(f);
        }
    }, new drM<Object, BaselineShift>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$2
        @Override // o.drM
        /* renamed from: invoke-jTk7eUs  reason: not valid java name */
        public final BaselineShift invoke(Object obj) {
            C8632dsu.d(obj);
            return BaselineShift.m2331boximpl(BaselineShift.m2332constructorimpl(((Float) obj).floatValue()));
        }
    });
    private static final Saver<TextRange, Object> TextRangeSaver = SaverKt.Saver(new drX<SaverScope, TextRange, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$1
        @Override // o.drX
        public /* synthetic */ Object invoke(SaverScope saverScope, TextRange textRange) {
            return m2123invokeFDrldGo(saverScope, textRange.m2161unboximpl());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke-FDrldGo  reason: not valid java name */
        public final Object m2123invokeFDrldGo(SaverScope saverScope, long j) {
            ArrayList a;
            a = C8569dql.a(SaversKt.save(Integer.valueOf(TextRange.m2157getStartimpl(j))), SaversKt.save(Integer.valueOf(TextRange.m2152getEndimpl(j))));
            return a;
        }
    }, new drM<Object, TextRange>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$2
        @Override // o.drM
        /* renamed from: invoke-VqIyPBM  reason: not valid java name */
        public final TextRange invoke(Object obj) {
            C8632dsu.d(obj);
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num = obj2 != null ? (Integer) obj2 : null;
            C8632dsu.d(num);
            int intValue = num.intValue();
            Object obj3 = list.get(1);
            Integer num2 = obj3 != null ? (Integer) obj3 : null;
            C8632dsu.d(num2);
            return TextRange.m2145boximpl(TextRangeKt.TextRange(intValue, num2.intValue()));
        }
    });
    private static final Saver<Shadow, Object> ShadowSaver = SaverKt.Saver(new drX<SaverScope, Shadow, Object>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$1
        @Override // o.drX
        public final Object invoke(SaverScope saverScope, Shadow shadow) {
            ArrayList a;
            a = C8569dql.a(SaversKt.save(Color.m1284boximpl(shadow.m1431getColor0d7_KjU()), SaversKt.getSaver(Color.Companion), saverScope), SaversKt.save(Offset.m1126boximpl(shadow.m1432getOffsetF1C5BW0()), SaversKt.getSaver(Offset.Companion), saverScope), SaversKt.save(Float.valueOf(shadow.getBlurRadius())));
            return a;
        }
    }, new drM<Object, Shadow>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drM
        public final Shadow invoke(Object obj) {
            C8632dsu.d(obj);
            List list = (List) obj;
            Object obj2 = list.get(0);
            Saver<Color, Object> saver = SaversKt.getSaver(Color.Companion);
            Boolean bool = Boolean.FALSE;
            Color restore = (C8632dsu.c(obj2, bool) || obj2 == null) ? null : saver.restore(obj2);
            C8632dsu.d(restore);
            long m1302unboximpl = restore.m1302unboximpl();
            Object obj3 = list.get(1);
            Offset restore2 = (C8632dsu.c(obj3, bool) || obj3 == null) ? null : SaversKt.getSaver(Offset.Companion).restore(obj3);
            C8632dsu.d(restore2);
            long m1146unboximpl = restore2.m1146unboximpl();
            Object obj4 = list.get(2);
            Float f = obj4 != null ? (Float) obj4 : null;
            C8632dsu.d(f);
            return new Shadow(m1302unboximpl, m1146unboximpl, f.floatValue(), null);
        }
    });
    private static final Saver<Color, Object> ColorSaver = SaverKt.Saver(new drX<SaverScope, Color, Object>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$1
        @Override // o.drX
        public /* synthetic */ Object invoke(SaverScope saverScope, Color color) {
            return m2119invoke4WTKRHQ(saverScope, color.m1302unboximpl());
        }

        /* renamed from: invoke-4WTKRHQ  reason: not valid java name */
        public final Object m2119invoke4WTKRHQ(SaverScope saverScope, long j) {
            return dpL.e(j);
        }
    }, new drM<Object, Color>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$2
        @Override // o.drM
        /* renamed from: invoke-ijrfgN4  reason: not valid java name */
        public final Color invoke(Object obj) {
            C8632dsu.d(obj);
            return Color.m1284boximpl(Color.m1289constructorimpl(((dpL) obj).a()));
        }
    });
    private static final Saver<TextUnit, Object> TextUnitSaver = SaverKt.Saver(new drX<SaverScope, TextUnit, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$1
        @Override // o.drX
        public /* synthetic */ Object invoke(SaverScope saverScope, TextUnit textUnit) {
            return m2125invokempE4wyQ(saverScope, textUnit.m2563unboximpl());
        }

        /* renamed from: invoke-mpE4wyQ  reason: not valid java name */
        public final Object m2125invokempE4wyQ(SaverScope saverScope, long j) {
            ArrayList a;
            a = C8569dql.a(SaversKt.save(Float.valueOf(TextUnit.m2560getValueimpl(j))), SaversKt.save(TextUnitType.m2570boximpl(TextUnit.m2559getTypeUIouoOA(j))));
            return a;
        }
    }, new drM<Object, TextUnit>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$2
        @Override // o.drM
        /* renamed from: invoke-XNhUCwk  reason: not valid java name */
        public final TextUnit invoke(Object obj) {
            C8632dsu.d(obj);
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f = obj2 != null ? (Float) obj2 : null;
            C8632dsu.d(f);
            float floatValue = f.floatValue();
            Object obj3 = list.get(1);
            TextUnitType textUnitType = obj3 != null ? (TextUnitType) obj3 : null;
            C8632dsu.d(textUnitType);
            return TextUnit.m2554boximpl(TextUnitKt.m2565TextUnitanM5pPY(floatValue, textUnitType.m2576unboximpl()));
        }
    });
    private static final Saver<Offset, Object> OffsetSaver = SaverKt.Saver(new drX<SaverScope, Offset, Object>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$1
        @Override // o.drX
        public /* synthetic */ Object invoke(SaverScope saverScope, Offset offset) {
            return m2121invokeUv8p0NA(saverScope, offset.m1146unboximpl());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke-Uv8p0NA  reason: not valid java name */
        public final Object m2121invokeUv8p0NA(SaverScope saverScope, long j) {
            ArrayList a;
            if (Offset.m1134equalsimpl0(j, Offset.Companion.m1148getUnspecifiedF1C5BW0())) {
                return Boolean.FALSE;
            }
            a = C8569dql.a(SaversKt.save(Float.valueOf(Offset.m1137getXimpl(j))), SaversKt.save(Float.valueOf(Offset.m1138getYimpl(j))));
            return a;
        }
    }, new drM<Object, Offset>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$2
        @Override // o.drM
        /* renamed from: invoke-x-9fifI  reason: not valid java name */
        public final Offset invoke(Object obj) {
            if (C8632dsu.c(obj, Boolean.FALSE)) {
                return Offset.m1126boximpl(Offset.Companion.m1148getUnspecifiedF1C5BW0());
            }
            C8632dsu.d(obj);
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f = obj2 != null ? (Float) obj2 : null;
            C8632dsu.d(f);
            float floatValue = f.floatValue();
            Object obj3 = list.get(1);
            Float f2 = obj3 != null ? (Float) obj3 : null;
            C8632dsu.d(f2);
            return Offset.m1126boximpl(OffsetKt.Offset(floatValue, f2.floatValue()));
        }
    });
    private static final Saver<LocaleList, Object> LocaleListSaver = SaverKt.Saver(new drX<SaverScope, LocaleList, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$1
        @Override // o.drX
        public final Object invoke(SaverScope saverScope, LocaleList localeList) {
            List<Locale> localeList2 = localeList.getLocaleList();
            ArrayList arrayList = new ArrayList(localeList2.size());
            int size = localeList2.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(SaversKt.save(localeList2.get(i), SaversKt.getSaver(Locale.Companion), saverScope));
            }
            return arrayList;
        }
    }, new drM<Object, LocaleList>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drM
        public final LocaleList invoke(Object obj) {
            C8632dsu.d(obj);
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                Locale restore = (C8632dsu.c(obj2, Boolean.FALSE) || obj2 == null) ? null : SaversKt.getSaver(Locale.Companion).restore(obj2);
                C8632dsu.d(restore);
                arrayList.add(restore);
            }
            return new LocaleList(arrayList);
        }
    });
    private static final Saver<Locale, Object> LocaleSaver = SaverKt.Saver(new drX<SaverScope, Locale, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$1
        @Override // o.drX
        public final Object invoke(SaverScope saverScope, Locale locale) {
            return locale.toLanguageTag();
        }
    }, new drM<Object, Locale>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drM
        public final Locale invoke(Object obj) {
            C8632dsu.d(obj);
            return new Locale((String) obj);
        }
    });

    public static final Saver<AnnotatedString, Object> getAnnotatedStringSaver() {
        return AnnotatedStringSaver;
    }

    public static final Saver<ParagraphStyle, Object> getParagraphStyleSaver() {
        return ParagraphStyleSaver;
    }

    public static final Saver<Offset, Object> getSaver(Offset.Companion companion) {
        return OffsetSaver;
    }

    public static final Saver<Color, Object> getSaver(Color.Companion companion) {
        return ColorSaver;
    }

    public static final Saver<Shadow, Object> getSaver(Shadow.Companion companion) {
        return ShadowSaver;
    }

    public static final Saver<TextRange, Object> getSaver(TextRange.Companion companion) {
        return TextRangeSaver;
    }

    public static final Saver<FontWeight, Object> getSaver(FontWeight.Companion companion) {
        return FontWeightSaver;
    }

    public static final Saver<Locale, Object> getSaver(Locale.Companion companion) {
        return LocaleSaver;
    }

    public static final Saver<LocaleList, Object> getSaver(LocaleList.Companion companion) {
        return LocaleListSaver;
    }

    public static final Saver<BaselineShift, Object> getSaver(BaselineShift.Companion companion) {
        return BaselineShiftSaver;
    }

    public static final Saver<TextDecoration, Object> getSaver(TextDecoration.Companion companion) {
        return TextDecorationSaver;
    }

    public static final Saver<TextGeometricTransform, Object> getSaver(TextGeometricTransform.Companion companion) {
        return TextGeometricTransformSaver;
    }

    public static final Saver<TextIndent, Object> getSaver(TextIndent.Companion companion) {
        return TextIndentSaver;
    }

    public static final Saver<TextUnit, Object> getSaver(TextUnit.Companion companion) {
        return TextUnitSaver;
    }

    public static final Saver<SpanStyle, Object> getSpanStyleSaver() {
        return SpanStyleSaver;
    }

    public static final <T> T save(T t) {
        return t;
    }

    public static final <T extends Saver<Original, Saveable>, Original, Saveable> Object save(Original original, T t, SaverScope saverScope) {
        Object save;
        return (original == null || (save = t.save(saverScope, original)) == null) ? Boolean.FALSE : save;
    }
}
