package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class AnnotatedString implements CharSequence {
    private final List<Range<? extends Object>> annotations;
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;
    private final List<Range<SpanStyle>> spanStylesOrNull;
    private final String text;

    public final List<Range<? extends Object>> getAnnotations$ui_text_release() {
        return this.annotations;
    }

    public final List<Range<ParagraphStyle>> getParagraphStylesOrNull$ui_text_release() {
        return this.paragraphStylesOrNull;
    }

    public final List<Range<SpanStyle>> getSpanStylesOrNull$ui_text_release() {
        return this.spanStylesOrNull;
    }

    public final String getText() {
        return this.text;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
        r3 = o.C8576dqs.c((java.lang.Iterable) r5, new androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AnnotatedString(java.lang.String r3, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>> r4, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>> r5, java.util.List<? extends androidx.compose.ui.text.AnnotatedString.Range<? extends java.lang.Object>> r6) {
        /*
            r2 = this;
            r2.<init>()
            r2.text = r3
            r2.spanStylesOrNull = r4
            r2.paragraphStylesOrNull = r5
            r2.annotations = r6
            if (r5 == 0) goto L7b
            androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1 r3 = new androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1
            r3.<init>()
            java.util.List r3 = o.C8570dqm.b(r5, r3)
            if (r3 == 0) goto L7b
            int r4 = r3.size()
            r5 = -1
            r6 = 0
        L1e:
            if (r6 >= r4) goto L7b
            java.lang.Object r0 = r3.get(r6)
            androidx.compose.ui.text.AnnotatedString$Range r0 = (androidx.compose.ui.text.AnnotatedString.Range) r0
            int r1 = r0.getStart()
            if (r1 < r5) goto L6f
            int r5 = r0.getEnd()
            java.lang.String r1 = r2.text
            int r1 = r1.length()
            if (r5 > r1) goto L3f
            int r5 = r0.getEnd()
            int r6 = r6 + 1
            goto L1e
        L3f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ParagraphStyle range ["
            r3.append(r4)
            int r4 = r0.getStart()
            r3.append(r4)
            java.lang.String r4 = ", "
            r3.append(r4)
            int r4 = r0.getEnd()
            r3.append(r4)
            java.lang.String r4 = ") is out of boundary"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L6f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "ParagraphStyle should not overlap"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AnnotatedString.<init>(java.lang.String, java.util.List, java.util.List, java.util.List):void");
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return get(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return getLength();
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, List list3, int i, C8627dsp c8627dsp) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }

    public final List<Range<SpanStyle>> getSpanStyles() {
        List<Range<SpanStyle>> i;
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        if (list == null) {
            i = C8569dql.i();
            return i;
        }
        return list;
    }

    public final List<Range<ParagraphStyle>> getParagraphStyles() {
        List<Range<ParagraphStyle>> i;
        List<Range<ParagraphStyle>> list = this.paragraphStylesOrNull;
        if (list == null) {
            i = C8569dql.i();
            return i;
        }
        return list;
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i, C8627dsp c8627dsp) {
        this(str, (i & 2) != 0 ? C8569dql.i() : list, (i & 4) != 0 ? C8569dql.i() : list2);
    }

    public AnnotatedString(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2) {
        this(str, list.isEmpty() ? null : list, list2.isEmpty() ? null : list2, null);
    }

    public int getLength() {
        return this.text.length();
    }

    public char get(int i) {
        return this.text.charAt(i);
    }

    @Override // java.lang.CharSequence
    public AnnotatedString subSequence(int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
        } else if (i == 0 && i2 == this.text.length()) {
            return this;
        } else {
            String substring = this.text.substring(i, i2);
            C8632dsu.a(substring, "");
            return new AnnotatedString(substring, AnnotatedStringKt.access$filterRanges(this.spanStylesOrNull, i, i2), AnnotatedStringKt.access$filterRanges(this.paragraphStylesOrNull, i, i2), AnnotatedStringKt.access$filterRanges(this.annotations, i, i2));
        }
    }

    /* renamed from: subSequence-5zc-tL8  reason: not valid java name */
    public final AnnotatedString m2067subSequence5zctL8(long j) {
        return subSequence(TextRange.m2155getMinimpl(j), TextRange.m2154getMaximpl(j));
    }

    public final AnnotatedString plus(AnnotatedString annotatedString) {
        Builder builder = new Builder(this);
        builder.append(annotatedString);
        return builder.toAnnotatedString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnnotatedString) {
            AnnotatedString annotatedString = (AnnotatedString) obj;
            return C8632dsu.c((Object) this.text, (Object) annotatedString.text) && C8632dsu.c(this.spanStylesOrNull, annotatedString.spanStylesOrNull) && C8632dsu.c(this.paragraphStylesOrNull, annotatedString.paragraphStylesOrNull) && C8632dsu.c(this.annotations, annotatedString.annotations);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode();
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        int hashCode2 = list != null ? list.hashCode() : 0;
        List<Range<ParagraphStyle>> list2 = this.paragraphStylesOrNull;
        int hashCode3 = list2 != null ? list2.hashCode() : 0;
        List<Range<? extends Object>> list3 = this.annotations;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    /* loaded from: classes.dex */
    public static final class Range<T> {
        private final int end;
        private final T item;
        private final int start;
        private final String tag;

        public final T component1() {
            return this.item;
        }

        public final int component2() {
            return this.start;
        }

        public final int component3() {
            return this.end;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Range) {
                Range range = (Range) obj;
                return C8632dsu.c(this.item, range.item) && this.start == range.start && this.end == range.end && C8632dsu.c((Object) this.tag, (Object) range.tag);
            }
            return false;
        }

        public final int getEnd() {
            return this.end;
        }

        public final T getItem() {
            return this.item;
        }

        public final int getStart() {
            return this.start;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            T t = this.item;
            return ((((((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }

        public Range(T t, int i, int i2, String str) {
            this.item = t;
            this.start = i;
            this.end = i2;
            this.tag = str;
            if (i > i2) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public Range(T t, int i, int i2) {
            this(t, i, i2, "");
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder implements Appendable {
        private final List<MutableRange<? extends Object>> annotations;
        private final List<MutableRange<ParagraphStyle>> paragraphStyles;
        private final List<MutableRange<SpanStyle>> spanStyles;
        private final List<MutableRange<? extends Object>> styleStack;
        private final StringBuilder text;

        public Builder() {
            this(0, 1, null);
        }

        public Builder(int i) {
            this.text = new StringBuilder(i);
            this.spanStyles = new ArrayList();
            this.paragraphStyles = new ArrayList();
            this.annotations = new ArrayList();
            this.styleStack = new ArrayList();
        }

        public /* synthetic */ Builder(int i, int i2, C8627dsp c8627dsp) {
            this((i2 & 1) != 0 ? 16 : i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class MutableRange<T> {
            private int end;
            private final T item;
            private final int start;
            private final String tag;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof MutableRange) {
                    MutableRange mutableRange = (MutableRange) obj;
                    return C8632dsu.c(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && C8632dsu.c((Object) this.tag, (Object) mutableRange.tag);
                }
                return false;
            }

            public int hashCode() {
                T t = this.item;
                return ((((((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
            }

            public final void setEnd(int i) {
                this.end = i;
            }

            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }

            public MutableRange(T t, int i, int i2, String str) {
                this.item = t;
                this.start = i;
                this.end = i2;
                this.tag = str;
            }

            public /* synthetic */ MutableRange(Object obj, int i, int i2, String str, int i3, C8627dsp c8627dsp) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
            }

            public final Range<T> toRange(int i) {
                int i2 = this.end;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (i == Integer.MIN_VALUE) {
                    throw new IllegalStateException("Item.end should be set first".toString());
                }
                return new Range<>(this.item, this.start, i, this.tag);
            }
        }

        public Builder(AnnotatedString annotatedString) {
            this(0, 1, null);
            append(annotatedString);
        }

        public final int getLength() {
            return this.text.length();
        }

        public final void append(String str) {
            this.text.append(str);
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence charSequence) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence);
            } else {
                this.text.append(charSequence);
            }
            return this;
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence charSequence, int i, int i2) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence, i, i2);
            } else {
                this.text.append(charSequence, i, i2);
            }
            return this;
        }

        @Override // java.lang.Appendable
        public Builder append(char c) {
            this.text.append(c);
            return this;
        }

        public final void append(AnnotatedString annotatedString) {
            int length = this.text.length();
            this.text.append(annotatedString.getText());
            List<Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
            if (spanStylesOrNull$ui_text_release != null) {
                int size = spanStylesOrNull$ui_text_release.size();
                for (int i = 0; i < size; i++) {
                    Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i);
                    addStyle(range.getItem(), range.getStart() + length, range.getEnd() + length);
                }
            }
            List<Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
            if (paragraphStylesOrNull$ui_text_release != null) {
                int size2 = paragraphStylesOrNull$ui_text_release.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Range<ParagraphStyle> range2 = paragraphStylesOrNull$ui_text_release.get(i2);
                    addStyle(range2.getItem(), range2.getStart() + length, range2.getEnd() + length);
                }
            }
            List<Range<? extends Object>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
            if (annotations$ui_text_release != null) {
                int size3 = annotations$ui_text_release.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    Range<? extends Object> range3 = annotations$ui_text_release.get(i3);
                    this.annotations.add(new MutableRange<>(range3.getItem(), range3.getStart() + length, range3.getEnd() + length, range3.getTag()));
                }
            }
        }

        public final void append(AnnotatedString annotatedString, int i, int i2) {
            int length = this.text.length();
            this.text.append((CharSequence) annotatedString.getText(), i, i2);
            List access$getLocalSpanStyles = AnnotatedStringKt.access$getLocalSpanStyles(annotatedString, i, i2);
            if (access$getLocalSpanStyles != null) {
                int size = access$getLocalSpanStyles.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Range range = (Range) access$getLocalSpanStyles.get(i3);
                    addStyle((SpanStyle) range.getItem(), range.getStart() + length, range.getEnd() + length);
                }
            }
            List access$getLocalParagraphStyles = AnnotatedStringKt.access$getLocalParagraphStyles(annotatedString, i, i2);
            if (access$getLocalParagraphStyles != null) {
                int size2 = access$getLocalParagraphStyles.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Range range2 = (Range) access$getLocalParagraphStyles.get(i4);
                    addStyle((ParagraphStyle) range2.getItem(), range2.getStart() + length, range2.getEnd() + length);
                }
            }
            List access$getLocalAnnotations = AnnotatedStringKt.access$getLocalAnnotations(annotatedString, i, i2);
            if (access$getLocalAnnotations != null) {
                int size3 = access$getLocalAnnotations.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    Range range3 = (Range) access$getLocalAnnotations.get(i5);
                    this.annotations.add(new MutableRange<>(range3.getItem(), range3.getStart() + length, range3.getEnd() + length, range3.getTag()));
                }
            }
        }

        public final void addStyle(SpanStyle spanStyle, int i, int i2) {
            this.spanStyles.add(new MutableRange<>(spanStyle, i, i2, null, 8, null));
        }

        public final void addStyle(ParagraphStyle paragraphStyle, int i, int i2) {
            this.paragraphStyles.add(new MutableRange<>(paragraphStyle, i, i2, null, 8, null));
        }

        public final int pushStyle(SpanStyle spanStyle) {
            MutableRange<SpanStyle> mutableRange = new MutableRange<>(spanStyle, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.spanStyles.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushUrlAnnotation(UrlAnnotation urlAnnotation) {
            MutableRange<? extends Object> mutableRange = new MutableRange<>(urlAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final void pop() {
            if (!(!this.styleStack.isEmpty())) {
                throw new IllegalStateException("Nothing to pop.".toString());
            }
            List<MutableRange<? extends Object>> list = this.styleStack;
            list.remove(list.size() - 1).setEnd(this.text.length());
        }

        public final void pop(int i) {
            if (i >= this.styleStack.size()) {
                throw new IllegalStateException((i + " should be less than " + this.styleStack.size()).toString());
            }
            while (this.styleStack.size() - 1 >= i) {
                pop();
            }
        }

        public final AnnotatedString toAnnotatedString() {
            String sb = this.text.toString();
            List<MutableRange<SpanStyle>> list = this.spanStyles;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).toRange(this.text.length()));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            List<MutableRange<ParagraphStyle>> list2 = this.paragraphStyles;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(list2.get(i2).toRange(this.text.length()));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            List<MutableRange<? extends Object>> list3 = this.annotations;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList3.add(list3.get(i3).toRange(this.text.length()));
            }
            return new AnnotatedString(sb, arrayList, arrayList2, arrayList3.isEmpty() ? null : arrayList3);
        }
    }

    public final List<Range<String>> getStringAnnotations(String str, int i, int i2) {
        List i3;
        List<Range<? extends Object>> list = this.annotations;
        if (list == null) {
            i3 = C8569dql.i();
        } else {
            i3 = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Range<? extends Object> range = list.get(i4);
                Range<? extends Object> range2 = range;
                if ((range2.getItem() instanceof String) && C8632dsu.c((Object) str, (Object) range2.getTag()) && AnnotatedStringKt.intersect(i, i2, range2.getStart(), range2.getEnd())) {
                    i3.add(range);
                }
            }
        }
        C8632dsu.d(i3);
        return i3;
    }

    public final boolean hasStringAnnotations(String str, int i, int i2) {
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Range<? extends Object> range = list.get(i3);
                if ((range.getItem() instanceof String) && C8632dsu.c((Object) str, (Object) range.getTag()) && AnnotatedStringKt.intersect(i, i2, range.getStart(), range.getEnd())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final List<Range<TtsAnnotation>> getTtsAnnotations(int i, int i2) {
        List i3;
        List<Range<? extends Object>> list = this.annotations;
        if (list == null) {
            i3 = C8569dql.i();
        } else {
            i3 = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Range<? extends Object> range = list.get(i4);
                Range<? extends Object> range2 = range;
                if ((range2.getItem() instanceof TtsAnnotation) && AnnotatedStringKt.intersect(i, i2, range2.getStart(), range2.getEnd())) {
                    i3.add(range);
                }
            }
        }
        C8632dsu.d(i3);
        return i3;
    }

    public final List<Range<UrlAnnotation>> getUrlAnnotations(int i, int i2) {
        List i3;
        List<Range<? extends Object>> list = this.annotations;
        if (list == null) {
            i3 = C8569dql.i();
        } else {
            i3 = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Range<? extends Object> range = list.get(i4);
                Range<? extends Object> range2 = range;
                if ((range2.getItem() instanceof UrlAnnotation) && AnnotatedStringKt.intersect(i, i2, range2.getStart(), range2.getEnd())) {
                    i3.add(range);
                }
            }
        }
        C8632dsu.d(i3);
        return i3;
    }
}
