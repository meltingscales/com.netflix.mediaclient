package o;

import com.google.gson.JsonElement;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.Map;

/* renamed from: o.diI  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8324diI extends AbstractC0941Im implements InterfaceC0952Ix, InterfaceC5172btj {
    private String b;
    private boolean d = true;
    private String e;

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            C8632dsu.d(entry);
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (key != null) {
                int hashCode = key.hashCode();
                if (hashCode != -733902135) {
                    if (hashCode != 116079) {
                        if (hashCode == 1911932886 && key.equals("imageId")) {
                            this.e = value.getAsString();
                        }
                    } else if (key.equals(SignupConstants.Field.URL)) {
                        this.b = value.getAsString();
                    }
                } else if (key.equals("available")) {
                    this.d = value.getAsBoolean();
                }
            }
        }
    }
}
