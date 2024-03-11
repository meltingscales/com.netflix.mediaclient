package o;

import android.content.Context;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballCallData;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.List;

/* loaded from: classes3.dex */
public class aML {
    private Context a;
    private aOV c;
    private aMU e;

    public aML(Context context, aMU amu, aOV aov) {
        this.a = context;
        this.e = amu;
        this.c = aov;
    }

    public NetflixDataRequest d(MoneyballCallData moneyballCallData, aMX amx) {
        return new aMZ(this.a, this.e, this.c, moneyballCallData, amx);
    }

    public NetflixDataRequest e(String str, String str2, List<String> list, aMX amx) {
        return new aMR(this.a, this.e, this.c, str, str2, list, amx);
    }
}
