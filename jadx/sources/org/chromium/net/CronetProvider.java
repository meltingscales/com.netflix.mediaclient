package org.chromium.net;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.chromium.net.CronetEngine;

/* loaded from: classes5.dex */
public abstract class CronetProvider {
    private static final String GMS_CORE_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.GmsCoreCronetProvider";
    private static final String JAVA_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.JavaCronetProvider";
    private static final String NATIVE_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.NativeCronetProvider";
    private static final String PLAY_SERVICES_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.PlayServicesCronetProvider";
    public static final String PROVIDER_NAME_APP_PACKAGED = "App-Packaged-Cronet-Provider";
    public static final String PROVIDER_NAME_FALLBACK = "Fallback-Cronet-Provider";
    private static final String RES_KEY_CRONET_IMPL_CLASS = "CronetProviderClassName";
    private static final String TAG = "CronetProvider";
    private static int c = 1;
    private static int e;
    private static byte e$ss2$1210;
    public final Context mContext;

    static {
        c();
    }

    static void c() {
        e$ss2$1210 = (byte) 24;
    }

    public abstract CronetEngine.Builder createBuilder();

    public abstract String getName();

    public abstract String getVersion();

    public abstract boolean isEnabled();

    public CronetProvider(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        this.mContext = context;
    }

    public String toString() {
        String name = getClass().getName();
        String name2 = getName();
        String version = getVersion();
        boolean isEnabled = isEnabled();
        return "[class=" + name + ", name=" + name2 + ", version=" + version + ", enabled=" + isEnabled + "]";
    }

    public static List<CronetProvider> getAllProviders(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        addCronetProviderFromResourceFile(context, linkedHashSet);
        addCronetProviderImplByClassName(context, PLAY_SERVICES_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        addCronetProviderImplByClassName(context, GMS_CORE_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        addCronetProviderImplByClassName(context, NATIVE_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        addCronetProviderImplByClassName(context, JAVA_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    private static boolean addCronetProviderImplByClassName(Context context, String str, Set<CronetProvider> set, boolean z) {
        try {
            set.add((CronetProvider) context.getClassLoader().loadClass(str).asSubclass(CronetProvider.class).getConstructor(Context.class).newInstance(context));
            return true;
        } catch (ClassNotFoundException e2) {
            logReflectiveOperationException(str, z, e2);
            return false;
        } catch (IllegalAccessException e3) {
            logReflectiveOperationException(str, z, e3);
            return false;
        } catch (InstantiationException e4) {
            logReflectiveOperationException(str, z, e4);
            return false;
        } catch (NoSuchMethodException e5) {
            logReflectiveOperationException(str, z, e5);
            return false;
        } catch (InvocationTargetException e6) {
            logReflectiveOperationException(str, z, e6);
            return false;
        }
    }

    private static void logReflectiveOperationException(String str, boolean z, Exception exc) {
        if (z) {
            String str2 = TAG;
            Log.e(str2, "Unable to load provider class: " + str, exc);
            return;
        }
        String str3 = TAG;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Tried to load " + str + " provider class but it wasn't included in the app classpath");
        }
    }

    private static boolean addCronetProviderFromResourceFile(Context context, Set<CronetProvider> set) {
        int i = 2 % 2;
        int i2 = e + 33;
        c = i2 % 128;
        int i3 = i2 % 2;
        int identifier = context.getResources().getIdentifier(RES_KEY_CRONET_IMPL_CLASS, "string", context.getPackageName());
        if (identifier == 0) {
            return false;
        }
        String string = context.getResources().getString(identifier);
        if (string.startsWith("'!#+")) {
            int i4 = e + 43;
            c = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            b(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i6 = c + 23;
            e = i6 % 128;
            int i7 = i6 % 2;
        }
        if (string == null || string.equals(PLAY_SERVICES_CRONET_PROVIDER_CLASS)) {
            return false;
        }
        int i8 = e + 53;
        c = i8 % 128;
        if (i8 % 2 == 0) {
            string.equals(GMS_CORE_CRONET_PROVIDER_CLASS);
            Object obj = null;
            obj.hashCode();
            throw null;
        } else if (string.equals(GMS_CORE_CRONET_PROVIDER_CLASS) || string.equals(JAVA_CRONET_PROVIDER_CLASS) || string.equals(NATIVE_CRONET_PROVIDER_CLASS)) {
            return false;
        } else {
            if (!addCronetProviderImplByClassName(context, string, set, true)) {
                String str = TAG;
                Log.e(str, "Unable to instantiate Cronet implementation class " + string + " that is listed as in the app string resource file under CronetProviderClassName key");
            }
            return true;
        }
    }

    private static void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$1210);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
