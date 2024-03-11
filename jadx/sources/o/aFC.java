package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.event.discrete.experimentation.FlexEvent;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import javax.inject.Provider;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aFC implements InterfaceC1542aFd {
    public static final e d = new e(null);
    private final ConcurrentHashMap<String, Boolean> a;
    private final Provider<aFR> e;

    @Inject
    public aFC(Provider<aFR> provider) {
        C8632dsu.c((Object) provider, "");
        this.e = provider;
        this.a = new ConcurrentHashMap<>();
    }

    @Override // o.InterfaceC1542aFd
    public <T> T d(String str, T t, T t2) {
        FlexEvent flexEvent;
        C8632dsu.c((Object) str, "");
        boolean c = C8632dsu.c(t, t2);
        if (!C8632dsu.c(this.a.get(str), Boolean.valueOf(c))) {
            this.a.put(str, Boolean.valueOf(c));
            aFR afr = this.e.get();
            if (!c) {
                flexEvent = new FlexEvent("android.hendrix.ab.validation.mismatch", new String[]{"AndroidHendrixValidation"}, new JSONObject(), new JSONObject().put("abTestConfigValue", t).put("hendrixConfigValue", t2).put(Payload.PARAM_RENO_REQUEST_ID, afr.d()).put("rulesetVersion", afr.b()).put("fieldName", str));
            } else {
                flexEvent = new FlexEvent("android.hendrix.ab.validation.match", new String[]{"AndroidHendrixValidation"}, new JSONObject(), new JSONObject().put("fieldName", str));
            }
            Logger.INSTANCE.logEvent(flexEvent);
        }
        return t;
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }
}
