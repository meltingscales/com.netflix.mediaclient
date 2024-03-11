package o;

import com.netflix.ale.AleCryptoBouncyCastle;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.aYu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2071aYu {
    private static int d(int i) {
        if (i <= 127) {
            return 1;
        }
        return i <= 32767 ? 2 : -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(byte[] bArr, String str) {
        if (e(bArr)) {
            try {
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                if (bytes.length == 0) {
                    C1044Mm.j("MdxTargetCryptContext", "encrypt input data size is 0");
                    return null;
                }
                Cipher cipher = Cipher.getInstance(AleCryptoBouncyCastle.AES_CBC_PKCS5_ALGO);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, 32, 16, "AES");
                byte[] bArr2 = new byte[16];
                new Random().nextBytes(bArr2);
                cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
                byte[] doFinal = cipher.doFinal(bytes);
                int length = doFinal.length;
                if (length != 0 && length <= 32767) {
                    int d = d(16) + 17 + d(length) + length;
                    C1044Mm.c("MdxTargetCryptContext", "data length %d, envelop length %d", Integer.valueOf(length), Integer.valueOf(d));
                    byte[] bArr3 = new byte[d];
                    bArr3[0] = 2;
                    bArr3[1] = 16;
                    System.arraycopy(bArr2, 0, bArr3, 2, 16);
                    if (length <= 16383) {
                        int i = 19;
                        if (length <= 127) {
                            bArr3[18] = (byte) length;
                        } else {
                            bArr3[18] = (byte) (((length >> 8) & 63) | 128);
                            bArr3[19] = (byte) (length & PrivateKeyType.INVALID);
                            i = 20;
                        }
                        System.arraycopy(doFinal, 0, bArr3, i, length);
                        return C8427dle.e(bArr3);
                    }
                    return null;
                }
                C1044Mm.j("MdxTargetCryptContext", "incorrect encrypt ciphertext data size %x", Integer.valueOf(length));
                return null;
            } catch (InvalidAlgorithmParameterException e) {
                C1044Mm.j("MdxTargetCryptContext", "encrypt exception %s", e);
                return null;
            } catch (InvalidKeyException e2) {
                C1044Mm.j("MdxTargetCryptContext", "encrypt exception %s", e2);
                return null;
            } catch (NoSuchAlgorithmException e3) {
                e = e3;
                C1044Mm.j("MdxTargetCryptContext", "encrypt exception %s", e);
                return null;
            } catch (BadPaddingException e4) {
                C1044Mm.j("MdxTargetCryptContext", "encrypt exception %s", e4);
                return null;
            } catch (IllegalBlockSizeException e5) {
                C1044Mm.j("MdxTargetCryptContext", "encrypt exception %s", e5);
                return null;
            } catch (NoSuchPaddingException e6) {
                e = e6;
                C1044Mm.j("MdxTargetCryptContext", "encrypt exception %s", e);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3 A[Catch: IllegalBlockSizeException -> 0x00ed, BadPaddingException -> 0x00f6, InvalidKeyException -> 0x00ff, InvalidAlgorithmParameterException -> 0x0108, NoSuchPaddingException -> 0x0111, NoSuchAlgorithmException -> 0x0113, TRY_LEAVE, TryCatch #2 {InvalidAlgorithmParameterException -> 0x0108, InvalidKeyException -> 0x00ff, NoSuchAlgorithmException -> 0x0113, BadPaddingException -> 0x00f6, IllegalBlockSizeException -> 0x00ed, NoSuchPaddingException -> 0x0111, blocks: (B:15:0x0043, B:16:0x0063, B:18:0x0066, B:22:0x0075, B:27:0x0086, B:35:0x00a6, B:38:0x00b6, B:40:0x00ce, B:42:0x00db, B:29:0x0090, B:31:0x0096, B:34:0x009a, B:44:0x00e3), top: B:60:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(byte[] r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2071aYu.b(byte[], java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(byte[] bArr, String str) {
        if (e(bArr)) {
            try {
                Mac mac = Mac.getInstance("HmacSHA256");
                mac.init(new SecretKeySpec(bArr, 0, 32, "HmacSHA256"));
                return C8427dle.e(mac.doFinal(str.getBytes(StandardCharsets.UTF_8)));
            } catch (InvalidKeyException | NoSuchAlgorithmException e) {
                C1044Mm.j("MdxTargetCryptContext", "hmac has exception %s", e);
                return null;
            }
        }
        return null;
    }

    private static boolean e(byte[] bArr) {
        return bArr != null && bArr.length >= 48;
    }
}
