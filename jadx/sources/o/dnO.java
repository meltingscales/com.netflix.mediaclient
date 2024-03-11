package o;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import o.dnT;

/* loaded from: classes5.dex */
public final class dnO {
    public static String b(String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }

    public static GenericArrayType d(Type type) {
        return new dnT.e(type);
    }

    public static WildcardType a(Type type) {
        return new dnT.d(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, dnT.b);
    }

    public static WildcardType j(Type type) {
        return new dnT.d(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    public static Class<?> c(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(c(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return c(((WildcardType) type).getUpperBounds()[0]);
        }
        String name = type == null ? "null" : type.getClass().getName();
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    public static Type c(Type type, Class<?> cls) {
        Type c = c(type, cls, Collection.class);
        if (c instanceof WildcardType) {
            c = ((WildcardType) c).getUpperBounds()[0];
        }
        return c instanceof ParameterizedType ? ((ParameterizedType) c).getActualTypeArguments()[0] : Object.class;
    }

    public static boolean a(Type type, Type type2) {
        Type[] actualTypeArguments;
        Type[] actualTypeArguments2;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            if (type2 instanceof GenericArrayType) {
                return a(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return type.equals(type2);
        } else if (type instanceof ParameterizedType) {
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                if (parameterizedType instanceof dnT.a) {
                    actualTypeArguments = ((dnT.a) parameterizedType).c;
                } else {
                    actualTypeArguments = parameterizedType.getActualTypeArguments();
                }
                if (parameterizedType2 instanceof dnT.a) {
                    actualTypeArguments2 = ((dnT.a) parameterizedType2).c;
                } else {
                    actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                }
                return a(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(actualTypeArguments, actualTypeArguments2);
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return a(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        } else if (type instanceof WildcardType) {
            if (type2 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
            }
            return false;
        } else if ((type instanceof TypeVariable) && (type2 instanceof TypeVariable)) {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Type[] d(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type c = c(type, cls, Map.class);
        return c instanceof ParameterizedType ? ((ParameterizedType) c).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    static Type c(Type type, Class<?> cls, Class<?> cls2) {
        if (!cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException();
        }
        return dnT.b(type, cls, dnT.e(type, cls, cls2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Type b(Type type) {
        Class<?> c = c(type);
        return dnT.b(type, c, c.getGenericSuperclass());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Type e(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }
}
