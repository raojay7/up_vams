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
    private Integer pageNum;

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
    private long totalRecord;

    /**
     * 总页数
     */
    private Integer totalPage;

    /**
     * 查询关键字
     */
    private String keyWord;

    /**
     * 查询ID
     */
    private String id;

    /**
     * 查询得到数据列表
     */
    private List<T> list;

    public Page(){

    }

    public Page(Integer pageNum, Integer pageSize, long totalRecord, List<T> list) {

        this.list = list;
        this.totalRecord = totalRecord;
        this.pageSize = pageSize;

        if (totalRecord != 0) {

            int tmp = (int) totalRecord / pageSize;
            totalPage = totalRecord % pageSize == 0 ? tmp :tmp++;
            this.pageNum = pageNum;
        } else {
            this.pageNum = 0;
        }



    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getStart() {

        this.start = (pageNum - 1) * pageSize;

        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public long getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(long totalRecord) {
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
