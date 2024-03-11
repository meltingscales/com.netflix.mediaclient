package o;

import j$.time.zone.ZoneRules;
import j$.time.zone.ZoneRulesException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o.dpi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8539dpi {
    private static volatile Set a;
    private static final ConcurrentMap d;
    private static final CopyOnWriteArrayList e;

    /* renamed from: o.dpi$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC8539dpi {
        private final Set e;

        b() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (String str : TimeZone.getAvailableIDs()) {
                linkedHashSet.add(str);
            }
            this.e = Collections.unmodifiableSet(linkedHashSet);
        }

        @Override // o.AbstractC8539dpi
        protected ZoneRules a(String str, boolean z) {
            if (this.e.contains(str)) {
                return new ZoneRules(TimeZone.getTimeZone(str));
            }
            throw new ZoneRulesException("Not a built-in time zone: " + str);
        }

        @Override // o.AbstractC8539dpi
        protected Set b() {
            return this.e;
        }
    }

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        e = copyOnWriteArrayList;
        d = new ConcurrentHashMap(512, 0.75f, 2);
        final ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new PrivilegedAction() { // from class: o.dpi.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
                if (property == null) {
                    AbstractC8539dpi.a(new b());
                    return null;
                }
                try {
                    AbstractC8539dpi abstractC8539dpi = (AbstractC8539dpi) AbstractC8539dpi.class.cast(Class.forName(property, true, AbstractC8539dpi.class.getClassLoader()).newInstance());
                    AbstractC8539dpi.a(abstractC8539dpi);
                    arrayList.add(abstractC8539dpi);
                    return null;
                } catch (Exception e2) {
                    throw new Error(e2);
                }
            }
        });
        copyOnWriteArrayList.addAll(arrayList);
    }

    protected AbstractC8539dpi() {
    }

    public static Set a() {
        return a;
    }

    public static void a(AbstractC8539dpi abstractC8539dpi) {
        Objects.requireNonNull(abstractC8539dpi, "provider");
        e(abstractC8539dpi);
        e.add(abstractC8539dpi);
    }

    public static ZoneRules b(String str, boolean z) {
        Objects.requireNonNull(str, "zoneId");
        return b(str).a(str, z);
    }

    private static AbstractC8539dpi b(String str) {
        ConcurrentMap concurrentMap = d;
        AbstractC8539dpi abstractC8539dpi = (AbstractC8539dpi) concurrentMap.get(str);
        if (abstractC8539dpi == null) {
            if (concurrentMap.isEmpty()) {
                throw new ZoneRulesException("No time-zone data files registered");
            }
            throw new ZoneRulesException("Unknown time-zone ID: " + str);
        }
        return abstractC8539dpi;
    }

    private static void e(AbstractC8539dpi abstractC8539dpi) {
        synchronized (AbstractC8539dpi.class) {
            for (String str : abstractC8539dpi.b()) {
                Objects.requireNonNull(str, "zoneId");
                if (((AbstractC8539dpi) d.putIfAbsent(str, abstractC8539dpi)) != null) {
                    throw new ZoneRulesException("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + abstractC8539dpi);
                }
            }
            a = Collections.unmodifiableSet(new HashSet(d.keySet()));
        }
    }

    protected abstract ZoneRules a(String str, boolean z);

    protected abstract Set b();
}
