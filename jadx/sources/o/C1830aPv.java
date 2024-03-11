package o;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.netflix.mediaclient.service.webclient.model.leafs.StreamingConfigOverride;

/* renamed from: o.aPv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1830aPv {
    private final Context c;
    private StreamingConfigOverride d;

    public StreamingConfigOverride c() {
        return this.d;
    }

    public C1830aPv(Context context) {
        this.c = context;
        this.d = b(C8157dfA.e(context, "streamingConfig", (String) null));
    }

    public void a(String str) {
        if (C8168dfL.h(str)) {
            C8157dfA.a(this.c, "streamingConfig", str);
            this.d = b(str);
        }
    }

    private StreamingConfigOverride b(String str) {
        StreamingConfigOverride streamingConfigOverride;
        try {
            streamingConfigOverride = (StreamingConfigOverride) ((Gson) C1332Xp.b(Gson.class)).fromJson(str, (Class<Object>) StreamingConfigOverride.class);
        } catch (JsonSyntaxException e) {
            InterfaceC1598aHf.e("JsonSyntaxException when parsing StreamingConfigOverride", e);
            streamingConfigOverride = null;
        }
        return streamingConfigOverride == null ? StreamingConfigOverride.empty() : streamingConfigOverride;
    }
}
