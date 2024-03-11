package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.locationselector;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import o.C4755bkv;
import o.InterfaceC4662bij;

/* loaded from: classes6.dex */
class NetflixUnequalizedLocationSelector$LocationSelectionTreeSet<T> extends TreeSet<Comparable> {
    final /* synthetic */ InterfaceC4662bij c$2feb35fc;

    public /* synthetic */ NetflixUnequalizedLocationSelector$LocationSelectionTreeSet(InterfaceC4662bij interfaceC4662bij, Object obj) {
        this(interfaceC4662bij);
    }

    private NetflixUnequalizedLocationSelector$LocationSelectionTreeSet(InterfaceC4662bij interfaceC4662bij) {
        this.c$2feb35fc = interfaceC4662bij;
    }

    public Comparable c$6feff228(String str) {
        Iterator it = super.iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) it.next();
            try {
                Object[] objArr = {str};
                Object obj = C4755bkv.q.get(1305470229);
                if (obj == null) {
                    obj = ((Class) C4755bkv.b((char) 0, 5, 1489)).getMethod("b", String.class);
                    C4755bkv.q.put(1305470229, obj);
                }
                if (((Boolean) ((Method) obj).invoke(comparable, objArr)).booleanValue()) {
                    try {
                        Object obj2 = C4755bkv.q.get(31362344);
                        if (obj2 == null) {
                            obj2 = ((Class) C4755bkv.b((char) 0, 5, 1489)).getMethod("k", null);
                            C4755bkv.q.put(31362344, obj2);
                        }
                        if (!((Boolean) ((Method) obj2).invoke(comparable, null)).booleanValue()) {
                            return comparable;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        return null;
    }

    public Comparable d$6feff228(String str) {
        try {
            Object[] objArr = {this.c$2feb35fc, str};
            Object obj = C4755bkv.q.get(-1360060665);
            if (obj == null) {
                obj = ((Class) C4755bkv.b((char) 0, 136, 1525)).getDeclaredMethod("a", (Class) C4755bkv.b((char) 0, 136, 1525), String.class);
                C4755bkv.q.put(-1360060665, obj);
            }
            boolean booleanValue = ((Boolean) ((Method) obj).invoke(null, objArr)).booleanValue();
            Iterator it = super.iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) it.next();
                try {
                    Object obj2 = C4755bkv.q.get(31362344);
                    if (obj2 == null) {
                        obj2 = ((Class) C4755bkv.b((char) 0, 5, 1489)).getMethod("k", null);
                        C4755bkv.q.put(31362344, obj2);
                    }
                    if (!((Boolean) ((Method) obj2).invoke(comparable, null)).booleanValue()) {
                        try {
                            Object[] objArr2 = {str, Boolean.valueOf(booleanValue)};
                            Object obj3 = C4755bkv.q.get(333300735);
                            if (obj3 == null) {
                                obj3 = ((Class) C4755bkv.b((char) 0, 5, 1489)).getMethod("b", String.class, Boolean.TYPE);
                                C4755bkv.q.put(333300735, obj3);
                            }
                            if (((Boolean) ((Method) obj3).invoke(comparable, objArr2)).booleanValue()) {
                                return comparable;
                            }
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            return c$6feff228(str);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }

    public Comparable a$6feff228(String str) {
        Iterator it = super.iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) it.next();
            try {
                Object[] objArr = {str};
                Object obj = C4755bkv.q.get(1305470229);
                if (obj == null) {
                    obj = ((Class) C4755bkv.b((char) 0, 5, 1489)).getMethod("b", String.class);
                    C4755bkv.q.put(1305470229, obj);
                }
                if (((Boolean) ((Method) obj).invoke(comparable, objArr)).booleanValue()) {
                    return comparable;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return null;
    }

    public void i() {
        Iterator it = super.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                Object obj = C4755bkv.q.get(31365227);
                if (obj == null) {
                    obj = ((Class) C4755bkv.b((char) 0, 5, 1489)).getMethod("n", null);
                    C4755bkv.q.put(31365227, obj);
                }
                ((Method) obj).invoke(next, null);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    public boolean b(String str) {
        Iterator it = super.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            try {
                Object[] objArr = {str};
                Object obj = C4755bkv.q.get(1305470229);
                if (obj == null) {
                    obj = ((Class) C4755bkv.b((char) 0, 5, 1489)).getMethod("b", String.class);
                    C4755bkv.q.put(1305470229, obj);
                }
                if (((Boolean) ((Method) obj).invoke(next, objArr)).booleanValue()) {
                    i2++;
                    try {
                        Object obj2 = C4755bkv.q.get(31362344);
                        if (obj2 == null) {
                            obj2 = ((Class) C4755bkv.b((char) 0, 5, 1489)).getMethod("k", null);
                            C4755bkv.q.put(31362344, obj2);
                        }
                        if (((Boolean) ((Method) obj2).invoke(next, null)).booleanValue()) {
                            i++;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        return i != i2;
    }

    public boolean e(String str) {
        Iterator it = super.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                Object[] objArr = {str};
                Object obj = C4755bkv.q.get(1305470229);
                if (obj == null) {
                    obj = ((Class) C4755bkv.b((char) 0, 5, 1489)).getMethod("b", String.class);
                    C4755bkv.q.put(1305470229, obj);
                }
                if (((Boolean) ((Method) obj).invoke(next, objArr)).booleanValue()) {
                    try {
                        Object obj2 = C4755bkv.q.get(31363305);
                        if (obj2 == null) {
                            obj2 = ((Class) C4755bkv.b((char) 0, 5, 1489)).getMethod("l", null);
                            C4755bkv.q.put(31363305, obj2);
                        }
                        if (((Boolean) ((Method) obj2).invoke(next, null)).booleanValue()) {
                            return true;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        return false;
    }

    public int b() {
        Iterator it = super.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Class) C4755bkv.b((char) 0, 5, 1489)).getField("d").getInt(it.next());
        }
        return i;
    }

    public int e() {
        Iterator it = super.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Class) C4755bkv.b((char) 0, 5, 1489)).getField("i").getInt(it.next());
        }
        return i;
    }

    public int a() {
        Iterator it = super.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Class) C4755bkv.b((char) 0, 5, 1489)).getField("e").getInt(it.next());
        }
        return i;
    }

    public int c() {
        Iterator it = super.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Class) C4755bkv.b((char) 0, 5, 1489)).getField("j").getInt(it.next());
        }
        return i;
    }

    public long d() {
        Iterator it = super.iterator();
        long j = -1;
        while (it.hasNext()) {
            Object next = it.next();
            if (((Class) C4755bkv.b((char) 0, 5, 1489)).getField("d").getInt(next) > 0) {
                j = Math.max(j, ((Class) C4755bkv.b((char) 0, 5, 1489)).getField("g").getLong(next));
            }
        }
        return j;
    }

    public long f() {
        Iterator it = super.iterator();
        long j = -1;
        while (it.hasNext()) {
            Object next = it.next();
            if (((Class) C4755bkv.b((char) 0, 5, 1489)).getField("e").getInt(next) > 0) {
                j = Math.max(j, ((Class) C4755bkv.b((char) 0, 5, 1489)).getField("h").getLong(next));
            }
        }
        return j;
    }

    public List<Long> g() {
        ArrayList arrayList = new ArrayList();
        Iterator it = super.iterator();
        while (it.hasNext()) {
            arrayList.addAll((Collection) ((Class) C4755bkv.b((char) 0, 5, 1489)).getField("p").get(it.next()));
        }
        return arrayList;
    }

    public List<Long> j() {
        ArrayList arrayList = new ArrayList();
        Iterator it = super.iterator();
        while (it.hasNext()) {
            arrayList.addAll((Collection) ((Class) C4755bkv.b((char) 0, 5, 1489)).getField("s").get(it.next()));
        }
        return arrayList;
    }
}
