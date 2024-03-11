package androidx.compose.ui.platform;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import java.util.ArrayList;
import java.util.List;
import o.C8563dqf;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class AndroidClipboardManager_androidKt {
    public static final AnnotatedString convertToAnnotatedString(CharSequence charSequence) {
        int w;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new AnnotatedString(charSequence.toString(), null, null, 6, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        w = C8563dqf.w(annotationArr);
        if (w >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i];
                if (C8632dsu.c((Object) annotation.getKey(), (Object) "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new AnnotatedString.Range(new DecodeHelper(annotation.getValue()).decodeSpanStyle(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i == w) {
                    break;
                }
                i++;
            }
        }
        return new AnnotatedString(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final CharSequence convertToCharSequence(AnnotatedString annotatedString) {
        if (annotatedString.getSpanStyles().isEmpty()) {
            return annotatedString.getText();
        }
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        EncodeHelper encodeHelper = new EncodeHelper();
        List<AnnotatedString.Range<SpanStyle>> spanStyles = annotatedString.getSpanStyles();
        int size = spanStyles.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i);
            int component2 = range.component2();
            int component3 = range.component3();
            encodeHelper.reset();
            encodeHelper.encode(range.component1());
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", encodeHelper.encodedString()), component2, component3, 33);
        }
        return spannableString;
    }
}
