package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlaybackConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.text.Regex;
import o.C1045Mp;
import o.C8569dql;
import o.C8572dqo;
import o.C8586drb;
import o.C8587drc;
import o.C8590drf;
import o.C8592drh;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C8654dtp;
import o.C8657dts;
import o.C8671duf;
import o.C8737dwr;
import o.GF;
import o.InterfaceC4793bmb;
import o.InterfaceC4796bme;
import o.InterfaceC8554dpx;
import o.InterfaceC8585dra;
import o.InterfaceC8598drn;
import o.InterfaceC8678dum;
import o.dpB;
import o.dqB;
import o.drO;
import o.duD;
import o.dwG;
import o.dwH;
import o.dwU;
import o.dwY;
import o.dwZ;
import o.dxK;

/* loaded from: classes3.dex */
public final class LiveStreamMissingSegmentProbe {
    public static final d c = new d(null);
    private final InterfaceC4793bmb a;
    private final dwG b;
    private final dwU d;
    private final InterfaceC8554dpx e;

    public LiveStreamMissingSegmentProbe(InterfaceC4793bmb interfaceC4793bmb) {
        dwG c2;
        InterfaceC8554dpx b;
        C8632dsu.c((Object) interfaceC4793bmb, "");
        this.a = interfaceC4793bmb;
        c2 = dxK.c(null, 1, null);
        this.b = c2;
        this.d = dwY.c(c2.plus(GF.d()));
        b = dpB.b(new drO<Regex>() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe$regex$2
            @Override // o.drO
            /* renamed from: c */
            public final Regex invoke() {
                return new Regex("s_([0-9]+)");
            }
        });
        this.e = b;
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MissingSegmentProbe");
        }
    }

    private final Regex a() {
        return (Regex) this.e.getValue();
    }

    public final a b(LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, long j) {
        int i;
        dwZ d2;
        C8632dsu.c((Object) loadErrorInfo, "");
        MediaLoadData mediaLoadData = loadErrorInfo.mediaLoadData;
        i = C8657dts.i((int) (j / (mediaLoadData.mediaEndTimeMs - mediaLoadData.mediaStartTimeMs)), Config_FastProperty_PlaybackConfig.maxSegmentsToProbe404());
        if (b(loadErrorInfo) && i > 0) {
            d2 = C8737dwr.d(this.d, null, null, new LiveStreamMissingSegmentProbe$checkForMissingSegment$1(this, loadErrorInfo, i, null), 3, null);
            return new a(d2);
        }
        return new a(dwH.a(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(android.net.Uri r5, int r6, o.InterfaceC8585dra<? super java.lang.Integer> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe$checkForMissingSegment$2
            if (r0 == 0) goto L13
            r0 = r7
            com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe$checkForMissingSegment$2 r0 = (com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe$checkForMissingSegment$2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.c = r1
            goto L18
        L13:
            com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe$checkForMissingSegment$2 r0 = new com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe$checkForMissingSegment$2
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o.C8556dpz.d(r7)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            o.C8556dpz.d(r7)
            java.util.List r5 = r4.b(r5, r6)
            r0.c = r3
            java.lang.Object r7 = r4.a(r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            java.util.List r7 = (java.util.List) r7
            com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe$d r5 = com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe.c
            r5.getLogTag()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r7.iterator()
        L51:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r6.next()
            r1 = r0
            com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe$SegmentPresence r1 = (com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe.SegmentPresence) r1
            com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe$SegmentPresence r2 = com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe.SegmentPresence.d
            if (r1 != r2) goto L66
            r5.add(r0)
            goto L51
        L66:
            int r5 = r5.size()
            if (r5 != 0) goto L72
            com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe$d r5 = com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe.c
            r5.getLogTag()
            goto L8b
        L72:
            int r6 = r7.size()
            if (r5 != r6) goto L7e
            com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe$d r5 = com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe.c
            r5.getLogTag()
            goto L8b
        L7e:
            java.lang.Object r6 = r7.get(r5)
            com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe$SegmentPresence r7 = com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe.SegmentPresence.b
            if (r6 == r7) goto L8d
            com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe$d r5 = com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe.c
            r5.getLogTag()
        L8b:
            r5 = 0
            goto L92
        L8d:
            com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe$d r6 = com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe.c
            r6.getLogTag()
        L92:
            java.lang.Integer r5 = o.C8589dre.c(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe.d(android.net.Uri, int, o.dra):java.lang.Object");
    }

    private final List<Uri> b(Uri uri, int i) {
        List<Uri> i2;
        C8654dtp g;
        int d2;
        CharSequence b;
        List<Uri> i3;
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        InterfaceC8678dum a2 = Regex.a(a(), path, 0, 2, null);
        if (a2 != null) {
            C8671duf d3 = a2.e().d(1);
            if (d3 == null) {
                i3 = C8569dql.i();
                return i3;
            }
            int parseInt = Integer.parseInt(d3.a());
            c.getLogTag();
            g = C8657dts.g(parseInt, i + parseInt);
            d2 = C8572dqo.d(g, 10);
            ArrayList arrayList = new ArrayList(d2);
            Iterator<Integer> it = g.iterator();
            while (it.hasNext()) {
                b = duD.b(path, d3.c(), String.valueOf(((dqB) it).nextInt()));
                arrayList.add(uri.buildUpon().path(b.toString()).build());
            }
            return arrayList;
        }
        i2 = C8569dql.i();
        return i2;
    }

    private final Object a(List<? extends Uri> list, InterfaceC8585dra<? super List<? extends SegmentPresence>> interfaceC8585dra) {
        return dwY.b(new LiveStreamMissingSegmentProbe$probe$2(this, list, null), interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(InterfaceC4796bme interfaceC4796bme, Uri uri, InterfaceC8585dra<? super SegmentPresence> interfaceC8585dra) {
        InterfaceC8585dra b;
        Object e;
        b = C8590drf.b(interfaceC8585dra);
        C8587drc c8587drc = new C8587drc(b);
        interfaceC4796bme.d(uri, null, new c(c8587drc));
        Object b2 = c8587drc.b();
        e = C8586drb.e();
        if (b2 == e) {
            C8592drh.c(interfaceC8585dra);
        }
        return b2;
    }

    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC4796bme.a {
        final /* synthetic */ InterfaceC8585dra<SegmentPresence> e;

        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC8585dra<? super SegmentPresence> interfaceC8585dra) {
            this.e = interfaceC8585dra;
        }

        @Override // o.InterfaceC4796bme.a
        public void a() {
            InterfaceC8585dra<SegmentPresence> interfaceC8585dra = this.e;
            Result.c cVar = Result.e;
            interfaceC8585dra.resumeWith(Result.e(SegmentPresence.b));
        }

        @Override // o.InterfaceC4796bme.a
        public void b(int i) {
            SegmentPresence segmentPresence;
            if (i == 404) {
                segmentPresence = SegmentPresence.d;
            } else {
                segmentPresence = SegmentPresence.c;
            }
            InterfaceC8585dra<SegmentPresence> interfaceC8585dra = this.e;
            Result.c cVar = Result.e;
            interfaceC8585dra.resumeWith(Result.e(segmentPresence));
        }
    }

    private final boolean b(LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        Regex a2 = a();
        String path = loadErrorInfo.loadEventInfo.uri.getPath();
        if (path == null) {
            path = "";
        }
        boolean d2 = a2.d(path);
        MediaLoadData mediaLoadData = loadErrorInfo.mediaLoadData;
        int i = mediaLoadData.trackType;
        return d2 && (i == 1 || i == 2 || i == 3) && (mediaLoadData.dataType == 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class SegmentPresence {
        private static final /* synthetic */ InterfaceC8598drn a;
        private static final /* synthetic */ SegmentPresence[] e;
        public static final SegmentPresence d = new SegmentPresence("SEGMENT_MISSING", 0);
        public static final SegmentPresence b = new SegmentPresence("SEGMENT_AVAILABLE", 1);
        public static final SegmentPresence c = new SegmentPresence("SEGMENT_UNKNOWN", 2);

        private static final /* synthetic */ SegmentPresence[] d() {
            return new SegmentPresence[]{d, b, c};
        }

        public static SegmentPresence valueOf(String str) {
            return (SegmentPresence) Enum.valueOf(SegmentPresence.class, str);
        }

        public static SegmentPresence[] values() {
            return (SegmentPresence[]) e.clone();
        }

        private SegmentPresence(String str, int i) {
        }

        static {
            SegmentPresence[] d2 = d();
            e = d2;
            a = C8600drp.e(d2);
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final long a;
        private final dwZ<Integer> b;

        public a(dwZ<Integer> dwz) {
            C8632dsu.c((Object) dwz, "");
            this.b = dwz;
            this.a = SystemClock.elapsedRealtime();
        }

        public final int e() {
            if (this.b.k()) {
                return this.b.e().intValue();
            }
            return 0;
        }

        public final boolean a(long j) {
            return this.b.k() && this.b.e().intValue() <= 0 && this.a < SystemClock.elapsedRealtime() - j;
        }
    }
}
