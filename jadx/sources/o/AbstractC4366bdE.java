package o;

import android.content.Context;
import com.netflix.falkor.FalkorException;
import org.json.JSONObject;

/* renamed from: o.bdE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4366bdE extends aZF {
    public Context C;

    public AbstractC4366bdE(Context context) {
        this.C = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC2100aZw
    /* renamed from: a */
    public JSONObject d(C8380djl c8380djl) {
        String c = c8380djl.c();
        if (AbstractC2100aZw.j(c)) {
            C1044Mm.d("nf_bladerunner", "User is not authorized, trying recovery...");
            throw new FalkorException(c);
        }
        return a(c);
    }
}
