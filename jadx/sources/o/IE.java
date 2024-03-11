package o;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class IE {
    public static InterfaceC1242Ud b(Object... objArr) {
        return new IC(d(Arrays.asList(objArr)));
    }

    static InterfaceC1242Ud b(List list) {
        return new IC(d(list));
    }

    public static InterfaceC1242Ud d(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList(jsonArray.size());
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            JsonElement next = it.next();
            if (next.isJsonPrimitive()) {
                arrayList.add(next.getAsString());
            } else if (next.isJsonArray()) {
                ArrayList arrayList2 = new ArrayList();
                JsonArray asJsonArray = next.getAsJsonArray();
                for (int i = 0; i < asJsonArray.size(); i++) {
                    arrayList2.add(jsonArray.get(i).toString());
                }
                arrayList.add(arrayList2);
            } else if (next.isJsonObject()) {
                JsonObject asJsonObject = next.getAsJsonObject();
                JsonElement jsonElement = asJsonObject.get("to");
                if (jsonElement != null) {
                    JsonElement jsonElement2 = asJsonObject.get(NetflixActivity.EXTRA_FROM);
                    HashMap hashMap = new HashMap();
                    hashMap.put("to", Long.valueOf(jsonElement.getAsLong()));
                    hashMap.put(NetflixActivity.EXTRA_FROM, Long.valueOf(jsonElement2 == null ? 0L : jsonElement2.getAsLong()));
                    arrayList.add(hashMap);
                }
            } else {
                InterfaceC1598aHf.a(new C1596aHd("Query.fromJsonArray: unknown json " + next).b(ErrorType.m));
            }
        }
        return b((List) arrayList);
    }

    public static InterfaceC1242Ud b(HX hx) {
        AbstractC0935Ig<GW> i = hx.i();
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(i.d().b());
            i = i.g();
        } while (i.b());
        return b((List) arrayList);
    }

    public static void c(List<InterfaceC1242Ud> list) {
        List arrayList;
        InterfaceC1242Ud interfaceC1242Ud;
        int size = list.size();
        if (list.size() < 2) {
            return;
        }
        Collections.sort(list, new Comparator<InterfaceC1242Ud>() { // from class: o.IE.3
            @Override // java.util.Comparator
            /* renamed from: b */
            public int compare(InterfaceC1242Ud interfaceC1242Ud2, InterfaceC1242Ud interfaceC1242Ud3) {
                return IE.e(interfaceC1242Ud2, interfaceC1242Ud3);
            }
        });
        int i = 0;
        int i2 = 1;
        boolean z = false;
        int i3 = 1;
        InterfaceC1242Ud interfaceC1242Ud2 = null;
        InterfaceC1242Ud interfaceC1242Ud3 = null;
        while (i3 != 0) {
            int i4 = i;
            int i5 = i4;
            int i6 = i2;
            boolean z2 = z;
            int i7 = -1;
            InterfaceC1242Ud interfaceC1242Ud4 = interfaceC1242Ud3;
            InterfaceC1242Ud interfaceC1242Ud5 = interfaceC1242Ud2;
            int i8 = i5;
            while (i6 < size) {
                interfaceC1242Ud5 = list.get(i4);
                List<Object> d = interfaceC1242Ud5.d();
                InterfaceC1242Ud interfaceC1242Ud6 = list.get(i6);
                List<Object> d2 = interfaceC1242Ud6.d();
                Integer num = 100;
                if (d.size() == d2.size() && d.size() > i2) {
                    num = Integer.valueOf(i);
                    for (int size2 = d.size() - i2; size2 >= 0 && num.intValue() <= i2; size2--) {
                        if (!e(d.get(size2), d2.get(size2))) {
                            num = Integer.valueOf(num.intValue() + i2);
                            i7 = size2;
                        }
                    }
                }
                if (num.intValue() == i2) {
                    Object obj = d.get(i7);
                    if (!(obj instanceof List)) {
                        arrayList = new ArrayList();
                        arrayList.add(obj);
                        d.set(i7, arrayList);
                    } else if (obj instanceof ArrayList) {
                        arrayList = (List) obj;
                    } else {
                        arrayList = new ArrayList((List) obj);
                    }
                    Object obj2 = arrayList.get(arrayList.size() - i2);
                    Map map = obj2 instanceof Map ? (Map) obj2 : null;
                    Integer e = e(obj2);
                    Object obj3 = d2.get(i7);
                    Integer e2 = e(obj3);
                    if (map == null || map.get("to") == null || e2 == null) {
                        interfaceC1242Ud = interfaceC1242Ud6;
                    } else {
                        interfaceC1242Ud = interfaceC1242Ud6;
                        if (((Integer) map.get("to")).equals(Integer.valueOf(e2.intValue() - 1))) {
                            map.put("to", Integer.valueOf(((Integer) map.get("to")).intValue() + 1));
                        } else {
                            i2 = 1;
                        }
                    }
                    if (e != null && e2 != null && e.equals(Integer.valueOf(e2.intValue() - i2))) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(NetflixActivity.EXTRA_FROM, e);
                        hashMap.put("to", e2);
                        arrayList.set(arrayList.size() - i2, hashMap);
                    } else if (obj3 instanceof List) {
                        arrayList.addAll((List) obj3);
                    } else {
                        arrayList.add(d2.get(i7));
                    }
                } else {
                    interfaceC1242Ud = interfaceC1242Ud6;
                    if (num.intValue() != 0) {
                        list.set(i5, interfaceC1242Ud5);
                        i5++;
                        i4 = i6;
                        interfaceC1242Ud4 = interfaceC1242Ud;
                        i = 0;
                        z2 = false;
                        i7 = -1;
                        i6++;
                        i2 = 1;
                    }
                }
                i6++;
                interfaceC1242Ud4 = interfaceC1242Ud;
                i = 0;
                i2 = 1;
                i8 = 1;
                z2 = true;
            }
            if (!z2) {
                list.set(i5, interfaceC1242Ud4);
            } else if (i8 != 0) {
                list.set(i5, interfaceC1242Ud5);
            }
            size = i5 + 1;
            i3 = i8;
            interfaceC1242Ud2 = interfaceC1242Ud5;
            interfaceC1242Ud3 = interfaceC1242Ud4;
            z = z2;
            i = 0;
            i2 = 1;
        }
        for (int size3 = list.size() - 1; size3 >= size; size3--) {
            list.remove(size3);
        }
        for (InterfaceC1242Ud interfaceC1242Ud7 : list) {
            d(interfaceC1242Ud7.d());
        }
    }

    public static int b(Collection<InterfaceC1242Ud> collection) {
        int i = 0;
        for (InterfaceC1242Ud interfaceC1242Ud : collection) {
            i += interfaceC1242Ud.b();
        }
        return i;
    }

    public static List c(Object... objArr) {
        return Arrays.asList(objArr);
    }

    public static Map a(int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put(NetflixActivity.EXTRA_FROM, Integer.valueOf(i));
        hashMap.put("to", Integer.valueOf(i2));
        return hashMap;
    }

    public static Map a(int i) {
        return a(0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(java.lang.Object r4) {
        /*
            boolean r0 = r4 instanceof java.util.List
            r1 = 0
            if (r0 == 0) goto L14
            r0 = r4
            java.util.List r0 = (java.util.List) r0
            int r2 = r0.size()
            r3 = 1
            if (r2 != r3) goto L14
            java.lang.Object r4 = r0.get(r1)
            goto L15
        L14:
            r3 = r1
        L15:
            boolean r0 = r4 instanceof java.util.Map
            if (r0 == 0) goto L55
            r0 = r4
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r2 = "from"
            java.lang.Object r3 = r0.get(r2)
            if (r3 != 0) goto L2c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r1)
            goto L3d
        L2c:
            boolean r1 = r3 instanceof java.lang.Long
            if (r1 == 0) goto L3d
            java.lang.Long r3 = (java.lang.Long) r3
            int r1 = r3.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r1)
        L3d:
            java.lang.String r1 = "to"
            java.lang.Object r2 = r0.get(r1)
            boolean r3 = r2 instanceof java.lang.Long
            if (r3 == 0) goto La0
            java.lang.Long r2 = (java.lang.Long) r2
            int r2 = r2.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto La0
        L55:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L5e
            java.lang.String r4 = r4.toString()
            goto La0
        L5e:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 != 0) goto La0
            boolean r0 = r4 instanceof java.util.List
            if (r0 != 0) goto La0
            if (r3 == 0) goto L6d
            java.lang.String r0 = "sanitizeKey: key was a List"
            o.InterfaceC1593aHa.b(r0)
        L6d:
            if (r4 != 0) goto L72
            java.lang.String r0 = "null"
            goto L7a
        L72:
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L7a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "sanitizeKey: Invalid Query key "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            o.InterfaceC1593aHa.b(r0)
            o.aHd r1 = new o.aHd
            r1.<init>(r0)
            com.netflix.mediaclient.api.logging.error.ErrorType r0 = com.netflix.mediaclient.api.logging.error.ErrorType.m
            o.aHd r0 = r1.b(r0)
            o.InterfaceC1598aHf.a(r0)
            java.lang.String r4 = r4.toString()
        La0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.IE.b(java.lang.Object):java.lang.Object");
    }

    private static List d(List list) {
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof List) {
                List list2 = (List) obj;
                if (list2 != null && list2.size() == 1) {
                    list.set(i, b(obj));
                } else {
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        list2.set(i2, b(list2.get(i2)));
                    }
                }
            } else {
                list.set(i, b(obj));
            }
        }
        return list;
    }

    private static Double a(Object obj) {
        if ((obj instanceof Map) || (obj instanceof List)) {
            return null;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (Exception unused) {
                return null;
            }
        } else if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        } else {
            return (Double) obj;
        }
    }

    private static Integer e(Object obj) {
        if ((obj instanceof Map) || (obj instanceof List)) {
            return null;
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (Exception unused) {
                return null;
            }
        }
        return (Integer) obj;
    }

    private static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else if (obj2 == null) {
            return false;
        } else {
            return obj.equals(obj2);
        }
    }

    private static boolean e(Object obj, Object obj2) {
        if (b(obj.toString(), obj2.toString())) {
            return true;
        }
        Map map = obj instanceof Map ? (Map) obj : null;
        Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
        if (map == null || map2 == null || map.get("to") == null || !b(map.get("to"), map2.get("to")) || !b(map.get(NetflixActivity.EXTRA_FROM), map2.get(NetflixActivity.EXTRA_FROM))) {
            List list = obj instanceof List ? (List) obj : null;
            List list2 = obj2 instanceof List ? (List) obj2 : null;
            if (list == null || list2 == null || list.size() != list2.size()) {
                return false;
            }
            int size = list.size() - 1;
            while (size >= 0 && e(list.get(size), list2.get(size))) {
                size--;
            }
            return size < 0;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(InterfaceC1242Ud interfaceC1242Ud, InterfaceC1242Ud interfaceC1242Ud2) {
        List<Object> d = interfaceC1242Ud.d();
        List<Object> d2 = interfaceC1242Ud2.d();
        int size = d.size();
        int size2 = d2.size();
        int i = size - size2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (i != 0) {
            return i;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (d.get(i2) instanceof String) {
                arrayList2.add(Integer.valueOf(i2));
            } else {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        arrayList2.addAll(arrayList);
        for (int i3 = 0; i3 < size; i3++) {
            int intValue = ((Integer) arrayList2.get(i3)).intValue();
            Object obj = d.get(intValue);
            Object obj2 = d2.get(intValue);
            List list = obj instanceof List ? (List) obj : null;
            List list2 = obj2 instanceof List ? (List) obj2 : null;
            if (list != null && list.size() == 1 && list2 == null) {
                obj = list.get(0);
                list = null;
            }
            if (list2 != null && list2.size() == 1 && list == null) {
                obj2 = list2.get(0);
                list2 = null;
            }
            if (list != null && list2 != null) {
                int size3 = list2.size() - list2.size();
                if (size3 != 0) {
                    return size3;
                }
                for (int i4 = 0; i4 < list.size(); i4++) {
                    Object obj3 = list.get(i4);
                    Object obj4 = list2.get(i4);
                    if (obj3 instanceof Map) {
                        obj3 = ((Map) obj3).get(NetflixActivity.EXTRA_FROM);
                    }
                    if (obj4 instanceof Map) {
                        obj4 = ((Map) obj4).get(NetflixActivity.EXTRA_FROM);
                    }
                    Double a = a(obj3);
                    Double a2 = a(obj4);
                    if (a2 != null && !a.equals(a2)) {
                        double doubleValue = a.doubleValue() - a2.doubleValue();
                        if (doubleValue != 0.0d) {
                            return (int) doubleValue;
                        }
                    } else {
                        int compareTo = obj3.toString().compareTo(obj4.toString());
                        if (compareTo != 0) {
                            return compareTo;
                        }
                    }
                }
                return 0;
            }
            Map map = obj instanceof Map ? (Map) obj : null;
            if (map != null && (obj = map.get(NetflixActivity.EXTRA_FROM)) == null) {
                obj = 0;
            }
            Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
            if (map2 != null && (obj2 = map2.get(NetflixActivity.EXTRA_FROM)) == null) {
                obj2 = 0;
            }
            Double a3 = a(obj);
            Double a4 = a(obj2);
            if (a3 != null && a4 != null && !a3.equals(a4)) {
                return (int) (a3.doubleValue() - a4.doubleValue());
            }
            int compareTo2 = obj.toString().compareTo(obj2.toString());
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        if (size > size2) {
            return 1;
        }
        return size2 > size ? -1 : 0;
    }
}
