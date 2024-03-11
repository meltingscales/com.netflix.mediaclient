package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ConsolidatedLoggingSessionSpecification;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* loaded from: classes3.dex */
class aTP {
    private final aOV b;
    private final Map<String, Random> d = new HashMap();
    private final Map<String, Boolean> e = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public aTP(aOV aov) {
        if (aov == null) {
            throw new IllegalStateException("Config can not be null!");
        }
        this.b = aov;
    }

    public boolean e(String str) {
        return a(str) && !b(str);
    }

    private boolean a(String str) {
        Boolean bool = this.e.get(str);
        if (bool != null) {
            C1044Mm.a("nf_log_cl", "CL session specification override exist and status enabled %b: ", bool);
            return bool.booleanValue();
        }
        C1044Mm.e("nf_log_cl", "CL session cached status not found, check if override exist");
        ConsolidatedLoggingSessionSpecification c = this.b.c(str);
        if (c == null) {
            C1044Mm.a("nf_log_cl", "CL session specification override not found. Session is enabled for %s", str);
            return true;
        } else if (c.getDisableChancePercentagePerUserSession() <= 0) {
            C1044Mm.e("nf_log_cl", "CL session is enabled without restrictions");
            return true;
        } else if (c.getDisableChancePercentagePerUserSession() >= 100) {
            C1044Mm.e("nf_log_cl", "CL session is disabled");
            return false;
        } else {
            C1044Mm.a("nf_log_cl", "CL session is enabled with restriction that %d of user sessions will not be logged.", Integer.valueOf(c.getDisableChancePercentagePerUserSession()));
            int nextInt = new Random().nextInt(100);
            boolean z = nextInt >= c.getDisableChancePercentagePerUserSession();
            C1044Mm.a("nf_log_cl", "Rnd value %d, session is enabled %b", Integer.valueOf(nextInt), Boolean.valueOf(z));
            this.e.put(str, Boolean.valueOf(z));
            return z;
        }
    }

    protected boolean b(String str) {
        ConsolidatedLoggingSessionSpecification c = this.b.c(str);
        if (c == null) {
            C1044Mm.a("nf_log_cl", "CL session specification override not found. Event can be sent for %s", str);
            return false;
        } else if (c.getSuppressPercentagePerEvent() <= 0) {
            C1044Mm.e("nf_log_cl", "Event should NOT be suppressed.");
            return false;
        } else if (c.getSuppressPercentagePerEvent() >= 100) {
            C1044Mm.e("nf_log_cl", "Event is fully suppressed.");
            return true;
        } else {
            C1044Mm.a("nf_log_cl", "Event is suppressed with restriction that %d of created events will not be logged.", Integer.valueOf(c.getSuppressPercentagePerEvent()));
            Random random = this.d.get(str);
            if (random == null) {
                random = new Random();
                this.d.put(str, random);
            }
            return !(random.nextInt(100) >= c.getSuppressPercentagePerEvent());
        }
    }
}
