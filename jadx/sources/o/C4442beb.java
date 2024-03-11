package o;

import androidx.media3.common.text.Cue;
import androidx.media3.extractor.text.SimpleSubtitleDecoder;
import androidx.media3.extractor.text.Subtitle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.beb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4442beb extends SimpleSubtitleDecoder {
    private long b;
    private List<Cue> c;

    /* JADX INFO: Access modifiers changed from: protected */
    public C4442beb() {
        super("CMISC");
        this.b = 0L;
        this.c = new ArrayList();
    }

    @Override // androidx.media3.extractor.text.SimpleSubtitleDecoder, androidx.media3.extractor.text.SubtitleDecoder
    public void setPositionUs(long j) {
        super.setPositionUs(j);
        this.b = j;
    }

    @Override // androidx.media3.extractor.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] bArr, int i, boolean z) {
        C4371bdJ c4371bdJ = new C4371bdJ(this.b, bArr, i);
        if (c4371bdJ.d) {
            this.c.addAll(c4371bdJ.getCues(0L));
        } else {
            c4371bdJ.c.addAll(this.c);
            this.c.clear();
        }
        return c4371bdJ;
    }
}
