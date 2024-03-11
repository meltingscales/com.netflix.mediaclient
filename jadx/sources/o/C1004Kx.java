package o;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import o.C8143den;

/* renamed from: o.Kx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1004Kx extends AbstractC0985Ke<Pair<? extends InterfaceC5157btU, ? extends Status>> {
    public static final d e = new d(null);
    private final int a;
    private final int c;
    private final String d;

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public boolean e() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004Kx(String str, int i, int i2) {
        super("SetRating_NfRepo", null, false, 6, null);
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.a = i;
        this.c = i2;
    }

    /* renamed from: o.Kx$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("SetRating_NfRepo");
        }
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        InterfaceC1242Ud b = IE.b(SignupConstants.Field.VIDEOS, this.d, "setThumbRating");
        C8632dsu.a(b, "");
        list.add(b);
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public List<C8143den.d> c() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new C8143den.d("param", String.valueOf(this.a)));
        arrayList.add(new C8143den.d("param", String.valueOf(this.c)));
        return arrayList;
    }

    @Override // o.AbstractC0985Ke
    /* renamed from: b */
    public Pair<InterfaceC5157btU, Status> e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        InterfaceC8322diG b = interfaceC1240Ub.b(IE.b(SignupConstants.Field.VIDEOS, this.d, "summary"));
        InterfaceC5157btU interfaceC5157btU = b instanceof InterfaceC5157btU ? (InterfaceC5157btU) b : null;
        d(interfaceC5157btU);
        return new Pair<>(interfaceC5157btU, InterfaceC1078Nw.aJ);
    }

    private final void d(InterfaceC5157btU interfaceC5157btU) {
        dpR dpr;
        if (interfaceC5157btU != null) {
            Intent putExtra = new Intent("com.netflix.falkor.ACTION_NOTIFY_OF_RATINGS_CHANGE").putExtra(NetflixActivity.EXTRA_VIDEO_ID, this.d).putExtra("extra_user_thumb_rating", interfaceC5157btU.getUserThumbRating());
            C8632dsu.a(putExtra, "");
            LocalBroadcastManager.getInstance((Context) C1332Xp.b(Context.class)).sendBroadcast(putExtra);
            e.getLogTag();
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            e.getLogTag();
        }
    }
}
