package com.up_vams.core.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wzw on 2017/4/5.
 */
public class Page<T> implements Serializable {
    private static final long serialVersionUID = 7609364184942680615L;

    /**
     * 当前页号
     */
    private Integer page;

    /**
     * 每页大小
     */
    private Integer pageSize;

    /**
     * 开始查询位置
     */
    private Integer start;

    /**
     * 总记录数
     */
    private Integer totalRecord;

    /**
     * 查询关键字
     */
    private String keyWord;

    /**
     * 查询得到数据列表
     */
    private List<T> list;


    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getStart() {

        this.start = (page - 1) * pageSize;

        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
