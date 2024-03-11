package o;

import android.content.Context;
import com.netflix.android.org.json.JSONArray;
import com.netflix.android.org.json.JSONObject;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class aYO implements InterfaceC8385djq {
    private final Context c;
    private final KeyFactory e;
    private final Map<String, PublicKey> a = new HashMap();
    private final Map<String, String> d = new HashMap();
    private final Map<String, PrivateKey> b = new HashMap();

    public aYO(Context context) {
        this.c = context;
        try {
            this.e = KeyFactory.getInstance("EC");
            d();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("Unable to get ECC key factory", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        String e = C2079aZb.e().e();
        C1044Mm.a("nf_msl_eccstore", "AppBoot ECC key %s", e);
        c("APPBOOT", e);
    }

    @Override // o.djH
    public PublicKey d(String str) {
        PublicKey publicKey;
        synchronized (this) {
            publicKey = this.a.get(str);
        }
        return publicKey;
    }

    @Override // o.djH
    public PrivateKey c(String str) {
        PrivateKey privateKey;
        synchronized (this) {
            privateKey = this.b.get(str);
        }
        return privateKey;
    }

    public void c(String str, String str2) {
        synchronized (this) {
            c(str, str2, true);
        }
    }

    private void c(String str, String str2, boolean z) {
        b(str, C8427dle.e(str2));
        if (z) {
            e(str, str2);
        }
    }

    private void b(String str, byte[] bArr) {
        try {
            PublicKey generatePublic = this.e.generatePublic(new X509EncodedKeySpec(bArr));
            if (!(generatePublic instanceof ECPublicKey)) {
                throw new IllegalArgumentException("Public key is not an instance of ECPublicKey.");
            }
            this.a.put(str, generatePublic);
        } catch (InvalidKeySpecException e) {
            throw new IllegalArgumentException("Public key can not be parsed", e);
        }
    }

    private void b() {
        synchronized (this) {
            C1044Mm.e("nf_msl_eccstore", "save:: started.");
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (String str : this.d.keySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("identity", str);
                jSONObject2.put("encodedKey", this.d.get(str));
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("publicKeys", jSONArray);
            String jSONObject3 = jSONObject.toString();
            C1044Mm.a("nf_msl_eccstore", "save:: %s", jSONObject3);
            C8157dfA.a(this.c, "nf_msl_ecc_store_json", jSONObject3);
            C1044Mm.e("nf_msl_eccstore", "save:: done.");
        }
    }

    private void e(String str, String str2) {
        if (C8168dfL.g(str) || C8168dfL.g(str2)) {
            C1044Mm.j("nf_msl_eccstore", "Empty identity and/or raw public key. It should NOT happen!");
        } else if ("APPBOOT".equals(str)) {
            C1044Mm.e("nf_msl_eccstore", "Do not add MSL Boot key (" + str + ") to persistence...");
        } else {
            this.d.put(str, str2);
            try {
                b();
            } catch (Throwable th) {
                C1044Mm.e("nf_msl_eccstore", "Failed to save ECC store to persistence: ", th);
            }
        }
    }

    private void d() {
        try {
            String e = C8157dfA.e(this.c, "nf_msl_ecc_store_json", (String) null);
            if (C8168dfL.g(e)) {
                C1044Mm.e("nf_msl_eccstore", "ECC store not found...");
                return;
            }
            C1044Mm.a("nf_msl_eccstore", "ECC store found %s", e);
            JSONArray optJSONArray = new JSONObject(e).optJSONArray("publicKeys");
            if (optJSONArray == null) {
                C1044Mm.d("nf_msl_eccstore", "Public keys array NOT found!");
                return;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject = optJSONArray.getJSONObject(i);
                c(jSONObject.optString("identity"), jSONObject.optString("encodedKey"), false);
            }
        } catch (Throwable th) {
            C1044Mm.e("nf_msl_eccstore", "Failed to create public key JSON object: ", th);
        }
    }
}
