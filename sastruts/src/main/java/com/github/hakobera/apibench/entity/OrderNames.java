package com.github.hakobera.apibench.entity;

import java.util.Date;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Order}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/03/04 23:33:54")
public class OrderNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Long> id() {
        return new PropertyName<Long>("id");
    }

    /**
     * tennatIdのプロパティ名を返します。
     * 
     * @return tennatIdのプロパティ名
     */
    public static PropertyName<String> tennatId() {
        return new PropertyName<String>("tennatId");
    }

    /**
     * versionNoのプロパティ名を返します。
     * 
     * @return versionNoのプロパティ名
     */
    public static PropertyName<Integer> versionNo() {
        return new PropertyName<Integer>("versionNo");
    }

    /**
     * createdAtのプロパティ名を返します。
     * 
     * @return createdAtのプロパティ名
     */
    public static PropertyName<Date> createdAt() {
        return new PropertyName<Date>("createdAt");
    }

    /**
     * createdByのプロパティ名を返します。
     * 
     * @return createdByのプロパティ名
     */
    public static PropertyName<String> createdBy() {
        return new PropertyName<String>("createdBy");
    }

    /**
     * modifiedAtのプロパティ名を返します。
     * 
     * @return modifiedAtのプロパティ名
     */
    public static PropertyName<Date> modifiedAt() {
        return new PropertyName<Date>("modifiedAt");
    }

    /**
     * modifiedByのプロパティ名を返します。
     * 
     * @return modifiedByのプロパティ名
     */
    public static PropertyName<String> modifiedBy() {
        return new PropertyName<String>("modifiedBy");
    }

    /**
     * locationIdのプロパティ名を返します。
     * 
     * @return locationIdのプロパティ名
     */
    public static PropertyName<String> locationId() {
        return new PropertyName<String>("locationId");
    }

    /**
     * sourceIdのプロパティ名を返します。
     * 
     * @return sourceIdのプロパティ名
     */
    public static PropertyName<String> sourceId() {
        return new PropertyName<String>("sourceId");
    }

    /**
     * treatmentIdのプロパティ名を返します。
     * 
     * @return treatmentIdのプロパティ名
     */
    public static PropertyName<String> treatmentId() {
        return new PropertyName<String>("treatmentId");
    }

    /**
     * poNumberのプロパティ名を返します。
     * 
     * @return poNumberのプロパティ名
     */
    public static PropertyName<String> poNumber() {
        return new PropertyName<String>("poNumber");
    }

    /**
     * notesのプロパティ名を返します。
     * 
     * @return notesのプロパティ名
     */
    public static PropertyName<String> notes() {
        return new PropertyName<String>("notes");
    }

    /**
     * closedのプロパティ名を返します。
     * 
     * @return closedのプロパティ名
     */
    public static PropertyName<Boolean> closed() {
        return new PropertyName<Boolean>("closed");
    }

    /**
     * closedAtのプロパティ名を返します。
     * 
     * @return closedAtのプロパティ名
     */
    public static PropertyName<Date> closedAt() {
        return new PropertyName<Date>("closedAt");
    }

    /**
     * closedByのプロパティ名を返します。
     * 
     * @return closedByのプロパティ名
     */
    public static PropertyName<String> closedBy() {
        return new PropertyName<String>("closedBy");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _OrderNames extends PropertyName<Order> {

        /**
         * インスタンスを構築します。
         */
        public _OrderNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _OrderNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _OrderNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Long> id() {
            return new PropertyName<Long>(this, "id");
        }

        /**
         * tennatIdのプロパティ名を返します。
         *
         * @return tennatIdのプロパティ名
         */
        public PropertyName<String> tennatId() {
            return new PropertyName<String>(this, "tennatId");
        }

        /**
         * versionNoのプロパティ名を返します。
         *
         * @return versionNoのプロパティ名
         */
        public PropertyName<Integer> versionNo() {
            return new PropertyName<Integer>(this, "versionNo");
        }

        /**
         * createdAtのプロパティ名を返します。
         *
         * @return createdAtのプロパティ名
         */
        public PropertyName<Date> createdAt() {
            return new PropertyName<Date>(this, "createdAt");
        }

        /**
         * createdByのプロパティ名を返します。
         *
         * @return createdByのプロパティ名
         */
        public PropertyName<String> createdBy() {
            return new PropertyName<String>(this, "createdBy");
        }

        /**
         * modifiedAtのプロパティ名を返します。
         *
         * @return modifiedAtのプロパティ名
         */
        public PropertyName<Date> modifiedAt() {
            return new PropertyName<Date>(this, "modifiedAt");
        }

        /**
         * modifiedByのプロパティ名を返します。
         *
         * @return modifiedByのプロパティ名
         */
        public PropertyName<String> modifiedBy() {
            return new PropertyName<String>(this, "modifiedBy");
        }

        /**
         * locationIdのプロパティ名を返します。
         *
         * @return locationIdのプロパティ名
         */
        public PropertyName<String> locationId() {
            return new PropertyName<String>(this, "locationId");
        }

        /**
         * sourceIdのプロパティ名を返します。
         *
         * @return sourceIdのプロパティ名
         */
        public PropertyName<String> sourceId() {
            return new PropertyName<String>(this, "sourceId");
        }

        /**
         * treatmentIdのプロパティ名を返します。
         *
         * @return treatmentIdのプロパティ名
         */
        public PropertyName<String> treatmentId() {
            return new PropertyName<String>(this, "treatmentId");
        }

        /**
         * poNumberのプロパティ名を返します。
         *
         * @return poNumberのプロパティ名
         */
        public PropertyName<String> poNumber() {
            return new PropertyName<String>(this, "poNumber");
        }

        /**
         * notesのプロパティ名を返します。
         *
         * @return notesのプロパティ名
         */
        public PropertyName<String> notes() {
            return new PropertyName<String>(this, "notes");
        }

        /**
         * closedのプロパティ名を返します。
         *
         * @return closedのプロパティ名
         */
        public PropertyName<Boolean> closed() {
            return new PropertyName<Boolean>(this, "closed");
        }

        /**
         * closedAtのプロパティ名を返します。
         *
         * @return closedAtのプロパティ名
         */
        public PropertyName<Date> closedAt() {
            return new PropertyName<Date>(this, "closedAt");
        }

        /**
         * closedByのプロパティ名を返します。
         *
         * @return closedByのプロパティ名
         */
        public PropertyName<String> closedBy() {
            return new PropertyName<String>(this, "closedBy");
        }
    }
}