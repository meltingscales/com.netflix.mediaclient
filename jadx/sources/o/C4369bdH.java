package o;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.util.MediaUtils;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import org.chromium.net.ConnectionSubtype;

/* renamed from: o.bdH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4369bdH implements MediaCodecSelector {
    private static boolean a = false;
    private static boolean b = false;
    private static boolean c = false;
    private static boolean d = false;
    private static final String e = "ExoVideoCodecSelector";
    private static boolean f = false;
    private static boolean g = false;
    private static boolean h = false;
    private static boolean i = false;
    private static boolean j = false;
    private static MediaCodecInfo k = null;
    private static MediaCodecInfo l = null;
    private static boolean m = false;
    private static boolean n = false;

    /* renamed from: o  reason: collision with root package name */
    private static boolean f13569o = false;
    private static boolean p = false;
    private static boolean q = false;

    static {
        c();
    }

    static void c() {
        m = d("video/x-vnd.on2.vp9");
        i = e("video/x-vnd.on2.vp9");
        g = e("video/hevc");
        if (aRA.j()) {
            g = q();
        } else {
            g = e("video/hevc");
        }
        l = b("video/x-vnd.on2.vp9");
        k = b("video/hevc");
        f13569o = d("video/x-vnd.on2.vp9", l, false);
        if (aRA.j()) {
            b = q();
        } else {
            b = d("video/hevc", k, false);
        }
        h = k();
        f = e("video/dolby-vision");
        j = m();
        boolean d2 = d("video/av01", (MediaCodecInfo) null, true);
        c = d2;
        d = d2 && e("video/av01");
        a = e("video/avc");
        n = e(false);
        p = e(true);
    }

    private static boolean e(boolean z) {
        try {
            for (MediaCodecInfo mediaCodecInfo : MediaCodecUtil.getDecoderInfos("video/avc", z, false)) {
                if (mediaCodecInfo.adaptive) {
                    int b2 = MediaUtils.b(mediaCodecInfo.getProfileLevels(), 8);
                    if (z) {
                        return b2 >= 2048;
                    } else if (b2 >= 256) {
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    private static boolean q() {
        return e("video/hevc") && e("video/hevc", 2, 2048);
    }

    private static boolean k() {
        return e("video/hevc") && e("video/hevc", 4096, 1024);
    }

    private static boolean m() {
        return e("video/av01") && e("video/av01", 8192, (int) JSONzip.end);
    }

    private static boolean e(String str, final int i2, final int i3) {
        MediaCodecInfo.CodecProfileLevel[] profileLevels;
        if (aRA.j()) {
            try {
                return MediaCodecUtil.getDecoderInfos(str, true, false).stream().anyMatch(new Predicate() { // from class: o.bdQ
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        boolean d2;
                        d2 = C4369bdH.d(i2, i3, (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) obj);
                        return d2;
                    }
                });
            } catch (MediaCodecUtil.DecoderQueryException e2) {
                C1044Mm.b(e, e2, "unable to query decoders", new Object[0]);
                return false;
            }
        }
        try {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : MediaCodecUtil.getDecoderInfo(str, true, false).getProfileLevels()) {
                if ((codecProfileLevel.profile & i2) != 0 && codecProfileLevel.level >= i3) {
                    return true;
                }
            }
        } catch (MediaCodecUtil.DecoderQueryException e3) {
            e3.printStackTrace();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(final int i2, final int i3, androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.adaptive && mediaCodecInfo.hardwareAccelerated && Arrays.stream(mediaCodecInfo.getProfileLevels()).anyMatch(new Predicate() { // from class: o.bdM
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean e2;
                e2 = C4369bdH.e(i2, i3, (MediaCodecInfo.CodecProfileLevel) obj);
                return e2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean e(int i2, int i3, MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
        return (i2 & codecProfileLevel.profile) != 0 && codecProfileLevel.level >= i3;
    }

    private static boolean e(String str) {
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return MediaCodecUtil.getDecoderInfo(str, true, false) != null;
    }

    private static androidx.media3.exoplayer.mediacodec.MediaCodecInfo b(String str) {
        try {
            List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> decoderInfos = MediaCodecUtil.getDecoderInfos(str, false, false);
            if (decoderInfos != null) {
                for (androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo : decoderInfos) {
                    if (mediaCodecInfo.name.toLowerCase().contains(".google.")) {
                        return mediaCodecInfo;
                    }
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static boolean d(String str) {
        try {
        } catch (MediaCodecUtil.DecoderQueryException e2) {
            e2.printStackTrace();
        }
        return MediaCodecUtil.getDecoderInfo(str, false, false) != null;
    }

    @TargetApi(ConnectionSubtype.SUBTYPE_WIFI_G)
    private static boolean c(String str, boolean z) {
        android.media.MediaCodecInfo[] codecInfos;
        boolean isHardwareAccelerated;
        for (android.media.MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (!mediaCodecInfo.isEncoder()) {
                for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        if (!z || (capabilitiesForType != null && capabilitiesForType.isFeatureSupported("adaptive-playback"))) {
                            isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                            return isHardwareAccelerated;
                        }
                        return false;
                    }
                }
                continue;
            }
        }
        return false;
    }

    private static boolean d(String str, androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            return c(str, z);
        }
        try {
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo decoderInfo = MediaCodecUtil.getDecoderInfo(str, false, false);
            if (decoderInfo != null) {
                if (mediaCodecInfo != null) {
                    if (decoderInfo.name.equals(mediaCodecInfo.name)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (o.C4369bdH.i != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
        if (o.C4369bdH.g != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
        r3 = true;
     */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfos(java.lang.String r2, boolean r3, boolean r4) {
        /*
            r1 = this;
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1a
            boolean r0 = o.C4369bdH.q
            if (r0 == 0) goto L13
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo r2 = o.C4369bdH.l
            java.util.List r2 = java.util.Collections.singletonList(r2)
            return r2
        L13:
            if (r3 == 0) goto L35
            boolean r3 = o.C4369bdH.i
            if (r3 == 0) goto L35
            goto L33
        L1a:
            java.lang.String r0 = "video/hevc"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L36
            boolean r0 = o.C4369bdH.q
            if (r0 == 0) goto L2d
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo r2 = o.C4369bdH.k
            java.util.List r2 = java.util.Collections.singletonList(r2)
            return r2
        L2d:
            if (r3 == 0) goto L35
            boolean r3 = o.C4369bdH.g
            if (r3 == 0) goto L35
        L33:
            r3 = 1
            goto L36
        L35:
            r3 = 0
        L36:
            java.util.List r2 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecoderInfos(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4369bdH.getDecoderInfos(java.lang.String, boolean, boolean):java.util.List");
    }

    public static boolean j() {
        return aRH.j() ? C4377bdP.b.i() : i;
    }

    public static boolean g() {
        return aRH.j() ? C4377bdP.b.g() : g;
    }

    public static boolean o() {
        return aRH.j() ? C4377bdP.b.b() : n;
    }

    public static boolean n() {
        return aRH.j() ? C4377bdP.b.l() : f13569o;
    }

    public static boolean b() {
        return aRH.j() ? C4377bdP.b.e() : b;
    }

    public static boolean d() {
        return aRH.j() ? C4377bdP.b.j() : f;
    }

    public static boolean e() {
        return aRH.j() ? C4377bdP.b.f() : h;
    }

    public static boolean f() {
        return aRH.j() ? C4377bdP.b.d() : a;
    }

    public static boolean a() {
        return aRH.j() ? C4377bdP.b.a() : c;
    }

    public static boolean i() {
        return aRH.j() ? C4377bdP.b.c() : d;
    }

    public static boolean h() {
        return aRH.j() ? C4377bdP.b.h() : m();
    }

    public static boolean l() {
        return aRH.j() ? C4377bdP.b.d() : p;
    }
}
