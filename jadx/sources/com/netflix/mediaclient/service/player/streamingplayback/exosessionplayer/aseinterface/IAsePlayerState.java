package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface;

import android.util.Range;
import androidx.media3.common.Format;
import com.netflix.mediaclient.service.player.StreamProfileType;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.C4656bid;

/* loaded from: classes3.dex */
public interface IAsePlayerState {

    /* loaded from: classes3.dex */
    public enum AsePlayerState {
        ASE_PLAYER_BUFFERING,
        ASE_PLAYER_PLAYING,
        ASE_PLAYER_PAUSED,
        ASE_PLAYER_ENDED,
        ASE_PLAYER_IDLE
    }

    long a(int i);

    long b(int i);

    AsePlayerState b();

    float c();

    List<a> c(int i);

    long d();

    long d(int i);

    a e(int i);

    d e();

    /* loaded from: classes3.dex */
    public static class a extends C4656bid {
        private final int a;
        private final String b;
        private final long d;
        private final Format e;

        private boolean n() {
            return this.a == 1;
        }

        public String b() {
            return this.b;
        }

        public long d() {
            return this.d;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(int r10, androidx.media3.exoplayer.source.chunk.Chunk r11) {
            /*
                r9 = this;
                long r1 = r11.startTimeUs
                long r3 = r11.endTimeUs
                androidx.media3.datasource.DataSpec r0 = r11.dataSpec
                long r3 = r3 - r1
                long r5 = r0.position
                long r7 = r0.length
                r0 = r9
                r0.<init>(r1, r3, r5, r7)
                r9.a = r10
                androidx.media3.common.Format r10 = r11.trackFormat
                r9.e = r10
                long r0 = r11.endTimeUs
                r9.d = r0
                java.lang.String r10 = r10.id
                r9.b = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState.a.<init>(int, androidx.media3.exoplayer.source.chunk.Chunk):void");
        }

        public int i() {
            Format format = this.e;
            if (format != null) {
                return format.bitrate;
            }
            return 0;
        }

        public boolean h() {
            return a() == -1;
        }

        @Override // o.C4656bid
        public String toString() {
            Locale locale = Locale.US;
            Object[] objArr = new Object[4];
            objArr[0] = n() ? "A" : "V";
            objArr[1] = Integer.valueOf(this.e.bitrate);
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            objArr[2] = Long.valueOf(timeUnit.toMillis(f()));
            objArr[3] = Long.valueOf(timeUnit.toMillis(this.d));
            return String.format(locale, "%s %6d %6d-%-6d", objArr);
        }
    }

    /* loaded from: classes3.dex */
    public static class d {
        private int a;
        public final String b;
        private StreamProfileType c;
        private int d;
        private Range<Integer> e;

        public Range<Integer> a() {
            return this.e;
        }

        public StreamProfileType b() {
            return this.c;
        }

        public void b(StreamProfileType streamProfileType) {
            this.c = streamProfileType;
        }

        public void d(int i, int i2) {
            this.d = i;
            this.a = i2;
        }

        public void d(Range<Integer> range) {
            this.e = range;
        }

        public d(StreamProfileType streamProfileType, String str) {
            this.c = streamProfileType;
            this.b = str;
        }
    }
}
