package com.up_vams.core.service.impl;

import com.up_vams.core.dao.BaseMapper;
import com.up_vams.core.entity.Page;
import com.up_vams.core.service.BaseService;
import com.up_vams.discussion.dao.DiscussionMapper;
import com.up_vams.photo.dao.PhotoMapper;
import com.up_vams.photoDiscussion.dao.PhotoDiscussionMapper;
import com.up_vams.school.dao.SchoolMapper;
import com.up_vams.schoolPhoto.dao.SchoolPhotoMapper;
import com.up_vams.user.dao.UserMapper;
import com.up_vams.userDiscussion.dao.UserDiscussionMapper;
import com.up_vams.userPhoto.dao.UserPhotoMapper;
import com.up_vams.userSchool.dao.UserSchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by 隽 on 2017/4/21.
 */
public class BaseServiceImpl<T> implements BaseService<T>
{

    protected BaseMapper<T> baseMapper;

    @Autowired
    protected PhotoMapper photoMapper;

    @Autowired
    protected SchoolMapper schoolMapper;
    @Autowired
    protected SchoolPhotoMapper schoolPhotoMapper;

    @Autowired
    protected UserMapper userMapper;

    //用与用户和图片的点赞关系
    @Autowired
    protected UserPhotoMapper userPhotoMapper;
    //用于用户和学校的点赞关系
    @Autowired
    protected UserSchoolMapper userSchoolMapper;

    //用于评论
    @Autowired
    protected DiscussionMapper discussionMapper;

    //用于用户和评论的关系
    @Autowired
    protected UserDiscussionMapper userDiscussionMapper;

    //用于评论和图片的关系
    @Autowired
    protected PhotoDiscussionMapper photoDiscussionMapper;

    @PostConstruct//在构造方法后，初化前执行
    private void initBaseMapper() throws Exception{
        //完成以下逻辑，需要对研发本身进行命名与使用规范
        //this关键字指对象本身，这里指的是调用此方法的实现类（子类）
        System.out.println("=======this :"+this);
        System.out.println("=======父类基本信息："+this.getClass().getSuperclass());
        System.out.println("=======父类和泛型的信息："+this.getClass().getGenericSuperclass());

        ParameterizedType type =(ParameterizedType) this.getClass().getGenericSuperclass();
        //获取第一个参数的class
        Class clazz = (Class)type.getActualTypeArguments()[0];
        System.out.println("=======class:"+clazz);
        //转化为属性名（相关的Mapper子类的引用名）Supplier  supplierMapper
        String localField = clazz.getSimpleName().substring(0,1).toLowerCase()+clazz.getSimpleName().substring(1)+"Mapper";
        System.out.println("=======localField:"+localField);
        //getDeclaredField:可以使用于包括私有、默认、受保护、公共字段，但不包括继承的字段
        Field field=this.getClass().getSuperclass().getDeclaredField(localField);
        System.out.println("=======field:"+field);
        System.out.println("=======field对应的对象:"+field.get(this));
        Field baseField = this.getClass().getSuperclass().getDeclaredField("baseMapper");

        System.out.println("=======baseField:"+baseField);
        System.out.println("=======baseField对应的对象:"+baseField.get(this));
        //field.get(this)获取当前this的field字段的值。例如：Supplier对象中，baseMapper所指向的对象为其子类型SupplierMapper对象，子类型对象已被spring实例化于容器中
        baseField.set(this, field.get(this));
        System.out.println("========baseField对应的对象:"+baseMapper);

    }
    @Override
    public int insert(T entity)
    {
        return baseMapper.insert(entity);
    }

    @Override
    public int update(T entity)
    {
        return baseMapper.update(entity);
    }

    @Override
    public List<T> selectList(String keyword)
    {
        return baseMapper.selectList(keyword);
    }

    @Override
    public List<T> selectAll()
    {
        return baseMapper.selectAll();
    }

    @Override
    public List<T> selectPageList(Page<T> page)
    {
        return baseMapper.selectPageList(page);
    }

    @Override
    public Long selectTotalRecord(String id)
    {
        return baseMapper.selectTotalRecord(id);
    }

    @Override
    public int delete(T entity)
    {
        return baseMapper.delete(entity);
    }

    @Override
    public T select(T entity)
    {
        return baseMapper.select(entity);
    }


    @Override
    public T selectByPK(String pk)
    {
        return baseMapper.selectByPK(pk);
    }
}
