package o;

import com.netflix.ale.AleCryptoBouncyCastle;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes3.dex */
public final class XE {
    public static final c b = new c(null);
    private final Map<String, String> d = new LinkedHashMap();

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("EncryptedUserIds");
        }
    }

    private final String c(String str) {
        System.currentTimeMillis();
        PublicKey generatePublic = KeyFactory.getInstance(AleCryptoBouncyCastle.RSA_KEY_ALG).generatePublic(new RSAPublicKeySpec(new BigInteger("B2D6B06706E2B385723B4AB95E61ED3D5C3D720FF7B33F54AEC2868364B5BC6E8CF6FD80B23499A62CFB8060A4601E995DBAAC41832DDCCB96C72B70DFD8C0FA93F9CB304ABAF1EC35F3B77C93D68D0E405C39D952B41D29F547C714F91BE4AC1FC57A8B7FA728D1F0ADB50B1AB649AE207F42F016A58F70E519258DFD76CB5D41715EB79F10F1004E3A2CC15C90FD5329093AC4C4178E912496C3172C368C70258644C1B583EE211BD92F229577A78AEF87D7C98E3DF18DAB577CFDEFAC453466345597BB02EA6FE519BE45471DFD89EBC33739E82153C0806A5109D76CF5B2F3B0E012CC6CD77B521E844585D869F0CA527B79DBDB1BEA3E0EFD8085146E23", 16), new BigInteger("010001", 16)));
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, generatePublic);
        byte[] bytes = str.getBytes(C8674dui.i);
        C8632dsu.a(bytes, "");
        String b2 = C8071ddU.b(cipher.doFinal(C8607drw.b(new ByteArrayInputStream(bytes))));
        b.getLogTag();
        C8632dsu.d((Object) b2);
        return b2;
    }

    public final String b(String str) {
        C8632dsu.c((Object) str, "");
        Map<String, String> map = this.d;
        String str2 = map.get(str);
        if (str2 == null) {
            str2 = c(str);
            map.put(str, str2);
        }
        return str2;
    }
}
