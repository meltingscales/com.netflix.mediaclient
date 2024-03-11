package com.netflix.mediaclient.ui.details;

import com.netflix.mediaclient.ui.R;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import o.C3654bFw;

/* loaded from: classes4.dex */
public final class DetailsUtilImpl$createCapToStrMap$1 extends EnumMap<SupportedCapabilities, Pair<? extends Integer, ? extends Integer>> {
    public DetailsUtilImpl$createCapToStrMap$1(Class<SupportedCapabilities> cls) {
        super(cls);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        SupportedCapabilities supportedCapabilities = SupportedCapabilities.d;
        Integer valueOf = Integer.valueOf(R.o.ci);
        i = C3654bFw.g;
        put((DetailsUtilImpl$createCapToStrMap$1) supportedCapabilities, (SupportedCapabilities) new Pair(valueOf, Integer.valueOf(i)));
        SupportedCapabilities supportedCapabilities2 = SupportedCapabilities.g;
        Integer valueOf2 = Integer.valueOf(R.o.cg);
        i2 = C3654bFw.i;
        put((DetailsUtilImpl$createCapToStrMap$1) supportedCapabilities2, (SupportedCapabilities) new Pair(valueOf2, Integer.valueOf(i2)));
        SupportedCapabilities supportedCapabilities3 = SupportedCapabilities.i;
        Integer valueOf3 = Integer.valueOf(R.o.cc);
        i3 = C3654bFw.e;
        put((DetailsUtilImpl$createCapToStrMap$1) supportedCapabilities3, (SupportedCapabilities) new Pair(valueOf3, Integer.valueOf(i3)));
        SupportedCapabilities supportedCapabilities4 = SupportedCapabilities.e;
        Integer valueOf4 = Integer.valueOf(R.o.ce);
        i4 = C3654bFw.h;
        put((DetailsUtilImpl$createCapToStrMap$1) supportedCapabilities4, (SupportedCapabilities) new Pair(valueOf4, Integer.valueOf(i4)));
        SupportedCapabilities supportedCapabilities5 = SupportedCapabilities.a;
        Integer valueOf5 = Integer.valueOf(R.o.ch);
        i5 = C3654bFw.b;
        put((DetailsUtilImpl$createCapToStrMap$1) supportedCapabilities5, (SupportedCapabilities) new Pair(valueOf5, Integer.valueOf(i5)));
    }

    public Set<Map.Entry<SupportedCapabilities, Pair<Integer, Integer>>> a() {
        return super.entrySet();
    }

    public Collection<Pair<Integer, Integer>> c() {
        return super.values();
    }

    public Pair<Integer, Integer> c(SupportedCapabilities supportedCapabilities) {
        return (Pair) super.get(supportedCapabilities);
    }

    @Override // java.util.EnumMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null || (obj instanceof SupportedCapabilities)) {
            return e((SupportedCapabilities) obj);
        }
        return false;
    }

    @Override // java.util.EnumMap, java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null || (obj instanceof Pair)) {
            return e((Pair) obj);
        }
        return false;
    }

    public int d() {
        return super.size();
    }

    public Pair<Integer, Integer> d(SupportedCapabilities supportedCapabilities) {
        return (Pair) super.remove(supportedCapabilities);
    }

    public boolean d(SupportedCapabilities supportedCapabilities, Pair<Integer, Integer> pair) {
        return super.remove(supportedCapabilities, pair);
    }

    public Set<SupportedCapabilities> e() {
        return super.keySet();
    }

    public Pair<Integer, Integer> e(SupportedCapabilities supportedCapabilities, Pair<Integer, Integer> pair) {
        return (Pair) super.getOrDefault(supportedCapabilities, pair);
    }

    public boolean e(SupportedCapabilities supportedCapabilities) {
        return super.containsKey(supportedCapabilities);
    }

    public boolean e(Pair<Integer, Integer> pair) {
        return super.containsValue(pair);
    }

    @Override // java.util.EnumMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<SupportedCapabilities, Pair<Integer, Integer>>> entrySet() {
        return a();
    }

    @Override // java.util.EnumMap, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null || (obj instanceof SupportedCapabilities)) {
            return c((SupportedCapabilities) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return (obj == null || (obj instanceof SupportedCapabilities)) ? e((SupportedCapabilities) obj, (Pair) obj2) : obj2;
    }

    @Override // java.util.EnumMap, java.util.AbstractMap, java.util.Map
    public final Set<SupportedCapabilities> keySet() {
        return e();
    }

    @Override // java.util.EnumMap, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        if (obj == null || (obj instanceof SupportedCapabilities)) {
            return d((SupportedCapabilities) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        if (obj == null || (obj instanceof SupportedCapabilities)) {
            if (obj2 == null || (obj2 instanceof Pair)) {
                return d((SupportedCapabilities) obj, (Pair) obj2);
            }
            return false;
        }
        return false;
    }

    @Override // java.util.EnumMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        return d();
    }

    @Override // java.util.EnumMap, java.util.AbstractMap, java.util.Map
    public final Collection<Pair<Integer, Integer>> values() {
        return c();
    }
}
