package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.bqV  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C4999bqV extends AbstractC1900aSk<Void> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: a */
    public Void e(String str, String str2) {
        return null;
    }

    @Override // o.AbstractC1902aSm
    public void e(Status status) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: e */
    public void b(Void r1) {
    }

    @Override // o.AbstractC1902aSm
    public boolean h() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4999bqV(Context context, NetflixDataRequest.Transport transport) {
        super(context, transport, "MarkSurveyReadRequest");
    }

    @Override // o.AbstractC1902aSm
    public List<String> c() {
        return Arrays.asList("[\"survey\", \"mark_read\"]");
    }
}
