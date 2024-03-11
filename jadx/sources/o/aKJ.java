package o;

import android.content.Intent;
import android.text.TextUtils;
import com.netflix.cl.model.event.session.command.ViewNewsFeedCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.netflixcom.DeepLinkUtils;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aKJ implements aKP {
    public static final a e = new a(null);
    private final Map<String, String> a;

    @Override // o.aKP
    public boolean c(List<String> list) {
        return true;
    }

    public aKJ(Map<String, String> map) {
        C8632dsu.c((Object) map, "");
        this.a = map;
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("NetflixComExtrasHandler");
        }
    }

    @Override // o.aKP
    /* renamed from: c */
    public ViewNewsFeedCommand d() {
        return new ViewNewsFeedCommand();
    }

    @Override // o.aKP
    public NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        Object obj;
        C8632dsu.c((Object) intent, "");
        e.getLogTag();
        DeepLinkUtils.INSTANCE.d(netflixActivity, false);
        if (list != null && list.size() >= 2) {
            Iterator<T> it = list.subList(1, list.size()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (TextUtils.isDigitsOnly((String) obj)) {
                    break;
                }
            }
            String str2 = (String) obj;
            if (str2 != null) {
                if (C8632dsu.c((Object) "remind-me", (Object) list.get(0))) {
                    NflxHandler.Response a2 = new aKZ(this.a).a(str2, netflixActivity, intent, str);
                    C8632dsu.a(a2, "");
                    return a2;
                }
                NflxHandler.Response a3 = new C1705aLe(this.a).a(str2, netflixActivity, intent, str);
                C8632dsu.a(a3, "");
                return a3;
            }
        }
        return NflxHandler.Response.HANDLING;
    }
}
