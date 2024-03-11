package org.xbill.DNS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xbill.DNS.hosts.HostsFileParser;

/* loaded from: classes6.dex */
public final class Lookup {
    private static Map<Integer, Cache> defaultCaches;
    private static HostsFileParser defaultHostsFileParser;
    private static int defaultNdots;
    private static Resolver defaultResolver;
    private static List<Name> defaultSearchPath;
    @Generated
    private static final Logger log = LoggerFactory.getLogger(Lookup.class);
    private static final Name[] noAliases = new Name[0];

    static {
        refreshDefault();
    }

    public static void refreshDefault() {
        synchronized (Lookup.class) {
            defaultResolver = new ExtendedResolver();
            defaultSearchPath = ResolverConfig.getCurrentConfig().searchPath();
            defaultCaches = new HashMap();
            defaultNdots = ResolverConfig.getCurrentConfig().ndots();
            defaultHostsFileParser = new HostsFileParser();
        }
    }

    public static void setDefaultResolver(Resolver resolver) {
        synchronized (Lookup.class) {
            defaultResolver = resolver;
        }
    }

    public static void setDefaultSearchPath(String... strArr) {
        synchronized (Lookup.class) {
            if (strArr == null) {
                defaultSearchPath = null;
                return;
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(Name.fromString(str, Name.root));
            }
            defaultSearchPath = arrayList;
        }
    }
}
