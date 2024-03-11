package o;

import com.netflix.msl.util.MslContext;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class dkH {
    public dkI d(MslContext mslContext, InputStream inputStream, Set<AbstractC8412dkq> set, Map<String, AbstractC8393djy> map) {
        return new dkI(mslContext, inputStream, set, map);
    }

    public dkE d(MslContext mslContext, OutputStream outputStream, dkG dkg, AbstractC8393djy abstractC8393djy) {
        return new dkE(mslContext, outputStream, dkg, abstractC8393djy);
    }

    public dkB a(MslContext mslContext, dkO dko, dkU dku, long j) {
        return new dkB(mslContext, dko, dku, j);
    }

    public dkB d(MslContext mslContext, dkO dko, dkU dku) {
        return new dkB(mslContext, dko, dku);
    }

    public dkB c(MslContext mslContext, dkG dkg) {
        return new dkK(mslContext, dkg);
    }
}
