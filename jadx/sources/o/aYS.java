package o;

import android.content.Context;
import com.google.common.base.Charsets;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.JSONArray;
import com.netflix.android.org.json.JSONException;
import com.netflix.android.org.json.JSONObject;
import com.netflix.cl.model.SignOutReason;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.msl.MslServiceState;
import com.netflix.mediaclient.service.msl.client.EsnMigrationFailedException;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.net.AuthCookieHolder;
import com.netflix.model.leafs.originals.interactive.animations.Ease;
import com.netflix.msl.EsnMigrationFailedNoNetworkException;
import com.netflix.msl.MslCryptoException;
import com.netflix.msl.MslEntityAuthException;
import com.netflix.msl.MslErrorException;
import com.netflix.msl.MslException;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.msg.MessageContext;
import com.netflix.msl.msg.MslControl;
import com.netflix.msl.util.MslContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import o.C2082aZe;
import o.C8382djn;
import o.C8404dki;
import o.InterfaceC5129bst;
import o.aYU;

/* loaded from: classes3.dex */
public final class aYS extends aYZ implements InterfaceC5170bth {
    public AbstractC8399dkd b() {
        return this.f13457o;
    }

    public C8382djn e() {
        return this.e;
    }

    public aYS(Context context, aOV aov, UserAgent userAgent, aHJ ahj, InterfaceC5128bss interfaceC5128bss, aYH ayh) {
        super(context, aov, ahj, userAgent, interfaceC5128bss, ayh);
        t();
    }

    private void t() {
        if (this.b.ao()) {
            C1044Mm.e("nf_msl_client", "handleEsnMigration:: ESN migration required, start...");
            try {
                C1044Mm.e("nf_msl_client", "Remove CAD service token if exist");
                this.t.d("cad");
                this.t.d();
                q();
                this.t.h();
            } catch (EsnMigrationFailedException | MslCryptoException | MslEntityAuthException e) {
                C1044Mm.b("nf_msl_client", e, "ESN migration failed, blow MSL store and redo all...", new Object[0]);
                p();
            }
        }
    }

    private void p() {
        if (ConnectivityUtils.n(this.d)) {
            C1044Mm.j("nf_msl_client", "handleEsnMigrationFailure:: force clear MSL store to log user out!");
            l();
            InterfaceC1598aHf.a(new C1596aHd("ESN migration failed!").b(false).b(ErrorType.p));
            return;
        }
        C1044Mm.j("nf_msl_client", "handleEsnMigrationFailure:: No connectivity, report failure to initiate MSL client due to networking!");
        C8189dfg.e(this.d, this.b.w().q());
        InterfaceC1598aHf.a(new C1596aHd("ESN migration failed, no network!").b(false).b(ErrorType.p));
        throw new EsnMigrationFailedNoNetworkException();
    }

    private C2083aZf a(URL url, byte[] bArr, List<Object> list) {
        C1044Mm.e("nf_msl_client", "Create app boot request with WEA");
        aYU.b d = aYU.d();
        Boolean bool = Boolean.TRUE;
        aYU d2 = d.e(bool).b(this).a(bArr).d(this.n).i(bool).c(true).e(this.j).f(bool).b(AleCryptoBouncyCastle.MAX_RANDOM_BYTES).d();
        C2083aZf c2083aZf = new C2083aZf();
        C2082aZe c2082aZe = new C2082aZe(this.f, this.j, url, NetworkRequestType.APPBOOT, list);
        c2083aZf.b = c2082aZe;
        c2083aZf.a = this.l.a(this.m, d2, c2082aZe, aYZ.c);
        return c2083aZf;
    }

    private C2083aZf a(String str, byte[] bArr, Map<String, String> map, String str2, AbstractC8424dlb abstractC8424dlb, Boolean bool, Object obj, List<Object> list, boolean z, boolean z2, int i) {
        URL b = C2081aZd.b(this.b, str, obj);
        MessageContext e = e(bArr, str2, abstractC8424dlb, bool, z, z2);
        C2083aZf c2083aZf = new C2083aZf();
        C2082aZe c2082aZe = new C2082aZe(this.f, this.j, b, obj, map, list);
        c2083aZf.b = c2082aZe;
        c2083aZf.a = this.l.a(this.m, e, c2082aZe, i);
        return c2083aZf;
    }

    private C2083aZf e(String str, byte[] bArr, MslContext mslContext, String str2, AbstractC8424dlb abstractC8424dlb, Boolean bool, Object obj, List<Object> list, boolean z) {
        URL b = C2081aZd.b(this.b, str, obj);
        MessageContext e = e(bArr, str2, abstractC8424dlb, bool, false, z);
        C2083aZf c2083aZf = new C2083aZf();
        C2082aZe c2082aZe = new C2082aZe(this.f, this.j, b, obj, list);
        c2083aZf.b = c2082aZe;
        c2083aZf.a = this.l.a(mslContext, e, c2082aZe, aYZ.c);
        return c2083aZf;
    }

    private MessageContext e(byte[] bArr, String str, AbstractC8424dlb abstractC8424dlb, Boolean bool, boolean z, boolean z2) {
        boolean z3 = abstractC8424dlb instanceof dkY;
        boolean z4 = z3 || z;
        C1044Mm.a("nf_msl_client", "createMessageContext requestingTokens=%b forceRequestTokens=%b isUserIdTokenAuthenticationData=%b %s", Boolean.valueOf(z4), Boolean.valueOf(z), Boolean.valueOf(z3), str);
        C1044Mm.a("nf_msl_client", "createMessageContext:: requestingTokens: %b", Boolean.valueOf(z4));
        aYU.b d = aYU.d().c(abstractC8424dlb).b(this).a(bArr).c(str).c(bool).d(this.n).a(Boolean.valueOf(z4)).d(Boolean.valueOf(z2));
        Boolean bool2 = Boolean.TRUE;
        return d.i(bool2).b(bool2).e(this.j).f(bool2).b(AleCryptoBouncyCastle.MAX_RANDOM_BYTES).d();
    }

    private C8384djp e(String str, djN djn, djT djt, InterfaceC8429dlg interfaceC8429dlg, dkO dko) {
        HashMap hashMap = new HashMap();
        aYP ayp = new aYP(new C1839aQd(str));
        hashMap.put(djI.j, new djO(djt, new C2084aZg()));
        hashMap.put(djL.q, new djM(ayp, dko));
        aYP ayp2 = new aYP(this.b.w());
        C1044Mm.e("nf_msl_client", "Create migration MSL context for WEA");
        hashMap.put(djL.t, new djU(ayp2));
        HashMap hashMap2 = new HashMap();
        hashMap2.put(C8419dkx.i, new C2086aZi());
        return C8384djp.a().b(djn).c(interfaceC8429dlg).c(hashMap).d(hashMap2).b(this.f13457o).d(new HashSet<C8404dki>() { // from class: com.netflix.mediaclient.service.msl.client.AndroidMslClient$1
            {
                add(C8404dki.b);
            }
        }).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String d(String str, String str2, Map<String, String> map, String str3, String str4) {
        Object jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(Ease.ANIMATION_EASE_TYPE.PATH, str);
        JSONObject jSONObject3 = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject3.put(entry.getKey(), entry.getValue());
            }
        }
        if (str3 == 0) {
            str3 = new JSONObject();
        }
        jSONObject2.put("query", str3);
        jSONObject2.put("headers", jSONObject3);
        if (C8168dfL.h(str4)) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject2.put("payload", jSONObject4);
            jSONObject4.put(NotificationFactory.DATA, str4);
        }
        if (C8168dfL.h(str2)) {
            jSONObject2.put("method", str2);
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        jSONArray.put(jSONObject2);
        return jSONArray.toString();
    }

    public C8380djl d(byte[] bArr) {
        try {
            return a(new String(bArr, StandardCharsets.UTF_8));
        } catch (JSONException unused) {
            C1044Mm.j("nf_msl_client", "Failed to parse as standard API response, trying NQ");
            return b(bArr);
        }
    }

    private C8380djl a(String str) {
        byte[] bArr;
        JSONArray jSONArray = new JSONArray(str);
        String optString = jSONArray.getJSONObject(0).optString("edgemsl-version");
        JSONObject jSONObject = jSONArray.getJSONObject(1);
        HashMap hashMap = new HashMap();
        if (jSONObject.has("headers")) {
            for (Map.Entry<String, Object> entry : C2081aZd.b(jSONObject.getJSONObject("headers")).entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        String optString2 = jSONObject.optString("status");
        int parseInt = C8168dfL.h(optString2) ? Integer.parseInt(optString2) : 520;
        JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
        if (jSONObject2.has(NotificationFactory.DATA)) {
            C1044Mm.e("nf_msl_client", "unwrapApiResponse::Base64 received");
            bArr = C8427dle.e(jSONObject2.getString(NotificationFactory.DATA));
        } else if (jSONObject2.has("json")) {
            C1044Mm.e("nf_msl_client", "unwrapApiResponse::Json received");
            Object obj = jSONObject2.get("json");
            if (obj instanceof String) {
                bArr = ((String) obj).getBytes(StandardCharsets.UTF_8);
            } else if (obj instanceof JSONObject) {
                bArr = ((JSONObject) obj).toString(2).getBytes(StandardCharsets.UTF_8);
            } else if (obj instanceof JSONArray) {
                bArr = ((JSONArray) obj).toString(2).getBytes(StandardCharsets.UTF_8);
            } else {
                throw new IllegalStateException("Only String/JSONObject/JSONArray are supported");
            }
        } else {
            C1044Mm.j("nf_msl_client", "No payload contents in data or json");
            bArr = null;
        }
        return new C8380djl(optString, hashMap, parseInt, bArr);
    }

    private C8380djl b(byte[] bArr) {
        return new C8380djl(null, new HashMap(), 200, bArr);
    }

    private void b(Throwable th, String str) {
        if (!ConnectivityUtils.n(this.d)) {
            C1044Mm.j("nf_msl_client", "Appboot failed using ECC key because of missing Internet connection, do not report!");
            return;
        }
        C1044Mm.b("nf_msl_client", th, "Appboot request failed using ECC key, retry with RSA", new Object[0]);
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appBootUrl", str);
        } else {
            hashMap.put("appBootUrl", "default");
        }
        hashMap.put("failureToStartApp", "false");
        hashMap.put("primaryKeyType", "ECC");
        hashMap.put("fallbackKeyType", AleCryptoBouncyCastle.RSA_KEY_ALG);
        InterfaceC1598aHf.e("Appboot request failed using ECC key, retry with RSA", th, ErrorType.p, false, hashMap);
    }

    private JSONObject d(JSONObject jSONObject, List<Object> list) {
        boolean d = this.b.j().d();
        URL b = aYX.b(this.b, aYX.d(this));
        if (!d) {
            C1044Mm.a("nf_msl_client", "AppBoot server does NOT support HTTPS, execute by http only %s", b.toExternalForm());
            return a(b, jSONObject, list);
        }
        C1044Mm.a("nf_msl_client", "AppBoot server does support HTTPS, execute first by https, url %s", b.toExternalForm());
        try {
            return a(b, jSONObject, list);
        } catch (Throwable th) {
            if (aYW.b()) {
                C1044Mm.a("nf_msl_client", th, "Failed to execute appBoot using https! Trying http");
                String replaceFirst = b.toExternalForm().replaceFirst("^https", "http");
                C1044Mm.a("nf_msl_client", "AppBoot server execute second time by http, url %s", replaceFirst);
                return a(new URL(replaceFirst), jSONObject, list);
            }
            C1044Mm.b("nf_msl_client", th, "Failed to execute appBoot using https! Http fallback not allowed, report failure", new Object[0]);
            throw th;
        }
    }

    private JSONObject b(String str, JSONObject jSONObject, List<Object> list) {
        return a(aYX.b(str, this.b.w().k()), jSONObject, list);
    }

    public JSONObject d(String str, JSONObject jSONObject, List<Object> list) {
        int c;
        int c2 = aYW.c() + 1;
        C1044Mm.a("nf_msl_client", "Execute appbootRequest with URL %s, total number of retries %d", str, Integer.valueOf(c2));
        int i = 0;
        while (i < c2) {
            C1044Mm.a("nf_msl_client", "Execute appbootRequest attempt %d out of %d", Integer.valueOf(i + 1), Integer.valueOf(c2));
            aYX.a(i);
            try {
                return c(str, jSONObject, list);
            } finally {
                if (i != c) {
                }
            }
        }
        throw new IllegalStateException("We should never end here");
    }

    private JSONObject c(String str, JSONObject jSONObject, List<Object> list) {
        try {
            return b(str, jSONObject, list);
        } catch (Throwable th) {
            this.e.b(new C8382djn.c(th, ConnectivityUtils.n(this.d)));
            if (this.b.aF()) {
                b(th, str);
                if (!aYW.a()) {
                    C1044Mm.b("nf_msl_client", th, "Appboot request can not be retries with fallback key. No fallback.", new Object[0]);
                    throw th;
                }
                try {
                    return b(str, jSONObject, list);
                } catch (Throwable th2) {
                    C1044Mm.b("nf_msl_client", th2, "Appboot request failed using fallback key RSA. No further fallback, report appboot failure", new Object[0]);
                    this.e.e(new C8382djn.c(th2, ConnectivityUtils.n(this.d)));
                    throw th2;
                }
            }
            C1044Mm.b("nf_msl_client", th, "Appboot request failed using primary key RSA. No fallback.", new Object[0]);
            throw th;
        }
    }

    public JSONObject a(Long l, String str) {
        return aYX.e(l, str);
    }

    public JSONObject b(JSONObject jSONObject, List<Object> list) {
        int c;
        int c2 = aYW.c() + 1;
        C1044Mm.a("nf_msl_client", "Execute appbootRequest with default URL, total number of retries %d", Integer.valueOf(c2));
        int i = 0;
        while (i < c2) {
            C1044Mm.a("nf_msl_client", "Execute appbootRequest attempt %d out of", Integer.valueOf(i + 1), Integer.valueOf(c2));
            aYX.a(i);
            try {
                return a(jSONObject, list);
            } finally {
                if (i != c) {
                }
            }
        }
        throw new IllegalStateException("We should never end here");
    }

    private JSONObject a(JSONObject jSONObject, List<Object> list) {
        try {
            return d(jSONObject, list);
        } catch (Throwable th) {
            this.e.b(new C8382djn.c(th, ConnectivityUtils.n(this.d)));
            if (this.b.aF()) {
                b(th, (String) null);
                if (!aYW.a()) {
                    C1044Mm.b("nf_msl_client", th, "Appboot request can not be retries with fallback key. No fallback.", new Object[0]);
                    throw th;
                }
                C1044Mm.j("nf_msl_client", "Trying appboot request with RSA key, after request with ECC key failed");
                try {
                    return d(jSONObject, list);
                } catch (Throwable th2) {
                    C1044Mm.b("nf_msl_client", th2, "Appboot request failed using fallback key RSA. No further fallback, report appboot failure", new Object[0]);
                    this.e.e(new C8382djn.c(th2, ConnectivityUtils.n(this.d)));
                    throw th2;
                }
            }
            C1044Mm.b("nf_msl_client", th, "Appboot request failed using primary key RSA. No fallback.", new Object[0]);
            throw th;
        }
    }

    private JSONObject a(URL url, JSONObject jSONObject, List<Object> list) {
        C2083aZf c2083aZf = null;
        try {
            try {
                String jSONObject2 = jSONObject.toString();
                Charset charset = StandardCharsets.UTF_8;
                c2083aZf = a(url, jSONObject2.getBytes(charset), list);
                String str = new String(a(c2083aZf).b, charset);
                C1044Mm.e("nf_msl_client", "AppBoot response body: ");
                C1044Mm.c("nf_msl_client", str);
                JSONObject jSONObject3 = new JSONObject(str);
                a(jSONObject3, this.p);
                return jSONObject3;
            } catch (MalformedURLException e) {
                throw new MslInternalException("Unable to parse our own url for " + url, e);
            }
        } finally {
            C2081aZd.b(c2083aZf);
        }
    }

    private void a(JSONObject jSONObject, InterfaceC8381djm interfaceC8381djm) {
        if (interfaceC8381djm == null) {
            C1044Mm.j("nf_msl_client", "extractMslTrustStore:: rsaStore is null!");
        } else if (jSONObject.has(UmaAlert.ICON_ERROR)) {
            C1044Mm.j("nf_msl_client", "Error in appboot response, pass whole response to be handled");
        } else if (!jSONObject.has("msltruststore")) {
            throw new MslException(C8373dje.bd, String.format("Unable to find msltruststore in appboot response (%s)", jSONObject));
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("msltruststore");
            if (jSONObject2.has(UmaAlert.ICON_ERROR)) {
                throw new MslException(C8373dje.bd, String.format("Unable to get msltruststore from appboot response because of error (%s)", jSONObject.getString(UmaAlert.ICON_ERROR)));
            }
            if (!jSONObject2.has("keys")) {
                throw new MslException(C8373dje.bd, String.format("Unable to find msltruststore keys in appboot response (%s)", jSONObject));
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("keys");
            Iterator keys = jSONObject3.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                interfaceC8381djm.e(str, jSONObject3.getString(str));
            }
        }
    }

    @Override // o.InterfaceC8387djs
    public C8386djr d(String str, byte[] bArr, Map<String, String> map, String str2, AbstractC8424dlb abstractC8424dlb, Boolean bool, Object obj, List<Object> list, boolean z, boolean z2) {
        return d(str, bArr, map, str2, abstractC8424dlb, bool, obj, list, z, z2, aYZ.c);
    }

    public C8386djr d(String str, byte[] bArr, Map<String, String> map, String str2, AbstractC8424dlb abstractC8424dlb, Boolean bool, Object obj, List<Object> list, boolean z, boolean z2, int i) {
        C2083aZf a = a(str, bArr, map, str2, abstractC8424dlb, bool, obj, list, z, z2, i);
        try {
            return a(a);
        } finally {
            C2081aZd.b(a);
        }
    }

    private C8386djr c(String str, byte[] bArr, MslContext mslContext, String str2, AbstractC8424dlb abstractC8424dlb, Boolean bool, Object obj, List<Object> list, boolean z) {
        C2083aZf e = e(str, bArr, mslContext, str2, abstractC8424dlb, bool, obj, list, z);
        try {
            return a(e);
        } finally {
            C2081aZd.b(e);
        }
    }

    private void d(MslContext mslContext, String str, AbstractC8424dlb abstractC8424dlb) {
        InterfaceC5129bst.b bVar = new InterfaceC5129bst.b("/android/7.64/api", "GET", null, "path%3D%5B%27ping%27%5D", null);
        String d = d(bVar.e, bVar.b, bVar.d, bVar.c, bVar.a);
        String externalForm = this.b.j().a("/msl").toExternalForm();
        Charset charset = StandardCharsets.UTF_8;
        C1044Mm.a("nf_msl_client", "ping:: raw api response: %s", new String(d(c(externalForm, d.getBytes(charset), mslContext, str, abstractC8424dlb, Boolean.FALSE, "PING", Collections.emptyList(), false).b).a(), charset));
    }

    public C8386djr a(C2083aZf c2083aZf) {
        try {
            MslControl.g gVar = c2083aZf.a.get();
            if (gVar == null) {
                throw new IllegalStateException("No MslChannel");
            }
            dkI dki = gVar.e;
            C1044Mm.e("nf_msl_client", "processRequest:: check input stream for error... ");
            C8416dku e = dki.e();
            if (e == null) {
                C1044Mm.e("nf_msl_client", "processRequest:: response received... ");
                return new C8386djr(C8426dld.d(dki, 16384), d(c2083aZf.b, dki));
            }
            d(c2083aZf);
            c(c2083aZf);
            d(e);
            throw new MslErrorException(e);
        } catch (InterruptedException e2) {
            C1044Mm.b("nf_msl_client", e2, "Interrupted exception found ", new Object[0]);
            d(c2083aZf);
            c(c2083aZf);
            throw new RuntimeException(e2);
        } catch (ExecutionException e3) {
            d(c2083aZf);
            c(c2083aZf);
            C2081aZd.b(e3);
            C2081aZd.e(e3);
            throw new RuntimeException(e3.getCause());
        }
    }

    private void d(C2083aZf c2083aZf) {
        byte[] bArr;
        C2082aZe c2082aZe = c2083aZf.b;
        if (c2082aZe == null) {
            C1044Mm.d("nf_msl_client", "MslUrlHttpURLConnectionImpl is missing!");
            return;
        }
        OutputStream a = c2082aZe.a();
        if (a == null) {
            C1044Mm.d("nf_msl_client", "MslUrlHttpURLConnectionImpl last used OS is missing! Unable to extract a request bytes.");
        } else if (a instanceof C2082aZe.b) {
            C1044Mm.e("nf_msl_client", "OS is LoggingOutputStream, extract sent raw bytes");
            try {
                bArr = ((C2082aZe.b) a).d();
            } catch (Throwable th) {
                C1044Mm.b("nf_msl_client", th, "Unable to extract a request bytes!", new Object[0]);
                bArr = null;
            }
            if (bArr != null) {
                C8427dle.e(bArr);
            }
        } else {
            C1044Mm.d("nf_msl_client", "Unable to extract a request bytes, OS is NOT LoggingOutputStream");
        }
    }

    private void c(C2083aZf c2083aZf) {
        byte[] bArr;
        C2082aZe c2082aZe = c2083aZf.b;
        if (c2082aZe == null) {
            C1044Mm.d("nf_msl_client", "MslUrlHttpURLConnectionImpl is missing!");
            return;
        }
        InputStream c = c2082aZe.c();
        if (c == null) {
            C1044Mm.d("nf_msl_client", "MslUrlHttpURLConnectionImpl last used IS is missing! Unable to extract a response body.");
        } else if (c instanceof C2082aZe.d) {
            C1044Mm.e("nf_msl_client", "IS is LoggingBufferedInputStream, extract payload");
            try {
                bArr = ((C2082aZe.d) c).e();
            } catch (Throwable th) {
                C1044Mm.b("nf_msl_client", th, "Unable to extract a response body", new Object[0]);
                bArr = null;
            }
            if (bArr != null) {
                C1044Mm.a("nf_msl_client", "Response on exception: %s", new String(bArr, Charsets.UTF_8));
            }
        } else {
            C1044Mm.d("nf_msl_client", "Unable to extract a response body, IS is NOT LoggingBufferedInputStream");
        }
    }

    private void a(C8416dku c8416dku) {
        if (c8416dku.a() == 106046) {
            C8157dfA.d(k(), "nf_drm_force_esn_migration", true);
            if (AbstractApplicationC1040Mh.e()) {
                C1044Mm.e("nf_msl_client", "ESN migration:: our app is in foreground, display error dialog.");
                this.g.b(aMH.c().a().a(k(), StatusCode.MSL_WEA_ESN_MIGRATION_NEEDED));
                return;
            }
            C1044Mm.e("nf_msl_client", "ESN migration:: our app is in background, kill it and execute ESN migration on next app start.");
            C8054ddD.e(k());
        }
    }

    private Map<String, List<String>> d(C2082aZe c2082aZe, dkI dki) {
        C1044Mm.a("nf_msl_client", "getHeaders:: source hashcode: %d", Integer.valueOf(dki.i()));
        return c2082aZe.d(dki.i());
    }

    private void d(C8416dku c8416dku) {
        e(c8416dku);
        a(c8416dku);
        c(c8416dku);
    }

    private void c(C8416dku c8416dku) {
        if (c8416dku.a() == 204055) {
            dkO i = this.t.i();
            boolean z = true;
            boolean z2 = i != null;
            if (!z2 || this.t.d(i) == null) {
                z = false;
            }
            long c = C8106deC.c();
            C1044Mm.d("nf_msl_client", "Entity auth rate limit tripped, master token is being reported as missing by server!");
            C1044Mm.e("nf_msl_client", "Client has master token: %b, crypto context exist: %b, available space: %d", Boolean.valueOf(z2), Boolean.valueOf(z), Long.valueOf(c));
            C1596aHd c1596aHd = new C1596aHd("MSL error 204055: Entity auth rate limit tripped.");
            c1596aHd.b(false);
            c1596aHd.e("masterTokenExist", String.valueOf(z2));
            c1596aHd.e("cryptoContextExists", String.valueOf(z));
            c1596aHd.e("availableFileSystem", String.valueOf(c));
            InterfaceC1598aHf.a(c1596aHd);
        }
    }

    private void e(C8416dku c8416dku) {
        boolean z;
        synchronized (this.h) {
            if (this.h.get()) {
                C1044Mm.j("nf_msl_client", "Entity mismatch already processed, do nothing!");
                return;
            }
            if (c8416dku.a() == 106030) {
                C1044Mm.d("nf_msl_client", "Message sender is not the master token entity, log user out!");
                z = true;
                this.h.set(true);
            } else {
                z = false;
                this.h.set(false);
            }
            if (z) {
                m();
            }
        }
    }

    private void m() {
        l();
        this.r.e(SignOutReason.entityMismatch, true);
        InterfaceC1598aHf.a(new C1596aHd("MSL entity mismatch handled.").b(false));
    }

    private void q() {
        aYY ayy;
        String str;
        dkO i = this.t.i();
        if (i == null) {
            l();
            return;
        }
        String e = C8157dfA.e(k(), "useragent_current_profile_id", (String) null);
        if (e == null) {
            l();
            return;
        }
        dkU a = this.t.a(e);
        if (a == null) {
            l();
            return;
        }
        this.k.b(MslServiceState.b);
        C1044Mm.e("nf_msl_client", "Migrate ESN For Widevine Entity Auth");
        djN djn = new djN(this.m, i, C2078aZa.e(this.b, i().d()), null);
        aYY ayy2 = new aYY(this.d, this.r, this.f13457o);
        C8384djp e2 = e(this.b.w().m(), djn, this.p, ayy2, i);
        try {
            this.k.b(MslServiceState.a);
            d(e2, e, (AbstractC8424dlb) null);
            ayy = ayy2;
            str = "nf_msl_client";
            try {
                d(e2, e, new dkW(this.m, this.t.i(), a, e2.h().i(), null));
            } catch (MslErrorException e3) {
                e = e3;
                C1044Mm.b(str, e, "migrateESN: ping() failed with error: ", new Object[0]);
                throw new EsnMigrationFailedException();
            } catch (MslException e4) {
                e = e4;
                C1044Mm.b(str, e, "migrateESN: ping() failed with error: ", new Object[0]);
                throw new EsnMigrationFailedException();
            } catch (IOException e5) {
                e = e5;
                C1044Mm.b(str, e, "migrateESN: ping() failed with error, retry", new Object[0]);
                d(e2, e, (AbstractC8424dlb) null);
                d(e2, e, new dkW(this.m, this.t.i(), a, e2.h().i(), null));
                this.t = ayy;
                this.m = e(this.b.w().m(), this.p, this.t);
                InterfaceC1598aHf.a(new C1596aHd("ESN migration success.").b(false).b(ErrorType.p));
            }
        } catch (MslErrorException e6) {
            e = e6;
            str = "nf_msl_client";
            C1044Mm.b(str, e, "migrateESN: ping() failed with error: ", new Object[0]);
            throw new EsnMigrationFailedException();
        } catch (MslException e7) {
            e = e7;
            str = "nf_msl_client";
            C1044Mm.b(str, e, "migrateESN: ping() failed with error: ", new Object[0]);
            throw new EsnMigrationFailedException();
        } catch (IOException e8) {
            e = e8;
            ayy = ayy2;
            str = "nf_msl_client";
        }
        this.t = ayy;
        this.m = e(this.b.w().m(), this.p, this.t);
        InterfaceC1598aHf.a(new C1596aHd("ESN migration success.").b(false).b(ErrorType.p));
    }

    public dkU d(String str) {
        return this.t.a(str);
    }

    @Override // o.InterfaceC8387djs
    public Long d() {
        dkO i = this.t.i();
        if (i == null) {
            return null;
        }
        return Long.valueOf(i.c());
    }

    public dkU a() {
        Collection<dkU> values = this.t.n.values();
        dkU dku = null;
        if (values.size() == 0) {
            C1044Mm.e("nf_msl_client", "no tokens");
            return null;
        }
        Iterator<dkU> it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dkU next = it.next();
            if (next.c()) {
                C1044Mm.e("nf_msl_client", "found a verified token");
                dku = next;
                break;
            } else if (dku == null) {
                dku = next;
            }
        }
        C1044Mm.a("nf_msl_client", "found token %s", dku);
        return dku;
    }

    public boolean j() {
        return this.t.f();
    }

    public void g() {
        synchronized (this) {
            this.t.c();
        }
    }

    @Override // o.InterfaceC8387djs
    public C8378djj f() {
        C8378djj g;
        synchronized (this) {
            g = this.t.g();
            this.t.d();
        }
        return g;
    }

    public void c(String str, String str2) {
        this.t.e(str, str2);
    }

    public C8379djk b(String str) {
        dkO i;
        C1044Mm.a("nf_msl_client", "getMslTokensAndCrypto (from MDX) with userid %s", str);
        if (!C8168dfL.h(str) || (i = this.t.i()) == null) {
            return null;
        }
        dkU a = this.t.a(str);
        AbstractC8393djy d = this.t.d(i);
        if (a == null || d == null) {
            return null;
        }
        return new C8379djk(i, a, d);
    }

    @Override // o.InterfaceC5170bth
    public AuthCookieHolder e(String str) {
        return this.t.e(str);
    }

    @Override // o.InterfaceC5170bth
    public void a(String str, AuthCookieHolder authCookieHolder) {
        this.t.a(str, authCookieHolder);
    }

    @Override // o.InterfaceC8387djs
    public void c() {
        this.t.e();
    }

    private void n() {
        this.t.c();
    }

    private void o() {
        this.t.a();
    }

    private void l() {
        c();
        n();
        o();
        aYY ayy = this.t;
        if (ayy instanceof aYV) {
            ((aYV) ayy).b();
            return;
        }
        C1044Mm.d("nf_msl_client", "This should NOT happen!");
        InterfaceC1598aHf.a(new C1596aHd("MSL store is NOT AndroidMslStore and we are trying to clear cookies!").b(false));
    }

    public boolean c(String str) {
        return this.t.b(str);
    }
}
