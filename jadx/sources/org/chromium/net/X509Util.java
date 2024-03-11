package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;
import org.chromium.base.ContextUtils;
import org.chromium.base.Log;

/* loaded from: classes6.dex */
public class X509Util {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String OID_ANY_EKU = "2.5.29.37.0";
    private static final String OID_SERVER_GATED_MICROSOFT = "1.3.6.1.4.1.311.10.3.3";
    private static final String OID_SERVER_GATED_NETSCAPE = "2.16.840.1.113730.4.1";
    private static final String OID_TLS_SERVER_AUTH = "1.3.6.1.5.5.7.3.1";
    private static final String TAG = "X509Util";
    private static CertificateFactory sCertificateFactory;
    private static X509TrustManagerExtensions sDefaultTrustManager;
    private static boolean sLoadedSystemKeyStore;
    private static File sSystemCertificateDirectory;
    private static KeyStore sSystemKeyStore;
    private static Set<Pair<X500Principal, PublicKey>> sSystemTrustAnchorCache;
    private static KeyStore sTestKeyStore;
    private static X509TrustManagerExtensions sTestTrustManager;
    private static TrustStorageListener sTrustStorageListener;
    private static final Object sLock = new Object();
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface Natives {
        void notifyKeyChainChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class TrustStorageListener extends BroadcastReceiver {
        private TrustStorageListener() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (!"android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction()) && !"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction()) && (!"android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) || intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false))) {
                    return;
                }
            } else if (!"android.security.STORAGE_CHANGED".equals(intent.getAction())) {
                return;
            }
            try {
                X509Util.reloadDefaultTrustManager();
            } catch (KeyStoreException e) {
                Log.e(X509Util.TAG, "Unable to reload the default TrustManager", (Throwable) e);
            } catch (NoSuchAlgorithmException e2) {
                Log.e(X509Util.TAG, "Unable to reload the default TrustManager", (Throwable) e2);
            } catch (CertificateException e3) {
                Log.e(X509Util.TAG, "Unable to reload the default TrustManager", (Throwable) e3);
            }
        }
    }

    private static List<X509Certificate> checkServerTrustedIgnoringRuntimeException(X509TrustManagerExtensions x509TrustManagerExtensions, X509Certificate[] x509CertificateArr, String str, String str2) {
        try {
            return x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2);
        } catch (RuntimeException e) {
            Log.e(TAG, "checkServerTrusted() unexpectedly threw: %s", (Throwable) e);
            throw new CertificateException(e);
        }
    }

    private static void ensureInitialized() {
        synchronized (sLock) {
            ensureInitializedLocked();
        }
    }

    private static void ensureInitializedLocked() {
        if (sCertificateFactory == null) {
            sCertificateFactory = CertificateFactory.getInstance("X.509");
        }
        if (sDefaultTrustManager == null) {
            sDefaultTrustManager = createTrustManager(null);
        }
        if (!sLoadedSystemKeyStore) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
                sSystemKeyStore = keyStore;
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
                String str = System.getenv("ANDROID_ROOT");
                sSystemCertificateDirectory = new File(str + "/etc/security/cacerts");
            } catch (KeyStoreException unused2) {
            }
            sLoadedSystemKeyStore = true;
        }
        if (sSystemTrustAnchorCache == null) {
            sSystemTrustAnchorCache = new HashSet();
        }
        if (sTrustStorageListener == null) {
            sTrustStorageListener = new TrustStorageListener();
            IntentFilter intentFilter = new IntentFilter();
            if (Build.VERSION.SDK_INT >= 26) {
                intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            } else {
                intentFilter.addAction("android.security.STORAGE_CHANGED");
            }
            ContextUtils.registerProtectedBroadcastReceiver(ContextUtils.getApplicationContext(), sTrustStorageListener, intentFilter);
        }
    }

    private static void ensureTestInitializedLocked() {
        if (sTestKeyStore == null) {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            sTestKeyStore = keyStore;
            try {
                keyStore.load(null);
            } catch (IOException unused) {
            }
        }
        if (sTestTrustManager == null) {
            sTestTrustManager = createTrustManager(sTestKeyStore);
        }
    }

    private static X509TrustManagerExtensions createTrustManager(KeyStore keyStore) {
        TrustManager[] trustManagers;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        try {
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    try {
                        return new X509TrustManagerExtensions((X509TrustManager) trustManager);
                    } catch (IllegalArgumentException e) {
                        Log.e(TAG, "Error creating trust manager (" + trustManager.getClass().getName() + "): " + e);
                    }
                }
            }
            Log.e(TAG, "Could not find suitable trust manager");
            return null;
        } catch (RuntimeException e2) {
            Log.e(TAG, "TrustManagerFactory.getTrustManagers() unexpectedly threw: %s", (Throwable) e2);
            throw new KeyStoreException(e2);
        }
    }

    private static void reloadTestTrustManager() {
        ensureTestInitializedLocked();
        sTestTrustManager = createTrustManager(sTestKeyStore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reloadDefaultTrustManager() {
        synchronized (sLock) {
            sDefaultTrustManager = null;
            sSystemTrustAnchorCache = null;
            ensureInitializedLocked();
        }
        X509UtilJni.get().notifyKeyChainChanged();
    }

    public static X509Certificate createCertificateFromBytes(byte[] bArr) {
        ensureInitialized();
        return (X509Certificate) sCertificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
    }

    public static void addTestRootCertificate(byte[] bArr) {
        X509Certificate createCertificateFromBytes = createCertificateFromBytes(bArr);
        synchronized (sLock) {
            ensureTestInitializedLocked();
            KeyStore keyStore = sTestKeyStore;
            String num = Integer.toString(keyStore.size());
            keyStore.setCertificateEntry("root_cert_" + num, createCertificateFromBytes);
            reloadTestTrustManager();
        }
    }

    public static void clearTestRootCertificates() {
        synchronized (sLock) {
            ensureTestInitializedLocked();
            try {
                sTestKeyStore.load(null);
                reloadTestTrustManager();
            } catch (IOException unused) {
            }
        }
    }

    private static String hashPrincipal(X500Principal x500Principal) {
        byte[] digest = MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        for (int i = 0; i < 4; i++) {
            int i2 = i * 2;
            char[] cArr2 = HEX_DIGITS;
            byte b = digest[3 - i];
            cArr[i2] = cArr2[(b >> 4) & 15];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    private static boolean isKnownRoot(X509Certificate x509Certificate) {
        if (sSystemKeyStore == null) {
            return false;
        }
        Pair<X500Principal, PublicKey> pair = new Pair<>(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (sSystemTrustAnchorCache.contains(pair)) {
            return true;
        }
        String hashPrincipal = hashPrincipal(x509Certificate.getSubjectX500Principal());
        int i = 0;
        while (true) {
            String str = hashPrincipal + "." + i;
            if (!new File(sSystemCertificateDirectory, str).exists()) {
                return false;
            }
            Certificate certificate = sSystemKeyStore.getCertificate("system:" + str);
            if (certificate != null) {
                if (!(certificate instanceof X509Certificate)) {
                    Log.e(TAG, "Anchor " + str + " not an X509Certificate: " + certificate.getClass().getName());
                } else {
                    X509Certificate x509Certificate2 = (X509Certificate) certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        sSystemTrustAnchorCache.add(pair);
                        return true;
                    }
                }
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean verifyKeyUsage(java.security.cert.X509Certificate r3) {
        /*
            java.util.List r3 = r3.getExtendedKeyUsage()     // Catch: java.lang.NullPointerException -> L39
            r0 = 1
            if (r3 != 0) goto L8
            return r0
        L8:
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "1.3.6.1.5.5.7.3.1"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L38
            java.lang.String r2 = "2.5.29.37.0"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L38
            java.lang.String r2 = "2.16.840.1.113730.4.1"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L38
            java.lang.String r2 = "1.3.6.1.4.1.311.10.3.3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lc
        L38:
            return r0
        L39:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.X509Util.verifyKeyUsage(java.security.cert.X509Certificate):boolean");
    }

    public static byte[][] getUserAddedRoots() {
        ArrayList arrayList = new ArrayList();
        synchronized (sLock) {
            try {
                try {
                    ensureInitialized();
                    KeyStore keyStore = sSystemKeyStore;
                    if (keyStore == null) {
                        return new byte[0];
                    }
                    try {
                        Enumeration<String> aliases = keyStore.aliases();
                        while (aliases.hasMoreElements()) {
                            String nextElement = aliases.nextElement();
                            if (nextElement.startsWith("user:")) {
                                try {
                                    Certificate certificate = sSystemKeyStore.getCertificate(nextElement);
                                    if (!(certificate instanceof X509Certificate)) {
                                        Log.w(TAG, "alias: " + nextElement + " is not a X509 Cert, skipping");
                                    } else {
                                        arrayList.add(((X509Certificate) certificate).getEncoded());
                                    }
                                } catch (KeyStoreException e) {
                                    Log.e(TAG, "Error reading cert with alias %s, error: %s", nextElement, e);
                                } catch (CertificateEncodingException e2) {
                                    Log.e(TAG, "Error encoding cert with alias %s, error: %s", nextElement, e2);
                                }
                            }
                        }
                        return (byte[][]) arrayList.toArray(new byte[0]);
                    } catch (KeyStoreException e3) {
                        Log.e(TAG, "Error reading cert aliases: %s", (Throwable) e3);
                        return new byte[0];
                    }
                } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                    return new byte[0];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089 A[Catch: all -> 0x00c9, TRY_ENTER, TryCatch #5 {, blocks: (B:25:0x006c, B:27:0x0070, B:28:0x0075, B:30:0x0077, B:42:0x00ab, B:44:0x00b1, B:46:0x00c2, B:47:0x00c7, B:33:0x007d, B:35:0x0081, B:39:0x0089, B:40:0x00a9), top: B:73:0x006c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: all -> 0x00c9, TryCatch #5 {, blocks: (B:25:0x006c, B:27:0x0070, B:28:0x0075, B:30:0x0077, B:42:0x00ab, B:44:0x00b1, B:46:0x00c2, B:47:0x00c7, B:33:0x007d, B:35:0x0081, B:39:0x0089, B:40:0x00a9), top: B:73:0x006c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.chromium.net.AndroidCertVerifyResult verifyServerCertificates(byte[][] r7, java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.X509Util.verifyServerCertificates(byte[][], java.lang.String, java.lang.String):org.chromium.net.AndroidCertVerifyResult");
    }
}
