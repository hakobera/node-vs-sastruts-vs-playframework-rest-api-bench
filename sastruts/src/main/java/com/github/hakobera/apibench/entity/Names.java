package com.github.hakobera.apibench.entity;

import com.github.hakobera.apibench.entity.OrderNames._OrderNames;
import javax.annotation.Generated;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2012/03/04 23:33:54")
public class Names {

    /**
     * {@link Order}の名前クラスを返します。
     * 
     * @return Orderの名前クラス
     */
    public static _OrderNames order() {
        return new _OrderNames();
    }
}