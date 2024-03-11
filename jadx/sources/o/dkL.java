package o;

import com.netflix.msl.msg.MessageContext;
import com.netflix.msl.util.MslContext;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class dkL {
    private final dkB c;
    private final MslContext d;
    private final Map<String, AbstractC8393djy> e;

    public dkL(MslContext mslContext, MessageContext messageContext, dkB dkb) {
        this.d = mslContext;
        this.e = messageContext.c();
        this.c = dkb;
    }

    public Set<dkQ> b() {
        return this.c.e();
    }

    public boolean b(dkQ dkq) {
        return b(dkq.d(), dkq.c(), dkq.f());
    }

    public boolean b(String str, boolean z, boolean z2) {
        for (dkQ dkq : this.c.e()) {
            if (dkq.d().equals(str) && dkq.c() == z && dkq.f() == z2) {
                this.c.d(str, z, z2);
                return true;
            }
        }
        return false;
    }
}
