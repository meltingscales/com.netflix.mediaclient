package o;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.player.StreamProfileType;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.DexguardInitializerError;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AseConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.StreamingConfigOverride;
import com.netflix.mediaclient.service.webclient.model.leafs.SyntheticAllocationConfigData;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.bhs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4618bhs implements InterfaceC4604bhe {
    private static StreamingConfigOverride c;
    private static final Gson d;
    private static SyntheticAllocationConfigData h;
    public static final C4618bhs a = new C4618bhs();
    private static final String b = "AseConfigMergeHelper";
    private static HashMap<C4613bhn, AseConfig> e = new HashMap<>();

    private C4618bhs() {
    }

    static {
        GsonBuilder gsonBuilder = new GsonBuilder();
        try {
            Object obj = C1043Ml.p.get(9190152);
            if (obj == null) {
                obj = ((Class) C1043Ml.c((char) 0, 5, 112)).getMethod("c", null);
                C1043Ml.p.put(9190152, obj);
            }
            Gson create = gsonBuilder.registerTypeAdapterFactory((TypeAdapterFactory) ((Method) obj).invoke(null, null)).create();
            C8632dsu.a(create, "");
            d = create;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // o.InterfaceC4604bhe
    public void c(StreamingConfigOverride streamingConfigOverride, SyntheticAllocationConfigData syntheticAllocationConfigData) {
        synchronized (e) {
            h = syntheticAllocationConfigData;
            c = streamingConfigOverride;
            e.clear();
            dpR dpr = dpR.c;
        }
    }

    public final AseConfig b(StreamProfileType streamProfileType, String str) {
        JsonObject jsonObject;
        C8632dsu.c((Object) streamProfileType, "");
        C8632dsu.c((Object) str, "");
        C4613bhn c4613bhn = new C4613bhn(streamProfileType, str);
        synchronized (e) {
            AseConfig aseConfig = e.get(c4613bhn);
            if (aseConfig != null) {
                return aseConfig;
            }
            C1044Mm.c(b, "generate streaming config for flavor %s, uiLabel %s .", streamProfileType.name(), str);
            C4623bhx c4623bhx = C4623bhx.d;
            JsonObject b2 = c4623bhx.b(str);
            JsonObject b3 = c4623bhx.b(streamProfileType);
            try {
                StreamingConfigOverride streamingConfigOverride = c;
                if (streamingConfigOverride == null || (jsonObject = streamingConfigOverride.getOverride(b2, b3, str, streamProfileType)) == null) {
                    jsonObject = new JsonObject();
                }
                C8632dsu.d(jsonObject);
                a.e(jsonObject);
                AseConfig aseConfig2 = (AseConfig) d.fromJson((JsonElement) jsonObject, (Class<Object>) AseConfig.class);
                HashMap<C4613bhn, AseConfig> hashMap = e;
                C8632dsu.d(aseConfig2);
                hashMap.put(c4613bhn, aseConfig2);
                return aseConfig2;
            } catch (Exception e2) {
                C1044Mm.b(b, e2, "unable to parse config", new Object[0]);
                Object fromJson = d.fromJson((JsonElement) new JsonObject(), (Class<Object>) AseConfig.class);
                C8632dsu.a(fromJson, "");
                return (AseConfig) fromJson;
            } catch (ExceptionInInitializerError e3) {
                throw new DexguardInitializerError("SPY-37220 - dexguard unable to decrypt ASE", e3);
            }
        }
    }

    public final C4854bnj a() {
        AseConfig d2 = d();
        if (d2 != null) {
            return d2.cf();
        }
        return null;
    }

    public final AseConfig d() {
        return b(StreamProfileType.i, "Default");
    }

    private final void e(JsonObject jsonObject) {
        Map d2;
        Map k;
        Throwable th;
        boolean d3;
        SyntheticAllocationConfigData syntheticAllocationConfigData = h;
        if (syntheticAllocationConfigData != null) {
            for (Map.Entry<String, String> entry : syntheticAllocationConfigData.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                JsonElement jsonElement = jsonObject.get("groupName");
                if (jsonElement != null) {
                    try {
                        String asString = jsonElement.getAsString();
                        C8632dsu.a(asString, "");
                        d3 = duD.d((CharSequence) asString, (CharSequence) ("Test" + key + ".Cell" + value), false, 2, (Object) null);
                        if (!d3) {
                            String asString2 = jsonElement.getAsString();
                            jsonObject.addProperty("groupName", asString2 + "|Test" + key + ".Cell" + value);
                        }
                    } catch (Exception e2) {
                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                        d2 = dqE.d();
                        k = dqE.k(d2);
                        C1596aHd c1596aHd = new C1596aHd("unable to create groupname", e2, null, true, k, false, false, 96, null);
                        ErrorType errorType = c1596aHd.a;
                        if (errorType != null) {
                            c1596aHd.e.put("errorType", errorType.c());
                            String b2 = c1596aHd.b();
                            if (b2 != null) {
                                String c2 = errorType.c();
                                c1596aHd.a(c2 + " " + b2);
                            }
                        }
                        if (c1596aHd.b() != null && c1596aHd.i != null) {
                            th = new Throwable(c1596aHd.b(), c1596aHd.i);
                        } else if (c1596aHd.b() != null) {
                            th = new Throwable(c1596aHd.b());
                        } else {
                            th = c1596aHd.i;
                            if (th == null) {
                                th = new Throwable("Handled exception with no message");
                            } else if (th == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        }
                        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                        InterfaceC1598aHf a2 = dVar.a();
                        if (a2 != null) {
                            a2.e(c1596aHd, th);
                        } else {
                            dVar.e().b(c1596aHd, th);
                        }
                    }
                }
            }
        }
    }
}
