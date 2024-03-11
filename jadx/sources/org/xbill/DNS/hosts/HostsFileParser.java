package org.xbill.DNS.hosts;

import j$.time.Instant;
import java.net.InetAddress;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import lombok.Generated;
import o.C9496qg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes6.dex */
public final class HostsFileParser {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(HostsFileParser.class);
    private final boolean clearCacheOnChange;
    private final Map<String, InetAddress> hostsCache;
    private Instant lastFileReadTime;
    private final Path path;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HostsFileParser() {
        /*
            r2 = this;
            java.lang.String r0 = "os.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "Windows"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1f
            java.lang.String r0 = "SystemRoot"
            java.lang.String r0 = java.lang.System.getenv(r0)
            java.lang.String r1 = "\\System32\\drivers\\etc\\hosts"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.nio.file.Path r0 = o.C9501ql.e(r0, r1)
            goto L28
        L1f:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "/etc/hosts"
            java.nio.file.Path r0 = o.C9501ql.e(r1, r0)
        L28:
            r1 = 1
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xbill.DNS.hosts.HostsFileParser.<init>():void");
    }

    public HostsFileParser(Path path, boolean z) {
        boolean isDirectory;
        this.hostsCache = new HashMap();
        this.lastFileReadTime = Instant.b;
        Objects.requireNonNull(path, "path is required");
        this.path = C9496qg.e(path);
        this.clearCacheOnChange = z;
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        if (isDirectory) {
            throw new IllegalArgumentException("path must be a file");
        }
    }
}
