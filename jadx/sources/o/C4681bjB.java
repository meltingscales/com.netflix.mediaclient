package o;

import androidx.media3.common.DataReader;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.bjB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4681bjB implements Extractor {
    private final C4684bjE a;
    private b c;
    private ExtractorOutput e;
    private int b = 1;
    private byte[] d = new byte[4];
    private short h = 0;
    private int j = 0;
    private long f = -1;
    private LinkedList<a> i = new LinkedList<>();

    private byte[] b(int i) {
        return new byte[]{(byte) ((i >> 24) & PrivateKeyType.INVALID), (byte) ((i >> 16) & PrivateKeyType.INVALID), (byte) ((i >> 8) & PrivateKeyType.INVALID), (byte) (i & PrivateKeyType.INVALID)};
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.e = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        return false;
    }

    public C4681bjB(Representation representation) {
        this.a = representation instanceof C4684bjE ? (C4684bjE) representation : null;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int i = this.b;
        if (i == 1) {
            if (b(extractorInput)) {
                this.b = 2;
                this.e.track(0, 3).format(this.a.format);
                this.e.endTracks();
                return -1;
            }
            return -1;
        } else if (i == 2) {
            if (e(extractorInput)) {
                this.b = 3;
                return -1;
            }
            return -1;
        } else {
            c(extractorInput);
            return -1;
        }
    }

    private boolean b(ExtractorInput extractorInput) {
        long j = this.a.getInitializationUri().start;
        if (j != extractorInput.getPosition()) {
            throw new IOException("Wrong master index " + this.a.getCacheKey() + ", " + this.a.getInitializationUri() + "vs. @" + j + " - " + extractorInput.getLength());
        }
        int i = (int) this.a.getInitializationUri().length;
        ParsableByteArray parsableByteArray = new ParsableByteArray(i);
        if (extractorInput.readFully(parsableByteArray.getData(), 0, i, true)) {
            parsableByteArray.skipBytes(68);
            parsableByteArray.readBytes(this.d, 0, 4);
            parsableByteArray.skipBytes(32);
            this.f = parsableByteArray.readLong();
            this.h = parsableByteArray.readShort();
            this.j = 0;
            for (int i2 = 0; i2 < this.h; i2++) {
                parsableByteArray.readInt();
                this.j += parsableByteArray.readShort();
            }
            C4684bjE c4684bjE = this.a;
            if (c4684bjE != null) {
                c4684bjE.e(this.f, this.j);
            }
            return true;
        }
        return false;
    }

    private boolean e(ExtractorInput extractorInput) {
        long j = this.f;
        if (j == -1 || j == extractorInput.getPosition()) {
            ParsableByteArray parsableByteArray = new ParsableByteArray(this.j);
            if (extractorInput.readFully(parsableByteArray.getData(), 0, this.j, true)) {
                for (int i = 0; i < this.h; i++) {
                    parsableByteArray.skipBytes(44);
                    int readShort = parsableByteArray.readShort();
                    if (readShort > 0) {
                        while (readShort > 0) {
                            int position = parsableByteArray.getPosition();
                            int readInt = parsableByteArray.readInt();
                            int readInt2 = parsableByteArray.readInt();
                            parsableByteArray.setPosition(position);
                            byte[] bArr = new byte[16];
                            parsableByteArray.readBytes(bArr, 0, 16);
                            long readLong = parsableByteArray.readLong();
                            int readInt3 = parsableByteArray.readInt();
                            a peekLast = this.i.peekLast();
                            if (peekLast != null && peekLast.b == readLong) {
                                int i2 = peekLast.d + readInt2;
                                System.arraycopy(b(i2), 0, bArr, 4, 4);
                                a aVar = new a(peekLast.a, i2, bArr, readLong, readInt3);
                                this.i.removeLast();
                                this.i.addLast(aVar);
                            } else {
                                this.i.addLast(new a(readInt, readInt2, bArr, readLong, readInt3));
                            }
                            readShort--;
                        }
                    }
                }
                d();
                return true;
            }
            return false;
        }
        return false;
    }

    private void c(ExtractorInput extractorInput) {
        int e = this.c.e(extractorInput.getPosition());
        long timeUs = this.c.getTimeUs(e);
        int c = this.c.c(e);
        if (this.c.a(e) != extractorInput.getPosition() || c > extractorInput.getLength()) {
            return;
        }
        byte[] bArr = this.i.get(e).c;
        byte[] bArr2 = new byte[24];
        long j = e + 1;
        System.arraycopy(b(this.c.getTimeUs(j) != -1 ? (int) Util.constrainValue(this.c.getTimeUs(j) - timeUs, -1L, 2147483647L) : Integer.MAX_VALUE), 0, bArr2, 0, 4);
        System.arraycopy(this.d, 0, bArr2, 4, 4);
        System.arraycopy(bArr, 0, bArr2, 8, 16);
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr2);
        TrackOutput track = this.e.track(0, 3);
        track.sampleData(parsableByteArray, 24);
        int i = 0;
        while (i < c) {
            i += track.sampleData((DataReader) extractorInput, c + 24, false);
        }
        track.sampleMetadata(timeUs, 1, c + 24, 0, null);
    }

    private void d() {
        int size = this.i.size();
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[size];
        int[] iArr = new int[size];
        Iterator<a> it = this.i.iterator();
        int i = 0;
        while (it.hasNext()) {
            a next = it.next();
            jArr[i] = androidx.media3.common.C.msToUs(next.a);
            jArr2[i] = androidx.media3.common.C.msToUs(next.d);
            jArr3[i] = next.b;
            iArr[i] = next.e;
            i++;
        }
        C4684bjE c4684bjE = this.a;
        if (c4684bjE != null) {
            b bVar = new b(c4684bjE.d(), jArr, jArr2, jArr3, iArr);
            this.c = bVar;
            this.a.b(bVar);
            this.e.seekMap(new ChunkIndex(iArr, jArr3, jArr2, jArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bjB$a */
    /* loaded from: classes3.dex */
    public static class a {
        private final int a;
        private final long b;
        private final byte[] c;
        private final int d;
        private final int e;

        public a(int i, int i2, byte[] bArr, long j, int i3) {
            this.a = i;
            this.d = i2;
            this.c = bArr;
            this.b = j;
            this.e = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bjB$b */
    /* loaded from: classes3.dex */
    public static class b implements DashSegmentIndex {
        private final int[] a;
        private final long[] b;
        private final String c;
        private final long[] d;
        private final long[] e;
        private final int i;

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getAvailableSegmentCount(long j, long j2) {
            return this.i;
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getFirstAvailableSegmentNum(long j, long j2) {
            return 0L;
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getFirstSegmentNum() {
            return 0L;
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getNextSegmentAvailableTimeUs(long j, long j2) {
            return -9223372036854775807L;
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getSegmentCount(long j) {
            return this.i;
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public boolean isExplicit() {
            return true;
        }

        public b(String str, long[] jArr, long[] jArr2, long[] jArr3, int[] iArr) {
            this.c = str;
            this.e = jArr;
            this.b = jArr2;
            this.d = jArr3;
            this.a = iArr;
            this.i = jArr.length;
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getSegmentNum(long j, long j2) {
            return Util.binarySearchFloor(this.b, j, true, true);
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getTimeUs(long j) {
            if (j >= this.i || j < 0) {
                return -1L;
            }
            return this.e[(int) j];
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getDurationUs(long j, long j2) {
            if (j >= this.i || j < 0) {
                return -1L;
            }
            return this.b[(int) j];
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public RangedUri getSegmentUrl(long j) {
            if (j >= this.i || j < 0) {
                return null;
            }
            int i = (int) j;
            return new RangedUri(this.c, this.d[i], this.a[i]);
        }

        int e(long j) {
            return Util.binarySearchFloor(this.d, j, true, true);
        }

        long a(int i) {
            return this.d[i];
        }

        int c(int i) {
            return this.a[i];
        }
    }
}
