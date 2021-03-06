/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.dapeng.util;

import com.github.dapeng.core.metadata.*;
import com.github.dapeng.org.apache.thrift.protocol.TType;

import java.util.List;

/**
 * 对元数据的一些公共操作
 * @author ever
 */
public class MetaDataUtil {

    public static Struct findStruct(String qualifiedName, Service service) {
        if (qualifiedName == null) {
            return null;
        }
        List<Struct> structDefinitions = service.getStructDefinitions();

        for (Struct structDefinition : structDefinitions) {
            if ((structDefinition.getNamespace() + "." + structDefinition.getName()).equals(qualifiedName)) {
                return structDefinition;
            }
        }

        return null;
    }

    public static Method findMethod(String methodName, Service service) {
        List<Method> methods = service.getMethods();
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                return method;
            }
        }

        return null;
    }

    public static Field findField(String fieldName, Struct struct) {
        List<Field> fields = struct.getFields();

        for (Field field : fields) {
            if (field.getName().equals(fieldName)) {
                return field;
            }
        }

        return null;
    }

    public static TEnum findEnum(String qualifiedName, Service service) {
        List<TEnum> enumDefinitions = service.getEnumDefinitions();

        for (TEnum enumDefinition : enumDefinitions) {
            if ((enumDefinition.getNamespace() + "." + enumDefinition.getName()).equals(qualifiedName)) {
                return enumDefinition;
            }
        }

        return null;
    }

    public static String findEnumItemLabel(TEnum tEnum, Integer value) {
        List<TEnum.EnumItem> enumItems = tEnum.getEnumItems();
        for (TEnum.EnumItem enumItem : enumItems) {
            if (enumItem.getValue() == value) {
                return enumItem.getLabel();
            }
        }

        return null;
    }

    public static Integer findEnumItemValue(TEnum tEnum, String label) {
        List<TEnum.EnumItem> enumItems = tEnum.getEnumItems();
        for (TEnum.EnumItem enumItem : enumItems) {
            if (enumItem.getLabel().equals(label)) {
                return enumItem.getValue();
            }
        }

        for (TEnum.EnumItem enumItem : enumItems) {
            if (String.valueOf(enumItem.getValue()).equals(label)) {
                return enumItem.getValue();
            }
        }

        return null;
    }

    public static byte dataType2Byte(DataType type) {
        switch (type.kind) {
            case BOOLEAN:
                return TType.BOOL;

            case BYTE:
                return TType.BYTE;

            case DOUBLE:
                return TType.DOUBLE;

            case SHORT:
                return TType.I16;

            case INTEGER:
                return TType.I32;

            case LONG:
                return TType.I64;

            case STRING:
                return TType.STRING;

            case STRUCT:
                return TType.STRUCT;

            case MAP:
                return TType.MAP;

            case SET:
                return TType.SET;

            case LIST:
                return TType.LIST;

            case ENUM:
                return TType.I32;

            case VOID:
                return TType.VOID;

            case DATE:
                return TType.I64;

            case BIGDECIMAL:
                return TType.STRING;

            case BINARY:
                return TType.STRING;

            default:
                break;
        }

        return TType.STOP;
    }
}
