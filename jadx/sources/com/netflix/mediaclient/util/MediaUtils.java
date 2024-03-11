package com.netflix.mediaclient.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.Arrays;
import java.util.List;
import o.C1044Mm;
import o.C4373bdL;
import o.TU;
import org.chromium.net.ConnectionSubtype;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"InlinedApi"})
@TargetApi(ConnectionSubtype.SUBTYPE_WIFI_B)
/* loaded from: classes5.dex */
public final class MediaUtils {
    private static final List<VideoDecoderClassifier> e = Arrays.asList(VideoDecoderClassifier.AVC_HP, VideoDecoderClassifier.HEVC, VideoDecoderClassifier.VP9, VideoDecoderClassifier.HEVC10, VideoDecoderClassifier.HDR10, VideoDecoderClassifier.AV1);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum VideoDecoderClassifier {
        AVC("video/avc", 2, 2048, 512, 1),
        AVC_HP("video/avc", 8, 2048, 512, JSONzip.end),
        VP9("video/x-vnd.on2.vp9", 1, 64, 32, 16),
        HEVC("video/hevc", 1, 1024, JSONzip.end, 64),
        HEVC10("video/hevc", 2, 1024, JSONzip.end, 64),
        HDR10("video/hevc", 4096, 1024, JSONzip.end, 64),
        AV1("video/av01", 2, JSONzip.end, 32, 1);
        
        private int f;
        private int i;
        private int l;
        private String m;

        /* renamed from: o  reason: collision with root package name */
        private int f13329o;

        VideoDecoderClassifier(String str, int i, int i2, int i3, int i4) {
            this.m = str;
            this.f13329o = i;
            this.f = i2;
            this.i = i3;
            this.l = i4;
        }
    }

    public static String e(TU tu) {
        JSONObject jSONObject = new JSONObject();
        for (VideoDecoderClassifier videoDecoderClassifier : e) {
            try {
                jSONObject.putOpt(videoDecoderClassifier.name(), a(videoDecoderClassifier, tu));
            } catch (JSONException e2) {
                C1044Mm.b("MediaUtils", e2, "Failed when adding to JSON.", new Object[0]);
            }
        }
        return jSONObject.toString();
    }

    private static MediaCodecInfo[] e() {
        return new MediaCodecList(1).getCodecInfos();
    }

    private static JSONArray a(VideoDecoderClassifier videoDecoderClassifier, TU tu) {
        MediaCodecInfo[] e2;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        JSONArray jSONArray = new JSONArray();
        for (MediaCodecInfo mediaCodecInfo : e()) {
            if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).indexOf(videoDecoderClassifier.m) >= 0 && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(videoDecoderClassifier.m)) != null && capabilitiesForType.isFeatureSupported("adaptive-playback")) {
                JSONObject a = a(mediaCodecInfo, videoDecoderClassifier);
                if (tu.b()) {
                    try {
                        a.putOpt("maxDecoderInstance", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                    } catch (JSONException unused) {
                    }
                }
                try {
                    JSONArray jSONArray2 = new JSONArray();
                    a.put("profileLevels", jSONArray2);
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("a", codecProfileLevel.profile);
                        jSONObject.put("level", codecProfileLevel.level);
                        jSONArray2.put(jSONObject);
                    }
                } catch (JSONException unused2) {
                }
                if (a != null) {
                    jSONArray.put(a);
                }
            }
        }
        return jSONArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static org.json.JSONObject a(android.media.MediaCodecInfo r8, com.netflix.mediaclient.util.MediaUtils.VideoDecoderClassifier r9) {
        /*
            java.lang.String r0 = com.netflix.mediaclient.util.MediaUtils.VideoDecoderClassifier.c(r9)
            android.media.MediaCodecInfo$CodecCapabilities r0 = r8.getCapabilitiesForType(r0)
            java.lang.String r1 = "secure-playback"
            boolean r1 = r0.isFeatureSupported(r1)
            boolean r2 = o.C8054ddD.a()
            r3 = 0
            if (r2 == 0) goto L1a
            boolean r2 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil$$ExternalSyntheticApiModelOutline1.m(r8)     // Catch: java.lang.Exception -> L1a
            goto L1b
        L1a:
            r2 = r3
        L1b:
            android.media.MediaCodecInfo$CodecProfileLevel[] r4 = r0.profileLevels
            int r5 = com.netflix.mediaclient.util.MediaUtils.VideoDecoderClassifier.d(r9)
            int r4 = b(r4, r5)
            int r5 = com.netflix.mediaclient.util.MediaUtils.VideoDecoderClassifier.e(r9)
            if (r4 < r5) goto L2d
            r9 = 3
            goto L3e
        L2d:
            int r5 = com.netflix.mediaclient.util.MediaUtils.VideoDecoderClassifier.b(r9)
            if (r4 < r5) goto L35
            r9 = 2
            goto L3e
        L35:
            int r9 = com.netflix.mediaclient.util.MediaUtils.VideoDecoderClassifier.a(r9)
            if (r4 < r9) goto L3d
            r9 = 1
            goto L3e
        L3d:
            r9 = r3
        L3e:
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()
            r4 = 0
            if (r0 == 0) goto L56
            r5 = 960(0x3c0, float:1.345E-42)
            r6 = 540(0x21c, float:7.57E-43)
            android.util.Range r5 = b(r0, r5, r6)
            r6 = 1920(0x780, float:2.69E-42)
            r7 = 1080(0x438, float:1.513E-42)
            android.util.Range r0 = b(r0, r6, r7)
            goto L58
        L56:
            r0 = r4
            r5 = r0
        L58:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r7 = "name"
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Exception -> L91
            org.json.JSONObject r8 = r6.putOpt(r7, r8)     // Catch: java.lang.Exception -> L91
            java.lang.String r7 = "securePlayback"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L91
            org.json.JSONObject r8 = r8.putOpt(r7, r1)     // Catch: java.lang.Exception -> L91
            java.lang.String r1 = "hdPlayback"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L91
            org.json.JSONObject r8 = r8.putOpt(r1, r9)     // Catch: java.lang.Exception -> L91
            java.lang.String r9 = "hdDecodeRange"
            org.json.JSONObject r8 = r8.putOpt(r9, r0)     // Catch: java.lang.Exception -> L91
            java.lang.String r9 = "sdDecodeRange"
            org.json.JSONObject r8 = r8.putOpt(r9, r5)     // Catch: java.lang.Exception -> L91
            java.lang.String r9 = "hwAccelerated"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L91
            r8.putOpt(r9, r0)     // Catch: java.lang.Exception -> L91
            return r6
        L91:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r0 = "MediaUtils"
            java.lang.String r1 = "Failed to add to JSON"
            o.C1044Mm.b(r0, r8, r1, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.util.MediaUtils.a(android.media.MediaCodecInfo, com.netflix.mediaclient.util.MediaUtils$VideoDecoderClassifier):org.json.JSONObject");
    }

    private static Range<Double> b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        try {
            return videoCapabilities.getAchievableFrameRatesFor(i, i2);
        } catch (Throwable th) {
            C1044Mm.b("MediaUtils", th, "Failed to get frame rate for width: " + i + ", height: " + i2, new Object[0]);
            return null;
        }
    }

    public static int b(MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr, int i) {
        int i2 = 0;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == i) {
                i2 = Math.max(i2, codecProfileLevel.level);
            }
        }
        return i2;
    }

    public static String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("EAC3", Boolean.valueOf(C4373bdL.c()));
            jSONObject.putOpt("EAC3_JOC", Boolean.valueOf(C4373bdL.a()));
        } catch (JSONException e2) {
            C1044Mm.b("MediaUtils", e2, "Failed when adding to JSON.", new Object[0]);
        }
        return jSONObject.toString();
    }
}
