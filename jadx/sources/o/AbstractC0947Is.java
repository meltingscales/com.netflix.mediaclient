package o;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.netflix.falkor.BranchMap;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import o.InterfaceC0943Io;

@SuppressLint({"DefaultLocale"})
/* renamed from: o.Is  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0947Is<T extends InterfaceC0943Io> implements InterfaceC1240Ub<T> {
    private static b a = null;
    public static boolean b = false;
    private static long f;
    int c;
    int e;
    private final InterfaceC0907He g;
    private final InterfaceC0908Hf i;
    private final Handler j;
    private final T k;
    private final boolean l;
    private static final JsonParser d = new JsonParser();
    private static double h = 0.0d;

    /* renamed from: o.Is$b */
    /* loaded from: classes.dex */
    public interface b {
        long b();
    }

    public static void c(long j) {
        f = j;
    }

    public static void c(b bVar) {
        a = bVar;
    }

    public final T a() {
        return this.k;
    }

    public Handler d() {
        return this.j;
    }

    public final boolean e() {
        return this.l;
    }

    public AbstractC0947Is(T t, boolean z, InterfaceC0908Hf interfaceC0908Hf, InterfaceC0907He interfaceC0907He) {
        if (interfaceC0908Hf == null) {
            throw new IllegalArgumentException("diskCache cannot be null");
        }
        if (interfaceC0907He == null) {
            throw new IllegalArgumentException("diskCacheFilter cannot be null");
        }
        this.k = t;
        this.j = new Handler(Looper.getMainLooper());
        this.l = z;
        this.i = interfaceC0908Hf;
        this.g = interfaceC0907He;
    }

    private InterfaceC0912Hj a(long j) {
        return this.i.d(j);
    }

    private InterfaceC0913Hk d(long j) {
        return this.i.c(j);
    }

    private InterfaceC0909Hg e(long j) {
        return this.i.e(j);
    }

    public final C1244Uf d(Collection<InterfaceC1242Ud> collection, C0942In c0942In) {
        C1244Uf c1244Uf;
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis();
            c1244Uf = new C1244Uf(collection);
            ArrayList arrayList = new ArrayList();
            InterfaceC0912Hj a2 = a(currentTimeMillis);
            for (InterfaceC1242Ud interfaceC1242Ud : collection) {
                d(interfaceC1242Ud, this.k, 0, c1244Uf, a2, c0942In, arrayList, currentTimeMillis);
                d(c0942In, a2, arrayList, c1244Uf, currentTimeMillis);
            }
            if (a2 != null) {
                a2.close();
            }
        }
        return c1244Uf;
    }

    private void d(C0942In c0942In, InterfaceC0912Hj interfaceC0912Hj, List<IK> list, C1244Uf c1244Uf, long j) {
        ArrayList arrayList;
        while (!list.isEmpty()) {
            if (list.size() > 999) {
                arrayList = new ArrayList(list.subList(0, 998));
            } else {
                arrayList = new ArrayList(list);
            }
            ArrayList<IK> arrayList2 = arrayList;
            if (c0942In != null) {
                c0942In.c();
            }
            IL.a(interfaceC0912Hj, arrayList2, c0942In);
            if (c0942In != null) {
                c0942In.d();
            }
            for (IK ik : arrayList2) {
                if (c0942In != null) {
                    c0942In.c(ik.f() != null);
                }
                b(ik.d(), ik.f(), ik.e() + 1, c1244Uf, true, interfaceC0912Hj, c0942In, j, list);
            }
            list.removeAll(arrayList2);
        }
    }

    private final void d(InterfaceC1242Ud interfaceC1242Ud, InterfaceC8322diG interfaceC8322diG, int i, C1244Uf c1244Uf, InterfaceC0912Hj interfaceC0912Hj, C0942In c0942In, List<IK> list, long j) {
        synchronized (this) {
            String a2 = interfaceC1242Ud.a();
            b(interfaceC1242Ud, interfaceC8322diG, i, c1244Uf, a2 != null ? this.g.e(a2) : false, interfaceC0912Hj, c0942In, j, list);
        }
    }

    private final void b(InterfaceC1242Ud interfaceC1242Ud, InterfaceC8322diG interfaceC8322diG, int i, C1244Uf c1244Uf, boolean z, InterfaceC0912Hj interfaceC0912Hj, C0942In c0942In, long j, List<IK> list) {
        synchronized (this) {
            int size = interfaceC1242Ud.d().size();
            if (i < size && interfaceC8322diG == null) {
                c1244Uf.d.add(interfaceC1242Ud);
            } else if (i == size) {
                if (interfaceC8322diG != null) {
                    c1244Uf.b.add(interfaceC1242Ud);
                } else {
                    c1244Uf.d.add(interfaceC1242Ud);
                }
            } else if (i > size) {
                throw new IllegalStateException("Offset is invalid");
            } else {
                if (interfaceC8322diG instanceof IF) {
                    IF r1 = (IF) interfaceC8322diG;
                    InterfaceC8322diG c = r1.c();
                    if (c != null) {
                        d(r1.b().d(interfaceC1242Ud.e(i)), c, r1.b().d().size(), c1244Uf, interfaceC0912Hj, c0942In, list, j);
                    } else if (r1.b() == null) {
                        c1244Uf.d.add(interfaceC1242Ud);
                        if (c0942In != null) {
                            c0942In.i();
                        }
                    } else {
                        d(r1.b().d(interfaceC1242Ud.e(i)), this.k, 0, c1244Uf, interfaceC0912Hj, c0942In, list, j);
                    }
                    return;
                }
                if (!(interfaceC8322diG instanceof Exception) && !(interfaceC8322diG instanceof IJ)) {
                    if (!(interfaceC8322diG instanceof InterfaceC0943Io)) {
                        InterfaceC1593aHa.b("Bad path: " + interfaceC1242Ud + ", offset: " + i);
                        throw new IllegalStateException("Expected BranchNode, but found " + interfaceC8322diG.getClass().getSimpleName());
                    }
                    InterfaceC0943Io interfaceC0943Io = (InterfaceC0943Io) interfaceC8322diG;
                    Object obj = interfaceC1242Ud.d().get(i);
                    if (obj instanceof List) {
                        for (Object obj2 : (List) obj) {
                            if (obj2 instanceof Map) {
                                Map map = (Map) obj2;
                                Integer num = (Integer) map.get(NetflixActivity.EXTRA_FROM);
                                Integer num2 = (Integer) map.get("to");
                                if (num == null) {
                                    num = 0;
                                }
                                if (num2 == null) {
                                    throw new IllegalStateException("No 'to' param");
                                }
                                for (int intValue = num.intValue(); intValue <= num2.intValue(); intValue++) {
                                    b(interfaceC1242Ud.e(i, String.valueOf(intValue)), interfaceC8322diG, i, c1244Uf, z, interfaceC0912Hj, c0942In, j, list);
                                }
                            } else {
                                b(interfaceC1242Ud.e(i, obj2), interfaceC8322diG, i, c1244Uf, z, interfaceC0912Hj, c0942In, j, list);
                            }
                        }
                    } else if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        Integer num3 = (Integer) map2.get(NetflixActivity.EXTRA_FROM);
                        Integer num4 = (Integer) map2.get("to");
                        if (num3 == null) {
                            num3 = 0;
                        }
                        if (num4 == null) {
                            throw new IllegalStateException("No 'to' param");
                        }
                        for (int intValue2 = num3.intValue(); intValue2 <= num4.intValue(); intValue2++) {
                            b(interfaceC1242Ud.e(i, String.valueOf(intValue2)), interfaceC8322diG, i, c1244Uf, z, interfaceC0912Hj, c0942In, j, list);
                        }
                    } else {
                        String obj3 = obj.toString();
                        InterfaceC8322diG b2 = interfaceC0943Io.b(obj3);
                        if (b2 == null) {
                            if (c0942In != null) {
                                c0942In.i();
                            }
                            if (z) {
                                list.add(new IK(interfaceC1242Ud, i, obj3, interfaceC0943Io));
                                return;
                            }
                        } else if (c0942In != null && !(b2 instanceof InterfaceC0943Io)) {
                            c0942In.e();
                        }
                        b(interfaceC1242Ud, b2, i + 1, c1244Uf, z, interfaceC0912Hj, c0942In, j, list);
                    }
                    return;
                }
                c1244Uf.a.add(interfaceC1242Ud);
            }
        }
    }

    @Override // o.InterfaceC1240Ub
    public final InterfaceC8322diG b(InterfaceC1242Ud interfaceC1242Ud) {
        synchronized (this) {
            if (interfaceC1242Ud != null) {
                if (!interfaceC1242Ud.g()) {
                    InterfaceC8322diG interfaceC8322diG = this.k;
                    List<Object> d2 = interfaceC1242Ud.d();
                    int size = d2.size();
                    InterfaceC0943Io interfaceC0943Io = interfaceC8322diG;
                    for (int i = 0; i < size; i++) {
                        Object obj = d2.get(i);
                        if (obj != null) {
                            interfaceC8322diG = interfaceC0943Io.b((String) obj);
                            while (interfaceC8322diG instanceof IF) {
                                IF r0 = (IF) interfaceC8322diG;
                                if (i == size - 1) {
                                    return r0;
                                }
                                interfaceC8322diG = r0.d(this);
                            }
                            if ((interfaceC8322diG instanceof InterfaceC8319diD) && i >= size - 2) {
                                return interfaceC8322diG;
                            }
                            if (interfaceC8322diG instanceof InterfaceC0943Io) {
                                interfaceC0943Io = interfaceC8322diG;
                            } else {
                                if (!(interfaceC8322diG instanceof Exception)) {
                                    if (!(interfaceC8322diG instanceof IJ)) {
                                        return interfaceC8322diG;
                                    }
                                }
                                return interfaceC8322diG;
                            }
                        }
                    }
                    return interfaceC8322diG;
                }
            }
            return null;
        }
    }

    private static ArrayList<String> a(ArrayList<String> arrayList, String str) {
        ArrayList<String> arrayList2;
        if (arrayList == null) {
            arrayList2 = new ArrayList<>(15);
        } else {
            arrayList2 = new ArrayList<>(arrayList);
        }
        arrayList2.add(str);
        return arrayList2;
    }

    public final void d(HL hl, long j) {
        synchronized (this) {
            InterfaceC0913Hk d2 = d(j);
            b(hl, a(), null, d2, this.g, null, Long.valueOf(-c()));
            if (d2 != null) {
                d2.b(true);
            }
            if (d2 != null) {
                d2.close();
            }
        }
    }

    private static void b(HL hl, InterfaceC0943Io interfaceC0943Io, ArrayList<String> arrayList, InterfaceC0913Hk interfaceC0913Hk, InterfaceC0907He interfaceC0907He, Boolean bool, Long l) {
        JsonElement a2;
        Boolean bool2 = bool;
        for (Map.Entry<String, HZ> entry : hl.entrySet()) {
            String key = entry.getKey();
            HZ value = entry.getValue();
            if (value instanceof HH) {
                value = C0950Iv.b((HH) value);
            }
            Object e = interfaceC0943Io.e(key);
            boolean f2 = value.f();
            ArrayList<String> a3 = a(arrayList, key);
            String str = a3.get(0);
            Long l2 = "lolomo".equals(str) ? l : null;
            if (bool2 == null) {
                bool2 = Boolean.valueOf(interfaceC0907He.e(str));
            }
            Boolean bool3 = bool2;
            if (bool3.booleanValue() && (value instanceof HO)) {
                interfaceC0913Hk.c(IL.b(a3), value, l2);
            }
            if ((e instanceof InterfaceC8321diF) && (value instanceof HO)) {
                InterfaceC8321diF interfaceC8321diF = (InterfaceC8321diF) e;
                HO ho = (HO) value;
                interfaceC8321diF.setExpires(ho.a());
                Long e2 = ho.e();
                if (e2 != null) {
                    interfaceC8321diF.setTimestamp(e2.longValue());
                }
            }
            if ((e instanceof IH) && !value.t_()) {
                e = ((IH) e).a();
            }
            if (e instanceof InterfaceC0943Io) {
                if (f2) {
                    b(value.l(), (InterfaceC0943Io) e, a3, interfaceC0913Hk, interfaceC0907He, bool3, l);
                } else {
                    throw new IllegalStateException("should not happen");
                }
            } else if (e instanceof IF) {
                IF r4 = (IF) e;
                boolean g = value.g();
                if (interfaceC0913Hk != null) {
                    if (g && "shows".equals(a3.get(0)) && value.k().a() != null) {
                        new Date(System.currentTimeMillis() + 600000);
                        l2 = -600000L;
                    }
                    if (bool3.booleanValue()) {
                        interfaceC0913Hk.c(IL.b(a3), value, l2);
                    }
                }
                if (value.u_()) {
                    r4.d(IE.b(value.m()));
                } else if (value.s_()) {
                    r4.d(IE.d(HA.e.a(value.o())));
                } else if (value.v_()) {
                    interfaceC0943Io.d(key, IJ.b());
                } else if ((f2 || g) && !"current".equals(key)) {
                    "latest".equals(key);
                }
            } else if (e == null) {
                continue;
            } else {
                if (value instanceof HH) {
                    a2 = ((HH) value).d();
                } else {
                    a2 = HA.e.a(value);
                }
                if (bool3.booleanValue()) {
                    interfaceC0913Hk.c(IL.b(a3), value, l2);
                }
                if (e instanceof InterfaceC0952Ix) {
                    try {
                        ((InterfaceC0952Ix) e).populate(a2);
                    } catch (Exception e3) {
                        String jsonElement = a2.toString();
                        if (jsonElement.length() > 100) {
                            jsonElement = jsonElement.substring(0, 99);
                        }
                        String str2 = "node: " + e + ", path: " + a3 + ", value: " + jsonElement;
                        InterfaceC1593aHa.b(str2);
                        InterfaceC1593aHa.b(e3.toString());
                        InterfaceC1598aHf.a(new C1596aHd("Error populating node").b(ErrorType.m).d(e3).b(false));
                        throw new RuntimeException(str2, e3);
                    }
                } else if (e instanceof InterfaceC8322diG) {
                    interfaceC0943Io.d(key, C0946Ir.d("CachedModelProxy", a2, e.getClass()));
                } else {
                    InterfaceC1598aHf.a(new C1596aHd("Class was not an instance of BrowseObject, this should not happen").b(ErrorType.m));
                }
            }
            bool2 = bool3;
        }
    }

    public void c(InterfaceC1242Ud... interfaceC1242UdArr) {
        synchronized (this) {
            InterfaceC0909Hg e = e(System.currentTimeMillis());
            for (InterfaceC1242Ud interfaceC1242Ud : interfaceC1242UdArr) {
                b(interfaceC1242Ud, e);
            }
            e.b(false);
            e.close();
        }
    }

    private void b(InterfaceC1242Ud interfaceC1242Ud, InterfaceC0909Hg interfaceC0909Hg) {
        InterfaceC8322diG b2;
        synchronized (this) {
            if (interfaceC1242Ud.e() == 1) {
                b2 = b(interfaceC1242Ud);
            } else {
                b2 = b(interfaceC1242Ud.a(0, interfaceC1242Ud.e() - 1));
            }
            C1044Mm.j("CachedModelProxy", "falcor: invalidating: " + interfaceC1242Ud);
            if (interfaceC0909Hg != null) {
                String i = interfaceC1242Ud.i();
                if (i != null) {
                    interfaceC0909Hg.e(i);
                } else {
                    C1044Mm.e("CachedModelProxy", "cannot invalidate pql as it is not a simple path: " + interfaceC1242Ud);
                }
            }
            if (b2 == null) {
                C1044Mm.a("CachedModelProxy", "Can't invalidate node because it is null: %s", interfaceC1242Ud);
            } else if (b2 instanceof InterfaceC0943Io) {
                if ((b2 instanceof BranchMap) && interfaceC1242Ud.e() == 1) {
                    C1044Mm.a("CachedModelProxy", "Invalidating at BranchMap: %s", b2.getClass());
                    ((BranchMap) b2).clear();
                } else {
                    String valueOf = String.valueOf(interfaceC1242Ud.d().get(interfaceC1242Ud.e() - 1));
                    C1044Mm.a("CachedModelProxy", "Invalidating at BranchNode: %s, node key: %s", b2.getClass(), valueOf);
                    ((InterfaceC0943Io) b2).a(valueOf);
                }
            } else if (b2 instanceof IF) {
                C1044Mm.a("CachedModelProxy", "Invalidating ref path for pql: %s", interfaceC1242Ud);
                ((IF) b2).d((InterfaceC1242Ud) null);
            } else {
                C1044Mm.j("CachedModelProxy", "Don't know how to invalidate node: %s, pql: ", b2.getClass(), interfaceC1242Ud);
            }
        }
    }

    public final void b(boolean z) {
        synchronized (this) {
            InterfaceC1593aHa.b("CachedModelProxy Flushing caches. Include Disk " + z);
            if (z) {
                InterfaceC0914Hl b2 = this.i.b();
                b2.e();
                b2.close();
            }
            this.e = -1;
            this.c = -1;
            T t = this.k;
            if (t instanceof Flushable) {
                try {
                    ((Flushable) t).flush();
                } catch (IOException e) {
                    C1044Mm.a("CachedModelProxy", e);
                }
            }
        }
    }

    @Override // o.InterfaceC1240Ub
    public final <I extends InterfaceC8319diD> List<I> c(InterfaceC1242Ud interfaceC1242Ud) {
        return b(Collections.singleton(interfaceC1242Ud));
    }

    @Override // o.InterfaceC1240Ub
    public final <I extends InterfaceC8319diD> List<I> b(Collection<InterfaceC1242Ud> collection) {
        ArrayList arrayList;
        synchronized (this) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (InterfaceC1242Ud interfaceC1242Ud : collection) {
                for (InterfaceC1242Ud interfaceC1242Ud2 : interfaceC1242Ud.c()) {
                    InterfaceC8322diG b2 = b(interfaceC1242Ud2);
                    if (b2 instanceof InterfaceC8319diD) {
                        linkedHashSet.add((InterfaceC8319diD) b2);
                    }
                }
            }
            arrayList = new ArrayList(linkedHashSet.size());
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList.add((InterfaceC8319diD) it.next());
            }
        }
        return arrayList;
    }

    public static long c() {
        b bVar = a;
        if (bVar != null) {
            return bVar.b();
        }
        return 36000000L;
    }

    public static boolean b() {
        return c() > 0;
    }
}
