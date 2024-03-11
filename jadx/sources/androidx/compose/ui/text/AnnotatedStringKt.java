package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import o.C8569dql;
import o.C8632dsu;
import o.C8657dts;

/* loaded from: classes.dex */
public final class AnnotatedStringKt {
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, null, 6, null);

    public static final boolean contains(int i, int i2, int i3, int i4) {
        if (i > i3 || i4 > i2) {
            return false;
        }
        if (i2 == i4) {
            if ((i3 == i4) != (i == i2)) {
                return false;
            }
        }
        return true;
    }

    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }

    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(AnnotatedString annotatedString, ParagraphStyle paragraphStyle) {
        int length = annotatedString.getText().length();
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release == null) {
            paragraphStylesOrNull$ui_text_release = C8569dql.i();
        }
        ArrayList arrayList = new ArrayList();
        int size = paragraphStylesOrNull$ui_text_release.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i);
            ParagraphStyle component1 = range.component1();
            int component2 = range.component2();
            int component3 = range.component3();
            if (component2 != i2) {
                arrayList.add(new AnnotatedString.Range(paragraphStyle, i2, component2));
            }
            arrayList.add(new AnnotatedString.Range(paragraphStyle.merge(component1), component2, component3));
            i++;
            i2 = component3;
        }
        if (i2 != length) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, i2, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, 0, 0));
        }
        return arrayList;
    }

    public static final List<AnnotatedString.Range<SpanStyle>> getLocalSpanStyles(AnnotatedString annotatedString, int i, int i2) {
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release;
        int c;
        int c2;
        if (i == i2 || (spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i != 0 || i2 < annotatedString.getText().length()) {
            ArrayList arrayList = new ArrayList(spanStylesOrNull$ui_text_release.size());
            int size = spanStylesOrNull$ui_text_release.size();
            for (int i3 = 0; i3 < size; i3++) {
                AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i3);
                AnnotatedString.Range<SpanStyle> range2 = range;
                if (intersect(i, i2, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i4);
                Object item = range3.getItem();
                c = C8657dts.c(range3.getStart(), i, i2);
                c2 = C8657dts.c(range3.getEnd(), i, i2);
                arrayList2.add(new AnnotatedString.Range(item, c - i, c2 - i));
            }
            return arrayList2;
        }
        return spanStylesOrNull$ui_text_release;
    }

    public static final List<AnnotatedString.Range<ParagraphStyle>> getLocalParagraphStyles(AnnotatedString annotatedString, int i, int i2) {
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release;
        int c;
        int c2;
        if (i == i2 || (paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i != 0 || i2 < annotatedString.getText().length()) {
            ArrayList arrayList = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
            int size = paragraphStylesOrNull$ui_text_release.size();
            for (int i3 = 0; i3 < size; i3++) {
                AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i3);
                AnnotatedString.Range<ParagraphStyle> range2 = range;
                if (intersect(i, i2, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i4);
                Object item = range3.getItem();
                c = C8657dts.c(range3.getStart(), i, i2);
                c2 = C8657dts.c(range3.getEnd(), i, i2);
                arrayList2.add(new AnnotatedString.Range(item, c - i, c2 - i));
            }
            return arrayList2;
        }
        return paragraphStylesOrNull$ui_text_release;
    }

    public static final List<AnnotatedString.Range<? extends Object>> getLocalAnnotations(AnnotatedString annotatedString, int i, int i2) {
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release;
        int c;
        int c2;
        if (i == i2 || (annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release()) == null) {
            return null;
        }
        if (i != 0 || i2 < annotatedString.getText().length()) {
            ArrayList arrayList = new ArrayList(annotations$ui_text_release.size());
            int size = annotations$ui_text_release.size();
            for (int i3 = 0; i3 < size; i3++) {
                AnnotatedString.Range<? extends Object> range = annotations$ui_text_release.get(i3);
                AnnotatedString.Range<? extends Object> range2 = range;
                if (intersect(i, i2, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i4);
                String tag = range3.getTag();
                Object item = range3.getItem();
                c = C8657dts.c(range3.getStart(), i, i2);
                c2 = C8657dts.c(range3.getEnd(), i, i2);
                arrayList2.add(new AnnotatedString.Range(item, c - i, c2 - i, tag));
            }
            return arrayList2;
        }
        return annotations$ui_text_release;
    }

    public static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString, int i, int i2) {
        String str;
        if (i == i2) {
            str = "";
        } else {
            String substring = annotatedString.getText().substring(i, i2);
            C8632dsu.a(substring, "");
            str = substring;
        }
        return new AnnotatedString(str, getLocalSpanStyles(annotatedString, i, i2), null, null, 12, null);
    }

    public static final boolean intersect(int i, int i2, int i3, int i4) {
        return Math.max(i, i3) < Math.min(i2, i4) || contains(i, i2, i3, i4) || contains(i3, i4, i, i2);
    }

    public static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> list, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
        } else if (list == null) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                AnnotatedString.Range<? extends T> range = list.get(i3);
                AnnotatedString.Range<? extends T> range2 = range;
                if (intersect(i, i2, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i4);
                arrayList2.add(new AnnotatedString.Range(range3.getItem(), Math.max(i, range3.getStart()) - i, Math.min(i2, range3.getEnd()) - i, range3.getTag()));
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return arrayList2;
        }
    }
}
