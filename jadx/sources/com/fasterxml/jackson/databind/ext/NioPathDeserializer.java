package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.ServiceLoader;
import o.C9496qg;
import o.C9499qj;
import o.C9502qm;
import o.C9504qo;

/* loaded from: classes5.dex */
public class NioPathDeserializer extends StdScalarDeserializer<Path> {
    private static final boolean b;
    private static final long serialVersionUID = 1;

    static {
        File[] listRoots = File.listRoots();
        int length = listRoots.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String path = listRoots[i].getPath();
            if (path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':') {
                z = true;
                break;
            }
            i++;
        }
        b = z;
    }

    public NioPathDeserializer() {
        super(C9499qj.e());
    }

    @Override // o.AbstractC9452pp
    /* renamed from: d */
    public Path b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String scheme;
        Path path;
        Path path2;
        Path path3;
        Path path4;
        if (!jsonParser.a(JsonToken.VALUE_STRING)) {
            return C9496qg.e(deserializationContext.e(C9499qj.e(), jsonParser));
        }
        String A = jsonParser.A();
        if (A.indexOf(58) < 0) {
            path4 = Paths.get(A, new String[0]);
            return path4;
        } else if (b && A.length() >= 2 && Character.isLetter(A.charAt(0)) && A.charAt(1) == ':') {
            path3 = Paths.get(A, new String[0]);
            return path3;
        } else {
            try {
                URI uri = new URI(A);
                try {
                    path2 = Paths.get(uri);
                    return path2;
                } catch (FileSystemNotFoundException e) {
                    try {
                        String scheme2 = uri.getScheme();
                        Iterator it = ServiceLoader.load(C9504qo.c()).iterator();
                        while (it.hasNext()) {
                            FileSystemProvider a = C9502qm.a(it.next());
                            scheme = a.getScheme();
                            if (scheme.equalsIgnoreCase(scheme2)) {
                                path = a.getPath(uri);
                                return path;
                            }
                        }
                        return C9496qg.e(deserializationContext.d(c(), A, e));
                    } catch (Throwable th) {
                        th.addSuppressed(e);
                        return C9496qg.e(deserializationContext.d(c(), A, th));
                    }
                } catch (Throwable th2) {
                    return C9496qg.e(deserializationContext.d(c(), A, th2));
                }
            } catch (URISyntaxException e2) {
                return C9496qg.e(deserializationContext.d(c(), A, e2));
            }
        }
    }
}
