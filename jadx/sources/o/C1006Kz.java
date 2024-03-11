package o;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.ArrayList;
import java.util.List;
import o.C8143den;

/* renamed from: o.Kz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1006Kz extends IT {
    private final VideoType f;
    private final String g;
    private final int i;
    private final int j;

    @Override // o.IT
    protected boolean a() {
        return true;
    }

    public C1006Kz(C0954Iz<?> c0954Iz, String str, VideoType videoType, int i, int i2, InterfaceC1757aNc interfaceC1757aNc) {
        super("SetVideoThumbRating", c0954Iz, interfaceC1757aNc);
        this.g = str;
        this.f = videoType;
        this.j = i;
        this.i = i2;
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        list.add(IE.b(SignupConstants.Field.VIDEOS, this.g, "setThumbRating"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public List<C8143den.d> c() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new C8143den.d("param", String.valueOf(this.j)));
        arrayList.add(new C8143den.d("param", String.valueOf(this.i)));
        return arrayList;
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        InterfaceC5157btU interfaceC5157btU = (InterfaceC5157btU) this.d.a(IE.b(SignupConstants.Field.VIDEOS, this.g, "summary"));
        interfaceC1757aNc.b(interfaceC5157btU, InterfaceC1078Nw.aJ);
        a(interfaceC5157btU);
    }

    private void a(InterfaceC5157btU interfaceC5157btU) {
        if (interfaceC5157btU == null) {
            C1044Mm.e("SetVideoThumbRatingTask", "null user rating - can't notify listeners");
            return;
        }
        LocalBroadcastManager.getInstance(j()).sendBroadcast(new Intent("com.netflix.falkor.ACTION_NOTIFY_OF_RATINGS_CHANGE").putExtra(NetflixActivity.EXTRA_VIDEO_ID, this.g).putExtra("extra_user_thumb_rating", interfaceC5157btU.getUserThumbRating()));
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.b((InterfaceC5157btU) null, status);
    }
}
