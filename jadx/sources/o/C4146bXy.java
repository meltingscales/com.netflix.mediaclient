package o;

import android.app.Activity;
import com.netflix.mediaclient.android.activity.NetflixActivity;

/* renamed from: o.bXy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4146bXy extends AbstractC4140bXs {
    public static final a d = new a(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4146bXy(C4141bXt c4141bXt) {
        super(c4141bXt);
        C8632dsu.c((Object) c4141bXt, "");
    }

    /* renamed from: o.bXy$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final boolean e(NetflixActivity netflixActivity) {
            C8632dsu.c((Object) netflixActivity, "");
            return netflixActivity.getTutorialHelper().h() && C8153dex.x() && !C9851xl.d.d(netflixActivity);
        }
    }

    @Override // o.AbstractC4140bXs
    public boolean a() {
        Activity e = e();
        if (e != null) {
            return d.e((NetflixActivity) e);
        }
        return false;
    }

    @Override // o.AbstractC4140bXs
    public boolean b() {
        Activity e = e();
        if (e != null) {
            NetflixActivity netflixActivity = (NetflixActivity) e;
            boolean c = InterfaceC7194crc.c.b(e).c();
            if (c) {
                netflixActivity.getTutorialHelper().a();
            }
            return c;
        }
        return false;
    }
}
