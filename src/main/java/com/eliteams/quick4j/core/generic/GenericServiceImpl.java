package com.eliteams.quick4j.core.generic;

/**
 * GenericService 的实现类,其他的业务类 ,继承自它,可以获得常用的增删查改操作<br>
 * Model : 代表数据库 模型 类型<br>
 * PK :代表模型 的主键 类型<br>
 * 
 * @author StarZou
 * @since 2014年6月9日 下午6:14:06
 **/
public abstract class GenericServiceImpl<Model, PK> implements GenericService<Model, PK> {

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * 
     * @return GenericDao实现类
     */
    public abstract GenericDao<Model, PK> getDao();

    /**
     * 插入 对象
     * 
     * @param model
     *            要插入的对象
     */
    public int insert(Model model) {
        return getDao().insertSelective(model);
    }

    /**
     * 更新对象
     * 
     * @param model
     *            要更新的对象
     */
    public int update(Model model) {
        return getDao().updateByPrimaryKeySelective(model);
    }

    /**
     * 通过id删除对象
     * 
     * @param id
     *            要删除对象的id
     */
    public int delete(PK id) {
        return getDao().deleteByPrimaryKey(id);
    }

    /**
     * 通过 id 查询对象
     * 
     * @param id
     * @return
     */
    public Model selectById(PK id) {
        return getDao().selectByPrimaryKey(id);
    }

}
