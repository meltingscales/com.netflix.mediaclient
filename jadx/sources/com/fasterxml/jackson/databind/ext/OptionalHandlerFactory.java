package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import java.io.Serializable;
import o.AbstractC9445pi;
import o.AbstractC9452pp;
import o.AbstractC9453pq;
import o.AbstractC9493qd;
import o.C9537rU;
import o.InterfaceC9427pQ;
import o.InterfaceC9522rF;

/* loaded from: classes5.dex */
public class OptionalHandlerFactory implements Serializable {
    private static final Class<?> a;
    public static final OptionalHandlerFactory c;
    private static final Class<?> d;
    private static final AbstractC9493qd e;
    private static final long serialVersionUID = 1;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:6:0x0006
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            r0 = 0
            java.lang.Class<org.w3c.dom.Node> r1 = org.w3c.dom.Node.class
            java.lang.Class<org.w3c.dom.Document> r2 = org.w3c.dom.Document.class
            goto L19
        L6:
            r1 = r0
        L7:
            java.lang.Class<com.fasterxml.jackson.databind.ext.OptionalHandlerFactory> r2 = com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.class
            java.lang.String r2 = r2.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            java.lang.String r4 = "Could not load DOM `Node` and/or `Document` classes: no DOM support"
            r2.log(r3, r4)
            r2 = r0
        L19:
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.d = r1
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.a = r2
            o.qd r0 = o.AbstractC9493qd.a()     // Catch: java.lang.Throwable -> L21
        L21:
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.e = r0
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory r0 = new com.fasterxml.jackson.databind.ext.OptionalHandlerFactory
            r0.<init>()
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.<clinit>():void");
    }

    protected OptionalHandlerFactory() {
    }

    public AbstractC9453pq<?> b(SerializationConfig serializationConfig, JavaType javaType, AbstractC9445pi abstractC9445pi) {
        Object e2;
        AbstractC9453pq<?> c2;
        Class<?> h = javaType.h();
        Class<?> cls = d;
        if (cls == null || !cls.isAssignableFrom(h)) {
            AbstractC9493qd abstractC9493qd = e;
            if (abstractC9493qd == null || (c2 = abstractC9493qd.c(h)) == null) {
                if ((h.getName().startsWith("javax.xml.") || c(h, "javax.xml.")) && (e2 = e("com.fasterxml.jackson.databind.ext.CoreXMLSerializers")) != null) {
                    return ((InterfaceC9522rF) e2).b(serializationConfig, javaType, abstractC9445pi);
                }
                return null;
            }
            return c2;
        }
        return (AbstractC9453pq) e("com.fasterxml.jackson.databind.ext.DOMSerializer");
    }

    public AbstractC9452pp<?> d(JavaType javaType, DeserializationConfig deserializationConfig, AbstractC9445pi abstractC9445pi) {
        Object e2;
        AbstractC9452pp<?> d2;
        Class<?> h = javaType.h();
        AbstractC9493qd abstractC9493qd = e;
        if (abstractC9493qd == null || (d2 = abstractC9493qd.d(h)) == null) {
            Class<?> cls = d;
            if (cls != null && cls.isAssignableFrom(h)) {
                return (AbstractC9452pp) e("com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer");
            }
            Class<?> cls2 = a;
            if (cls2 != null && cls2.isAssignableFrom(h)) {
                return (AbstractC9452pp) e("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer");
            }
            if ((h.getName().startsWith("javax.xml.") || c(h, "javax.xml.")) && (e2 = e("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers")) != null) {
                return ((InterfaceC9427pQ) e2).e(javaType, deserializationConfig, abstractC9445pi);
            }
            return null;
        }
        return d2;
    }

    private Object e(String str) {
        try {
            return C9537rU.b((Class<Object>) Class.forName(str), false);
        } catch (Exception | LinkageError unused) {
            return null;
        }
    }

    private boolean c(Class<?> cls, String str) {
        do {
            cls = cls.getSuperclass();
            if (cls == null || cls == Object.class) {
                return false;
            }
        } while (!cls.getName().startsWith(str));
        return true;
    }
}
