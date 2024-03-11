package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Base64;
import androidx.tracing.Trace;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class AppInitializer {
    private static int d = 0;
    private static int e = 1;
    private static byte e$ss2$106;
    private static volatile AppInitializer sInstance;
    private static final Object sLock;
    final Context mContext;
    final Set<Class<? extends Initializer<?>>> mDiscovered = new HashSet();
    final Map<Class<?>, Object> mInitialized = new HashMap();

    static void a() {
        e$ss2$106 = (byte) 24;
    }

    static {
        a();
        sLock = new Object();
    }

    AppInitializer(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static AppInitializer getInstance(Context context) {
        if (sInstance == null) {
            synchronized (sLock) {
                if (sInstance == null) {
                    sInstance = new AppInitializer(context);
                }
            }
        }
        return sInstance;
    }

    public <T> T initializeComponent(Class<? extends Initializer<T>> cls) {
        return (T) doInitialize(cls);
    }

    public boolean isEagerlyInitialized(Class<? extends Initializer<?>> cls) {
        return this.mDiscovered.contains(cls);
    }

    <T> T doInitialize(Class<? extends Initializer<?>> cls) {
        T t;
        synchronized (sLock) {
            t = (T) this.mInitialized.get(cls);
            if (t == null) {
                t = (T) doInitialize(cls, new HashSet());
            }
        }
        return t;
    }

    private <T> T doInitialize(Class<? extends Initializer<?>> cls, Set<Class<?>> set) {
        T t;
        if (Trace.isEnabled()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (!this.mInitialized.containsKey(cls)) {
            set.add(cls);
            Initializer<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            List<Class<? extends Initializer<?>>> dependencies = newInstance.dependencies();
            if (!dependencies.isEmpty()) {
                for (Class<? extends Initializer<?>> cls2 : dependencies) {
                    if (!this.mInitialized.containsKey(cls2)) {
                        doInitialize(cls2, set);
                    }
                }
            }
            t = (T) newInstance.create(this.mContext);
            set.remove(cls);
            this.mInitialized.put(cls, t);
        } else {
            t = (T) this.mInitialized.get(cls);
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void discoverAndInitialize() {
        try {
            try {
                Trace.beginSection("Startup");
                discoverAndInitialize(this.mContext.getPackageManager().getProviderInfo(new ComponentName(this.mContext.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e2) {
                throw new StartupException(e2);
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void discoverAndInitialize(Bundle bundle) {
        Class<?> cls;
        int i = 2 % 2;
        int i2 = e + 25;
        d = i2 % 128;
        int i3 = i2 % 2;
        String string = this.mContext.getString(R.string.androidx_startup);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            b(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (it.hasNext()) {
                    int i4 = e + 121;
                    d = i4 % 128;
                    Object obj = null;
                    if (i4 % 2 != 0) {
                        string.equals(bundle.getString(it.next(), null));
                        obj.hashCode();
                        throw null;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        int i5 = e + 71;
                        d = i5 % 128;
                        if (i5 % 2 != 0) {
                            cls = Class.forName(next);
                            int i6 = 73 / 0;
                            if (!(!Initializer.class.isAssignableFrom(cls))) {
                                this.mDiscovered.add(cls);
                            }
                        } else {
                            cls = Class.forName(next);
                            if (Initializer.class.isAssignableFrom(cls)) {
                                this.mDiscovered.add(cls);
                            }
                        }
                    }
                }
                Iterator<Class<? extends Initializer<?>>> it2 = this.mDiscovered.iterator();
                while (!(!it2.hasNext())) {
                    int i7 = e + 99;
                    d = i7 % 128;
                    int i8 = i7 % 2;
                    doInitialize(it2.next(), hashSet);
                }
            } catch (ClassNotFoundException e2) {
                throw new StartupException(e2);
            }
        }
    }

    private void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$106);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
