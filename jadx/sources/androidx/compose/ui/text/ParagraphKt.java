package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.List;
import o.C8569dql;

/* loaded from: classes.dex */
public final class ParagraphKt {
    /* renamed from: Paragraph-UdtVg6A$default  reason: not valid java name */
    public static /* synthetic */ Paragraph m2090ParagraphUdtVg6A$default(String str, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, List list2, int i, boolean z, int i2, Object obj) {
        List list3;
        List list4;
        List i3;
        List i4;
        if ((i2 & 32) != 0) {
            i4 = C8569dql.i();
            list3 = i4;
        } else {
            list3 = list;
        }
        if ((i2 & 64) != 0) {
            i3 = C8569dql.i();
            list4 = i3;
        } else {
            list4 = list2;
        }
        return m2089ParagraphUdtVg6A(str, textStyle, j, density, resolver, list3, list4, (i2 & 128) != 0 ? Integer.MAX_VALUE : i, (i2 & JSONzip.end) != 0 ? false : z);
    }

    /* renamed from: Paragraph-UdtVg6A  reason: not valid java name */
    public static final Paragraph m2089ParagraphUdtVg6A(String str, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, boolean z) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m2310ActualParagraphO3s9Psw(str, textStyle, list, list2, i, z, j, density, resolver);
    }

    /* renamed from: Paragraph-_EkL_-Y  reason: not valid java name */
    public static final Paragraph m2091Paragraph_EkL_Y(ParagraphIntrinsics paragraphIntrinsics, long j, int i, boolean z) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m2309ActualParagraphhBUhpc(paragraphIntrinsics, i, z, j);
    }

    public static final int ceilToInt(float f) {
        return (int) Math.ceil(f);
    }
}
