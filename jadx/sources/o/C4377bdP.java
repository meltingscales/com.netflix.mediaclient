package o;

import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.Collection;
import java.util.List;
import o.C4377bdP;

/* renamed from: o.bdP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4377bdP extends C1045Mp {
    private static final InterfaceC8554dpx a;
    public static final C4377bdP b = new C4377bdP();
    private static final InterfaceC8554dpx c;
    private static final InterfaceC8554dpx d;
    private static final InterfaceC8554dpx e;
    private static final InterfaceC8554dpx f;
    private static final InterfaceC8554dpx g;
    private static final InterfaceC8554dpx h;
    private static final InterfaceC8554dpx i;
    private static final InterfaceC8554dpx j;
    private static final InterfaceC8554dpx k;

    /* renamed from: o  reason: collision with root package name */
    private static final InterfaceC8554dpx f13570o;

    private C4377bdP() {
        super("VideoCodec");
    }

    static {
        InterfaceC8554dpx b2;
        InterfaceC8554dpx b3;
        InterfaceC8554dpx b4;
        InterfaceC8554dpx b5;
        InterfaceC8554dpx b6;
        InterfaceC8554dpx b7;
        InterfaceC8554dpx b8;
        InterfaceC8554dpx b9;
        InterfaceC8554dpx b10;
        InterfaceC8554dpx b11;
        InterfaceC8554dpx b12;
        b2 = dpB.b(new drO<Boolean>() { // from class: com.netflix.mediaclient.service.player.common.ExoVideoCodecSelector2$hasVp9Decoder$2
            @Override // o.drO
            /* renamed from: a */
            public final Boolean invoke() {
                boolean d2;
                d2 = C4377bdP.b.d("video/x-vnd.on2.vp9", false, 1, 64);
                return Boolean.valueOf(d2);
            }
        });
        k = b2;
        b3 = dpB.b(new drO<Boolean>() { // from class: com.netflix.mediaclient.service.player.common.ExoVideoCodecSelector2$hasSecureVp9Decoder$2
            @Override // o.drO
            /* renamed from: a */
            public final Boolean invoke() {
                boolean d2;
                d2 = C4377bdP.b.d("video/x-vnd.on2.vp9", true, 1, 64);
                return Boolean.valueOf(d2);
            }
        });
        f13570o = b3;
        b4 = dpB.b(new drO<Boolean>() { // from class: com.netflix.mediaclient.service.player.common.ExoVideoCodecSelector2$hasHevcDecoder$2
            @Override // o.drO
            /* renamed from: d */
            public final Boolean invoke() {
                boolean d2;
                d2 = C4377bdP.b.d("video/hevc", false, 2, 2048);
                return Boolean.valueOf(d2);
            }
        });
        e = b4;
        b5 = dpB.b(new drO<Boolean>() { // from class: com.netflix.mediaclient.service.player.common.ExoVideoCodecSelector2$hasSecureHevcDecoder$2
            @Override // o.drO
            /* renamed from: e */
            public final Boolean invoke() {
                boolean d2;
                d2 = C4377bdP.b.d("video/hevc", true, 2, 2048);
                return Boolean.valueOf(d2);
            }
        });
        h = b5;
        b6 = dpB.b(new drO<Boolean>() { // from class: com.netflix.mediaclient.service.player.common.ExoVideoCodecSelector2$hasAvcHighDecoder$2
            @Override // o.drO
            /* renamed from: a */
            public final Boolean invoke() {
                boolean d2;
                d2 = C4377bdP.b.d("video/avc", false, 8, JSONzip.end);
                return Boolean.valueOf(d2);
            }
        });
        c = b6;
        b7 = dpB.b(new drO<Boolean>() { // from class: com.netflix.mediaclient.service.player.common.ExoVideoCodecSelector2$hasSecureAvcHighDecoder$2
            @Override // o.drO
            /* renamed from: d */
            public final Boolean invoke() {
                boolean d2;
                d2 = C4377bdP.b.d("video/avc", true, 8, 2048);
                return Boolean.valueOf(d2);
            }
        });
        g = b7;
        b8 = dpB.b(new drO<Boolean>() { // from class: com.netflix.mediaclient.service.player.common.ExoVideoCodecSelector2$hasSecureHdr10Decoder$2
            @Override // o.drO
            /* renamed from: b */
            public final Boolean invoke() {
                boolean d2;
                d2 = C4377bdP.b.d("video/hevc", true, 4096, 1024);
                return Boolean.valueOf(d2);
            }
        });
        f = b8;
        b9 = dpB.b(new drO<Boolean>() { // from class: com.netflix.mediaclient.service.player.common.ExoVideoCodecSelector2$hasSecureDolbyVisionDecoder$2
            @Override // o.drO
            /* renamed from: b */
            public final Boolean invoke() {
                boolean d2;
                d2 = C4377bdP.b.d("video/dolby-vision", true, 32, 8);
                return Boolean.valueOf(d2);
            }
        });
        j = b9;
        b10 = dpB.b(new drO<Boolean>() { // from class: com.netflix.mediaclient.service.player.common.ExoVideoCodecSelector2$hasAv1Decoder$2
            @Override // o.drO
            /* renamed from: c */
            public final Boolean invoke() {
                boolean d2;
                boolean z = false;
                if (Build.VERSION.SDK_INT >= 29) {
                    d2 = C4377bdP.b.d("video/av01", false, 2, JSONzip.end);
                    if (d2) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
        a = b10;
        b11 = dpB.b(new drO<Boolean>() { // from class: com.netflix.mediaclient.service.player.common.ExoVideoCodecSelector2$hasSecureAv1Decoder$2
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
                if (r0 != false) goto L5;
             */
            @Override // o.drO
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Boolean invoke() {
                /*
                    r5 = this;
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r1 = 29
                    if (r0 < r1) goto L15
                    o.bdP r0 = o.C4377bdP.b
                    r1 = 2
                    r2 = 256(0x100, float:3.59E-43)
                    java.lang.String r3 = "video/av01"
                    r4 = 1
                    boolean r0 = o.C4377bdP.e(r0, r3, r4, r1, r2)
                    if (r0 == 0) goto L15
                    goto L16
                L15:
                    r4 = 0
                L16:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.player.common.ExoVideoCodecSelector2$hasSecureAv1Decoder$2.invoke():java.lang.Boolean");
            }
        });
        d = b11;
        b12 = dpB.b(new drO<Boolean>() { // from class: com.netflix.mediaclient.service.player.common.ExoVideoCodecSelector2$hasSecureHdr10PlusDecoder$2
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
                if (r0 != false) goto L5;
             */
            @Override // o.drO
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Boolean invoke() {
                /*
                    r5 = this;
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r1 = 29
                    if (r0 < r1) goto L16
                    o.bdP r0 = o.C4377bdP.b
                    r1 = 8192(0x2000, float:1.14794E-41)
                    r2 = 256(0x100, float:3.59E-43)
                    java.lang.String r3 = "video/av01"
                    r4 = 1
                    boolean r0 = o.C4377bdP.e(r0, r3, r4, r1, r2)
                    if (r0 == 0) goto L16
                    goto L17
                L16:
                    r4 = 0
                L17:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.player.common.ExoVideoCodecSelector2$hasSecureHdr10PlusDecoder$2.invoke():java.lang.Boolean");
            }
        });
        i = b12;
    }

    public final boolean l() {
        return ((Boolean) k.getValue()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) f13570o.getValue()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) e.getValue()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) h.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) c.getValue()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) g.getValue()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) f.getValue()).booleanValue();
    }

    public final boolean j() {
        return ((Boolean) j.getValue()).booleanValue();
    }

    public final boolean a() {
        return ((Boolean) a.getValue()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) d.getValue()).booleanValue();
    }

    public final boolean h() {
        return ((Boolean) i.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(String str, boolean z, int i2, int i3) {
        List<MediaCodecInfo> decoderInfos = MediaCodecUtil.getDecoderInfos(str, z, false);
        C8632dsu.a(decoderInfos, "");
        if ((decoderInfos instanceof Collection) && decoderInfos.isEmpty()) {
            return false;
        }
        for (MediaCodecInfo mediaCodecInfo : decoderInfos) {
            if (mediaCodecInfo.adaptive && mediaCodecInfo.hardwareAccelerated) {
                MediaCodecInfo.CodecProfileLevel[] profileLevels = mediaCodecInfo.getProfileLevels();
                C8632dsu.a(profileLevels, "");
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : profileLevels) {
                    if ((codecProfileLevel.profile & i2) != 0 && codecProfileLevel.level >= i3) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }
}
