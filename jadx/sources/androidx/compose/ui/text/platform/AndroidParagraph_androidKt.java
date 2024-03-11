package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import java.util.List;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class AndroidParagraph_androidKt {
    /* renamed from: ActualParagraph-O3s9Psw  reason: not valid java name */
    public static final Paragraph m2310ActualParagraphO3s9Psw(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, boolean z, long j, Density density, FontFamily.Resolver resolver) {
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i, z, j, null);
    }

    /* renamed from: ActualParagraph--hBUhpc  reason: not valid java name */
    public static final Paragraph m2309ActualParagraphhBUhpc(ParagraphIntrinsics paragraphIntrinsics, int i, boolean z, long j) {
        C8632dsu.d(paragraphIntrinsics);
        return new AndroidParagraph((AndroidParagraphIntrinsics) paragraphIntrinsics, i, z, j, null);
    }
}
