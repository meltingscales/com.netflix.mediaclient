package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import o.AbstractC9452pp;

/* loaded from: classes5.dex */
public class BeanPropertyMap implements Iterable<SettableBeanProperty>, Serializable {
    private static final long serialVersionUID = 2;
    private final Map<String, List<PropertyName>> a;
    private Object[] b;
    private int c;
    private final Map<String, String> d;
    protected final boolean e;
    private int f;
    private int g;
    private final SettableBeanProperty[] j;

    private static final int e(int i) {
        if (i <= 5) {
            return 8;
        }
        if (i <= 12) {
            return 16;
        }
        int i2 = 32;
        while (i2 < (i >> 2) + i) {
            i2 += i2;
        }
        return i2;
    }

    public SettableBeanProperty[] b() {
        return this.j;
    }

    public boolean c() {
        return this.e;
    }

    public int e() {
        return this.g;
    }

    public BeanPropertyMap(boolean z, Collection<SettableBeanProperty> collection, Map<String, List<PropertyName>> map) {
        this.e = z;
        this.j = (SettableBeanProperty[]) collection.toArray(new SettableBeanProperty[collection.size()]);
        this.a = map;
        this.d = a(map);
        b(collection);
    }

    private BeanPropertyMap(BeanPropertyMap beanPropertyMap, SettableBeanProperty settableBeanProperty, int i, int i2) {
        this.e = beanPropertyMap.e;
        this.c = beanPropertyMap.c;
        this.g = beanPropertyMap.g;
        this.f = beanPropertyMap.f;
        this.a = beanPropertyMap.a;
        this.d = beanPropertyMap.d;
        Object[] objArr = beanPropertyMap.b;
        this.b = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap.j;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this.j = settableBeanPropertyArr2;
        this.b[i] = settableBeanProperty;
        settableBeanPropertyArr2[i2] = settableBeanProperty;
    }

    private BeanPropertyMap(BeanPropertyMap beanPropertyMap, SettableBeanProperty settableBeanProperty, String str, int i) {
        this.e = beanPropertyMap.e;
        this.c = beanPropertyMap.c;
        this.g = beanPropertyMap.g;
        this.f = beanPropertyMap.f;
        this.a = beanPropertyMap.a;
        this.d = beanPropertyMap.d;
        Object[] objArr = beanPropertyMap.b;
        this.b = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap.j;
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, length + 1);
        this.j = settableBeanPropertyArr2;
        settableBeanPropertyArr2[length] = settableBeanProperty;
        int i2 = this.c + 1;
        int i3 = i << 1;
        Object[] objArr2 = this.b;
        if (objArr2[i3] != null) {
            i3 = ((i >> 1) + i2) << 1;
            if (objArr2[i3] != null) {
                int i4 = this.f;
                i3 = ((i2 + (i2 >> 1)) << 1) + i4;
                this.f = i4 + 2;
                if (i3 >= objArr2.length) {
                    this.b = Arrays.copyOf(objArr2, objArr2.length + 4);
                }
            }
        }
        Object[] objArr3 = this.b;
        objArr3[i3] = str;
        objArr3[i3 + 1] = settableBeanProperty;
    }

    protected BeanPropertyMap(BeanPropertyMap beanPropertyMap, boolean z) {
        this.e = z;
        this.a = beanPropertyMap.a;
        this.d = beanPropertyMap.d;
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap.j;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this.j = settableBeanPropertyArr2;
        b(Arrays.asList(settableBeanPropertyArr2));
    }

    public BeanPropertyMap d(boolean z) {
        return this.e == z ? this : new BeanPropertyMap(this, z);
    }

    protected void b(Collection<SettableBeanProperty> collection) {
        int size = collection.size();
        this.g = size;
        int e = e(size);
        this.c = e - 1;
        int i = (e >> 1) + e;
        Object[] objArr = new Object[i * 2];
        int i2 = 0;
        for (SettableBeanProperty settableBeanProperty : collection) {
            if (settableBeanProperty != null) {
                String a = a(settableBeanProperty);
                int b = b(a);
                int i3 = b << 1;
                if (objArr[i3] != null) {
                    i3 = ((b >> 1) + e) << 1;
                    if (objArr[i3] != null) {
                        i3 = (i << 1) + i2;
                        i2 += 2;
                        if (i3 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i3] = a;
                objArr[i3 + 1] = settableBeanProperty;
            }
        }
        this.b = objArr;
        this.f = i2;
    }

    public static BeanPropertyMap c(Collection<SettableBeanProperty> collection, boolean z, Map<String, List<PropertyName>> map) {
        return new BeanPropertyMap(z, collection, map);
    }

    public BeanPropertyMap e(SettableBeanProperty settableBeanProperty) {
        String a = a(settableBeanProperty);
        int length = this.b.length;
        for (int i = 1; i < length; i += 2) {
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) this.b[i];
            if (settableBeanProperty2 != null && settableBeanProperty2.a().equals(a)) {
                return new BeanPropertyMap(this, settableBeanProperty, i, c(settableBeanProperty2));
            }
        }
        return new BeanPropertyMap(this, settableBeanProperty, a, b(a));
    }

    public BeanPropertyMap a() {
        int length = this.b.length;
        int i = 0;
        for (int i2 = 1; i2 < length; i2 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this.b[i2];
            if (settableBeanProperty != null) {
                settableBeanProperty.d(i);
                i++;
            }
        }
        return this;
    }

    public BeanPropertyMap c(NameTransformer nameTransformer) {
        if (nameTransformer == null || nameTransformer == NameTransformer.e) {
            return this;
        }
        int length = this.j.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanProperty = this.j[i];
            if (settableBeanProperty == null) {
                arrayList.add(settableBeanProperty);
            } else {
                arrayList.add(e(settableBeanProperty, nameTransformer));
            }
        }
        return new BeanPropertyMap(this.e, arrayList, this.a);
    }

    public BeanPropertyMap d(Collection<String> collection) {
        if (collection.isEmpty()) {
            return this;
        }
        int length = this.j.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanProperty = this.j[i];
            if (settableBeanProperty != null && !collection.contains(settableBeanProperty.a())) {
                arrayList.add(settableBeanProperty);
            }
        }
        return new BeanPropertyMap(this.e, arrayList, this.a);
    }

    public void a(SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        int length = this.b.length;
        for (int i = 1; i <= length; i += 2) {
            Object[] objArr = this.b;
            if (objArr[i] == settableBeanProperty) {
                objArr[i] = settableBeanProperty2;
                this.j[c(settableBeanProperty)] = settableBeanProperty2;
                return;
            }
        }
        throw new NoSuchElementException("No entry '" + settableBeanProperty.a() + "' found, can't replace");
    }

    public void d(SettableBeanProperty settableBeanProperty) {
        ArrayList arrayList = new ArrayList(this.g);
        String a = a(settableBeanProperty);
        int length = this.b.length;
        boolean z = false;
        for (int i = 1; i < length; i += 2) {
            Object[] objArr = this.b;
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) objArr[i];
            if (settableBeanProperty2 != null) {
                if (!z && (z = a.equals(objArr[i - 1]))) {
                    this.j[c(settableBeanProperty2)] = null;
                } else {
                    arrayList.add(settableBeanProperty2);
                }
            }
        }
        if (!z) {
            throw new NoSuchElementException("No entry '" + settableBeanProperty.a() + "' found, can't remove");
        }
        b(arrayList);
    }

    @Override // java.lang.Iterable
    public Iterator<SettableBeanProperty> iterator() {
        return d().iterator();
    }

    private List<SettableBeanProperty> d() {
        ArrayList arrayList = new ArrayList(this.g);
        int length = this.b.length;
        for (int i = 1; i < length; i += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this.b[i];
            if (settableBeanProperty != null) {
                arrayList.add(settableBeanProperty);
            }
        }
        return arrayList;
    }

    protected final String a(SettableBeanProperty settableBeanProperty) {
        boolean z = this.e;
        String a = settableBeanProperty.a();
        return z ? a.toLowerCase() : a;
    }

    public SettableBeanProperty e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot pass null property name");
        }
        if (this.e) {
            str = str.toLowerCase();
        }
        int hashCode = str.hashCode() & this.c;
        int i = hashCode << 1;
        Object obj = this.b[i];
        if (obj == str || str.equals(obj)) {
            return (SettableBeanProperty) this.b[i + 1];
        }
        return a(str, hashCode, obj);
    }

    private final SettableBeanProperty a(String str, int i, Object obj) {
        if (obj == null) {
            return c(this.d.get(str));
        }
        int i2 = this.c + 1;
        int i3 = ((i >> 1) + i2) << 1;
        Object obj2 = this.b[i3];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this.b[i3 + 1];
        }
        if (obj2 != null) {
            int i4 = (i2 + (i2 >> 1)) << 1;
            int i5 = this.f;
            for (int i6 = i4; i6 < i5 + i4; i6 += 2) {
                Object obj3 = this.b[i6];
                if (obj3 == str || str.equals(obj3)) {
                    return (SettableBeanProperty) this.b[i6 + 1];
                }
            }
        }
        return c(this.d.get(str));
    }

    private SettableBeanProperty c(String str) {
        if (str == null) {
            return null;
        }
        int b = b(str);
        int i = b << 1;
        Object obj = this.b[i];
        if (str.equals(obj)) {
            return (SettableBeanProperty) this.b[i + 1];
        }
        if (obj == null) {
            return null;
        }
        return b(str, b, obj);
    }

    private SettableBeanProperty b(String str, int i, Object obj) {
        int i2 = this.c + 1;
        int i3 = ((i >> 1) + i2) << 1;
        Object obj2 = this.b[i3];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this.b[i3 + 1];
        }
        if (obj2 != null) {
            int i4 = (i2 + (i2 >> 1)) << 1;
            int i5 = this.f;
            for (int i6 = i4; i6 < i5 + i4; i6 += 2) {
                Object obj3 = this.b[i6];
                if (obj3 == str || str.equals(obj3)) {
                    return (SettableBeanProperty) this.b[i6 + 1];
                }
            }
            return null;
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Properties=[");
        Iterator<SettableBeanProperty> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            SettableBeanProperty next = it.next();
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(next.a());
            sb.append('(');
            sb.append(next.d());
            sb.append(')');
            i++;
        }
        sb.append(']');
        if (!this.a.isEmpty()) {
            sb.append("(aliases: ");
            sb.append(this.a);
            sb.append(")");
        }
        return sb.toString();
    }

    protected SettableBeanProperty e(SettableBeanProperty settableBeanProperty, NameTransformer nameTransformer) {
        AbstractC9452pp<Object> d;
        if (settableBeanProperty == null) {
            return settableBeanProperty;
        }
        SettableBeanProperty e = settableBeanProperty.e(nameTransformer.c(settableBeanProperty.a()));
        AbstractC9452pp<Object> o2 = e.o();
        return (o2 == null || (d = o2.d(nameTransformer)) == o2) ? e : e.d(d);
    }

    private final int c(SettableBeanProperty settableBeanProperty) {
        int length = this.j.length;
        for (int i = 0; i < length; i++) {
            if (this.j[i] == settableBeanProperty) {
                return i;
            }
        }
        throw new IllegalStateException("Illegal state: property '" + settableBeanProperty.a() + "' missing from _propsInOrder");
    }

    private final int b(String str) {
        return str.hashCode() & this.c;
    }

    private Map<String, String> a(Map<String, List<PropertyName>> map) {
        if (map == null || map.isEmpty()) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<PropertyName>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (this.e) {
                key = key.toLowerCase();
            }
            for (PropertyName propertyName : entry.getValue()) {
                String c = propertyName.c();
                if (this.e) {
                    c = c.toLowerCase();
                }
                hashMap.put(c, key);
            }
        }
        return hashMap;
    }
}
