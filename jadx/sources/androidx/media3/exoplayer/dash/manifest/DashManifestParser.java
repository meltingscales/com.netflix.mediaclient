package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.XmlPullParserUtil;
import androidx.media3.exoplayer.dash.manifest.SegmentBase;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C9572sD;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes5.dex */
public class DashManifestParser extends DefaultHandler implements ParsingLoadable.Parser<DashManifest> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Pattern CEA_608_ACCESSIBILITY_PATTERN;
    private static final Pattern CEA_708_ACCESSIBILITY_PATTERN;
    private static final Pattern FRAME_RATE_PATTERN;
    private static final int[] MPEG_CHANNEL_CONFIGURATION_MAPPING;
    private static int a$s17$789 = 0;
    private static int b = 1;
    private static boolean b$s19$789;
    private static char[] d$s16$789;
    private static int e;
    private static boolean e$s20$789;
    private final XmlPullParserFactory xmlParserFactory;

    static void b() {
        e$s20$789 = true;
        d$s16$789 = new char[]{10365};
        a$s17$789 = -286513012;
        b$s19$789 = true;
    }

    private static long getFinalAvailabilityTimeOffset(long j, long j2) {
        int i = 2 % 2;
        long j3 = -9223372036854775807L;
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        Object obj = null;
        if (j == Long.MAX_VALUE) {
            int i2 = b + 31;
            e = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            j3 = j;
        }
        int i3 = e + 25;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return j3;
        }
        obj.hashCode();
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public /* synthetic */ DashManifest parse(Uri uri, InputStream inputStream) {
        int i = 2 % 2;
        int i2 = e + 79;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return parse(uri, inputStream);
        }
        parse(uri, inputStream);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        b();
        FRAME_RATE_PATTERN = Pattern.compile("(\\d+)(?:/(\\d+))?");
        CEA_608_ACCESSIBILITY_PATTERN = Pattern.compile("CC([1-4])=.*");
        CEA_708_ACCESSIBILITY_PATTERN = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
        MPEG_CHANNEL_CONFIGURATION_MAPPING = new int[]{-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
        int i = b + 21;
        e = i % 128;
        int i2 = i % 2;
    }

    public DashManifestParser() {
        try {
            this.xmlParserFactory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public DashManifest parse(Uri uri, InputStream inputStream) {
        int i = 2 % 2;
        int i2 = b + 53;
        e = i2 % 128;
        int i3 = i2 % 2;
        try {
            XmlPullParser newPullParser = this.xmlParserFactory.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2) {
                int i4 = e + 35;
                b = i4 % 128;
                int i5 = i4 % 2;
                if (!(!"MPD".equals(newPullParser.getName()))) {
                    return parseMediaPresentationDescription(newPullParser, uri);
                }
            }
            throw ParserException.createForMalformedManifest("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            throw ParserException.createForMalformedManifest(null, e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected androidx.media3.exoplayer.dash.manifest.DashManifest parseMediaPresentationDescription(org.xmlpull.v1.XmlPullParser r48, android.net.Uri r49) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.parseMediaPresentationDescription(org.xmlpull.v1.XmlPullParser, android.net.Uri):androidx.media3.exoplayer.dash.manifest.DashManifest");
    }

    protected DashManifest buildMediaPresentationDescription(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, ProgramInformation programInformation, UtcTimingElement utcTimingElement, ServiceDescriptionElement serviceDescriptionElement, Uri uri, List<Period> list) {
        int i = 2 % 2;
        DashManifest dashManifest = new DashManifest(j, j2, j3, z, j4, j5, j6, j7, programInformation, utcTimingElement, serviceDescriptionElement, uri, list);
        int i2 = e + 87;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return dashManifest;
        }
        throw null;
    }

    protected UtcTimingElement parseUtcTiming(XmlPullParser xmlPullParser) {
        int i = 2 % 2;
        int i2 = e + 123;
        b = i2 % 128;
        int i3 = i2 % 2;
        UtcTimingElement buildUtcTimingElement = buildUtcTimingElement(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
        int i4 = b + 99;
        e = i4 % 128;
        int i5 = i4 % 2;
        return buildUtcTimingElement;
    }

    protected UtcTimingElement buildUtcTimingElement(String str, String str2) {
        int i = 2 % 2;
        UtcTimingElement utcTimingElement = new UtcTimingElement(str, str2);
        int i2 = e + 63;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return utcTimingElement;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e A[LOOP:0: B:3:0x0013->B:15:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement parseServiceDescription(org.xmlpull.v1.XmlPullParser r24) {
        /*
            r23 = this;
            r0 = r24
            r1 = 2
            int r2 = r1 % r1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r3
            r7 = r5
            r9 = r7
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L13:
            r24.next()
            java.lang.String r13 = "Latency"
            boolean r13 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r0, r13)
            r14 = 1
            r13 = r13 ^ r14
            java.lang.String r15 = "max"
            java.lang.String r2 = "min"
            if (r13 == r14) goto L3f
            java.lang.String r5 = "target"
            long r5 = parseLong(r0, r5, r3)
            long r7 = parseLong(r0, r2, r3)
            long r9 = parseLong(r0, r15, r3)
        L32:
            r15 = r5
            r17 = r7
            r19 = r9
            r21 = r11
            r22 = r12
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L6f
        L3f:
            java.lang.String r13 = "PlaybackRate"
            boolean r13 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r0, r13)
            if (r13 == r14) goto L48
            goto L32
        L48:
            int r11 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.b
            int r11 = r11 + 45
            int r12 = r11 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.e = r12
            int r11 = r11 % r1
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            float r2 = parseFloat(r0, r2, r11)
            float r12 = parseFloat(r0, r15, r11)
            int r13 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.b
            int r13 = r13 + 29
            int r14 = r13 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.e = r14
            int r13 = r13 % 2
            r21 = r2
            r15 = r5
            r17 = r7
            r19 = r9
            r22 = r12
        L6f:
            java.lang.String r2 = "ServiceDescription"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.isEndTag(r0, r2)
            if (r2 == 0) goto L7e
            androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement r0 = new androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement
            r14 = r0
            r14.<init>(r15, r17, r19, r21, r22)
            return r0
        L7e:
            r5 = r15
            r7 = r17
            r9 = r19
            r11 = r21
            r12 = r22
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.parseServiceDescription(org.xmlpull.v1.XmlPullParser):androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
        r18 = r0;
        r17 = r2;
        r20 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (r43 != (-9223372036854775807L)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
        if (r43 != (-9223372036854775807L)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
        r18 = r0;
        r17 = r2;
        r20 = r43 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected android.util.Pair<androidx.media3.exoplayer.dash.manifest.Period, java.lang.Long> parsePeriod(org.xmlpull.v1.XmlPullParser r37, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> r38, long r39, long r41, long r43, long r45, boolean r47) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.parsePeriod(org.xmlpull.v1.XmlPullParser, java.util.List, long, long, long, long, boolean):android.util.Pair");
    }

    protected Period buildPeriod(String str, long j, List<AdaptationSet> list, List<EventStream> list2, Descriptor descriptor) {
        int i = 2 % 2;
        Period period = new Period(str, j, list, list2, descriptor);
        int i2 = e + 107;
        b = i2 % 128;
        int i3 = i2 % 2;
        return period;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0389 A[LOOP:0: B:3:0x0082->B:81:0x0389, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0349 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected androidx.media3.exoplayer.dash.manifest.AdaptationSet parseAdaptationSet(org.xmlpull.v1.XmlPullParser r59, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> r60, androidx.media3.exoplayer.dash.manifest.SegmentBase r61, long r62, long r64, long r66, long r68, long r70, boolean r72) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.parseAdaptationSet(org.xmlpull.v1.XmlPullParser, java.util.List, androidx.media3.exoplayer.dash.manifest.SegmentBase, long, long, long, long, long, boolean):androidx.media3.exoplayer.dash.manifest.AdaptationSet");
    }

    protected AdaptationSet buildAdaptationSet(long j, int i, List<Representation> list, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4) {
        int i2 = 2 % 2;
        AdaptationSet adaptationSet = new AdaptationSet(j, i, list, list2, list3, list4);
        int i3 = e + 51;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 7 / 0;
        }
        return adaptationSet;
    }

    protected int parseContentType(XmlPullParser xmlPullParser) {
        int i = 2 % 2;
        int i2 = e + 47;
        b = i2 % 128;
        int i3 = i2 % 2;
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (!TextUtils.isEmpty(attributeValue)) {
            if ("audio".equals(attributeValue)) {
                return 1;
            }
            if ("video".equals(attributeValue)) {
                int i4 = e + 43;
                b = i4 % 128;
                int i5 = i4 % 2;
                return 2;
            } else if ("text".equals(attributeValue)) {
                return 3;
            } else {
                if ("image".equals(attributeValue)) {
                    int i6 = e + 65;
                    b = i6 % 128;
                    return i6 % 2 == 0 ? 5 : 4;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected android.util.Pair<java.lang.String, androidx.media3.common.DrmInitData.SchemeData> parseContentProtection(org.xmlpull.v1.XmlPullParser r12) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.parseContentProtection(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    protected void parseAdaptationSetChild(XmlPullParser xmlPullParser) {
        int i = 2 % 2;
        int i2 = b + 73;
        e = i2 % 128;
        int i3 = i2 % 2;
        maybeSkipTag(xmlPullParser);
        int i4 = e + 23;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0241 A[LOOP:0: B:3:0x006f->B:65:0x0241, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected androidx.media3.exoplayer.dash.manifest.DashManifestParser.RepresentationInfo parseRepresentation(org.xmlpull.v1.XmlPullParser r40, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> r41, java.lang.String r42, java.lang.String r43, int r44, int r45, float r46, int r47, int r48, java.lang.String r49, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r50, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r51, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r52, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r53, androidx.media3.exoplayer.dash.manifest.SegmentBase r54, long r55, long r57, long r59, long r61, long r63, boolean r65) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.parseRepresentation(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, androidx.media3.exoplayer.dash.manifest.SegmentBase, long, long, long, long, long, boolean):androidx.media3.exoplayer.dash.manifest.DashManifestParser$RepresentationInfo");
    }

    protected Format buildFormat(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, List<Descriptor> list, List<Descriptor> list2, String str4, List<Descriptor> list3, List<Descriptor> list4) {
        int i6;
        int i7;
        int i8 = 2 % 2;
        String str5 = str4;
        String sampleMimeType = getSampleMimeType(str2, str5);
        if ("audio/eac3".equals(sampleMimeType)) {
            sampleMimeType = parseEac3SupplementalProperties(list4);
            if ("audio/eac3-joc".equals(sampleMimeType)) {
                str5 = "ec+3";
            }
        }
        int parseSelectionFlagsFromRoleDescriptors = parseSelectionFlagsFromRoleDescriptors(list);
        int parseRoleFlagsFromRoleDescriptors = parseRoleFlagsFromRoleDescriptors(list);
        int parseRoleFlagsFromAccessibilityDescriptors = parseRoleFlagsFromAccessibilityDescriptors(list2);
        int parseRoleFlagsFromProperties = parseRoleFlagsFromProperties(list3);
        int parseRoleFlagsFromProperties2 = parseRoleFlagsFromProperties(list4);
        Pair<Integer, Integer> parseTileCountFromProperties = parseTileCountFromProperties(list3);
        Format.Builder language = new Format.Builder().setId(str).setContainerMimeType(str2).setSampleMimeType(sampleMimeType).setCodecs(str5).setPeakBitrate(i5).setSelectionFlags(parseSelectionFlagsFromRoleDescriptors).setRoleFlags(parseRoleFlagsFromRoleDescriptors | parseRoleFlagsFromAccessibilityDescriptors | parseRoleFlagsFromProperties | parseRoleFlagsFromProperties2).setLanguage(str3);
        int i9 = -1;
        Object obj = null;
        if (parseTileCountFromProperties != null) {
            int i10 = b + 111;
            e = i10 % 128;
            if (i10 % 2 != 0) {
                ((Integer) parseTileCountFromProperties.first).intValue();
                obj.hashCode();
                throw null;
            }
            i6 = ((Integer) parseTileCountFromProperties.first).intValue();
        } else {
            int i11 = b + 91;
            e = i11 % 128;
            int i12 = i11 % 2;
            i6 = -1;
        }
        Format.Builder tileCountHorizontal = language.setTileCountHorizontal(i6);
        if (parseTileCountFromProperties != null) {
            int i13 = b + 63;
            e = i13 % 128;
            int i14 = i13 % 2;
            i7 = ((Integer) parseTileCountFromProperties.second).intValue();
        } else {
            i7 = -1;
        }
        Format.Builder tileCountVertical = tileCountHorizontal.setTileCountVertical(i7);
        if (MimeTypes.isVideo(sampleMimeType)) {
            tileCountVertical.setWidth(i).setHeight(i2).setFrameRate(f);
            int i15 = b + 105;
            e = i15 % 128;
            int i16 = i15 % 2;
        } else if (!(!MimeTypes.isAudio(sampleMimeType))) {
            tileCountVertical.setChannelCount(i3).setSampleRate(i4);
        } else if (MimeTypes.isText(sampleMimeType)) {
            if (!"application/cea-608".equals(sampleMimeType)) {
                if ("application/cea-708".equals(sampleMimeType)) {
                    int i17 = e + 93;
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    i9 = parseCea708AccessibilityChannel(list2);
                }
            } else {
                int i19 = b + 81;
                e = i19 % 128;
                if (i19 % 2 != 0) {
                    parseCea608AccessibilityChannel(list2);
                    obj.hashCode();
                    throw null;
                }
                i9 = parseCea608AccessibilityChannel(list2);
            }
            tileCountVertical.setAccessibilityChannel(i9);
            int i20 = b + 61;
            e = i20 % 128;
            int i21 = i20 % 2;
        } else if (MimeTypes.isImage(sampleMimeType)) {
            int i22 = b + 69;
            e = i22 % 128;
            int i23 = i22 % 2;
            tileCountVertical.setWidth(i).setHeight(i2);
        }
        return tileCountVertical.build();
    }

    protected Representation buildRepresentation(RepresentationInfo representationInfo, String str, String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2) {
        int i = 2 % 2;
        int i2 = e + 3;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            representationInfo.format.buildUpon();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Format.Builder buildUpon = representationInfo.format.buildUpon();
        if (str != null) {
            buildUpon.setLabel(str);
        }
        String str3 = representationInfo.drmSchemeType;
        if (str3 == null) {
            str3 = str2;
        } else {
            int i3 = e + 109;
            b = i3 % 128;
            int i4 = i3 % 2;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = representationInfo.drmSchemeDatas;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            fillInClearKeyInformation(arrayList3);
            filterRedundantIncompleteSchemeDatas(arrayList3);
            buildUpon.setDrmInitData(new DrmInitData(str3, arrayList3));
        }
        ArrayList<Descriptor> arrayList4 = representationInfo.inbandEventStreams;
        arrayList4.addAll(arrayList2);
        return Representation.newInstance(representationInfo.revisionId, buildUpon.build(), representationInfo.baseUrls, representationInfo.segmentBase, arrayList4, representationInfo.essentialProperties, representationInfo.supplementalProperties, null);
    }

    protected SegmentBase.SingleSegmentBase parseSegmentBase(XmlPullParser xmlPullParser, SegmentBase.SingleSegmentBase singleSegmentBase) {
        long j;
        long j2;
        long j3;
        int i = 2 % 2;
        if (singleSegmentBase != null) {
            j = singleSegmentBase.timescale;
            int i2 = b + 103;
            e = i2 % 128;
            int i3 = i2 % 2;
        } else {
            j = 1;
        }
        long parseLong = parseLong(xmlPullParser, "timescale", j);
        long j4 = 0;
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", singleSegmentBase != null ? singleSegmentBase.presentationTimeOffset : 0L);
        long j5 = singleSegmentBase != null ? singleSegmentBase.indexStart : 0L;
        if (singleSegmentBase != null) {
            j4 = singleSegmentBase.indexLength;
            int i4 = b + 17;
            e = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 5;
            }
        }
        RangedUri rangedUri = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j3 = Long.parseLong(split[0]);
            j2 = (Long.parseLong(split[1]) - j3) + 1;
        } else {
            j2 = j4;
            j3 = j5;
        }
        if (singleSegmentBase != null) {
            int i6 = e + 77;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                rangedUri = singleSegmentBase.initialization;
                int i7 = 0 / 0;
            } else {
                rangedUri = singleSegmentBase.initialization;
            }
        }
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                rangedUri = parseInitialization(xmlPullParser);
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentBase"));
        return buildSingleSegmentBase(rangedUri, parseLong, parseLong2, j3, j2);
    }

    protected SegmentBase.SingleSegmentBase buildSingleSegmentBase(RangedUri rangedUri, long j, long j2, long j3, long j4) {
        int i = 2 % 2;
        SegmentBase.SingleSegmentBase singleSegmentBase = new SegmentBase.SingleSegmentBase(rangedUri, j, j2, j3, j4);
        int i2 = e + 51;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return singleSegmentBase;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected SegmentBase.SegmentList parseSegmentList(XmlPullParser xmlPullParser, SegmentBase.SegmentList segmentList, long j, long j2, long j3, long j4, long j5) {
        long j6;
        ArrayList arrayList;
        int i = 2 % 2;
        long j7 = 1;
        if (segmentList != null) {
            int i2 = e + 3;
            b = i2 % 128;
            int i3 = i2 % 2;
            j6 = segmentList.timescale;
        } else {
            int i4 = e + 55;
            b = i4 % 128;
            int i5 = i4 % 2;
            j6 = 1;
        }
        long parseLong = parseLong(xmlPullParser, "timescale", j6);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", segmentList != null ? segmentList.presentationTimeOffset : 0L);
        long parseLong3 = parseLong(xmlPullParser, "duration", segmentList != null ? segmentList.duration : -9223372036854775807L);
        if (segmentList != null) {
            int i6 = b + 101;
            e = i6 % 128;
            int i7 = i6 % 2;
            j7 = segmentList.startNumber;
        }
        long parseLong4 = parseLong(xmlPullParser, "startNumber", j7);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j3, j4);
        Object obj = null;
        List<SegmentBase.SegmentTimelineElement> list = null;
        ArrayList arrayList2 = null;
        RangedUri rangedUri = null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                rangedUri = parseInitialization(xmlPullParser);
                int i8 = b + 27;
                e = i8 % 128;
                int i9 = i8 % 2;
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                list = parseSegmentTimeline(xmlPullParser, parseLong, j2);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentURL")) {
                int i10 = b + 83;
                e = i10 % 128;
                if (i10 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(parseSegmentUrl(xmlPullParser));
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentList"));
        if (segmentList != null) {
            if (rangedUri == null) {
                rangedUri = segmentList.initialization;
            }
            if (list != null) {
                int i11 = b + 125;
                e = i11 % 128;
                int i12 = i11 % 2;
            } else {
                list = segmentList.segmentTimeline;
            }
            if (arrayList2 == null) {
                arrayList = segmentList.mediaSegments;
                return buildSegmentList(rangedUri, parseLong, parseLong2, parseLong4, parseLong3, list, finalAvailabilityTimeOffset, arrayList, j5, j);
            }
        }
        arrayList = arrayList2;
        return buildSegmentList(rangedUri, parseLong, parseLong2, parseLong4, parseLong3, list, finalAvailabilityTimeOffset, arrayList, j5, j);
    }

    protected SegmentBase.SegmentList buildSegmentList(RangedUri rangedUri, long j, long j2, long j3, long j4, List<SegmentBase.SegmentTimelineElement> list, long j5, List<RangedUri> list2, long j6, long j7) {
        int i = 2 % 2;
        SegmentBase.SegmentList segmentList = new SegmentBase.SegmentList(rangedUri, j, j2, j3, j4, list, j5, list2, Util.msToUs(j6), Util.msToUs(j7));
        int i2 = b + 51;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            return segmentList;
        }
        throw null;
    }

    protected SegmentBase.SegmentTemplate parseSegmentTemplate(XmlPullParser xmlPullParser, SegmentBase.SegmentTemplate segmentTemplate, List<Descriptor> list, long j, long j2, long j3, long j4, long j5) {
        long j6;
        int i = 2 % 2;
        int i2 = e + 37;
        b = i2 % 128;
        int i3 = i2 % 2;
        long parseLong = parseLong(xmlPullParser, "timescale", segmentTemplate != null ? segmentTemplate.timescale : 1L);
        if (segmentTemplate != null) {
            int i4 = e + 81;
            b = i4 % 128;
            int i5 = i4 % 2;
            j6 = segmentTemplate.presentationTimeOffset;
        } else {
            j6 = 0;
        }
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", j6);
        long parseLong3 = parseLong(xmlPullParser, "duration", segmentTemplate != null ? segmentTemplate.duration : -9223372036854775807L);
        long parseLong4 = parseLong(xmlPullParser, "startNumber", segmentTemplate != null ? segmentTemplate.startNumber : 1L);
        long parseLastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty(list);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j3, j4);
        List<SegmentBase.SegmentTimelineElement> list2 = null;
        UrlTemplate parseUrlTemplate = parseUrlTemplate(xmlPullParser, "media", segmentTemplate != null ? segmentTemplate.mediaTemplate : null);
        UrlTemplate parseUrlTemplate2 = parseUrlTemplate(xmlPullParser, "initialization", segmentTemplate != null ? segmentTemplate.initializationTemplate : null);
        RangedUri rangedUri = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                rangedUri = parseInitialization(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                int i6 = b + 77;
                e = i6 % 128;
                if (i6 % 2 != 0) {
                    list2 = parseSegmentTimeline(xmlPullParser, parseLong, j2);
                    int i7 = 51 / 0;
                } else {
                    list2 = parseSegmentTimeline(xmlPullParser, parseLong, j2);
                }
            } else {
                maybeSkipTag(xmlPullParser);
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTemplate")) {
                break;
            }
        }
        if (segmentTemplate != null) {
            if (rangedUri == null) {
                rangedUri = segmentTemplate.initialization;
            }
            if (list2 == null) {
                list2 = segmentTemplate.segmentTimeline;
            }
        }
        return buildSegmentTemplate(rangedUri, parseLong, parseLong2, parseLong4, parseLastSegmentNumberSupplementalProperty, parseLong3, list2, finalAvailabilityTimeOffset, parseUrlTemplate2, parseUrlTemplate, j5, j);
    }

    protected SegmentBase.SegmentTemplate buildSegmentTemplate(RangedUri rangedUri, long j, long j2, long j3, long j4, long j5, List<SegmentBase.SegmentTimelineElement> list, long j6, UrlTemplate urlTemplate, UrlTemplate urlTemplate2, long j7, long j8) {
        int i = 2 % 2;
        SegmentBase.SegmentTemplate segmentTemplate = new SegmentBase.SegmentTemplate(rangedUri, j, j2, j3, j4, j5, list, j6, urlTemplate, urlTemplate2, Util.msToUs(j7), Util.msToUs(j8));
        int i2 = e + 27;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return segmentTemplate;
        }
        throw null;
    }

    protected EventStream parseEventStream(XmlPullParser xmlPullParser) {
        ByteArrayOutputStream byteArrayOutputStream;
        ArrayList arrayList;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        String parseString = parseString(xmlPullParser, "schemeIdUri", "");
        String parseString2 = parseString(xmlPullParser, "value", "");
        long parseLong = parseLong(xmlPullParser, "timescale", 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (!XmlPullParserUtil.isStartTag(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                arrayList = arrayList2;
                maybeSkipTag(xmlPullParser);
                int i4 = e + 121;
                b = i4 % 128;
                i = 2;
                int i5 = i4 % 2;
            } else {
                int i6 = b + 93;
                e = i6 % 128;
                int i7 = i6 % i2;
                byteArrayOutputStream = byteArrayOutputStream2;
                arrayList = arrayList2;
                arrayList.add(parseEvent(xmlPullParser, parseString, parseString2, parseLong, parseLong2, byteArrayOutputStream));
                i = 2;
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            i2 = i;
        }
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            Pair pair = (Pair) arrayList.get(i8);
            jArr[i8] = ((Long) pair.first).longValue();
            eventMessageArr[i8] = (EventMessage) pair.second;
        }
        return buildEventStream(parseString, parseString2, parseLong, jArr, eventMessageArr);
    }

    protected EventStream buildEventStream(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        int i = 2 % 2;
        EventStream eventStream = new EventStream(str, str2, j, jArr, eventMessageArr);
        int i2 = b + 41;
        e = i2 % 128;
        int i3 = i2 % 2;
        return eventStream;
    }

    protected Pair<Long, EventMessage> parseEvent(XmlPullParser xmlPullParser, String str, String str2, long j, long j2, ByteArrayOutputStream byteArrayOutputStream) {
        int i = 2 % 2;
        int i2 = e + 117;
        b = i2 % 128;
        int i3 = i2 % 2;
        long parseLong = parseLong(xmlPullParser, SignupConstants.Field.LANG_ID, 0L);
        long parseLong2 = parseLong(xmlPullParser, "duration", -9223372036854775807L);
        long parseLong3 = parseLong(xmlPullParser, "presentationTime", 0L);
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(parseLong2, 1000L, j);
        long scaleLargeTimestamp2 = Util.scaleLargeTimestamp(parseLong3 - j2, 1000000L, j);
        Object obj = null;
        String parseString = parseString(xmlPullParser, "messageData", null);
        byte[] parseEventObject = parseEventObject(xmlPullParser, byteArrayOutputStream);
        if (parseString != null) {
            parseEventObject = Util.getUtf8Bytes(parseString);
        }
        byte[] bArr = parseEventObject;
        int i4 = e + 37;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return Pair.create(Long.valueOf(scaleLargeTimestamp2), buildEvent(str, str2, parseLong, scaleLargeTimestamp, bArr));
        }
        Pair.create(Long.valueOf(scaleLargeTimestamp2), buildEvent(str, str2, parseLong, scaleLargeTimestamp, bArr));
        obj.hashCode();
        throw null;
    }

    protected byte[] parseEventObject(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        int i = 2 % 2;
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, Charsets.UTF_8.name());
        xmlPullParser.nextToken();
        while (!XmlPullParserUtil.isEndTag(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    int i2 = e + 81;
                    b = i2 % 128;
                    int i3 = i2 % 2;
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i4 = 0; i4 < xmlPullParser.getAttributeCount(); i4++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i4), xmlPullParser.getAttributeName(i4), xmlPullParser.getAttributeValue(i4));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
            int i5 = e + 33;
            b = i5 % 128;
            int i6 = i5 % 2;
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    protected EventMessage buildEvent(String str, String str2, long j, long j2, byte[] bArr) {
        int i = 2 % 2;
        EventMessage eventMessage = new EventMessage(str, str2, j2, j, bArr);
        int i2 = b + 13;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 74 / 0;
        }
        return eventMessage;
    }

    protected List<SegmentBase.SegmentTimelineElement> parseSegmentTimeline(XmlPullParser xmlPullParser, long j, long j2) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        boolean z = false;
        int i2 = 0;
        long j4 = -9223372036854775807L;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "S")) {
                long parseLong = parseLong(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    int i3 = b + 27;
                    e = i3 % 128;
                    if (i3 % 2 != 0) {
                        j3 = addSegmentTimelineElementsToList(arrayList, j3, j4, i2, parseLong);
                        int i4 = 56 / 0;
                    } else {
                        j3 = addSegmentTimelineElementsToList(arrayList, j3, j4, i2, parseLong);
                    }
                }
                if (parseLong != -9223372036854775807L) {
                    int i5 = e + 37;
                    b = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    parseLong = j3;
                }
                j4 = parseLong(xmlPullParser, "d", -9223372036854775807L);
                i2 = parseInt(xmlPullParser, "r", 0);
                z = true;
                j3 = parseLong;
            } else {
                maybeSkipTag(xmlPullParser);
                int i7 = e + 15;
                b = i7 % 128;
                int i8 = i7 % 2;
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTimeline"));
        int i9 = b + 3;
        e = i9 % 128;
        if (i9 % 2 == 0) {
            if (z) {
                addSegmentTimelineElementsToList(arrayList, j3, j4, i2, Util.scaleLargeTimestamp(j2, j, 1000L));
            }
            return arrayList;
        }
        throw null;
    }

    private long addSegmentTimelineElementsToList(List<SegmentBase.SegmentTimelineElement> list, long j, long j2, int i, long j3) {
        int ceilDivide;
        int i2 = 2 % 2;
        int i3 = e + 103;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (i >= 0) {
            int i6 = i4 + 39;
            e = i6 % 128;
            ceilDivide = i6 % 2 != 0 ? i + 48 : i + 1;
        } else {
            ceilDivide = (int) Util.ceilDivide(j3 - j, j2);
        }
        for (int i7 = 0; i7 < ceilDivide; i7++) {
            list.add(buildSegmentTimelineElement(j, j2));
            j += j2;
        }
        int i8 = e + 117;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return j;
        }
        throw null;
    }

    protected SegmentBase.SegmentTimelineElement buildSegmentTimelineElement(long j, long j2) {
        int i = 2 % 2;
        SegmentBase.SegmentTimelineElement segmentTimelineElement = new SegmentBase.SegmentTimelineElement(j, j2);
        int i2 = e + 19;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 / 0;
        }
        return segmentTimelineElement;
    }

    protected UrlTemplate parseUrlTemplate(XmlPullParser xmlPullParser, String str, UrlTemplate urlTemplate) {
        int i = 2 % 2;
        int i2 = e + 89;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                UrlTemplate compile = UrlTemplate.compile(attributeValue);
                int i3 = b + 49;
                e = i3 % 128;
                int i4 = i3 % 2;
                return compile;
            }
            return urlTemplate;
        }
        xmlPullParser.getAttributeValue(null, str);
        obj.hashCode();
        throw null;
    }

    protected RangedUri parseInitialization(XmlPullParser xmlPullParser) {
        int i = 2 % 2;
        int i2 = e + 1;
        b = i2 % 128;
        int i3 = i2 % 2;
        RangedUri parseRangedUrl = parseRangedUrl(xmlPullParser, "sourceURL", "range");
        int i4 = b + 39;
        e = i4 % 128;
        int i5 = i4 % 2;
        return parseRangedUrl;
    }

    protected RangedUri parseSegmentUrl(XmlPullParser xmlPullParser) {
        int i = 2 % 2;
        int i2 = b + 67;
        e = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            parseRangedUrl(xmlPullParser, "media", "mediaRange");
            throw null;
        }
        RangedUri parseRangedUrl = parseRangedUrl(xmlPullParser, "media", "mediaRange");
        int i3 = e + 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return parseRangedUrl;
        }
        obj.hashCode();
        throw null;
    }

    protected RangedUri parseRangedUrl(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        int i = 2 % 2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j3 = 0;
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            long parseLong = Long.parseLong(split[0]);
            if (split.length == 2) {
                int i2 = e + 57;
                b = i2 % 128;
                j2 = i2 % 2 == 0 ? (Long.parseLong(split[1]) ^ parseLong) % 0 : (Long.parseLong(split[1]) - parseLong) + 1;
                j = parseLong;
                int i3 = e + 91;
                b = i3 % 128;
                int i4 = i3 % 2;
                return buildRangedUri(attributeValue, j, j2);
            }
            j3 = parseLong;
        }
        j = j3;
        j2 = -1;
        int i32 = e + 91;
        b = i32 % 128;
        int i42 = i32 % 2;
        return buildRangedUri(attributeValue, j, j2);
    }

    protected RangedUri buildRangedUri(String str, long j, long j2) {
        int i = 2 % 2;
        RangedUri rangedUri = new RangedUri(str, j, j2);
        int i2 = b + 111;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            return rangedUri;
        }
        throw null;
    }

    protected ProgramInformation parseProgramInformation(XmlPullParser xmlPullParser) {
        int i = 2 % 2;
        int i2 = b + 75;
        e = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            String parseString = parseString(xmlPullParser, "moreInformationURL", null);
            String parseString2 = parseString(xmlPullParser, "lang", null);
            String str = null;
            String str2 = null;
            String str3 = null;
            do {
                xmlPullParser.next();
                if (!XmlPullParserUtil.isStartTag(xmlPullParser, "Title")) {
                    if (XmlPullParserUtil.isStartTag(xmlPullParser, "Source")) {
                        str2 = xmlPullParser.nextText();
                        int i3 = b + 27;
                        e = i3 % 128;
                        int i4 = i3 % 2;
                    } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Copyright")) {
                        str3 = xmlPullParser.nextText();
                    } else {
                        maybeSkipTag(xmlPullParser);
                    }
                } else {
                    int i5 = e + 73;
                    b = i5 % 128;
                    if (i5 % 2 == 0) {
                        xmlPullParser.nextText();
                        obj.hashCode();
                        throw null;
                    }
                    str = xmlPullParser.nextText();
                }
            } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "ProgramInformation"));
            return new ProgramInformation(str, str2, str3, parseString, parseString2);
        }
        parseString(xmlPullParser, "moreInformationURL", null);
        parseString(xmlPullParser, "lang", null);
        throw null;
    }

    protected String parseLabel(XmlPullParser xmlPullParser) {
        int i = 2 % 2;
        int i2 = b + 41;
        e = i2 % 128;
        int i3 = i2 % 2;
        String parseText = parseText(xmlPullParser, "Label");
        int i4 = b + 25;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            return parseText;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r12 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        r1 = Integer.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r1 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        r1 = java.lang.Integer.parseInt(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> parseBaseUrl(org.xmlpull.v1.XmlPullParser r10, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> r11, boolean r12) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.e
            int r1 = r1 + 75
            int r2 = r1 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.b = r2
            int r1 = r1 % r0
            java.lang.String r2 = "dvb:priority"
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L1b
            java.lang.String r1 = r10.getAttributeValue(r5, r2)
            r2 = r3
            if (r1 == 0) goto L27
            goto L22
        L1b:
            java.lang.String r1 = r10.getAttributeValue(r5, r2)
            r2 = r4
            if (r1 == 0) goto L27
        L22:
            int r1 = java.lang.Integer.parseInt(r1)
            goto L2d
        L27:
            if (r12 == 0) goto L2b
            r1 = r4
            goto L2d
        L2b:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L2d:
            java.lang.String r6 = "dvb:weight"
            java.lang.String r6 = r10.getAttributeValue(r5, r6)
            if (r6 == 0) goto L39
            int r2 = java.lang.Integer.parseInt(r6)
        L39:
            java.lang.String r6 = "serviceLocation"
            java.lang.String r6 = r10.getAttributeValue(r5, r6)
            java.lang.String r7 = "BaseURL"
            java.lang.String r10 = parseText(r10, r7)
            boolean r7 = androidx.media3.common.util.UriUtil.isAbsolute(r10)
            if (r7 == 0) goto L73
            int r11 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.e
            int r11 = r11 + 25
            int r12 = r11 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.b = r12
            int r11 = r11 % r0
            if (r11 == 0) goto L72
            if (r6 != 0) goto L64
            int r12 = r12 + 105
            int r11 = r12 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.e = r11
            int r12 = r12 % r0
            if (r12 != 0) goto L63
            r6 = r10
            goto L64
        L63:
            throw r5
        L64:
            androidx.media3.exoplayer.dash.manifest.BaseUrl r11 = new androidx.media3.exoplayer.dash.manifest.BaseUrl
            r11.<init>(r10, r6, r1, r2)
            androidx.media3.exoplayer.dash.manifest.BaseUrl[] r10 = new androidx.media3.exoplayer.dash.manifest.BaseUrl[r4]
            r10[r3] = r11
            java.util.ArrayList r10 = com.google.common.collect.Lists.newArrayList(r10)
            return r10
        L72:
            throw r5
        L73:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L78:
            int r5 = r11.size()
            if (r3 >= r5) goto Lab
            int r5 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.e
            int r5 = r5 + 35
            int r7 = r5 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.b = r7
            int r5 = r5 % r0
            java.lang.Object r5 = r11.get(r3)
            androidx.media3.exoplayer.dash.manifest.BaseUrl r5 = (androidx.media3.exoplayer.dash.manifest.BaseUrl) r5
            java.lang.String r7 = r5.url
            java.lang.String r7 = androidx.media3.common.util.UriUtil.resolve(r7, r10)
            if (r6 != 0) goto L97
            r8 = r7
            goto L98
        L97:
            r8 = r6
        L98:
            if (r12 == 0) goto La0
            int r1 = r5.priority
            int r2 = r5.weight
            java.lang.String r8 = r5.serviceLocation
        La0:
            androidx.media3.exoplayer.dash.manifest.BaseUrl r5 = new androidx.media3.exoplayer.dash.manifest.BaseUrl
            r5.<init>(r7, r8, r1, r2)
            r4.add(r5)
            int r3 = r3 + 1
            goto L78
        Lab:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.parseBaseUrl(org.xmlpull.v1.XmlPullParser, java.util.List, boolean):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        if ("INF".equals(r5) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        return Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        r5 = java.lang.Float.parseFloat(r5) * 1000000.0f;
        r7 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.e + 59;
        androidx.media3.exoplayer.dash.manifest.DashManifestParser.b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        if ((r7 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r5 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r5 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected long parseAvailabilityTimeOffsetUs(org.xmlpull.v1.XmlPullParser r5, long r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.e
            int r1 = r1 + 57
            int r2 = r1 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.b = r2
            int r1 = r1 % r0
            java.lang.String r2 = "availabilityTimeOffset"
            r3 = 0
            if (r1 != 0) goto L1c
            java.lang.String r5 = r5.getAttributeValue(r3, r2)
            r1 = 85
            int r1 = r1 / 0
            if (r5 != 0) goto L23
            goto L22
        L1c:
            java.lang.String r5 = r5.getAttributeValue(r3, r2)
            if (r5 != 0) goto L23
        L22:
            return r6
        L23:
            java.lang.String r6 = "INF"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L31
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r5
        L31:
            float r5 = java.lang.Float.parseFloat(r5)
            r6 = 1232348160(0x49742400, float:1000000.0)
            float r5 = r5 * r6
            long r5 = (long) r5
            int r7 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.e
            int r7 = r7 + 59
            int r1 = r7 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.b = r1
            int r7 = r7 % r0
            if (r7 == 0) goto L46
            return r5
        L46:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.parseAvailabilityTimeOffsetUs(org.xmlpull.v1.XmlPullParser, long):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected int parseAudioChannelConfiguration(XmlPullParser xmlPullParser) {
        char c;
        int i = 2 % 2;
        int i2 = e + 87;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            String parseString = parseString(xmlPullParser, "schemeIdUri", null);
            parseString.hashCode();
            parseString.hashCode();
            obj.hashCode();
            throw null;
        }
        String parseString2 = parseString(xmlPullParser, "schemeIdUri", null);
        parseString2.hashCode();
        int i3 = -1;
        switch (parseString2.hashCode()) {
            case -2128649360:
                if (parseString2.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1352850286:
                if (parseString2.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1138141449:
                if (!parseString2.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    int i4 = b + 121;
                    e = i4 % 128;
                    int i5 = i4 % 2;
                    c = 65535;
                    break;
                } else {
                    c = 2;
                    break;
                }
            case -986633423:
                if (parseString2.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -79006963:
                if (parseString2.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 312179081:
                if (parseString2.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2036691300:
                if (parseString2.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c = 6;
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
            case 4:
                i3 = parseDtsChannelConfiguration(xmlPullParser);
                break;
            case 1:
                i3 = parseInt(xmlPullParser, "value", -1);
                break;
            case 2:
            case 6:
                i3 = parseDolbyChannelConfiguration(xmlPullParser);
                break;
            case 3:
                i3 = parseMpegChannelConfiguration(xmlPullParser);
                break;
            case 5:
                i3 = parseDtsxChannelConfiguration(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "AudioChannelConfiguration"));
        int i6 = b + 13;
        e = i6 % 128;
        int i7 = i6 % 2;
        return i3;
    }

    protected int parseSelectionFlagsFromRoleDescriptors(List<Descriptor> list) {
        int i = 2 % 2;
        int i2 = e + 111;
        b = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            Descriptor descriptor = list.get(i5);
            if (!(!Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri))) {
                i4 |= parseSelectionFlagsFromDashRoleScheme(descriptor.value);
                int i6 = b + 99;
                e = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return i4;
    }

    protected int parseSelectionFlagsFromDashRoleScheme(String str) {
        int i = 2 % 2;
        if (str == null) {
            int i2 = b + 101;
            e = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }
        if (!str.equals("forced_subtitle")) {
            int i4 = b + 9;
            e = i4 % 128;
            if (i4 % 2 != 0) {
                str.equals("forced-subtitle");
                throw null;
            } else if (!str.equals("forced-subtitle")) {
                int i5 = e + 15;
                b = i5 % 128;
                int i6 = i5 % 2;
                return 0;
            }
        }
        return 2;
    }

    protected int parseRoleFlagsFromRoleDescriptors(List<Descriptor> list) {
        int i = 2 % 2;
        int i2 = b + 107;
        e = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        int i5 = 0;
        while (i4 < list.size()) {
            Descriptor descriptor = list.get(i4);
            if (Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                int i6 = e + 89;
                b = i6 % 128;
                int i7 = i6 % 2;
                i5 |= parseRoleFlagsFromDashRoleScheme(descriptor.value);
            }
            i4++;
            int i8 = b + 15;
            e = i8 % 128;
            int i9 = i8 % 2;
        }
        return i5;
    }

    protected int parseRoleFlagsFromAccessibilityDescriptors(List<Descriptor> list) {
        int parseTvaAudioPurposeCsValue;
        int i = 2 % 2;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int i4 = e + 71;
            b = i4 % 128;
            int i5 = i4 % 2;
            Descriptor descriptor = list.get(i3);
            if (Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                int i6 = e + 71;
                b = i6 % 128;
                if (i6 % 2 != 0) {
                    parseTvaAudioPurposeCsValue = parseRoleFlagsFromDashRoleScheme(descriptor.value);
                    int i7 = e + 91;
                    b = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    parseRoleFlagsFromDashRoleScheme(descriptor.value);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            } else if (Ascii.equalsIgnoreCase("urn:tva:metadata:cs:AudioPurposeCS:2007", descriptor.schemeIdUri)) {
                int i9 = b + 81;
                e = i9 % 128;
                if (i9 % 2 != 0) {
                    parseTvaAudioPurposeCsValue = parseTvaAudioPurposeCsValue(descriptor.value);
                    int i10 = 7 / 0;
                } else {
                    parseTvaAudioPurposeCsValue = parseTvaAudioPurposeCsValue(descriptor.value);
                }
            }
            i2 |= parseTvaAudioPurposeCsValue;
            int i11 = e + 101;
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        return i2;
    }

    protected int parseRoleFlagsFromProperties(List<Descriptor> list) {
        int i = 2 % 2;
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            int i4 = b + 97;
            e = i4 % 128;
            int i5 = i4 % 2;
            if (Ascii.equalsIgnoreCase("http://dashif.org/guidelines/trickmode", list.get(i2).schemeIdUri)) {
                int i6 = e + 13;
                b = i6 % 128;
                i3 = i6 % 2 == 0 ? 18702 : i3 | 16384;
            }
            i2++;
            int i7 = e + 11;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        return i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a8, code lost:
        if (r8.equals("forced_subtitle") == false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected int parseRoleFlagsFromDashRoleScheme(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.parseRoleFlagsFromDashRoleScheme(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected int parseTvaAudioPurposeCsValue(String str) {
        char c;
        int i = 2 % 2;
        int i2 = b + 123;
        int i3 = i2 % 128;
        e = i3;
        int i4 = i2 % 2;
        if (str == null) {
            int i5 = i3 + 33;
            b = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
        switch (str.hashCode()) {
            case 49:
                Object[] objArr = new Object[1];
                c(null, 127, new byte[]{-127}, null, objArr);
                if (str.equals(((String) objArr[0]).intern())) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                if (str.equals("2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 51:
                if (str.equals("3")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 52:
                if (str.equals("4")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 53:
            default:
                c = 65535;
                break;
            case 54:
                if (str.equals("6")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            return 0;
                        }
                        int i7 = b + 51;
                        e = i7 % 128;
                        if (i7 % 2 == 0) {
                            return 1;
                        }
                        throw null;
                    }
                    return 8;
                }
                return 4;
            }
            return 2048;
        }
        return 512;
    }

    protected String[] parseProfiles(XmlPullParser xmlPullParser, String str, String[] strArr) {
        int i = 2 % 2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            int i2 = e + 9;
            int i3 = i2 % 128;
            b = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 47;
            e = i5 % 128;
            int i6 = i5 % 2;
            return strArr;
        }
        return attributeValue.split(",");
    }

    protected Pair<Integer, Integer> parseTileCountFromProperties(List<Descriptor> list) {
        String str;
        int i = 2 % 2;
        int i2 = e + 121;
        b = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int i5 = e + 85;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                Descriptor descriptor = list.get(i4);
                if ((Ascii.equalsIgnoreCase("http://dashif.org/thumbnail_tile", descriptor.schemeIdUri) || Ascii.equalsIgnoreCase("http://dashif.org/guidelines/thumbnail_tile", descriptor.schemeIdUri)) && (str = descriptor.value) != null) {
                    String[] split = Util.split(str, InteractiveAnimation.ANIMATION_TYPE.X);
                    if (split.length == 2) {
                        try {
                            return Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    }
                }
            } else {
                Ascii.equalsIgnoreCase("http://dashif.org/thumbnail_tile", list.get(i4).schemeIdUri);
                throw null;
            }
        }
        return null;
    }

    public static void maybeSkipTag(XmlPullParser xmlPullParser) {
        int i = 2 % 2;
        int i2 = b + 17;
        e = i2 % 128;
        int i3 = i2 % 2;
        if (!XmlPullParserUtil.isStartTag(xmlPullParser)) {
            int i4 = e + 45;
            b = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = 1;
        while (i6 != 0) {
            xmlPullParser.next();
            if (!(!XmlPullParserUtil.isStartTag(xmlPullParser))) {
                int i7 = e + 17;
                int i8 = i7 % 128;
                b = i8;
                int i9 = i7 % 2;
                i6++;
                int i10 = i8 + 45;
                e = i10 % 128;
                int i11 = i10 % 2;
            } else if (XmlPullParserUtil.isEndTag(xmlPullParser)) {
                i6--;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void filterRedundantIncompleteSchemeDatas(java.util.ArrayList<androidx.media3.common.DrmInitData.SchemeData> r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.b
            int r1 = r1 + 97
            int r2 = r1 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.e = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L14
            int r1 = r8.size()
            goto L19
        L14:
            int r1 = r8.size()
            int r1 = r1 - r2
        L19:
            r3 = 0
            if (r1 < 0) goto L79
            java.lang.Object r4 = r8.get(r1)
            androidx.media3.common.DrmInitData$SchemeData r4 = (androidx.media3.common.DrmInitData.SchemeData) r4
            boolean r5 = r4.hasData()
            if (r5 != 0) goto L76
            int r5 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.e
            int r5 = r5 + 67
            int r6 = r5 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.b = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L35
            r5 = r2
            goto L36
        L35:
            r5 = r3
        L36:
            int r6 = r8.size()
            if (r5 >= r6) goto L76
            int r6 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.e
            int r6 = r6 + r2
            int r7 = r6 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.b = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L56
            java.lang.Object r6 = r8.get(r5)
            androidx.media3.common.DrmInitData$SchemeData r6 = (androidx.media3.common.DrmInitData.SchemeData) r6
            boolean r6 = r6.canReplace(r4)
            r7 = 47
            int r7 = r7 / r3
            if (r6 == 0) goto L66
            goto L62
        L56:
            java.lang.Object r6 = r8.get(r5)
            androidx.media3.common.DrmInitData$SchemeData r6 = (androidx.media3.common.DrmInitData.SchemeData) r6
            boolean r6 = r6.canReplace(r4)
            if (r6 == 0) goto L66
        L62:
            r8.remove(r1)
            goto L76
        L66:
            int r5 = r5 + 1
            int r6 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.b
            int r6 = r6 + 89
            int r7 = r6 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.e = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L36
            int r6 = r0 / r0
            goto L36
        L76:
            int r1 = r1 + (-1)
            goto L19
        L79:
            int r8 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.e
            int r8 = r8 + 119
            int r1 = r8 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.b = r1
            int r8 = r8 % r0
            if (r8 != 0) goto L87
            r8 = 16
            int r8 = r8 / r3
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.filterRedundantIncompleteSchemeDatas(java.util.ArrayList):void");
    }

    private static void fillInClearKeyInformation(ArrayList<DrmInitData.SchemeData> arrayList) {
        String str;
        int i = 2 % 2;
        int i2 = e + 113;
        b = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (true) {
            if (i4 >= arrayList.size()) {
                int i5 = b + 51;
                e = i5 % 128;
                int i6 = i5 % 2;
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = arrayList.get(i4);
            if (C.CLEARKEY_UUID.equals(schemeData.uuid) && (str = schemeData.licenseServerUrl) != null) {
                int i7 = b + 117;
                e = i7 % 128;
                int i8 = i7 % 2;
                arrayList.remove(i4);
                break;
            }
            i4++;
        }
        if (str == null) {
            int i9 = b + 95;
            e = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int i12 = b + 61;
            e = i12 % 128;
            if (i12 % 2 != 0) {
                C.COMMON_PSSH_UUID.equals(arrayList.get(i11).uuid);
                throw null;
            }
            DrmInitData.SchemeData schemeData2 = arrayList.get(i11);
            if (C.COMMON_PSSH_UUID.equals(schemeData2.uuid) && schemeData2.licenseServerUrl == null) {
                arrayList.set(i11, new DrmInitData.SchemeData(C.CLEARKEY_UUID, str, schemeData2.mimeType, schemeData2.data));
            }
        }
    }

    private static String getSampleMimeType(String str, String str2) {
        int i = 2 % 2;
        if (MimeTypes.isAudio(str)) {
            return MimeTypes.getAudioMediaMimeType(str2);
        }
        if (!MimeTypes.isVideo(str)) {
            if (MimeTypes.isText(str)) {
                return str;
            }
            if (MimeTypes.isImage(str)) {
                int i2 = b + 21;
                e = i2 % 128;
                int i3 = i2 % 2;
                return str;
            } else if ("application/mp4".equals(str)) {
                int i4 = b + 13;
                e = i4 % 128;
                if (i4 % 2 != 0) {
                    String mediaMimeType = MimeTypes.getMediaMimeType(str2);
                    int i5 = 15 / 0;
                    if (!"text/vtt".equals(mediaMimeType)) {
                        return mediaMimeType;
                    }
                } else {
                    String mediaMimeType2 = MimeTypes.getMediaMimeType(str2);
                    if (!"text/vtt".equals(mediaMimeType2)) {
                        return mediaMimeType2;
                    }
                }
                int i6 = e + 115;
                b = i6 % 128;
                if (i6 % 2 != 0) {
                    return "application/x-mp4-vtt";
                }
                throw null;
            } else {
                return null;
            }
        }
        int i7 = e + 93;
        b = i7 % 128;
        int i8 = i7 % 2;
        String videoMediaMimeType = MimeTypes.getVideoMediaMimeType(str2);
        int i9 = e + 17;
        b = i9 % 128;
        int i10 = i9 % 2;
        return videoMediaMimeType;
    }

    private static String checkLanguageConsistency(String str, String str2) {
        int i = 2 % 2;
        if (str != null) {
            if (str2 == null) {
                return str;
            }
            Assertions.checkState(str.equals(str2));
            return str;
        }
        int i2 = b + 65;
        int i3 = i2 % 128;
        e = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 47;
        b = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r7 != (-1)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r6 != r7) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        r1 = r1 + 95;
        androidx.media3.exoplayer.dash.manifest.DashManifestParser.b = r1 % 128;
        r1 = r1 % 2;
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        androidx.media3.common.util.Assertions.checkState(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r6 == (-1)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r6 == (-1)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        r3 = r3 + 47;
        androidx.media3.exoplayer.dash.manifest.DashManifestParser.e = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int checkContentTypeConsistency(int r6, int r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.e
            int r2 = r1 + 33
            int r3 = r2 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.b = r3
            int r2 = r2 % r0
            r4 = 0
            r5 = -1
            if (r2 != 0) goto L16
            r2 = 60
            int r2 = r2 / r4
            if (r6 != r5) goto L20
            goto L18
        L16:
            if (r6 != r5) goto L20
        L18:
            int r3 = r3 + 47
            int r6 = r3 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.e = r6
            int r3 = r3 % r0
            return r7
        L20:
            if (r7 != r5) goto L23
            return r6
        L23:
            if (r6 != r7) goto L2d
            int r1 = r1 + 95
            int r7 = r1 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.b = r7
            int r1 = r1 % r0
            r4 = 1
        L2d:
            androidx.media3.common.util.Assertions.checkState(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.checkContentTypeConsistency(int, int):int");
    }

    protected static Descriptor parseDescriptor(XmlPullParser xmlPullParser, String str) {
        int i = 2 % 2;
        int i2 = e + 35;
        b = i2 % 128;
        int i3 = i2 % 2;
        String parseString = parseString(xmlPullParser, "schemeIdUri", "");
        Object obj = null;
        String parseString2 = parseString(xmlPullParser, "value", null);
        String parseString3 = parseString(xmlPullParser, SignupConstants.Field.LANG_ID, null);
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        Descriptor descriptor = new Descriptor(parseString, parseString2, parseString3);
        int i4 = e + 103;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return descriptor;
        }
        obj.hashCode();
        throw null;
    }

    protected static int parseCea608AccessibilityChannel(List<Descriptor> list) {
        String str;
        int i = 2 % 2;
        int i2 = e + 77;
        b = i2 % 128;
        for (int i3 = i2 % 2 == 0 ? 1 : 0; i3 < list.size(); i3++) {
            int i4 = b + 17;
            e = i4 % 128;
            if (i4 % 2 != 0) {
                "urn:scte:dash:cc:cea-608:2015".equals(list.get(i3).schemeIdUri);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Descriptor descriptor = list.get(i3);
            if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = CEA_608_ACCESSIBILITY_PATTERN.matcher(str);
                if (matcher.matches()) {
                    int i5 = b + 41;
                    e = i5 % 128;
                    int i6 = i5 % 2;
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int i7 = e + 41;
                    b = i7 % 128;
                    int i8 = i7 % 2;
                    return parseInt;
                }
                Log.w("MpdParser", "Unable to parse CEA-608 channel number from: " + descriptor.value);
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static int parseCea708AccessibilityChannel(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            r2 = r1
        L5:
            int r3 = r8.size()
            if (r2 >= r3) goto L8a
            int r3 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.b
            int r3 = r3 + 99
            int r4 = r3 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.e = r4
            int r3 = r3 % r0
            java.lang.String r4 = "urn:scte:dash:cc:cea-708:2015"
            r5 = 1
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r8.get(r2)
            androidx.media3.exoplayer.dash.manifest.Descriptor r3 = (androidx.media3.exoplayer.dash.manifest.Descriptor) r3
            java.lang.String r6 = r3.schemeIdUri
            boolean r4 = r4.equals(r6)
            r6 = 28
            int r6 = r6 / r1
            r4 = r4 ^ r5
            if (r4 == 0) goto L3a
            goto L86
        L2c:
            java.lang.Object r3 = r8.get(r2)
            androidx.media3.exoplayer.dash.manifest.Descriptor r3 = (androidx.media3.exoplayer.dash.manifest.Descriptor) r3
            java.lang.String r6 = r3.schemeIdUri
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L86
        L3a:
            int r4 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.e
            int r4 = r4 + 51
            int r6 = r4 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.b = r6
            int r4 = r4 % r0
            java.lang.String r4 = r3.value
            if (r4 == 0) goto L86
            int r6 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.b
            int r6 = r6 + 35
            int r7 = r6 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.e = r7
            int r6 = r6 % r0
            java.util.regex.Pattern r6 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.CEA_708_ACCESSIBILITY_PATTERN
            java.util.regex.Matcher r4 = r6.matcher(r4)
            boolean r6 = r4.matches()
            if (r6 == 0) goto L6e
            java.lang.String r8 = r4.group(r5)
            int r8 = java.lang.Integer.parseInt(r8)
            int r1 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.e
            int r1 = r1 + 9
            int r2 = r1 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.b = r2
            int r1 = r1 % r0
            return r8
        L6e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unable to parse CEA-708 service block number from: "
            r4.append(r5)
            java.lang.String r3 = r3.value
            r4.append(r3)
            java.lang.String r3 = "MpdParser"
            java.lang.String r4 = r4.toString()
            androidx.media3.common.util.Log.w(r3, r4)
        L86:
            int r2 = r2 + 1
            goto L5
        L8a:
            r8 = -1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.parseCea708AccessibilityChannel(java.util.List):int");
    }

    protected static String parseEac3SupplementalProperties(List<Descriptor> list) {
        int i = 2 % 2;
        int i2 = b + 67;
        e = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < list.size(); i4++) {
            Descriptor descriptor = list.get(i4);
            String str = descriptor.schemeIdUri;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str)) {
                int i5 = e + 33;
                b = i5 % 128;
                int i6 = i5 % 2;
                if (!(!"JOC".equals(descriptor.value))) {
                    int i7 = b + 87;
                    e = i7 % 128;
                    int i8 = i7 % 2;
                    return "audio/eac3-joc";
                }
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(descriptor.value)) {
                int i72 = b + 87;
                e = i72 % 128;
                int i82 = i72 % 2;
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    protected static float parseFrameRate(XmlPullParser xmlPullParser, float f) {
        String group;
        int i = 2 % 2;
        int i2 = b + NetflixImageView.DEFAULT_LAYER_GRAVITY;
        e = i2 % 128;
        int i3 = i2 % 2;
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            int i4 = b + 93;
            e = i4 % 128;
            int i5 = i4 % 2;
            Matcher matcher = FRAME_RATE_PATTERN.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                f = parseInt;
                if (!TextUtils.isEmpty(matcher.group(2))) {
                    f /= Integer.parseInt(group);
                }
            }
        }
        int i6 = e + 111;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return f;
        }
        throw null;
    }

    protected static long parseDuration(XmlPullParser xmlPullParser, String str, long j) {
        int i = 2 % 2;
        int i2 = e + 99;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            xmlPullParser.getAttributeValue(null, str);
            obj.hashCode();
            throw null;
        }
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        long parseXsDuration = Util.parseXsDuration(attributeValue);
        int i3 = b + 7;
        e = i3 % 128;
        if (i3 % 2 == 0) {
            return parseXsDuration;
        }
        obj.hashCode();
        throw null;
    }

    protected static long parseDateTime(XmlPullParser xmlPullParser, String str, long j) {
        int i = 2 % 2;
        int i2 = e + 15;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            xmlPullParser.getAttributeValue(null, str);
            throw null;
        }
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            int i3 = e + 71;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 0;
            }
            return j;
        }
        return Util.parseXsDateTime(attributeValue);
    }

    protected static String parseText(XmlPullParser xmlPullParser, String str) {
        int i = 2 % 2;
        int i2 = b + 113;
        int i3 = i2 % 128;
        e = i3;
        int i4 = i2 % 2;
        String str2 = "";
        int i5 = i3 + 7;
        b = i5 % 128;
        int i6 = i5 % 2;
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return str2;
    }

    protected static int parseInt(XmlPullParser xmlPullParser, String str, int i) {
        int i2 = 2 % 2;
        int i3 = e + 23;
        b = i3 % 128;
        int i4 = i3 % 2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return i;
        }
        int parseInt = Integer.parseInt(attributeValue);
        int i5 = b + 19;
        e = i5 % 128;
        int i6 = i5 % 2;
        return parseInt;
    }

    protected static long parseLong(XmlPullParser xmlPullParser, String str, long j) {
        int i = 2 % 2;
        int i2 = e + 89;
        b = i2 % 128;
        int i3 = i2 % 2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            j = Long.parseLong(attributeValue);
        }
        int i4 = e + 81;
        b = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    protected static float parseFloat(XmlPullParser xmlPullParser, String str, float f) {
        int i = 2 % 2;
        int i2 = b + 81;
        e = i2 % 128;
        int i3 = i2 % 2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            f = Float.parseFloat(attributeValue);
        }
        int i4 = e + 117;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return f;
    }

    protected static String parseString(XmlPullParser xmlPullParser, String str, String str2) {
        int i = 2 % 2;
        int i2 = b + 5;
        e = i2 % 128;
        int i3 = i2 % 2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            int i4 = e + 81;
            b = i4 % 128;
            int i5 = i4 % 2;
            return str2;
        }
        return attributeValue;
    }

    protected static int parseMpegChannelConfiguration(XmlPullParser xmlPullParser) {
        int i = 2 % 2;
        int parseInt = parseInt(xmlPullParser, "value", -1);
        if (parseInt >= 0) {
            int i2 = b;
            int i3 = i2 + 97;
            e = i3 % 128;
            int i4 = i3 % 2;
            int[] iArr = MPEG_CHANNEL_CONFIGURATION_MAPPING;
            if (parseInt < iArr.length) {
                int i5 = iArr[parseInt];
                int i6 = i2 + 99;
                e = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }
            return -1;
        }
        return -1;
    }

    protected static int parseDtsChannelConfiguration(XmlPullParser xmlPullParser) {
        int i = 2 % 2;
        int i2 = e + 9;
        b = i2 % 128;
        int i3 = -1;
        if (i2 % 2 == 0) {
            parseInt(xmlPullParser, "value", -1);
            throw null;
        }
        int parseInt = parseInt(xmlPullParser, "value", -1);
        if (parseInt > 0 && parseInt < 33) {
            i3 = parseInt;
        }
        int i4 = b + 13;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    protected static int parseDtsxChannelConfiguration(XmlPullParser xmlPullParser) {
        int i = 2 % 2;
        int i2 = b + 19;
        e = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            xmlPullParser.getAttributeValue(null, "value");
            obj.hashCode();
            throw null;
        }
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            int i3 = b + 11;
            e = i3 % 128;
            int i4 = i3 % 2;
            return -1;
        }
        int bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16));
        if (bitCount == 0) {
            return -1;
        }
        int i5 = e + 115;
        b = i5 % 128;
        int i6 = i5 % 2;
        return bitCount;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        r6 = com.google.common.base.Ascii.toLowerCase(r6);
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        switch(r6.hashCode()) {
            case 1596796: goto L27;
            case 2937391: goto L24;
            case 3094035: goto L21;
            case 3133436: goto L7;
            default: goto L29;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r6.equals("fa01") != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        r6 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.b + 107;
        androidx.media3.exoplayer.dash.manifest.DashManifestParser.e = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r6.equals("f801") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r6.equals("a000") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        if (r6.equals("4000") != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r2 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r2 == true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        if (r2 == true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        if (r2 == true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        return 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
        return 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007f, code lost:
        return 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r6 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r6 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        r6 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.e + 71;
        androidx.media3.exoplayer.dash.manifest.DashManifestParser.b = r6 % 128;
        r6 = r6 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static int parseDolbyChannelConfiguration(org.xmlpull.v1.XmlPullParser r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.b
            int r1 = r1 + 87
            int r2 = r1 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.e = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "value"
            r4 = 0
            r5 = -1
            if (r1 == 0) goto L1d
            java.lang.String r6 = r6.getAttributeValue(r4, r3)
            r1 = 57
            int r1 = r1 / r2
            if (r6 != 0) goto L2d
            goto L23
        L1d:
            java.lang.String r6 = r6.getAttributeValue(r4, r3)
            if (r6 != 0) goto L2d
        L23:
            int r6 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.e
            int r6 = r6 + 71
            int r1 = r6 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.b = r1
            int r6 = r6 % r0
            return r5
        L2d:
            java.lang.String r6 = com.google.common.base.Ascii.toLowerCase(r6)
            r6.hashCode()
            int r1 = r6.hashCode()
            r3 = 3
            r4 = 1
            switch(r1) {
                case 1596796: goto L68;
                case 2937391: goto L5d;
                case 3094035: goto L52;
                case 3133436: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L70
        L3e:
            java.lang.String r1 = "fa01"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L50
            int r6 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.b
            int r6 = r6 + 107
            int r1 = r6 % 128
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.e = r1
            int r6 = r6 % r0
            goto L70
        L50:
            r2 = r3
            goto L71
        L52:
            java.lang.String r1 = "f801"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L5b
            goto L70
        L5b:
            r2 = r0
            goto L71
        L5d:
            java.lang.String r1 = "a000"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L66
            goto L70
        L66:
            r2 = r4
            goto L71
        L68:
            java.lang.String r1 = "4000"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L71
        L70:
            r2 = r5
        L71:
            if (r2 == 0) goto L80
            if (r2 == r4) goto L7f
            if (r2 == r0) goto L7d
            if (r2 == r3) goto L7a
            return r5
        L7a:
            r6 = 8
            return r6
        L7d:
            r6 = 6
            return r6
        L7f:
            return r0
        L80:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.parseDolbyChannelConfiguration(org.xmlpull.v1.XmlPullParser):int");
    }

    protected static long parseLastSegmentNumberSupplementalProperty(List<Descriptor> list) {
        int i = 2 % 2;
        int i2 = e + 47;
        b = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < list.size()) {
            Descriptor descriptor = list.get(i4);
            if (!(!Ascii.equalsIgnoreCase("http://dashif.org/guidelines/last-segment-number", descriptor.schemeIdUri))) {
                int i5 = b + 27;
                e = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 8 / 0;
                    return Long.parseLong(descriptor.value);
                }
                return Long.parseLong(descriptor.value);
            }
            i4++;
            int i7 = e + 85;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        return -1L;
    }

    private boolean isDvbProfileDeclared(String[] strArr) {
        int i = 2 % 2;
        int i2 = e + 19;
        b = i2 % 128;
        int i3 = i2 % 2;
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        int i4 = e + 21;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static final class RepresentationInfo {
        public final ImmutableList<BaseUrl> baseUrls;
        public final ArrayList<DrmInitData.SchemeData> drmSchemeDatas;
        public final String drmSchemeType;
        public final List<Descriptor> essentialProperties;
        public final Format format;
        public final ArrayList<Descriptor> inbandEventStreams;
        public final long revisionId;
        public final SegmentBase segmentBase;
        public final List<Descriptor> supplementalProperties;

        public RepresentationInfo(Format format, List<BaseUrl> list, SegmentBase segmentBase, String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2, List<Descriptor> list2, List<Descriptor> list3, long j) {
            this.format = format;
            this.baseUrls = ImmutableList.copyOf((Collection) list);
            this.segmentBase = segmentBase;
            this.drmSchemeType = str;
            this.drmSchemeDatas = arrayList;
            this.inbandEventStreams = arrayList2;
            this.essentialProperties = list2;
            this.supplementalProperties = list3;
            this.revisionId = j;
        }
    }

    private static void c(int[] iArr, int i, byte[] bArr, char[] cArr, Object[] objArr) {
        char[] cArr2;
        int i2 = 2 % 2;
        C9572sD c9572sD = new C9572sD();
        char[] cArr3 = d$s16$789;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = $11 + 91;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    cArr4[i3] = (char) (cArr3[i3] % (-189645286263740190L));
                } else {
                    cArr4[i3] = (char) (cArr3[i3] ^ (-189645286263740190L));
                    i3++;
                }
            }
            cArr3 = cArr4;
        }
        int i5 = (int) ((-189645286263740190L) ^ a$s17$789);
        if (e$s20$789) {
            int i6 = $11 + 101;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                c9572sD.a = bArr.length;
                cArr2 = new char[c9572sD.a];
                c9572sD.e = 1;
            } else {
                c9572sD.a = bArr.length;
                cArr2 = new char[c9572sD.a];
                c9572sD.e = 0;
            }
            while (c9572sD.e < c9572sD.a) {
                cArr2[c9572sD.e] = (char) (cArr3[bArr[(c9572sD.a - 1) - c9572sD.e] + i] - i5);
                c9572sD.e++;
            }
            objArr[0] = new String(cArr2);
        } else if (b$s19$789) {
            c9572sD.a = cArr.length;
            char[] cArr5 = new char[c9572sD.a];
            c9572sD.e = 0;
            while (c9572sD.e < c9572sD.a) {
                int i7 = $10 + 109;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cArr5[c9572sD.e] = (char) (cArr3[cArr[(c9572sD.a - 1) - c9572sD.e] - i] - i5);
                c9572sD.e++;
            }
            objArr[0] = new String(cArr5);
        } else {
            c9572sD.a = iArr.length;
            char[] cArr6 = new char[c9572sD.a];
            c9572sD.e = 0;
            while (c9572sD.e < c9572sD.a) {
                int i9 = $10 + NetflixImageView.DEFAULT_LAYER_GRAVITY;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr6[c9572sD.e] = (char) (cArr3[iArr[(c9572sD.a - 1) - c9572sD.e] - i] - i5);
                c9572sD.e++;
            }
            String str = new String(cArr6);
            int i11 = $10 + 113;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            objArr[0] = str;
        }
    }
}
