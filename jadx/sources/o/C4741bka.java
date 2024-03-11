package o;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SinglePeriodTimeline;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.common.NetflixIdMetadataEntry;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.contentplaygraph.AdBreakHydrationException;
import com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import o.C4741bka;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.bka  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4741bka extends BaseMediaSource {
    public static final e b = new e(null);
    private final InterfaceC4640biN a;
    private final Format c;
    private final MediaItem d;
    private IOException e;
    private final C4680bjA f;
    private final Format h;

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        return this.d;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        C8632dsu.c((Object) mediaPeriod, "");
    }

    /* renamed from: o.bka$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("PaddingMediaSource");
        }
    }

    public C4741bka(String str, C4680bjA c4680bjA, InterfaceC4640biN interfaceC4640biN) {
        List e2;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c4680bjA, "");
        this.f = c4680bjA;
        this.a = interfaceC4640biN;
        e2 = C8566dqi.e(new NetflixIdMetadataEntry(2147483647L, ""));
        Metadata metadata = new Metadata(e2);
        Format.Builder builder = new Format.Builder();
        String trackTypeString = Util.getTrackTypeString(2);
        Format build = builder.setId("PaddingMedia_" + trackTypeString).setSampleMimeType(str).setMetadata(metadata).setAverageBitrate(100000).setWidth(512).setHeight(288).setFrameRate(24.0f).build();
        C8632dsu.a(build, "");
        this.h = build;
        Format.Builder builder2 = new Format.Builder();
        String trackTypeString2 = Util.getTrackTypeString(1);
        Format build2 = builder2.setId("PaddingMedia_" + trackTypeString2).setSampleMimeType("audio/raw").setMetadata(metadata).setChannelCount(2).setSampleRate(VoipConfiguration.MAX_SAMPLERATE_48K).setPcmEncoding(2).build();
        C8632dsu.a(build2, "");
        this.c = build2;
        MediaItem build3 = new MediaItem.Builder().setMediaId("PaddingMediaSource").setUri(Uri.EMPTY).setTag(c4680bjA).setMimeType("application/dash+xml").build();
        C8632dsu.a(build3, "");
        this.d = build3;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
        IOException iOException = this.e;
        if (iOException == null) {
            return;
        }
        C8632dsu.d(iOException);
        throw iOException;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    /* renamed from: e */
    public b createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        C8632dsu.c((Object) mediaPeriodId, "");
        C8632dsu.c((Object) allocator, "");
        return new b(new TrackGroupArray(new TrackGroup(this.c), new TrackGroup(this.h)), 10000000L);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(TransferListener transferListener) {
        this.e = null;
        Handler createHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
        C8632dsu.a(createHandlerForCurrentLooper, "");
        if (this.f.d() != null && this.a != null) {
            this.a.d(this.f.a(), this.f.d().longValue(), new a(createHandlerForCurrentLooper, this));
            return;
        }
        e();
    }

    /* renamed from: o.bka$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC4643biQ {
        final /* synthetic */ Handler d;
        final /* synthetic */ C4741bka e;

        a(Handler handler, C4741bka c4741bka) {
            this.d = handler;
            this.e = c4741bka;
        }

        @Override // o.InterfaceC4643biQ
        public void d(final Status status) {
            C8632dsu.c((Object) status, "");
            Handler handler = this.d;
            final C4741bka c4741bka = this.e;
            handler.post(new Runnable() { // from class: o.bkc
                @Override // java.lang.Runnable
                public final void run() {
                    C4741bka.a.c(Status.this, c4741bka);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Status status, C4741bka c4741bka) {
            C8632dsu.c((Object) status, "");
            C8632dsu.c((Object) c4741bka, "");
            C4741bka.b.getLogTag();
            if (status.j()) {
                c4741bka.e();
            } else {
                c4741bka.e = new AdBreakHydrationException(status);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        refreshSourceInfo(new SinglePeriodTimeline(10000000L, false, false, false, null, this.d));
    }

    /* renamed from: o.bka$b */
    /* loaded from: classes3.dex */
    public static final class b implements MediaPeriod {
        private final TrackGroupArray a;
        private final long d;
        private final ArrayList<d> e;

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean continueLoading(LoadingInfo loadingInfo) {
            C8632dsu.c((Object) loadingInfo, "");
            return false;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void discardBuffer(long j, boolean z) {
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
            C8632dsu.c((Object) seekParameters, "");
            return j;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return this.a;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean isLoading() {
            return false;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void maybeThrowPrepareError() {
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long readDiscontinuity() {
            return -9223372036854775807L;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public void reevaluateBuffer(long j) {
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long seekToUs(long j) {
            return j;
        }

        public b(TrackGroupArray trackGroupArray, long j) {
            C8632dsu.c((Object) trackGroupArray, "");
            this.a = trackGroupArray;
            this.d = j;
            this.e = new ArrayList<>();
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long j) {
            C8632dsu.c((Object) callback, "");
            callback.onPrepared(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            C8632dsu.c((Object) exoTrackSelectionArr, "");
            C8632dsu.c((Object) zArr, "");
            C8632dsu.c((Object) sampleStreamArr, "");
            C8632dsu.c((Object) zArr2, "");
            int length = exoTrackSelectionArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
                SampleStream sampleStream = sampleStreamArr[i2];
                if (sampleStream != null && (exoTrackSelectionArr[i2] == null || !zArr[i2])) {
                    dsH.b(this.e).remove(sampleStream);
                    C8632dsu.d((Object) null);
                    sampleStreamArr[i2] = null;
                }
                if (exoTrackSelection != null && sampleStreamArr[i2] == null) {
                    Format selectedFormat = exoTrackSelection.getSelectedFormat();
                    C8632dsu.a(selectedFormat, "");
                    d dVar = new d(selectedFormat);
                    this.e.add(dVar);
                    sampleStreamArr[i2] = dVar;
                    zArr2[i2] = true;
                }
                i++;
                i2++;
            }
            return j;
        }
    }

    /* renamed from: o.bka$d */
    /* loaded from: classes3.dex */
    public static final class d implements SampleStream {
        private static final byte[] a;
        public static final C0107d c = new C0107d(null);
        private byte[] b;
        private final Format d;
        private final long e;
        private boolean h;
        private int i;
        private long j;

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return true;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() {
        }

        public d(Format format) {
            C8632dsu.c((Object) format, "");
            this.d = format;
            if (MimeTypes.isAudio(format.sampleMimeType)) {
                this.e = 32000L;
                long j = 2;
                int i = (int) ((((((long) VoipConfiguration.MAX_SAMPLERATE_48K) * 32000) * j) * j) / 1000000);
                this.i = i;
                byte[] bArr = new byte[i];
                for (int i2 = 0; i2 < i; i2++) {
                    bArr[i2] = 0;
                }
                this.b = bArr;
                return;
            }
            this.e = 41667L;
            byte[] bArr2 = a;
            this.b = bArr2;
            this.i = bArr2.length;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
            C8632dsu.c((Object) formatHolder, "");
            C8632dsu.c((Object) decoderInputBuffer, "");
            if (!this.h || (i & 2) != 0) {
                formatHolder.format = this.d;
                this.h = true;
                return -5;
            }
            formatHolder.format = this.d;
            decoderInputBuffer.timeUs = this.j;
            decoderInputBuffer.setFlags(1);
            if ((i & 4) == 0) {
                decoderInputBuffer.ensureSpaceForWrite(this.i);
                ByteBuffer byteBuffer = decoderInputBuffer.data;
                if (byteBuffer != null) {
                    byteBuffer.put(this.b, 0, this.i);
                }
            }
            if ((i & 1) == 0) {
                this.j += this.e;
                return -4;
            }
            return -4;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j) {
            long j2 = j - this.j;
            this.j = j;
            return (int) (this.i * (j2 / this.e));
        }

        /* renamed from: o.bka$d$d  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0107d {
            public /* synthetic */ C0107d(C8627dsp c8627dsp) {
                this();
            }

            private C0107d() {
            }
        }

        static {
            List<Number> j;
            int d;
            byte[] i;
            j = C8569dql.j(0, 0, 0, 1, 103, 77, 64, 21, 217, 0, 128, 37, 176, 17, 0, 0, 3, 0, 1, 0, 0, 3, 0, 48, 15, 22, 46, 72, 0, 0, 0, 1, 104, 235, 195, 203, 32, 0, 0, 1, 101, 136, 132, 10, Integer.valueOf((int) PrivateKeyType.INVALID), 254, 246, 115, 124, 10, 107, 109, 176, 149, 46, 5, 118, 247, 102, 163, 229, 208, 146, 229, 251, 16, 96, 250, 208, 0, 0, 3, 0, 0, 3, 0, 120, 19, 210, 214, 120, 117, 45, 140, 155, 0, 0, 3, 3, 180, 0, 74, 198, 108, 222, 41, 104, 65, 246, 143, 43, 208, 229, 178, 221, 4, 0, 0, 3, 0, 48, 33);
            d = C8572dqo.d(j, 10);
            ArrayList arrayList = new ArrayList(d);
            for (Number number : j) {
                arrayList.add(Byte.valueOf((byte) number.intValue()));
            }
            i = C8576dqs.i(arrayList);
            a = i;
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        b.getLogTag();
    }
}
