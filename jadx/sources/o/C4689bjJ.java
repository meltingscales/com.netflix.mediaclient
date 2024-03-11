package o;

import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import java.io.IOException;

/* renamed from: o.bjJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4689bjJ implements Extractor {
    private final boolean a;
    boolean c;
    private final Extractor d;
    private b e;

    public C4689bjJ(Extractor extractor, boolean z) {
        this.d = extractor;
        this.a = z;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        return this.d.sniff(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.d.init(new e(extractorOutput));
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        b bVar = this.e;
        if (bVar == null || !bVar.c(extractorInput)) {
            this.c = false;
            this.e = new b(extractorInput);
        }
        try {
            return this.d.read(this.e, positionHolder);
        } catch (IOException e2) {
            if (this.c) {
                throw e2;
            }
            return -1;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.d.seek(j, j2);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
        this.d.release();
    }

    /* renamed from: o.bjJ$e */
    /* loaded from: classes3.dex */
    class e implements ExtractorOutput {
        private final ExtractorOutput c;

        public e(ExtractorOutput extractorOutput) {
            this.c = extractorOutput;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public TrackOutput track(int i, int i2) {
            return this.c.track(i, i2);
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void endTracks() {
            this.c.endTracks();
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
            if (!C4689bjJ.this.a) {
                C4689bjJ.this.c = true;
            }
            this.c.seekMap(seekMap);
        }
    }

    /* renamed from: o.bjJ$b */
    /* loaded from: classes3.dex */
    public class b implements ExtractorInput {
        private final ExtractorInput d;

        public boolean c(ExtractorInput extractorInput) {
            return this.d == extractorInput;
        }

        public b(ExtractorInput extractorInput) {
            this.d = extractorInput;
        }

        @Override // androidx.media3.extractor.ExtractorInput, androidx.media3.common.DataReader
        public int read(byte[] bArr, int i, int i2) {
            return this.d.read(bArr, i, i2);
        }

        @Override // androidx.media3.extractor.ExtractorInput
        public boolean readFully(byte[] bArr, int i, int i2, boolean z) {
            C4689bjJ c4689bjJ = C4689bjJ.this;
            if (c4689bjJ.c) {
                c4689bjJ.c = false;
                return false;
            }
            return this.d.readFully(bArr, i, i2, z);
        }

        @Override // androidx.media3.extractor.ExtractorInput
        public void readFully(byte[] bArr, int i, int i2) {
            this.d.readFully(bArr, i, i2);
        }

        @Override // androidx.media3.extractor.ExtractorInput
        public int skip(int i) {
            return this.d.skip(i);
        }

        @Override // androidx.media3.extractor.ExtractorInput
        public void skipFully(int i) {
            this.d.skipFully(i);
        }

        @Override // androidx.media3.extractor.ExtractorInput
        public int peek(byte[] bArr, int i, int i2) {
            return this.d.peek(bArr, i, i2);
        }

        @Override // androidx.media3.extractor.ExtractorInput
        public boolean peekFully(byte[] bArr, int i, int i2, boolean z) {
            return this.d.peekFully(bArr, i, i2, z);
        }

        @Override // androidx.media3.extractor.ExtractorInput
        public void peekFully(byte[] bArr, int i, int i2) {
            this.d.peekFully(bArr, i, i2);
        }

        @Override // androidx.media3.extractor.ExtractorInput
        public boolean advancePeekPosition(int i, boolean z) {
            return this.d.advancePeekPosition(i, z);
        }

        @Override // androidx.media3.extractor.ExtractorInput
        public void advancePeekPosition(int i) {
            this.d.advancePeekPosition(i);
        }

        @Override // androidx.media3.extractor.ExtractorInput
        public void resetPeekPosition() {
            this.d.resetPeekPosition();
        }

        @Override // androidx.media3.extractor.ExtractorInput
        public long getPeekPosition() {
            return this.d.getPeekPosition();
        }

        @Override // androidx.media3.extractor.ExtractorInput
        public long getPosition() {
            return this.d.getPosition();
        }

        @Override // androidx.media3.extractor.ExtractorInput
        public long getLength() {
            return this.d.getLength();
        }
    }
}
