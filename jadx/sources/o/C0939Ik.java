package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.netflix.model.leafs.social.IsRead;
import com.netflix.model.leafs.social.UserNotificationSummary;
import com.netflix.model.leafs.social.UserNotificationsListSummary;

/* renamed from: o.Ik  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0939Ik extends AbstractC0944Ip {
    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (IsRead.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) IsRead.typeAdapter(gson);
        }
        if (UserNotificationSummary.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UserNotificationSummary.typeAdapter(gson);
        }
        if (UserNotificationsListSummary.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UserNotificationsListSummary.typeAdapter(gson);
        }
        return null;
    }
}
