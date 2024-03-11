package androidx.media3.extractor.text.ttml;

import android.text.Layout;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ColorParser;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.XmlPullParserUtil;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.LegacySubtitleUtil;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.base.Ascii;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
public class TtmlParser implements SubtitleParser {
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern CLOCK_TIME = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern OFFSET_TIME = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern FONT_SIZE = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern SIGNED_PERCENTAGE = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern PERCENTAGE_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern PIXEL_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern CELL_RESOLUTION = Pattern.compile("^(\\d+) (\\d+)$");
    private static final FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = new FrameAndTickRate(30.0f, 1, 1);

    public TtmlParser() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.xmlParserFactory = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        LegacySubtitleUtil.toCuesWithTiming(parseToLegacySubtitle(bArr, i, i2), outputOptions, consumer);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public Subtitle parseToLegacySubtitle(byte[] bArr, int i, int i2) {
        char c;
        FrameAndTickRate frameAndTickRate;
        try {
            XmlPullParser newPullParser = this.xmlParserFactory.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new TtmlRegion(""));
            TtsExtent ttsExtent = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            FrameAndTickRate frameAndTickRate2 = DEFAULT_FRAME_AND_TICK_RATE;
            TtmlSubtitle ttmlSubtitle = null;
            int i3 = 0;
            int i4 = 15;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                if (i3 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            frameAndTickRate2 = parseFrameAndTickRates(newPullParser);
                            c = 15;
                            i4 = parseCellRows(newPullParser, 15);
                            ttsExtent = parseTtsExtent(newPullParser);
                        } else {
                            c = 15;
                        }
                        TtsExtent ttsExtent2 = ttsExtent;
                        FrameAndTickRate frameAndTickRate3 = frameAndTickRate2;
                        int i5 = i4;
                        if (isSupportedTag(name)) {
                            if ("head".equals(name)) {
                                frameAndTickRate = frameAndTickRate3;
                                parseHeader(newPullParser, hashMap, i5, ttsExtent2, hashMap2, hashMap3);
                            } else {
                                frameAndTickRate = frameAndTickRate3;
                                try {
                                    TtmlNode parseNode = parseNode(newPullParser, ttmlNode, hashMap2, frameAndTickRate);
                                    arrayDeque.push(parseNode);
                                    if (ttmlNode != null) {
                                        ttmlNode.addChild(parseNode);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    Log.w("TtmlParser", "Suppressing parser error", e);
                                    i3++;
                                }
                            }
                            frameAndTickRate2 = frameAndTickRate;
                            ttsExtent = ttsExtent2;
                            i4 = i5;
                        } else {
                            Log.i("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            i3++;
                            frameAndTickRate2 = frameAndTickRate3;
                            ttsExtent = ttsExtent2;
                            i4 = i5;
                        }
                    } else if (eventType == 4) {
                        ((TtmlNode) Assertions.checkNotNull(ttmlNode)).addChild(TtmlNode.buildTextNode(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            ttmlSubtitle = new TtmlSubtitle((TtmlNode) Assertions.checkNotNull((TtmlNode) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                newPullParser.next();
            }
            return (Subtitle) Assertions.checkNotNull(ttmlSubtitle);
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }

    protected FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlPullParser) {
        return parseFrameAndTickRates(xmlPullParser, "http://www.w3.org/ns/ttml#parameter");
    }

    public static FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlPullParser, String str) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue(str, "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] split = Util.split(attributeValue2, " ");
            Assertions.checkArgument(split.length == 2, "frameRateMultiplier doesn't have 2 parts");
            f = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
        } else {
            f = 1.0f;
        }
        FrameAndTickRate frameAndTickRate = DEFAULT_FRAME_AND_TICK_RATE;
        int i = frameAndTickRate.subFrameRate;
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = frameAndTickRate.tickRate;
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new FrameAndTickRate(parseInt * f, i, i2);
    }

    private static int parseCellRows(XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i;
        }
        Matcher matcher = CELL_RESOLUTION.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i;
        }
        boolean z = true;
        try {
            int parseInt = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2)));
            if (parseInt == 0 || parseInt2 == 0) {
                z = false;
            }
            Assertions.checkArgument(z, "Invalid cell resolution " + parseInt + " " + parseInt2);
            return parseInt2;
        } catch (NumberFormatException unused) {
            Log.w("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i;
        }
    }

    private static TtsExtent parseTtsExtent(XmlPullParser xmlPullParser) {
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "extent");
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = PIXEL_COORDINATES.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w("TtmlParser", "Ignoring non-pixel tts extent: " + attributeValue);
            return null;
        }
        try {
            return new TtsExtent(Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2))));
        } catch (NumberFormatException unused) {
            Log.w("TtmlParser", "Ignoring malformed tts extent: " + attributeValue);
            return null;
        }
    }

    private static Map<String, TtmlStyle> parseHeader(XmlPullParser xmlPullParser, Map<String, TtmlStyle> map, int i, TtsExtent ttsExtent, Map<String, TtmlRegion> map2, Map<String, String> map3) {
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "style")) {
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "style");
                TtmlStyle parseStyleAttributes = parseStyleAttributes(xmlPullParser, new TtmlStyle());
                if (attributeValue != null) {
                    for (String str : parseStyleIds(attributeValue)) {
                        parseStyleAttributes.chain(map.get(str));
                    }
                }
                String id = parseStyleAttributes.getId();
                if (id != null) {
                    map.put(id, parseStyleAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "region")) {
                TtmlRegion parseRegionAttributes = parseRegionAttributes(xmlPullParser, i, ttsExtent);
                if (parseRegionAttributes != null) {
                    map2.put(parseRegionAttributes.id, parseRegionAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "metadata")) {
                parseMetadata(xmlPullParser, map3);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "head"));
        return map;
    }

    private static void parseMetadata(XmlPullParser xmlPullParser, Map<String, String> map) {
        String attributeValue;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "image") && (attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, SignupConstants.Field.LANG_ID)) != null) {
                map.put(attributeValue, xmlPullParser.nextText());
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x025d, code lost:
        if (r0.equals("tb") == false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0262 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.media3.extractor.text.ttml.TtmlRegion parseRegionAttributes(org.xmlpull.v1.XmlPullParser r17, int r18, androidx.media3.extractor.text.ttml.TtmlParser.TtsExtent r19) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.TtmlParser.parseRegionAttributes(org.xmlpull.v1.XmlPullParser, int, androidx.media3.extractor.text.ttml.TtmlParser$TtsExtent):androidx.media3.extractor.text.ttml.TtmlRegion");
    }

    private static String[] parseStyleIds(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : Util.split(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static TtmlStyle parseStyleAttributes(XmlPullParser xmlPullParser, TtmlStyle ttmlStyle) {
        char c;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.hashCode();
            char c2 = 65535;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (attributeName.equals(SignupConstants.Field.LANG_ID)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    ttmlStyle = createIfNull(ttmlStyle).setItalic("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    ttmlStyle = createIfNull(ttmlStyle).setFontFamily(attributeValue);
                    break;
                case 2:
                    ttmlStyle = createIfNull(ttmlStyle).setTextAlign(parseAlignment(attributeValue));
                    break;
                case 3:
                    String lowerCase = Ascii.toLowerCase(attributeValue);
                    lowerCase.hashCode();
                    switch (lowerCase.hashCode()) {
                        case -1461280213:
                            if (lowerCase.equals("nounderline")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (lowerCase.equals("underline")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 913457136:
                            if (lowerCase.equals("nolinethrough")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (lowerCase.equals("linethrough")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            if (c2 != 2) {
                                if (c2 != 3) {
                                    break;
                                } else {
                                    ttmlStyle = createIfNull(ttmlStyle).setLinethrough(true);
                                    break;
                                }
                            } else {
                                ttmlStyle = createIfNull(ttmlStyle).setLinethrough(false);
                                break;
                            }
                        } else {
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(true);
                            break;
                        }
                    } else {
                        ttmlStyle = createIfNull(ttmlStyle).setUnderline(false);
                        break;
                    }
                case 4:
                    ttmlStyle = createIfNull(ttmlStyle).setBold("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        ttmlStyle = createIfNull(ttmlStyle).setId(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String lowerCase2 = Ascii.toLowerCase(attributeValue);
                    lowerCase2.hashCode();
                    switch (lowerCase2.hashCode()) {
                        case -618561360:
                            if (lowerCase2.equals("baseContainer")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -410956671:
                            if (lowerCase2.equals("container")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case -250518009:
                            if (lowerCase2.equals("delimiter")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case -136074796:
                            if (lowerCase2.equals("textContainer")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 3016401:
                            if (lowerCase2.equals("base")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 3556653:
                            if (lowerCase2.equals("text")) {
                                c2 = 5;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            if (c2 != 2) {
                                if (c2 != 3) {
                                    if (c2 != 4) {
                                        if (c2 != 5) {
                                            break;
                                        }
                                    }
                                }
                                ttmlStyle = createIfNull(ttmlStyle).setRubyType(3);
                                break;
                            } else {
                                ttmlStyle = createIfNull(ttmlStyle).setRubyType(4);
                                break;
                            }
                        } else {
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(1);
                            break;
                        }
                    }
                    ttmlStyle = createIfNull(ttmlStyle).setRubyType(2);
                    break;
                case 7:
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setFontColor(ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        Log.w("TtmlParser", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                case '\b':
                    ttmlStyle = createIfNull(ttmlStyle).setShearPercentage(parseShear(attributeValue));
                    break;
                case '\t':
                    String lowerCase3 = Ascii.toLowerCase(attributeValue);
                    lowerCase3.hashCode();
                    if (lowerCase3.equals("all")) {
                        ttmlStyle = createIfNull(ttmlStyle).setTextCombine(true);
                        break;
                    } else if (lowerCase3.equals("none")) {
                        ttmlStyle = createIfNull(ttmlStyle).setTextCombine(false);
                        break;
                    } else {
                        break;
                    }
                case '\n':
                    try {
                        ttmlStyle = createIfNull(ttmlStyle);
                        parseFontSize(attributeValue, ttmlStyle);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        Log.w("TtmlParser", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                case 11:
                    ttmlStyle = createIfNull(ttmlStyle).setTextEmphasis(TextEmphasis.parse(attributeValue));
                    break;
                case '\f':
                    String lowerCase4 = Ascii.toLowerCase(attributeValue);
                    lowerCase4.hashCode();
                    if (lowerCase4.equals("before")) {
                        ttmlStyle = createIfNull(ttmlStyle).setRubyPosition(1);
                        break;
                    } else if (lowerCase4.equals("after")) {
                        ttmlStyle = createIfNull(ttmlStyle).setRubyPosition(2);
                        break;
                    } else {
                        break;
                    }
                case '\r':
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setBackgroundColor(ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        Log.w("TtmlParser", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                case 14:
                    ttmlStyle = createIfNull(ttmlStyle).setMultiRowAlign(parseAlignment(attributeValue));
                    break;
            }
        }
        return ttmlStyle;
    }

    private static TtmlStyle createIfNull(TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Layout.Alignment parseAlignment(String str) {
        char c;
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.hashCode();
        switch (lowerCase.hashCode()) {
            case -1364013995:
                if (lowerCase.equals("center")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 100571:
                if (lowerCase.equals("end")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3317767:
                if (lowerCase.equals("left")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 108511772:
                if (lowerCase.equals("right")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 109757538:
                if (lowerCase.equals("start")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static TtmlNode parseNode(XmlPullParser xmlPullParser, TtmlNode ttmlNode, Map<String, TtmlRegion> map, FrameAndTickRate frameAndTickRate) {
        long j;
        long j2;
        char c;
        int attributeCount = xmlPullParser.getAttributeCount();
        TtmlStyle parseStyleAttributes = parseStyleAttributes(xmlPullParser, null);
        String[] strArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = "";
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1008619738:
                    if (attributeName.equals(AppMeasurementSdk.ConditionalUserProperty.ORIGIN)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -934795532:
                    if (attributeName.equals("region")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    str3 = attributeValue;
                    continue;
                case 1:
                    str2 = attributeValue;
                    continue;
                case 2:
                    if (map.containsKey(attributeValue)) {
                        str4 = attributeValue;
                    } else {
                        continue;
                    }
                case 3:
                    j5 = parseTimeExpression(attributeValue, frameAndTickRate);
                    continue;
                case 4:
                    j4 = parseTimeExpression(attributeValue, frameAndTickRate);
                    continue;
                case 5:
                    j3 = parseTimeExpression(attributeValue, frameAndTickRate);
                    continue;
                case 6:
                    String[] parseStyleIds = parseStyleIds(attributeValue);
                    if (parseStyleIds.length > 0) {
                        strArr = parseStyleIds;
                        break;
                    }
                    break;
                case 7:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (ttmlNode != null) {
            long j6 = ttmlNode.startTimeUs;
            j = -9223372036854775807L;
            if (j6 != -9223372036854775807L) {
                if (j3 != -9223372036854775807L) {
                    j3 += j6;
                }
                if (j4 != -9223372036854775807L) {
                    j4 += j6;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        long j7 = j3;
        if (j4 == j) {
            if (j5 != j) {
                j2 = j7 + j5;
            } else if (ttmlNode != null) {
                long j8 = ttmlNode.endTimeUs;
                if (j8 != j) {
                    j2 = j8;
                }
            }
            return TtmlNode.buildNode(xmlPullParser.getName(), j7, j2, parseStyleAttributes, strArr, str4, str, str2, str3, ttmlNode);
        }
        j2 = j4;
        return TtmlNode.buildNode(xmlPullParser.getName(), j7, j2, parseStyleAttributes, strArr, str4, str, str2, str3, ttmlNode);
    }

    private static boolean isSupportedTag(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals(NotificationFactory.DATA) || str.equals("information");
    }

    private static void parseFontSize(String str, TtmlStyle ttmlStyle) {
        Matcher matcher;
        char c;
        String[] split = Util.split(str, "\\s+");
        if (split.length == 1) {
            matcher = FONT_SIZE.matcher(str);
        } else if (split.length == 2) {
            matcher = FONT_SIZE.matcher(split[1]);
            Log.w("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + split.length + ".");
        }
        if (matcher.matches()) {
            String str2 = (String) Assertions.checkNotNull(matcher.group(3));
            str2.hashCode();
            int hashCode = str2.hashCode();
            if (hashCode == 37) {
                if (str2.equals("%")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != 3240) {
                if (hashCode == 3592 && str2.equals("px")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (str2.equals("em")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                ttmlStyle.setFontSizeUnit(3);
            } else if (c == 1) {
                ttmlStyle.setFontSizeUnit(2);
            } else if (c == 2) {
                ttmlStyle.setFontSizeUnit(1);
            } else {
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
            }
            ttmlStyle.setFontSize(Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))));
            return;
        }
        throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
    }

    private static float parseShear(String str) {
        Matcher matcher = SIGNED_PERCENTAGE.matcher(str);
        if (!matcher.matches()) {
            Log.w("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1)))));
        } catch (NumberFormatException e) {
            Log.w("TtmlParser", "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    private static long parseTimeExpression(String str, FrameAndTickRate frameAndTickRate) {
        char c;
        double d;
        double d2;
        String group;
        String group2;
        Matcher matcher = CLOCK_TIME.matcher(str);
        if (matcher.matches()) {
            double parseLong = Long.parseLong((String) Assertions.checkNotNull(matcher.group(1))) * 3600;
            double parseLong2 = Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))) * 60;
            double parseLong3 = Long.parseLong((String) Assertions.checkNotNull(matcher.group(3)));
            String group3 = matcher.group(4);
            double parseDouble = group3 != null ? Double.parseDouble(group3) : 0.0d;
            return (long) ((parseLong + parseLong2 + parseLong3 + parseDouble + (matcher.group(5) != null ? ((float) Long.parseLong(group)) / frameAndTickRate.effectiveFrameRate : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(group2) / frameAndTickRate.subFrameRate) / frameAndTickRate.effectiveFrameRate : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = OFFSET_TIME.matcher(str);
        if (matcher2.matches()) {
            double parseDouble2 = Double.parseDouble((String) Assertions.checkNotNull(matcher2.group(1)));
            String str2 = (String) Assertions.checkNotNull(matcher2.group(2));
            str2.hashCode();
            int hashCode = str2.hashCode();
            if (hashCode == 102) {
                if (str2.equals("f")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode == 104) {
                if (str2.equals("h")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode == 109) {
                if (str2.equals("m")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 116) {
                if (hashCode == 3494 && str2.equals("ms")) {
                    c = 4;
                }
                c = 65535;
            } else {
                if (str2.equals("t")) {
                    c = 3;
                }
                c = 65535;
            }
            if (c != 0) {
                if (c == 1) {
                    d2 = 3600.0d;
                } else if (c == 2) {
                    d2 = 60.0d;
                } else if (c != 3) {
                    if (c == 4) {
                        d = 1000.0d;
                    }
                    return (long) (parseDouble2 * 1000000.0d);
                } else {
                    d = frameAndTickRate.tickRate;
                }
                parseDouble2 *= d2;
                return (long) (parseDouble2 * 1000000.0d);
            }
            d = frameAndTickRate.effectiveFrameRate;
            parseDouble2 /= d;
            return (long) (parseDouble2 * 1000000.0d);
        }
        throw new SubtitleDecoderException("Malformed time expression: " + str);
    }

    /* loaded from: classes2.dex */
    public static final class FrameAndTickRate {
        final float effectiveFrameRate;
        final int subFrameRate;
        final int tickRate;

        FrameAndTickRate(float f, int i, int i2) {
            this.effectiveFrameRate = f;
            this.subFrameRate = i;
            this.tickRate = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class TtsExtent {
        final int height;
        final int width;

        TtsExtent(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }
}
