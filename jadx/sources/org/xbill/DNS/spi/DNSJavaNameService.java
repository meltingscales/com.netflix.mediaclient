package org.xbill.DNS.spi;

import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.StringTokenizer;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xbill.DNS.ExtendedResolver;
import org.xbill.DNS.Lookup;
import org.xbill.DNS.Name;
import org.xbill.DNS.TextParseException;
import sun.net.spi.nameservice.NameService;

/* loaded from: classes6.dex */
public class DNSJavaNameService implements NameService {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(DNSJavaNameService.class);
    private boolean addressesLoaded;
    private InetAddress[] localhostAddresses;
    private Name localhostName;
    private InetAddress[] localhostNamedAddresses;
    private boolean preferV6;

    /* JADX INFO: Access modifiers changed from: protected */
    public DNSJavaNameService() {
        this.preferV6 = false;
        this.localhostName = null;
        this.localhostNamedAddresses = null;
        this.localhostAddresses = null;
        this.addressesLoaded = false;
        String property = System.getProperty("sun.net.spi.nameservice.nameservers");
        String property2 = System.getProperty("sun.net.spi.nameservice.domain");
        String property3 = System.getProperty("java.net.preferIPv6Addresses");
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ",");
            String[] strArr = new String[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                strArr[i] = stringTokenizer.nextToken();
                i++;
            }
            try {
                Lookup.setDefaultResolver(new ExtendedResolver(strArr));
            } catch (UnknownHostException unused) {
                log.error("DNSJavaNameService: invalid {}", "sun.net.spi.nameservice.nameservers");
            }
        }
        if (property2 != null) {
            try {
                Lookup.setDefaultSearchPath(property2);
            } catch (TextParseException unused2) {
                log.error("DNSJavaNameService: invalid {}", "sun.net.spi.nameservice.domain");
            }
        }
        if (property3 != null && property3.equalsIgnoreCase("true")) {
            this.preferV6 = true;
        }
        try {
            Method declaredMethod = Class.forName("java.net.InetAddressImplFactory").getDeclaredMethod("create", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Class<?> cls = Class.forName("java.net.InetAddressImpl");
            Method method = cls.getMethod("getLocalHostName", new Class[0]);
            method.setAccessible(true);
            this.localhostName = Name.fromString((String) method.invoke(invoke, new Object[0]));
            Method method2 = cls.getMethod("lookupAllHostAddr", String.class);
            method2.setAccessible(true);
            this.localhostNamedAddresses = (InetAddress[]) method2.invoke(invoke, this.localhostName.toString());
            this.localhostAddresses = (InetAddress[]) method2.invoke(invoke, "localhost");
            this.addressesLoaded = true;
        } catch (Exception e) {
            log.error("Could not obtain localhost", (Throwable) e);
        }
    }
}
