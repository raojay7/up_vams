package com.up_vams.photo.service;

import com.up_vams.core.service.BaseService;
import com.up_vams.photo.entity.Photo;
import com.up_vams.schoolPhoto.entity.SchoolPhoto;

import java.util.List;

/**
 * Created by 隽 on 2017/4/5.
 */
public interface PhotoService extends BaseService<Photo>
{

    /**
     * 根据图片id拿到图片的ossname和id
     * 学校查看更多，主页照片
     * @param photoId 照片id
     * @return 照片
     */
    Photo selectSchoolMore(String photoId);


    /**
     * 通过SchoolPhoto列表查询照片
     * @param list 封装好的关联表，此时只有八条数据
     * @return 对应查出8个photo数据
     * 如果要使用分页还应该自己封装：
     *  Page<Photo> pageResult=new Page<>();
        pageResult.setPageNum(pageNum);
        pageResult.setTotalRecord(totalRecord);
        pageResult.setTotalPage(page.getTotalPage());
        pageResult.setList(photos);
     */
    List<Photo> selectPhotos(List<SchoolPhoto> list);
    //List<Photo> selectPageList(List<SchoolPhoto> list);没用的方法
}
