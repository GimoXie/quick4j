package com.eliteams.quick4j.core.generic;

import java.util.List;

/**
 * 所有Service层的 顶级 接口,封装常用的增删查改操作<br>
 * Model : 代表数据库 模型 类型<br>
 * PK :代表模型 的主键 类型<br>
 * 
 * @author StarZou
 * @since 2014年6月9日 下午6:14:06
 **/
public interface GenericService<Model, PK> {

    /**
     * 插入 对象
     * 
     * @param model
     *            要插入的对象
     */
    int insert(Model model);

    /**
     * 更新对象
     * 
     * @param model
     *            要更新的对象
     */
    int update(Model model);

    /**
     * 通过id删除对象
     * 
     * @param id
     *            要删除对象的id
     */
    int delete(PK id);

    /**
     * 通过 id 查询对象
     * 
     * @param id
     * @return
     */
    Model selectById(PK id);

    /**
     * 查询所有对象
     * 
     * @return
     */
    List<Model> selectAll();

}
