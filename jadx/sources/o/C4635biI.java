package o;

import androidx.media3.common.Format;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.exoplayer.source.chunk.BaseMediaChunk;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.biI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4635biI extends BaseMediaChunk {
    public final C4637biK a;
    private final byte[] b;
    private volatile boolean c;
    private volatile int d;
    private volatile boolean e;
    private final int j;

    public int b() {
        return this.j;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void cancelLoad() {
        this.c = true;
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.e;
    }

    public C4635biI(C4637biK c4637biK, byte[] bArr, int i, DataSource dataSource, DataSpec dataSpec, Format format, int i2, Object obj, long j, long j2, int i3) {
        super(dataSource, dataSpec, format, i2, obj, j, j2, -9223372036854775807L, -9223372036854775807L, i3);
        this.j = i;
        this.a = c4637biK;
        this.b = bArr;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void load() {
        DataSpec subrange = this.dataSpec.subrange(this.d);
        try {
            if (!this.c) {
                this.dataSource.open(subrange);
            }
            while (!this.c) {
                long j = subrange.length;
                if (this.d >= j) {
                    break;
                }
                int i = (int) (j - this.d);
                StatsDataSource statsDataSource = this.dataSource;
                byte[] bArr = this.b;
                this.d += statsDataSource.read(bArr, 0, Math.min(bArr.length, i));
            }
            C4632biF.a(this.dataSource);
            this.e = true;
        } catch (Throwable th) {
            C4632biF.a(this.dataSource);
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{segment=");
        sb.append(this.a.e);
        sb.append(", type=");
        sb.append(this.j == 1 ? "AUDIO" : "VIDEO");
        sb.append(", bitrate=");
        sb.append(this.trackFormat.bitrate / 1000);
        sb.append("kbps, pts=(");
        sb.append(androidx.media3.common.C.usToMs(this.startTimeUs));
        sb.append(", ");
        sb.append(androidx.media3.common.C.usToMs(this.endTimeUs));
        sb.append(")}");
        return sb.toString();
    }
}
