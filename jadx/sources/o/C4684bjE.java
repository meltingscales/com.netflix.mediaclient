package o;

import androidx.media3.common.Format;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.dash.manifest.SegmentBase;
import java.util.Collections;

/* renamed from: o.bjE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4684bjE extends Representation.SingleSegmentRepresentation {
    private final String a;
    private RangedUri c;
    private DashSegmentIndex d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(DashSegmentIndex dashSegmentIndex) {
        this.d = dashSegmentIndex;
    }

    public void c() {
        this.c = null;
        this.d = null;
    }

    public String d() {
        return this.a;
    }

    @Override // androidx.media3.exoplayer.dash.manifest.Representation.SingleSegmentRepresentation, androidx.media3.exoplayer.dash.manifest.Representation
    public DashSegmentIndex getIndex() {
        return this.d;
    }

    @Override // androidx.media3.exoplayer.dash.manifest.Representation.SingleSegmentRepresentation, androidx.media3.exoplayer.dash.manifest.Representation
    public RangedUri getIndexUri() {
        return this.c;
    }

    public C4684bjE(long j, Format format, String str, SegmentBase.SingleSegmentBase singleSegmentBase, String str2) {
        super(j, format, Collections.singletonList(new BaseUrl(str)), singleSegmentBase, null, Collections.emptyList(), Collections.emptyList(), str2, -1L);
        this.a = str;
    }

    public void e(long j, long j2) {
        this.c = new RangedUri(this.a, j, j2);
    }
}
