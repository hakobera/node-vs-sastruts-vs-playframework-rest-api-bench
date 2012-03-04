package com.github.hakobera.apibench.service;

import com.github.hakobera.apibench.entity.Order;
import java.util.List;
import javax.annotation.Generated;

import static com.github.hakobera.apibench.entity.OrderNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Order}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2012/03/04 23:20:22")
public class OrderService extends AbstractService<Order> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Order findById(Long id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子とバージョン番号でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @param versionNo
     *            バージョン番号
     * @return エンティティ
     */
    public Order findByIdVersion(Long id, Integer versionNo) {
        return select().id(id).version(versionNo).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Order> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Order> findAll() {
        return select().getResultList();
    }

}