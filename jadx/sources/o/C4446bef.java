package o;

import androidx.media3.extractor.text.ttml.TtmlParser;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: o.bef  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4446bef extends TtmlParser {
    @Override // androidx.media3.extractor.text.ttml.TtmlParser
    public TtmlParser.FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlPullParser) {
        return TtmlParser.parseFrameAndTickRates(xmlPullParser, xmlPullParser.getAttributeValue("xmlns", "ttp"));
    }
}
