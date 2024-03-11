package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.ArrayList;
import java.util.List;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class TextFieldValue {
    public static final Companion Companion = new Companion(null);
    private static final Saver<TextFieldValue, Object> Saver = SaverKt.Saver(new drX<SaverScope, TextFieldValue, Object>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$1
        @Override // o.drX
        public final Object invoke(SaverScope saverScope, TextFieldValue textFieldValue) {
            ArrayList a;
            a = C8569dql.a(SaversKt.save(textFieldValue.getAnnotatedString(), SaversKt.getAnnotatedStringSaver(), saverScope), SaversKt.save(TextRange.m2145boximpl(textFieldValue.m2302getSelectiond9O1mEE()), SaversKt.getSaver(TextRange.Companion), saverScope));
            return a;
        }
    }, new drM<Object, TextFieldValue>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drM
        public final TextFieldValue invoke(Object obj) {
            C8632dsu.d(obj);
            List list = (List) obj;
            Object obj2 = list.get(0);
            Saver<AnnotatedString, Object> annotatedStringSaver = SaversKt.getAnnotatedStringSaver();
            Boolean bool = Boolean.FALSE;
            TextRange textRange = null;
            AnnotatedString restore = (C8632dsu.c(obj2, bool) || obj2 == null) ? null : annotatedStringSaver.restore(obj2);
            C8632dsu.d(restore);
            Object obj3 = list.get(1);
            Saver<TextRange, Object> saver = SaversKt.getSaver(TextRange.Companion);
            if (!C8632dsu.c(obj3, bool) && obj3 != null) {
                textRange = saver.restore(obj3);
            }
            C8632dsu.d(textRange);
            return new TextFieldValue(restore, textRange.m2161unboximpl(), (TextRange) null, 4, (C8627dsp) null);
        }
    });
    private final AnnotatedString annotatedString;
    private final TextRange composition;
    private final long selection;

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange, C8627dsp c8627dsp) {
        this(annotatedString, j, textRange);
    }

    public /* synthetic */ TextFieldValue(String str, long j, TextRange textRange, C8627dsp c8627dsp) {
        this(str, j, textRange);
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    /* renamed from: getComposition-MzsxiRA  reason: not valid java name */
    public final TextRange m2301getCompositionMzsxiRA() {
        return this.composition;
    }

    /* renamed from: getSelection-d9O1mEE  reason: not valid java name */
    public final long m2302getSelectiond9O1mEE() {
        return this.selection;
    }

    private TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange) {
        this.annotatedString = annotatedString;
        this.selection = TextRangeKt.m2163coerceIn8ffj60Q(j, 0, getText().length());
        this.composition = textRange != null ? TextRange.m2145boximpl(TextRangeKt.m2163coerceIn8ffj60Q(textRange.m2161unboximpl(), 0, getText().length())) : null;
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange, int i, C8627dsp c8627dsp) {
        this(annotatedString, (i & 2) != 0 ? TextRange.Companion.m2162getZerod9O1mEE() : j, (i & 4) != 0 ? null : textRange, (C8627dsp) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j, TextRange textRange, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TextRange.Companion.m2162getZerod9O1mEE() : j, (i & 4) != 0 ? null : textRange, (C8627dsp) null);
    }

    private TextFieldValue(String str, long j, TextRange textRange) {
        this(new AnnotatedString(str, null, null, 6, null), j, textRange, (C8627dsp) null);
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    /* renamed from: copy-3r_uNRQ$default  reason: not valid java name */
    public static /* synthetic */ TextFieldValue m2297copy3r_uNRQ$default(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j, TextRange textRange, int i, Object obj) {
        if ((i & 1) != 0) {
            annotatedString = textFieldValue.annotatedString;
        }
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m2299copy3r_uNRQ(annotatedString, j, textRange);
    }

    /* renamed from: copy-3r_uNRQ  reason: not valid java name */
    public final TextFieldValue m2299copy3r_uNRQ(AnnotatedString annotatedString, long j, TextRange textRange) {
        return new TextFieldValue(annotatedString, j, textRange, (C8627dsp) null);
    }

    /* renamed from: copy-3r_uNRQ$default  reason: not valid java name */
    public static /* synthetic */ TextFieldValue m2298copy3r_uNRQ$default(TextFieldValue textFieldValue, String str, long j, TextRange textRange, int i, Object obj) {
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m2300copy3r_uNRQ(str, j, textRange);
    }

    /* renamed from: copy-3r_uNRQ  reason: not valid java name */
    public final TextFieldValue m2300copy3r_uNRQ(String str, long j, TextRange textRange) {
        return new TextFieldValue(new AnnotatedString(str, null, null, 6, null), j, textRange, (C8627dsp) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextFieldValue) {
            TextFieldValue textFieldValue = (TextFieldValue) obj;
            return TextRange.m2150equalsimpl0(this.selection, textFieldValue.selection) && C8632dsu.c(this.composition, textFieldValue.composition) && C8632dsu.c(this.annotatedString, textFieldValue.annotatedString);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.annotatedString.hashCode();
        int m2158hashCodeimpl = TextRange.m2158hashCodeimpl(this.selection);
        TextRange textRange = this.composition;
        return (((hashCode * 31) + m2158hashCodeimpl) * 31) + (textRange != null ? TextRange.m2158hashCodeimpl(textRange.m2161unboximpl()) : 0);
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.annotatedString) + "', selection=" + ((Object) TextRange.m2160toStringimpl(this.selection)) + ", composition=" + this.composition + ')';
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
