package o;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* renamed from: o.dAo  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7658dAo {
    public static final C7658dAo d = new C7658dAo();

    private C7658dAo() {
    }

    public final List<MainDispatcherFactory> e() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!C7659dAp.a()) {
            return b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 != null) {
                arrayList.add(mainDispatcherFactory2);
                return arrayList;
            }
            return arrayList;
        } catch (Throwable unused3) {
            return b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    private final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        List<S> U;
        try {
            return e(cls, classLoader);
        } catch (Throwable unused) {
            U = C8576dqs.U(ServiceLoader.load(cls, classLoader));
            return U;
        }
    }

    public final <S> List<S> e(Class<S> cls, ClassLoader classLoader) {
        Set W;
        int d2;
        ArrayList<URL> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        C8632dsu.a(list, "");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            C8571dqn.b(arrayList, d.d(url));
        }
        W = C8576dqs.W(arrayList);
        if (!(!W.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        Set<String> set = W;
        d2 = C8572dqo.d(set, 10);
        ArrayList arrayList2 = new ArrayList(d2);
        for (String str : set) {
            arrayList2.add(d.e(str, classLoader, cls));
        }
        return arrayList2;
    }

    private final <S> S e(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (!cls.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
        }
        return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    private final List<String> d(URL url) {
        boolean i;
        String b;
        String g;
        String b2;
        String url2 = url.toString();
        i = C8691duz.i(url2, "jar", false, 2, null);
        if (i) {
            b = duD.b(url2, "jar:file:", (String) null, 2, (Object) null);
            g = duD.g(b, '!', (String) null, 2, (Object) null);
            b2 = duD.b(url2, "!/", (String) null, 2, (Object) null);
            JarFile jarFile = new JarFile(g, false);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(b2)), "UTF-8"));
                List<String> b3 = d.b(bufferedReader);
                C8608drx.a(bufferedReader, null);
                jarFile.close();
                return b3;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        C8553dpw.c(th, th3);
                        throw th;
                    }
                }
            }
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(url.openStream()));
        try {
            List<String> b4 = d.b(bufferedReader2);
            C8608drx.a(bufferedReader2, null);
            return b4;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                C8608drx.a(bufferedReader2, th4);
                throw th5;
            }
        }
    }

    private final List<String> b(BufferedReader bufferedReader) {
        List<String> U;
        String a;
        CharSequence n;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                a = duD.a(readLine, "#", (String) null, 2, (Object) null);
                n = duD.n((CharSequence) a);
                String obj = n.toString();
                for (int i = 0; i < obj.length(); i++) {
                    char charAt = obj.charAt(i);
                    if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                        throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
                    }
                }
                if (obj.length() > 0) {
                    linkedHashSet.add(obj);
                }
            } else {
                U = C8576dqs.U(linkedHashSet);
                return U;
            }
        }
    }
}
