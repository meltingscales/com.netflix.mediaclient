package o;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.netflix.cl.model.ABTest;
import com.netflix.mediaclient.service.webclient.model.leafs.SyntheticAllocationConfigData;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: o.aPt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1828aPt implements InterfaceC1287Vw {
    private final Context a;
    private SyntheticAllocationConfigData b;

    public SyntheticAllocationConfigData a() {
        return this.b;
    }

    public C1828aPt(Context context) {
        this.a = context;
        this.b = b(C8157dfA.e(context, "syntheticAllocationConfig", (String) null));
    }

    public void c(String str) {
        if (str == null) {
            return;
        }
        this.b = b(str);
        C8157dfA.a(this.a, "syntheticAllocationConfig", str);
    }

    public boolean d() {
        return !this.b.isEmpty();
    }

    public static SyntheticAllocationConfigData b(String str) {
        Map map;
        Type type = TypeToken.getParameterized(Map.class, String.class, String.class).getType();
        if (str != null) {
            try {
                map = (Map) C8118deO.a().fromJson(str, type);
            } catch (Exception e) {
                InterfaceC1598aHf.e("unable to parse synth", e);
            }
            return new SyntheticAllocationConfigData(map);
        }
        map = null;
        return new SyntheticAllocationConfigData(map);
    }

    @Override // o.InterfaceC1287Vw
    public List<ABTest> b() {
        SyntheticAllocationConfigData syntheticAllocationConfigData = this.b;
        return syntheticAllocationConfigData != null ? syntheticAllocationConfigData.getAllTestAllocations() : Collections.emptyList();
    }
}
