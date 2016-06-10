package com.company.restaurant.dao.proto;

public class SqlExpressions {
    private static final String SQL_SELECT_PATTERN = "SELECT %s";
    private static final String SQL_FROM_PATTERN = "FROM %s";
    private static final String SQL_WHERE_FIELD_VALUE_PATTERN = "WHERE (%s = %s)";

    public static String selectExpression(String selectFields) {
        return String.format(SQL_SELECT_PATTERN, selectFields);
    }

    public static String fieldCondition(String fieldName, Object value) {
        return String.format(SQL_WHERE_FIELD_VALUE_PATTERN, fieldName, value);
    }

    public static String fromExpression(String entityName, String whereCondition, String orderByCondition) {
        return String.format(SQL_FROM_PATTERN, entityName) + " " +
                ((whereCondition != null) ? whereCondition + " " : "") +
                ((orderByCondition != null) ? orderByCondition : "");
    }

    public static String fromExpression(String entityName, String orderByCondition) {
        return fromExpression(entityName, null, orderByCondition);
    }

    public static String fromExpressionWithFieldCondition(String entityName,
                                                          String fieldName,
                                                          Object value,
                                                          String orderByCondition) {
        return fromExpression(entityName, fieldCondition(fieldName, value), orderByCondition);
    }

    public static String allEntityQueryCondition(String entityName,
                                                 String selectFields,
                                                 String orderByCondition) {
        return selectExpression(selectFields) + " " + fromExpression(entityName, orderByCondition);
    }

    public static String allEntityQueryCondition(String entityName, String selectFields) {
        return allEntityQueryCondition(entityName, selectFields, null);
    }

    public static String fieldEntityQueryCondition(String fieldName,
                                                   Object value,
                                                   String selectFields,
                                                   String entityName,
                                                   String orderByCondition) {
        return selectExpression(selectFields) +
                fromExpressionWithFieldCondition(entityName, fieldName, value, orderByCondition);
    }

    public static String fieldEntityQueryCondition(String fieldName,
                                                   Object value,
                                                   String selectFields,
                                                   String entityName) {
        return SqlExpressions.fieldEntityQueryCondition(fieldName, value, selectFields, entityName, null);
    }
}