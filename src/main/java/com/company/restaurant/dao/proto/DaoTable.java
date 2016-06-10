package com.company.restaurant.dao.proto;

/**
 * Created by Yevhen on 09.06.2016.
 */

public abstract class DaoTable {
    private static final String SQL_MAX_STATEMENT = "MAX(%s)";
    private static final String SQL_DELETE_EXPRESSION_PATTERN = "DELETE FROM \"%s\" WHERE (%s = %s)";
    private static final String SQL_UPDATE_BY_FIELD_VALUE = "UPDATE \"%s\" SET %s WHERE (%s = %s)";
    private static final String SQL_UPDATE_SET_SECTION_PART_PATTERN = "%s = %s";
    private static final String SQL_ALL_FIELDS_WILDCARD = "*";

    protected String tableName;
    protected String viewName;
    protected String orderByCondition;

    protected abstract void initMetadata();

    private String getViewName() {
        return (viewName != null && viewName.length() > 0) ? viewName : tableName;
    }

    private String orderByCondition() {
        return (orderByCondition == null) ? "" : " " + orderByCondition;
    }

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

    private String orderByCondition(String selectFields) {
        return (selectFields.equals(SQL_ALL_FIELDS_WILDCARD)) ? orderByCondition() : "";
    }

    protected String allEntityQueryCondition(String entityName) {
        return SqlExpressions.allEntityQueryCondition(SQL_ALL_FIELDS_WILDCARD, entityName, orderByCondition());
    }

    protected String allQueryCondition() {
        return allEntityQueryCondition(String.format("\"%s\"", getViewName()));
    }

    protected String fieldQueryCondition(String fieldName, Object value, String selectFields) {
        return SqlExpressions.fieldEntityQueryCondition(selectFields, String.format("\"%s\"", getViewName()), fieldName, toString(value),
                orderByCondition(selectFields));
    }

    protected String fieldQueryCondition(String fieldName, Object value) {
        return fieldQueryCondition(fieldName, value, SQL_ALL_FIELDS_WILDCARD);
    }

    protected String maxFieldValueExpression(String fieldName) {
        return String.format(SQL_MAX_STATEMENT, fieldName);
    }

    protected String twoFieldsFromTableQueryCondition(String fieldName1,
                                                      Object value1,
                                                      String fieldName2,
                                                      Object value2,
                                                      String selectFields) {
        return SqlExpressions.twoFieldsEntityQueryCondition(selectFields, tableName, fieldName1,
                toString(value1), fieldName2, toString(value2), orderByCondition(selectFields));
    }

    protected String twoFieldsFromTableQueryCondition(String fieldName1,
                                                      Object value1,
                                                      String fieldName2,
                                                      Object value2) {
        return twoFieldsFromTableQueryCondition(fieldName1, value1, fieldName2, value2, SQL_ALL_FIELDS_WILDCARD);
    }

    private String twoFieldsFromViewQueryCondition(String fieldName1,
                                                   Object value1,
                                                   String fieldName2,
                                                   Object value2,
                                                   String selectFields) {
        return SqlExpressions.twoFieldsEntityQueryCondition(selectFields, getViewName(), fieldName1,
                toString(value1), fieldName2, toString(value2), orderByCondition(selectFields));
    }

    protected String twoFieldsFromViewQueryCondition(String fieldName1,
                                                     Object value1,
                                                     String fieldName2,
                                                     Object value2) {
        return twoFieldsFromViewQueryCondition(fieldName1, value1, fieldName2, value2, SQL_ALL_FIELDS_WILDCARD);
    }

    protected String buildDeleteExpression(String fieldName, Object value) {
        return String.format(SQL_DELETE_EXPRESSION_PATTERN, tableName, fieldName, toString(value));
    }

    protected String buildOneFieldByOneFieldUpdateCondition(String updateFieldName,
                                                            Object updateFieldValue,
                                                            String conditionFieldName,
                                                            Object conditionFieldValue) {
        return String.format(SQL_UPDATE_BY_FIELD_VALUE, tableName,
                String.format(SQL_UPDATE_SET_SECTION_PART_PATTERN, updateFieldName, toString(updateFieldValue)),
                conditionFieldName, toString(conditionFieldValue));
    }
}
