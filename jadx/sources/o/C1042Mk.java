package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* renamed from: o.Mk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1042Mk extends AbstractC1054My {
    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (AbstractC4566bgt.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4566bgt.e(gson);
        }
        if (aHV.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) aHV.a(gson);
        }
        return null;
    }
}
