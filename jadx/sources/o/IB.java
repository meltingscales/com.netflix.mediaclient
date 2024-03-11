package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.model.leafs.social.UserNotificationSummary;

/* loaded from: classes.dex */
public final class IB {
    public static TypeAdapterFactory b() {
        return new b();
    }

    /* loaded from: classes.dex */
    public static class b implements TypeAdapterFactory {
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (NotificationSummaryItem.class.isAssignableFrom(typeToken.getRawType())) {
                return (TypeAdapter<T>) UserNotificationSummary.typeAdapter(gson);
            }
            return null;
        }
    }
}
