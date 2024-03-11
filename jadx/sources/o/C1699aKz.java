package o;

import android.content.Context;
import com.google.gson.JsonSyntaxException;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlayIntegrity;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONObject;

/* renamed from: o.aKz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1699aKz {
    public static final C1699aKz d = new C1699aKz();

    private C1699aKz() {
    }

    public final C1690aKq b(Context context) {
        Throwable th;
        C1690aKq c1690aKq;
        C8632dsu.c((Object) context, "");
        String e = C8157dfA.e(context, "preference_play_integrity", (String) null);
        if (e == null) {
            return new C1690aKq();
        }
        try {
            c1690aKq = (C1690aKq) C8118deO.a().fromJson(e, (Class<Object>) C1690aKq.class);
        } catch (JsonSyntaxException e2) {
            C1044Mm.e("PlayIntegrityUtils", e2, "Failed to load status, return empty", new Object[0]);
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            C1596aHd d2 = new C1596aHd("Failed to load status", null, null, false, null, false, false, 126, null).b(ErrorType.r).b(false).d(e2);
            ErrorType errorType = d2.a;
            if (errorType != null) {
                d2.e.put("errorType", errorType.c());
                String b = d2.b();
                if (b != null) {
                    String c = errorType.c();
                    d2.a(c + " " + b);
                }
            }
            if (d2.b() != null && d2.i != null) {
                th = new Throwable(d2.b(), d2.i);
            } else if (d2.b() != null) {
                th = new Throwable(d2.b());
            } else {
                th = d2.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(d2, th);
            } else {
                dVar.e().b(d2, th);
            }
            c1690aKq = new C1690aKq();
        }
        C8632dsu.d(c1690aKq);
        return c1690aKq;
    }

    public final String d(C1690aKq c1690aKq) {
        C8632dsu.c((Object) c1690aKq, "");
        String json = C8118deO.a().toJson(c1690aKq);
        C8632dsu.a(json, "");
        return json;
    }

    public final void a(Context context, C1690aKq c1690aKq) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c1690aKq, "");
        C8157dfA.a(context, "preference_play_integrity", d(c1690aKq));
    }

    public final String c(Status status) {
        StringBuilder sb = new StringBuilder();
        if (status == null) {
            sb.append("Unknown status");
        } else {
            sb.append("Status code: ");
            sb.append(status.c());
            String l = status.l();
            if (C8168dfL.h(l)) {
                sb.append(", message: ");
                sb.append(l);
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    public final JSONObject e(String str) {
        C8632dsu.c((Object) str, "");
        try {
            return new JSONObject(str);
        } catch (Throwable th) {
            C1044Mm.b("PlayIntegrityUtils", th, "Failed to create JSON object from " + str, new Object[0]);
            return null;
        }
    }

    public final void b(Context context, C1683aKj c1683aKj) {
        boolean z;
        C8632dsu.c((Object) context, "");
        if (c1683aKj != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (c1683aKj.a("UNKNOWN_ATTESTATION")) {
                    C1044Mm.d("PlayIntegrityUtils", "PlayIntegrity supported, data exist, unknown attestation!");
                    z = false;
                } else {
                    z = true;
                }
                if (!c1683aKj.a("BASIC_OS_VERIFIED")) {
                    C1044Mm.d("PlayIntegrityUtils", "PlayIntegrity supported, data exist, device is rooted!");
                    z = false;
                }
                if (!c1683aKj.a("VENDOR_COMPATIBILITY_TEST")) {
                    C1044Mm.d("PlayIntegrityUtils", "PlayIntegrity supported, data exist, device is not certified!");
                    z = false;
                }
                jSONObject.put("passed", z);
                if (z) {
                    jSONObject.put("completionTime", System.currentTimeMillis());
                }
                jSONObject.put("deviceAttestation", c1683aKj.b());
                C8157dfA.a(context, "preference_cap_play_integrity", jSONObject.toString());
                C1044Mm.e("PlayIntegrityUtils", "saveCapability saved");
            } catch (Throwable th) {
                C1044Mm.b("PlayIntegrityUtils", th, "Failed to create saveCapability", new Object[0]);
            }
        }
    }

    private final JSONObject e(Context context) {
        try {
            String e = C8157dfA.e(context, "preference_cap_play_integrity", (String) null);
            if (C8168dfL.g(e)) {
                C1044Mm.e("PlayIntegrityUtils", "getCapability is null");
                return null;
            }
            C1044Mm.a("PlayIntegrityUtils", "getCapability: %s", e);
            C8632dsu.d((Object) e);
            return new JSONObject(e);
        } catch (Throwable th) {
            C1044Mm.b("PlayIntegrityUtils", th, "Failed to getCapability", new Object[0]);
            return null;
        }
    }

    public final C1683aKj c(Context context) {
        C8632dsu.c((Object) context, "");
        JSONObject e = e(context);
        if (e != null) {
            try {
                JSONObject jSONObject = e.getJSONObject("deviceAttestation");
                C8632dsu.d(jSONObject);
                return new C1683aKj(jSONObject);
            } catch (Throwable th) {
                C1044Mm.b("PlayIntegrityUtils", th, "getDeviceAttestationData: failed to load attestation data", new Object[0]);
            }
        }
        return null;
    }

    public final C8287dhY a() {
        return new C8287dhY(5000, 0.5d, 2.0d, 30000, 60000);
    }

    public final void c(String str) {
        Throwable th;
        C8632dsu.c((Object) str, "");
        C1044Mm.e("PlayIntegrityUtils", str);
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        C1596aHd b = new C1596aHd(str, null, null, false, null, false, false, 126, null).b(ErrorType.r).b(false);
        ErrorType errorType = b.a;
        if (errorType != null) {
            b.e.put("errorType", errorType.c());
            String b2 = b.b();
            if (b2 != null) {
                String c = errorType.c();
                b.a(c + " " + b2);
            }
        }
        if (b.b() != null && b.i != null) {
            th = new Throwable(b.b(), b.i);
        } else if (b.b() != null) {
            th = new Throwable(b.b());
        } else {
            th = b.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(b, th);
        } else {
            dVar.e().b(b, th);
        }
    }

    public final void c(C1691aKr c1691aKr) {
        C8632dsu.c((Object) c1691aKr, "");
        C1683aKj c = c1691aKr.c();
        if (c != null) {
            C8159dfC.c(new aKA(c1691aKr.a(), c));
        }
    }

    public final boolean c(long j) {
        return j <= System.currentTimeMillis() - ((long) (Config_FastProperty_PlayIntegrity.Companion.c() * 3600000));
    }

    public final boolean b(C1693aKt c1693aKt) {
        C8632dsu.c((Object) c1693aKt, "");
        if (!c1693aKt.a()) {
            if (c1693aKt.e().c() != null) {
                c("Device does not support GPS, but it was attested in past! Not expected!");
            } else {
                C1044Mm.e("PlayIntegrityUtils", "Amazon or non Google certified device, nothing to refresh");
            }
            return false;
        }
        if (c(c1693aKt.e().a().b())) {
            C1044Mm.e("PlayIntegrityUtils", "It is more than 24h since we refreshed attestation, go for it!");
        } else {
            C1044Mm.e("PlayIntegrityUtils", "It is less than 24h since we tried to get attestation, check if we actually succeeded.");
            if (c1693aKt.e().c() == null) {
                C1044Mm.e("PlayIntegrityUtils", "It is less than 24h since we tried to get attestation, but we failed to receive attestation, try again.");
            } else {
                C1044Mm.e("PlayIntegrityUtils", "It is less than 24h since we refreshed attestation, no need yet.");
                return false;
            }
        }
        return true;
    }
}
