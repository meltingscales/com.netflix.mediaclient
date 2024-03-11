package o;

import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.TypeCastException;
import okhttp3.Protocol;

/* loaded from: classes5.dex */
public final class dHC extends dHG {
    public static final e a = new e(null);
    private final Class<?> b;
    private final Method c;
    private final Method d;
    private final Method e;
    private final Class<?> h;

    public dHC(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        C8632dsu.d(method, "");
        C8632dsu.d(method2, "");
        C8632dsu.d(method3, "");
        C8632dsu.d(cls, "");
        C8632dsu.d(cls2, "");
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.b = cls;
        this.h = cls2;
    }

    @Override // o.dHG
    public void b(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        C8632dsu.d(sSLSocket, "");
        C8632dsu.d(list, "");
        try {
            this.c.invoke(null, sSLSocket, Proxy.newProxyInstance(dHG.class.getClassLoader(), new Class[]{this.b, this.h}, new d(dHG.i.d(list))));
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        }
    }

    @Override // o.dHG
    public void e(SSLSocket sSLSocket) {
        C8632dsu.d(sSLSocket, "");
        try {
            this.e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        }
    }

    @Override // o.dHG
    public String d(SSLSocket sSLSocket) {
        C8632dsu.d(sSLSocket, "");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.d.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new TypeCastException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            d dVar = (d) invocationHandler;
            if (!dVar.b() && dVar.c() == null) {
                dHG.a(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            } else if (dVar.b()) {
                return null;
            } else {
                return dVar.c();
            }
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        }
    }

    /* loaded from: classes5.dex */
    static final class d implements InvocationHandler {
        private String a;
        private final List<String> b;
        private boolean e;

        public final boolean b() {
            return this.e;
        }

        public final String c() {
            return this.a;
        }

        public d(List<String> list) {
            C8632dsu.d(list, "");
            this.b = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            C8632dsu.d(obj, "");
            C8632dsu.d(method, "");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (C8632dsu.c((Object) name, (Object) "supports") && C8632dsu.c(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (C8632dsu.c((Object) name, (Object) "unsupported") && C8632dsu.c(Void.TYPE, returnType)) {
                this.e = true;
                return null;
            } else if (C8632dsu.c((Object) name, (Object) "protocols") && objArr.length == 0) {
                return this.b;
            } else {
                if ((C8632dsu.c((Object) name, (Object) "selectProtocol") || C8632dsu.c((Object) name, (Object) "select")) && C8632dsu.c(String.class, returnType) && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        if (obj2 != null) {
                            List list = (List) obj2;
                            int size = list.size();
                            if (size >= 0) {
                                int i = 0;
                                while (true) {
                                    Object obj3 = list.get(i);
                                    if (obj3 == null) {
                                        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    String str = (String) obj3;
                                    if (!this.b.contains(str)) {
                                        if (i == size) {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        this.a = str;
                                        return str;
                                    }
                                }
                            }
                            String str2 = this.b.get(0);
                            this.a = str2;
                            return str2;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                }
                if ((C8632dsu.c((Object) name, (Object) "protocolSelected") || C8632dsu.c((Object) name, (Object) VisualStateDefinition.ELEMENT_STATE.SELECTED)) && objArr.length == 1) {
                    Object obj4 = objArr[0];
                    if (obj4 != null) {
                        this.a = (String) obj4;
                        return null;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        public final dHG d() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                C8632dsu.b(property, "");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                C8632dsu.b(method, "");
                C8632dsu.b(method2, "");
                C8632dsu.b(method3, "");
                C8632dsu.b(cls3, "");
                C8632dsu.b(cls4, "");
                return new dHC(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }
}
