package o;

import android.content.Context;
import com.netflix.cl.Logger;
import com.netflix.cl.model.context.TestAllocations;
import com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInConfigData;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.json.JSONException;

/* renamed from: o.aPo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1823aPo {
    SignInConfigData c;
    private final Context e;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.aPo$c */
    /* loaded from: classes3.dex */
    public interface c {
        InterfaceC1595aHc L();
    }

    public SignInConfigData a() {
        return this.c;
    }

    @Inject
    public C1823aPo(@ApplicationContext Context context) {
        this.e = context;
        this.c = SignInConfigData.fromJsonString(C8157dfA.e(context, "signInConfigData", (String) null));
    }

    private boolean c(Context context) {
        return C8168dfL.h(C8157dfA.e(context, "signInConfigData", (String) null));
    }

    public void b(SignInConfigData signInConfigData) {
        SignInConfigData.Fields fields;
        if (signInConfigData == null) {
            C1044Mm.d("nf_config_signin", "signInConfigData object is null - ignore overwrite");
            return;
        }
        boolean c2 = c(this.e);
        C8157dfA.a(this.e, "signInConfigData", signInConfigData.toJsonString());
        this.c = signInConfigData;
        if (!(!c2) || (fields = signInConfigData.fields) == null) {
            return;
        }
        d(this.e, fields.abAllocations);
    }

    public static boolean e(Context context) {
        return C8168dfL.h(C8157dfA.e(context, "signInConfigData", (String) null));
    }

    public static void d(Context context, List<SignInConfigData.NmAbConfig> list) {
        if (list != null) {
            aRP.c();
            for (SignInConfigData.NmAbConfig nmAbConfig : list) {
                aRP.a(nmAbConfig.testId, nmAbConfig.cellId);
            }
        }
        b(context);
    }

    private static void b(Context context) {
        HashMap<String, Integer> a = aRP.a();
        ((c) EntryPointAccessors.fromApplication(context, c.class)).L().d(a);
        ArrayList arrayList = new ArrayList(a.size());
        for (Map.Entry<String, Integer> entry : a.entrySet()) {
            arrayList.add(new XC(entry.getKey(), entry.getKey(), entry.getValue().intValue()));
        }
        for (ExternalCrashReporter externalCrashReporter : ExternalCrashReporter.a(context)) {
            externalCrashReporter.a(arrayList);
        }
        try {
            Logger.INSTANCE.addContext(new TestAllocations(aRP.d().toJSONObject()));
        } catch (JSONException e) {
            InterfaceC1597aHe.c("error parsing non-member abTestAllocations", e);
        }
    }
}
