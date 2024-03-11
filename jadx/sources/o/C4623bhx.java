package o;

import com.google.gson.JsonObject;
import com.netflix.mediaclient.service.player.StreamProfileType;

/* renamed from: o.bhx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4623bhx {
    public static final C4623bhx d = new C4623bhx();

    /* renamed from: o.bhx$e */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[StreamProfileType.values().length];
            try {
                iArr[StreamProfileType.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StreamProfileType.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            c = iArr;
        }
    }

    private C4623bhx() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r10.equals("LolomoTrailer") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r10.equals("GameValueProp") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
        if (r10.equals("videoCarousel") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        if (r10.equals("trailerInLolomo") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
        if (r10.equals("ComingSoon") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r10.equals("motionBillboard") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
        if (r10.equals("previews") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
        if (r10.equals("TrailerDP") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00da, code lost:
        if (r10.equals("TrailerDPTablet") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dd, code lost:
        r10 = new com.google.gson.JsonObject();
        r10.addProperty("maxBufferingTime", (java.lang.Number) 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        return b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r10.equals("LolomoTrailerTablet") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r10.equals("ComingSoonTable") == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.gson.JsonObject b(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4623bhx.b(java.lang.String):com.google.gson.JsonObject");
    }

    public final JsonObject b(StreamProfileType streamProfileType) {
        int i = streamProfileType == null ? -1 : e.c[streamProfileType.ordinal()];
        if (i == 1) {
            JsonObject jsonObject = new JsonObject();
            C4623bhx c4623bhx = d;
            jsonObject.add("stdCellularCap", b(c4623bhx, 600, 0, 110, 0, 0, 2, null));
            jsonObject.add("lowCellularCap", b(c4623bhx, 400, 0, 110, 0, 0, 2, null));
            return jsonObject;
        } else if (i != 2) {
            return null;
        } else {
            JsonObject jsonObject2 = new JsonObject();
            C4623bhx c4623bhx2 = d;
            jsonObject2.add("stdCellularCap", b(c4623bhx2, 325, 0, 110, 0, 0, 2, null));
            jsonObject2.add("lowCellularCap", b(c4623bhx2, 300, 0, 110, 0, 0, 2, null));
            return jsonObject2;
        }
    }

    private final JsonObject b() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("maxPrebufSize", (Number) 10000);
        jsonObject.addProperty("maxRebufSize", (Number) 10000);
        jsonObject.addProperty("rebufferCheckDuration", (Number) 15000);
        jsonObject.addProperty("lowestBufForUpswitch", (Number) 4000);
        jsonObject.addProperty("maxMediaBufferAllowed", (Number) 30000);
        jsonObject.addProperty("maxMediaBufferAllowedCellular", (Number) 30000);
        jsonObject.addProperty("lowWatermarkLevel", (Number) 6000);
        jsonObject.addProperty("lowestWaterMarkLevel", (Number) 15000);
        jsonObject.addProperty("minRequiredBuffer", (Number) 15000);
        jsonObject.addProperty("maxBufferingTime", (Number) 1000);
        jsonObject.addProperty("minPrebufSize", (Number) 2000);
        jsonObject.addProperty("_maxPrefetchPlaylistSegmentBufferAllowed", (Number) 8000);
        return jsonObject;
    }

    static /* synthetic */ JsonObject b(C4623bhx c4623bhx, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = -1;
        }
        if ((i6 & 2) != 0) {
            i2 = -1;
        }
        if ((i6 & 4) != 0) {
            i3 = -1;
        }
        if ((i6 & 8) != 0) {
            i4 = -1;
        }
        if ((i6 & 16) != 0) {
            i5 = -1;
        }
        return c4623bhx.e(i, i2, i3, i4, i5);
    }

    private final JsonObject e(int i, int i2, int i3, int i4, int i5) {
        JsonObject jsonObject = new JsonObject();
        if (i >= 0) {
            jsonObject.addProperty("maxBitrate", Integer.valueOf(i));
        }
        if (i2 >= 0) {
            jsonObject.addProperty("maxBitrateNoVMAF", Integer.valueOf(i));
        }
        if (i3 >= 0) {
            jsonObject.addProperty("maxVMAF", Integer.valueOf(i3));
        }
        if (i4 >= 0) {
            jsonObject.addProperty("minVMAF", Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            jsonObject.addProperty("minBitrate", Integer.valueOf(i5));
        }
        return jsonObject;
    }
}
