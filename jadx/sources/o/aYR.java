package o;

import android.content.Context;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.JSONArray;
import com.netflix.android.org.json.JSONObject;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class aYR implements InterfaceC8381djm {
    private final Context a;
    private final Map<String, PublicKey> b = new HashMap();
    private final Map<String, String> c = new HashMap();
    private final Map<String, PrivateKey> d = new HashMap();
    private final KeyFactory e;

    public aYR(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context can not be null");
        }
        this.a = context;
        try {
            this.e = KeyFactory.getInstance(AleCryptoBouncyCastle.RSA_KEY_ALG);
            a();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("Unable to get RSA key factory", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        String e = C2079aZb.c().e();
        C1044Mm.a("nf_msl_rsastore", "AppBoot RSA key %s", e);
        e("APPBOOT", e);
    }

    @Override // o.djT
    public PublicKey e(String str) {
        PublicKey publicKey;
        synchronized (this) {
            publicKey = this.b.get(str);
        }
        return publicKey;
    }

    @Override // o.djT
    public PrivateKey b(String str) {
        PrivateKey privateKey;
        synchronized (this) {
            privateKey = this.d.get(str);
        }
        return privateKey;
    }

    @Override // o.InterfaceC8381djm
    public void e(String str, String str2) {
        synchronized (this) {
            a(str, str2, true);
        }
    }

    private void a(String str, String str2, boolean z) {
        b(str, C8427dle.e(str2));
        if (z) {
            d(str, str2);
        }
    }

    private void b(String str, byte[] bArr) {
        try {
            PublicKey generatePublic = this.e.generatePublic(new X509EncodedKeySpec(bArr));
            if (!(generatePublic instanceof RSAPublicKey)) {
                throw new IllegalArgumentException("Public key is not an instance of RSAPublicKey.");
            }
            this.b.put(str, generatePublic);
        } catch (InvalidKeySpecException e) {
            throw new IllegalArgumentException("Public key can not be parsed", e);
        }
    }

    private void d() {
        synchronized (this) {
            C1044Mm.e("nf_msl_rsastore", "save:: started.");
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (String str : this.c.keySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("identity", str);
                jSONObject2.put("encodedKey", this.c.get(str));
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("publicKeys", jSONArray);
            C8157dfA.a(this.a, "nf_msl_rsa_store_json", jSONObject.toString());
            C1044Mm.e("nf_msl_rsastore", "save:: done.");
        }
    }

    private void d(String str, String str2) {
        if (C8168dfL.g(str) || C8168dfL.g(str2)) {
            C1044Mm.j("nf_msl_rsastore", "Empty identity and/or raw public key. It should NOT happen!");
        } else if ("APPBOOT".equals(str)) {
            C1044Mm.e("nf_msl_rsastore", "Do not add APPBOOT to persistence...");
        } else {
            this.c.put(str, str2);
            try {
                d();
            } catch (Throwable th) {
                C1044Mm.b("nf_msl_rsastore", th, "Failed to save RSA store to persistence: ", new Object[0]);
            }
        }
    }

    private void a() {
        try {
            String e = C8157dfA.e(this.a, "nf_msl_rsa_store_json", (String) null);
            if (C8168dfL.g(e)) {
                C1044Mm.e("nf_msl_rsastore", "RSA store not found...");
                return;
            }
            JSONArray optJSONArray = new JSONObject(e).optJSONArray("publicKeys");
            if (optJSONArray == null) {
                C1044Mm.d("nf_msl_rsastore", "Public keys array NOT found!");
                return;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject = optJSONArray.getJSONObject(i);
                a(jSONObject.optString("identity"), jSONObject.optString("encodedKey"), false);
            }
        } catch (Throwable th) {
            C1044Mm.b("nf_msl_rsastore", th, "Failed to create public key JSON object: ", new Object[0]);
        }
    }
}
