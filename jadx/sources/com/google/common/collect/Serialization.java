package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes5.dex */
final class Serialization {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int readCount(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void writeMultimap(Multimap<K, V> multimap, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(multimap.asMap().size());
        for (Map.Entry<K, Collection<V>> entry : multimap.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            for (V v : entry.getValue()) {
                objectOutputStream.writeObject(v);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void populateMultimap(Multimap<K, V> multimap, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = multimap.get(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> FieldSetter<T> getFieldSetter(Class<T> cls, String str) {
        try {
            return new FieldSetter<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* loaded from: classes5.dex */
    static final class FieldSetter<T> {
        private final Field field;

        private FieldSetter(Field field) {
            this.field = field;
            field.setAccessible(true);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void set(T t, Object obj) {
            try {
                this.field.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void set(T t, int i) {
            try {
                this.field.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }
}
