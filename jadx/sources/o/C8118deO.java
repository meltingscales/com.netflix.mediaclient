package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.reflect.Type;

/* renamed from: o.deO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8118deO {
    public static Gson a() {
        return (Gson) C1332Xp.b(Gson.class);
    }

    public static <T> T a(JsonElement jsonElement, Class<T> cls) {
        try {
            return (T) ((Gson) C1332Xp.b(Gson.class)).fromJson(jsonElement, (Class<Object>) cls);
        } catch (JsonSyntaxException e) {
            C1044Mm.b("GsonUtils", e, "JsonSyntaxException", new Object[0]);
            InterfaceC1598aHf.a(new C1596aHd("JsonSyntaxException").b(ErrorType.m).d(e));
            return null;
        } catch (IncompatibleClassChangeError e2) {
            C1044Mm.b("GsonUtils", e2, "spy-8880: IncompatibleClassChangeError - gson reflection fail", new Object[0]);
            InterfaceC1598aHf.a(new C1596aHd("spy-8880: IncompatibleClassChangeError - gson reflection fail").b(ErrorType.m).d(e2));
            return null;
        } catch (IncompleteAnnotationException e3) {
            C1044Mm.b("GsonUtils", e3, "spy-18409: IncompleteAnnotationException ", new Object[0]);
            InterfaceC1598aHf.a(new C1596aHd("spy-18409: IncompleteAnnotationException ").b(ErrorType.m).d(e3));
            return null;
        }
    }

    public static <T> T e(JsonObject jsonObject, String str, Class<T> cls) {
        if (jsonObject.has(str)) {
            return (T) a(jsonObject.get(str), cls);
        }
        return null;
    }

    public static <T> T e(JsonObject jsonObject, String str, Type type) {
        if (jsonObject.has(str)) {
            try {
                return (T) ((Gson) C1332Xp.b(Gson.class)).fromJson(jsonObject.get(str), type);
            } catch (JsonSyntaxException e) {
                C1044Mm.b("GsonUtils", e, "spy-8880: JsonSyntaxException - gson reflection fail", new Object[0]);
                InterfaceC1598aHf.a(new C1596aHd("spy-8880: JsonSyntaxException - gson reflection fail").b(ErrorType.m));
                return null;
            }
        }
        return null;
    }

    public static boolean e(JsonObject jsonObject) {
        return jsonObject.isJsonNull() || jsonObject.toString().equals("{}");
    }
}
