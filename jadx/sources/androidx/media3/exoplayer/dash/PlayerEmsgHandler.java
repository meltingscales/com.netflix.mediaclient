package androidx.media3.exoplayer.dash;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.metadata.emsg.EventMessageDecoder;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import o.C9584sQ;

/* loaded from: classes2.dex */
public final class PlayerEmsgHandler implements Handler.Callback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int a = 1;
    private static char[] a$s58$2011 = {12849};
    private static int b;
    private final Allocator allocator;
    private boolean chunkLoadedCompletedSinceLastManifestRefreshRequest;
    private long expiredManifestPublishTimeUs;
    private boolean isWaitingForManifestRefresh;
    private DashManifest manifest;
    private final PlayerEmsgCallback playerEmsgCallback;
    private boolean released;
    private final TreeMap<Long, Long> manifestPublishTimeToExpiryTimeUs = new TreeMap<>();
    private final Handler handler = Util.createHandlerForCurrentLooper(this);
    private final EventMessageDecoder decoder = new EventMessageDecoder();

    /* loaded from: classes2.dex */
    public interface PlayerEmsgCallback {
        void onDashManifestPublishTimeExpired(long j);

        void onDashManifestRefreshRequested();
    }

    void onChunkLoadCompleted(Chunk chunk) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + NetflixImageView.DEFAULT_LAYER_GRAVITY;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.chunkLoadedCompletedSinceLastManifestRefreshRequest = true;
        int i5 = i2 + 115;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ EventMessageDecoder access$000(PlayerEmsgHandler playerEmsgHandler) {
        int i = 2 % 2;
        int i2 = a + 67;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        EventMessageDecoder eventMessageDecoder = playerEmsgHandler.decoder;
        if (i4 != 0) {
            int i5 = 77 / 0;
        }
        int i6 = i3 + 27;
        a = i6 % 128;
        int i7 = i6 % 2;
        return eventMessageDecoder;
    }

    static /* synthetic */ boolean access$100(String str, String str2) {
        int i = 2 % 2;
        int i2 = b + 5;
        a = i2 % 128;
        int i3 = i2 % 2;
        boolean isPlayerEmsgEvent = isPlayerEmsgEvent(str, str2);
        int i4 = a + 75;
        b = i4 % 128;
        int i5 = i4 % 2;
        return isPlayerEmsgEvent;
    }

    static /* synthetic */ long access$200(EventMessage eventMessage) {
        int i = 2 % 2;
        int i2 = a + 69;
        b = i2 % 128;
        int i3 = i2 % 2;
        long manifestPublishTimeMsInEmsg = getManifestPublishTimeMsInEmsg(eventMessage);
        int i4 = a + 75;
        b = i4 % 128;
        int i5 = i4 % 2;
        return manifestPublishTimeMsInEmsg;
    }

    static /* synthetic */ Handler access$300(PlayerEmsgHandler playerEmsgHandler) {
        int i = 2 % 2;
        int i2 = b + 55;
        int i3 = i2 % 128;
        a = i3;
        if (i2 % 2 == 0) {
            Handler handler = playerEmsgHandler.handler;
            throw null;
        }
        Handler handler2 = playerEmsgHandler.handler;
        int i4 = i3 + 125;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return handler2;
        }
        throw null;
    }

    public PlayerEmsgHandler(DashManifest dashManifest, PlayerEmsgCallback playerEmsgCallback, Allocator allocator) {
        this.manifest = dashManifest;
        this.playerEmsgCallback = playerEmsgCallback;
        this.allocator = allocator;
    }

    public void updateManifest(DashManifest dashManifest) {
        int i = 2 % 2;
        int i2 = b + 79;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            this.isWaitingForManifestRefresh = false;
            this.expiredManifestPublishTimeUs = -9223372036854775807L;
            this.manifest = dashManifest;
        } else {
            this.isWaitingForManifestRefresh = false;
            this.expiredManifestPublishTimeUs = -9223372036854775807L;
            this.manifest = dashManifest;
        }
        removePreviouslyExpiredManifestPublishTimeValues();
    }

    public PlayerTrackEmsgHandler newPlayerTrackEmsgHandler() {
        int i = 2 % 2;
        PlayerTrackEmsgHandler playerTrackEmsgHandler = new PlayerTrackEmsgHandler(this.allocator);
        int i2 = b + 83;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            return playerTrackEmsgHandler;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void release() {
        Handler handler;
        int i = 2 % 2;
        int i2 = b + 91;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            this.released = false;
            handler = this.handler;
        } else {
            this.released = true;
            handler = this.handler;
        }
        handler.removeCallbacksAndMessages(null);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = 2 % 2;
        if (this.released) {
            int i2 = b + 97;
            a = i2 % 128;
            int i3 = i2 % 2;
            return true;
        } else if (message.what != 1) {
            return false;
        } else {
            ManifestExpiryEventInfo manifestExpiryEventInfo = (ManifestExpiryEventInfo) message.obj;
            handleManifestExpiredMessage(manifestExpiryEventInfo.eventTimeUs, manifestExpiryEventInfo.manifestPublishTimeMsInEmsg);
            int i4 = b + 121;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }
    }

    boolean maybeRefreshManifestBeforeLoadingNextChunk(long j) {
        int i = 2 % 2;
        DashManifest dashManifest = this.manifest;
        boolean z = false;
        if (!dashManifest.dynamic) {
            int i2 = b + 87;
            a = i2 % 128;
            return i2 % 2 == 0;
        } else if (this.isWaitingForManifestRefresh) {
            return true;
        } else {
            Map.Entry<Long, Long> ceilingExpiryEntryForPublishTime = ceilingExpiryEntryForPublishTime(dashManifest.publishTimeMs);
            if (ceilingExpiryEntryForPublishTime != null && ceilingExpiryEntryForPublishTime.getValue().longValue() < j) {
                this.expiredManifestPublishTimeUs = ceilingExpiryEntryForPublishTime.getKey().longValue();
                notifyManifestPublishTimeExpired();
                z = true;
            }
            if (z) {
                int i3 = b + 11;
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    maybeNotifyDashManifestRefreshNeeded();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                maybeNotifyDashManifestRefreshNeeded();
            }
            return z;
        }
    }

    boolean onChunkLoadError(boolean z) {
        int i = 2 % 2;
        if (this.manifest.dynamic) {
            if (!this.isWaitingForManifestRefresh) {
                if (!z) {
                    return false;
                }
                int i2 = a + 63;
                b = i2 % 128;
                int i3 = i2 % 2;
                maybeNotifyDashManifestRefreshNeeded();
                return true;
            }
            int i4 = b;
            int i5 = i4 + 77;
            a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 41;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        return false;
    }

    private void handleManifestExpiredMessage(long j, long j2) {
        int i = 2 % 2;
        Long l = this.manifestPublishTimeToExpiryTimeUs.get(Long.valueOf(j2));
        if (l != null) {
            if (l.longValue() > j) {
                this.manifestPublishTimeToExpiryTimeUs.put(Long.valueOf(j2), Long.valueOf(j));
                return;
            }
            return;
        }
        int i2 = a + 73;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.manifestPublishTimeToExpiryTimeUs.put(Long.valueOf(j2), Long.valueOf(j));
        int i4 = b + 97;
        a = i4 % 128;
        int i5 = i4 % 2;
    }

    private Map.Entry<Long, Long> ceilingExpiryEntryForPublishTime(long j) {
        int i = 2 % 2;
        int i2 = b + 27;
        a = i2 % 128;
        int i3 = i2 % 2;
        Map.Entry<Long, Long> ceilingEntry = this.manifestPublishTimeToExpiryTimeUs.ceilingEntry(Long.valueOf(j));
        int i4 = a + 33;
        b = i4 % 128;
        int i5 = i4 % 2;
        return ceilingEntry;
    }

    private void removePreviouslyExpiredManifestPublishTimeValues() {
        int i = 2 % 2;
        int i2 = a + 79;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            this.manifestPublishTimeToExpiryTimeUs.entrySet().iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Iterator<Map.Entry<Long, Long>> it = this.manifestPublishTimeToExpiryTimeUs.entrySet().iterator();
        while (it.hasNext()) {
            int i3 = b + 51;
            a = i3 % 128;
            int i4 = i3 % 2;
            if (it.next().getKey().longValue() < this.manifest.publishTimeMs) {
                int i5 = a + 81;
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    it.remove();
                    int i6 = 78 / 0;
                } else {
                    it.remove();
                }
            }
        }
        int i7 = b + 15;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 44 / 0;
        }
    }

    private void notifyManifestPublishTimeExpired() {
        int i = 2 % 2;
        int i2 = b + 73;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            this.playerEmsgCallback.onDashManifestPublishTimeExpired(this.expiredManifestPublishTimeUs);
            int i3 = 41 / 0;
        } else {
            this.playerEmsgCallback.onDashManifestPublishTimeExpired(this.expiredManifestPublishTimeUs);
        }
        int i4 = a + 25;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    private void maybeNotifyDashManifestRefreshNeeded() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 3;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.chunkLoadedCompletedSinceLastManifestRefreshRequest) {
            this.isWaitingForManifestRefresh = true;
            this.chunkLoadedCompletedSinceLastManifestRefreshRequest = false;
            this.playerEmsgCallback.onDashManifestRefreshRequested();
            return;
        }
        int i4 = i2 + 57;
        a = i4 % 128;
        int i5 = i4 % 2;
    }

    private static long getManifestPublishTimeMsInEmsg(EventMessage eventMessage) {
        int i = 2 % 2;
        int i2 = b + 53;
        a = i2 % 128;
        int i3 = i2 % 2;
        try {
            long parseXsDateTime = Util.parseXsDateTime(Util.fromUtf8Bytes(eventMessage.messageData));
            int i4 = a + 103;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                return parseXsDateTime;
            }
            throw null;
        } catch (ParserException unused) {
            return -9223372036854775807L;
        }
    }

    private static boolean isPlayerEmsgEvent(String str, String str2) {
        int i = 2 % 2;
        if (!(!"urn:mpeg:dash:event:2012".equals(str))) {
            int i2 = a + 43;
            b = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            c(false, new byte[]{1}, new int[]{0, 1, 0, 0}, objArr);
            if (!(!((String) objArr[0]).intern().equals(str2))) {
                return true;
            }
            int i4 = b + 41;
            a = i4 % 128;
            if (i4 % 2 == 0) {
                "2".equals(str2);
                Object obj = null;
                obj.hashCode();
                throw null;
            } else if ("2".equals(str2) || "3".equals(str2)) {
                return true;
            }
        }
        int i5 = b + 65;
        a = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* loaded from: classes2.dex */
    public final class PlayerTrackEmsgHandler implements TrackOutput {
        private final SampleQueue sampleQueue;
        private final FormatHolder formatHolder = new FormatHolder();
        private final MetadataInputBuffer buffer = new MetadataInputBuffer();
        private long maxLoadedChunkEndTimeUs = -9223372036854775807L;

        PlayerTrackEmsgHandler(Allocator allocator) {
            this.sampleQueue = SampleQueue.createWithoutDrm(allocator);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void format(Format format) {
            this.sampleQueue.format(format);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public int sampleData(DataReader dataReader, int i, boolean z, int i2) {
            return this.sampleQueue.sampleData(dataReader, i, z);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleData(ParsableByteArray parsableByteArray, int i, int i2) {
            this.sampleQueue.sampleData(parsableByteArray, i);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
            this.sampleQueue.sampleMetadata(j, i, i2, i3, cryptoData);
            parseAndDiscardSamples();
        }

        public boolean maybeRefreshManifestBeforeLoadingNextChunk(long j) {
            return PlayerEmsgHandler.this.maybeRefreshManifestBeforeLoadingNextChunk(j);
        }

        public void onChunkLoadCompleted(Chunk chunk) {
            long j = this.maxLoadedChunkEndTimeUs;
            if (j == -9223372036854775807L || chunk.endTimeUs > j) {
                this.maxLoadedChunkEndTimeUs = chunk.endTimeUs;
            }
            PlayerEmsgHandler.this.onChunkLoadCompleted(chunk);
        }

        public boolean onChunkLoadError(Chunk chunk) {
            long j = this.maxLoadedChunkEndTimeUs;
            return PlayerEmsgHandler.this.onChunkLoadError(j != -9223372036854775807L && j < chunk.startTimeUs);
        }

        public void release() {
            this.sampleQueue.release();
        }

        private void parseAndDiscardSamples() {
            while (this.sampleQueue.isReady(false)) {
                MetadataInputBuffer dequeueSample = dequeueSample();
                if (dequeueSample != null) {
                    long j = dequeueSample.timeUs;
                    Metadata decode = PlayerEmsgHandler.access$000(PlayerEmsgHandler.this).decode(dequeueSample);
                    if (decode != null) {
                        EventMessage eventMessage = (EventMessage) decode.get(0);
                        if (PlayerEmsgHandler.access$100(eventMessage.schemeIdUri, eventMessage.value)) {
                            parsePlayerEmsgEvent(j, eventMessage);
                        }
                    }
                }
            }
            this.sampleQueue.discardToRead();
        }

        private MetadataInputBuffer dequeueSample() {
            this.buffer.clear();
            if (this.sampleQueue.read(this.formatHolder, this.buffer, 0, false) == -4) {
                this.buffer.flip();
                return this.buffer;
            }
            return null;
        }

        private void parsePlayerEmsgEvent(long j, EventMessage eventMessage) {
            long access$200 = PlayerEmsgHandler.access$200(eventMessage);
            if (access$200 == -9223372036854775807L) {
                return;
            }
            onManifestExpiredMessageEncountered(j, access$200);
        }

        private void onManifestExpiredMessageEncountered(long j, long j2) {
            PlayerEmsgHandler.access$300(PlayerEmsgHandler.this).sendMessage(PlayerEmsgHandler.access$300(PlayerEmsgHandler.this).obtainMessage(1, new ManifestExpiryEventInfo(j, j2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ManifestExpiryEventInfo {
        public final long eventTimeUs;
        public final long manifestPublishTimeMsInEmsg;

        public ManifestExpiryEventInfo(long j, long j2) {
            this.eventTimeUs = j;
            this.manifestPublishTimeMsInEmsg = j2;
        }
    }

    private static void c(boolean z, byte[] bArr, int[] iArr, Object[] objArr) {
        int i = 2 % 2;
        C9584sQ c9584sQ = new C9584sQ();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = a$s58$2011;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                cArr2[i6] = (char) (cArr[i6] ^ (-1938542877577235927L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i7 = $11 + 55;
            $10 = i7 % 128;
            char[] cArr4 = i7 % 2 != 0 ? new char[i3] : new char[i3];
            c9584sQ.c = 0;
            char c = 0;
            while (c9584sQ.c < i3) {
                if (bArr[c9584sQ.c] == 1) {
                    cArr4[c9584sQ.c] = (char) (((cArr3[c9584sQ.c] * 2) + 1) - c);
                } else {
                    cArr4[c9584sQ.c] = (char) ((cArr3[c9584sQ.c] * 2) - c);
                    int i8 = $10 + 3;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                }
                c = cArr4[c9584sQ.c];
                c9584sQ.c++;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i10 = $11 + 89;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                System.arraycopy(cArr5, 1, cArr3, i3 - i5, i5);
                System.arraycopy(cArr5, i5, cArr3, 1, i3 >> i5);
            } else {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr3, 0, cArr6, 0, i3);
                int i11 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr3, i11, i5);
                System.arraycopy(cArr6, i5, cArr3, 0, i11);
            }
        }
        if (!(!z)) {
            char[] cArr7 = new char[i3];
            c9584sQ.c = 0;
            int i12 = $11 + 11;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            while (c9584sQ.c < i3) {
                cArr7[c9584sQ.c] = cArr3[(i3 - c9584sQ.c) - 1];
                c9584sQ.c++;
            }
            cArr3 = cArr7;
        }
        if (i4 > 0) {
            c9584sQ.c = 0;
            while (c9584sQ.c < i3) {
                cArr3[c9584sQ.c] = (char) (cArr3[c9584sQ.c] - iArr[2]);
                c9584sQ.c++;
                int i14 = $11 + 53;
                $10 = i14 % 128;
                int i15 = i14 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
