package org.chromium.net;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import org.chromium.base.Log;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes6.dex */
public class AndroidKeyStore {
    private static final String TAG = "AndroidKeyStore";

    @CalledByNative
    private static String getPrivateKeyClassName(PrivateKey privateKey) {
        return privateKey.getClass().getName();
    }

    @CalledByNative
    private static boolean privateKeySupportsSignature(PrivateKey privateKey, String str) {
        try {
            Signature.getInstance(str).initSign(privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return false;
        } catch (Exception e) {
            Log.e(TAG, "Exception while checking support for " + str + ": " + e);
            return false;
        }
    }

    @CalledByNative
    private static boolean privateKeySupportsCipher(PrivateKey privateKey, String str) {
        try {
            Cipher.getInstance(str).init(1, privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        } catch (Exception e) {
            Log.e(TAG, "Exception while checking support for " + str + ": " + e);
            return false;
        }
    }

    @CalledByNative
    private static byte[] signWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Signature signature = Signature.getInstance(str);
            try {
                signature.initSign(privateKey);
                signature.update(bArr);
                return signature.sign();
            } catch (Exception e) {
                String algorithm = privateKey.getAlgorithm();
                String name = privateKey.getClass().getName();
                Log.e(TAG, "Exception while signing message with " + str + " and " + algorithm + " private key (" + name + "): " + e);
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            Log.e(TAG, "Signature algorithm " + str + " not supported: " + e2);
            return null;
        }
    }

    @CalledByNative
    private static byte[] encryptWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance(str);
            try {
                cipher.init(1, privateKey);
                return cipher.doFinal(bArr);
            } catch (Exception e) {
                String algorithm = privateKey.getAlgorithm();
                String name = privateKey.getClass().getName();
                Log.e(TAG, "Exception while encrypting input with " + str + " and " + algorithm + " private key (" + name + "): " + e);
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            Log.e(TAG, "Cipher " + str + " not supported: " + e2);
            return null;
        }
    }
}
