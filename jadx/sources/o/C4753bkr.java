package o;

import android.net.Uri;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AseConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.InterfaceC4682bjC;

/* renamed from: o.bkr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4753bkr {
    public static final C1045Mp e$728b6f21;
    private final InterfaceC4682bjC.e a;
    private AseConfig c;

    static {
        try {
            Object[] objArr = {null};
            Object obj = C1043Ml.p.get(179428329);
            if (obj == null) {
                obj = ((Class) C1043Ml.c((char) 0, 7, 33)).getDeclaredConstructor(C8627dsp.class);
                C1043Ml.p.put(179428329, obj);
            }
            e$728b6f21 = (C1045Mp) ((Constructor) obj).newInstance(objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final AseConfig d() {
        return this.c;
    }

    public final InterfaceC4682bjC.e e() {
        return this.a;
    }

    public C4753bkr(AseConfig aseConfig) {
        C8632dsu.c((Object) aseConfig, "");
        this.c = aseConfig;
        try {
            Object[] objArr = {this};
            Object obj = C1043Ml.p.get(1530654578);
            if (obj == null) {
                obj = ((Class) C1043Ml.c((char) 25338, 7, 40)).getDeclaredConstructor(C4753bkr.class);
                C1043Ml.p.put(1530654578, obj);
            }
            this.a = (InterfaceC4682bjC.e) ((Constructor) obj).newInstance(objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AseConfig a(AseConfig aseConfig, JsonObject jsonObject) {
        if (jsonObject.size() > 0) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            try {
                Object obj = C1043Ml.p.get(9190152);
                if (obj == null) {
                    obj = ((Class) C1043Ml.c((char) 0, 5, 112)).getMethod("c", null);
                    C1043Ml.p.put(9190152, obj);
                }
                Gson create = gsonBuilder.registerTypeAdapterFactory((TypeAdapterFactory) ((Method) obj).invoke(null, null)).create();
                e$728b6f21.getLogTag();
                try {
                    JsonElement jsonTree = create.toJsonTree(this.c);
                    C8632dsu.d(create);
                    C8632dsu.d(jsonTree);
                    b(create, jsonTree, jsonObject);
                    Object fromJson = create.fromJson(jsonTree, (Class<Object>) AseConfig.class);
                    C8632dsu.a(fromJson, "");
                    return (AseConfig) fromJson;
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            e$728b6f21.getLogTag();
        }
        return aseConfig;
    }

    private final void b(Gson gson, JsonElement jsonElement, JsonObject jsonObject) {
        if (jsonElement.isJsonObject()) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            Set<Map.Entry<String, JsonElement>> entrySet = jsonObject.entrySet();
            C8632dsu.a(entrySet, "");
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                C8632dsu.d(entry);
                String str = (String) entry.getKey();
                JsonElement jsonElement2 = (JsonElement) entry.getValue();
                if (jsonElement2.isJsonObject() && asJsonObject.has(str)) {
                    JsonElement jsonElement3 = asJsonObject.get(str);
                    C8632dsu.a(jsonElement3, "");
                    JsonObject asJsonObject2 = jsonElement2.getAsJsonObject();
                    C8632dsu.a(asJsonObject2, "");
                    b(gson, jsonElement3, asJsonObject2);
                } else if (jsonElement2.isJsonPrimitive() && asJsonObject.has(str) && asJsonObject.get(str).isJsonObject()) {
                    JsonObject jsonObject2 = (JsonObject) gson.fromJson(Uri.decode(jsonElement2.getAsString()), (Class<Object>) JsonObject.class);
                    JsonElement jsonElement4 = asJsonObject.get(str);
                    C8632dsu.a(jsonElement4, "");
                    C8632dsu.d(jsonObject2);
                    b(gson, jsonElement4, jsonObject2);
                } else {
                    asJsonObject.add(str, jsonElement2);
                }
            }
        }
    }
}
