package com.company.restaurant.dao.proto;

public class SqlExpressions {
    private static final String SQL_SELECT_ALL_RECORDS = "SELECT %s FROM %s";
    private static final String SQL_SELECT_BY_FIELD_VALUE = "SELECT %s FROM %s WHERE (%s = %s)";

    public static String toString(Object object) {
        String result;

        if (object == null) {
            result = "null";
        } else {
            result = object.toString();
            if (object instanceof String) {
                result = "'" + result + "'";
            }
        }

        return result;
    }

    public static String allEntityQueryCondition(String entityName, String selectFields, String orderByCondition) {
        return String.format(SQL_SELECT_ALL_RECORDS, selectFields, entityName) +
                ((orderByCondition != null) ? orderByCondition : "");
    }

    public static String allEntityQueryCondition(String entityName, String selectFields) {
        return allEntityQueryCondition(entityName, selectFields, null);
    }

    public static String fieldEntityQueryCondition(String fieldName, Object value, String selectFields,
                                                   String entityName, String orderByCondition) {
        return String.format(SQL_SELECT_BY_FIELD_VALUE, selectFields, entityName, fieldName, value) +
                ((orderByCondition != null) ? orderByCondition : "");
    }

    public static String fieldEntityQueryCondition(String fieldName, Object value, String selectFields,
                                                   String entityName) {
        return SqlExpressions.fieldEntityQueryCondition(fieldName, value, selectFields, entityName, null);
    }
}