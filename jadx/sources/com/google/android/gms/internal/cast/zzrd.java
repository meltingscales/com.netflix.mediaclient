package com.google.android.gms.internal.cast;

import com.fasterxml.jackson.core.JsonFactory;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes2.dex */
final class zzrd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzrb zzrbVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzrbVar, sb, 0);
        return sb.toString();
    }

    static final void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zzb(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzb(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzsb.zza(zzoy.zzl((String) obj)));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else if (obj instanceof zzoy) {
                sb.append(": \"");
                sb.append(zzsb.zza((zzoy) obj));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else if (obj instanceof zzpt) {
                sb.append(" {");
                zzd((zzpt) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                zzb(sb, i4, SignupConstants.Error.DEBUG_FIELD_KEY, entry2.getKey());
                zzb(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static final String zzc(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static void zzd(zzrb zzrbVar, StringBuilder sb, int i) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzrbVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb, i, zzc(concat), zzpt.zzy(method2, zzrbVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb, i, zzc(concat2), zzpt.zzy(method3, zzrbVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object zzy = zzpt.zzy(method4, zzrbVar, new Object[0]);
                    if (method5 == null) {
                        if (zzy instanceof Boolean) {
                            if (((Boolean) zzy).booleanValue()) {
                                zzb(sb, i, zzc(concat3), zzy);
                            }
                        } else if (zzy instanceof Integer) {
                            if (((Integer) zzy).intValue() != 0) {
                                zzb(sb, i, zzc(concat3), zzy);
                            }
                        } else if (zzy instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzy).floatValue()) != 0) {
                                zzb(sb, i, zzc(concat3), zzy);
                            }
                        } else if (zzy instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzy).doubleValue()) != 0) {
                                zzb(sb, i, zzc(concat3), zzy);
                            }
                        } else {
                            if (zzy instanceof String) {
                                equals = zzy.equals("");
                            } else if (zzy instanceof zzoy) {
                                equals = zzy.equals(zzoy.zzb);
                            } else if (zzy instanceof zzrb) {
                                if (zzy != ((zzrb) zzy).zzs()) {
                                    zzb(sb, i, zzc(concat3), zzy);
                                }
                            } else {
                                if ((zzy instanceof Enum) && ((Enum) zzy).ordinal() == 0) {
                                }
                                zzb(sb, i, zzc(concat3), zzy);
                            }
                            if (!equals) {
                                zzb(sb, i, zzc(concat3), zzy);
                            }
                        }
                    } else if (((Boolean) zzpt.zzy(method5, zzrbVar, new Object[0])).booleanValue()) {
                        zzb(sb, i, zzc(concat3), zzy);
                    }
                }
            }
        }
        if (!(zzrbVar instanceof zzpr)) {
            zzse zzseVar = ((zzpt) zzrbVar).zzc;
            if (zzseVar != null) {
                zzseVar.zze(sb, i);
                return;
            }
            return;
        }
        zzpr zzprVar = (zzpr) zzrbVar;
        throw null;
    }
}
